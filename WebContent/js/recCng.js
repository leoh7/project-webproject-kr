
function recCng(recId){
		var sta = $("#sta option:selected").val();
		$.ajax(
		{
			url : 'ajaxRecStaCng.do',
			type : "POST",
			data : 
				{
					recId :  recId ,
					cng : sta
				},			
			dataType : 'text',
			success : function(data){	
				if(data==1){
					$('#stat').text("모집완료");
					alert("공고상태를 변경했습니다.")
				} else if (data == 0){
					$('#stat').text("모집중");	
					alert("공고상태를 변경했습니다.")
				} else {
					alert("변경에 실패했습니다. 다시 시도해주세요.")
				}
			},
			error : function(e){
				alert("모집상태가 수정되지 않았습니다");		
			}
		}		
	);
		}