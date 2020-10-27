package com.dh.DpsdkCore;

/** 常量定义
@param DPSDK_CORE_IP_LEN					= 48;			远端IP地址长度
@param DPSDK_CORE_USER_NAME_LEN				= 64;			设备登陆用户名长度
@param DPSDK_CORE_PASSWORD_LEN				= 64;			密码长度
@param DPSDK_CORE_REC_FILENAME_LEN			= 64;			录像文件名长度
@param DPSDK_CORE_DEV_ID_LEN				= 64;			设备ID长度
@param DPSDK_CORE_AREA_ID_LEN              	= 50;        	区间长度
@param DPSDK_CORE_AREA_NAME_LEN           	= 256;       	区间名称长度
@param DPSDK_CORE_MSG_LEN				 	= (4*1024);		消息上报信息长度
@param DPSDK_CORE_REC_DISKID_LEN			= 64;			录像磁盘ID长度
@param DPSDK_CORE_CHL_ID_LEN				= 64;			通道ID长度
@param DPSDK_TAG_URL_LEN					= 1024;     	Url的长度
@param DPSDK_CORE_POINT_COUNT				= 80;			预置点数量
@param DPSDK_CORE_POINT_NAME_LEN        	= 32;        	预置点名称长度
@param DPSDK_CORE_ALARM_MSG_LEN				= (4*1024);		报警查询结果信息长度
@param DPSDK_CORE_ALARM_TITLE_LEN			= 256;			报警查询结果title长度
@param DPSDK_CORE_DEFAULT_TIMEOUT			= 10000;   		默认超时 单位毫秒
@param DPSDK_CORE_DGROUP_DGPNAME_LEN		= 256;			组织名称长度
@param DPSDK_CORE_DGROUP_DGPCODE_LEN		= 128;			组织Code长度
@param DPSDK_CORE_28181_SN_LENGTH			= 64;			SN长度
@param DPSDK_CORE_TIME_LENGTH				= 32;			时间串长度
@param DPSDK_CORE_DGROUP_DEVICENAME_LEN		= 256;			设备名称长度
@param DPSDK_CORE_FILEPATH_LEN				= 256;			文件路径长度
@param DPSDK_CORE_IMG_PATH_LEN			 	= 256;			图片文件路径长度
@param DPSDK_CORE_BAY_IMG_NUM				= 6;			图片数目
@param DPSDK_CORE_IMG_URL					= 1024;			客户端http请求的URL 的长度
@param DPSDK_CORE_DGROUP_CHNNAME_LEN    	= 256;   		设备通道名称长度
@param DPSDK_CORE_POS_ID_LEN             	= 50;     		地点位置名称长度
@param DPSDK_CORE_POS_NAME_LEN            	= 256;    		地点名称长度
@param DPSDK_CORE_ORG_CODE_LEN				= 128;    		组织节点长度
@param DPSDK_CORE_ORG_NAME_LEN          	= 256;      	组织名称长度
@param DPSDK_CORE_ORG_SN_LEN             	= 256;      	组织节点唯一码
@param DPSDK_CORE_ORG_TYPE_LEN            	= 16;      		组织节点类型
@param DPSDK_CORE_ORG_GPS_LEN            	= 64;     		组织节点经度
@param DPSDK_CORE_ORG_MEMO_LEN         		= 1024;    		组织节点描述
@param DPSDK_CORE_DIRECT_LEN            	= 4;       		方向编号
@param DPSDK_CORE_CAR_RECORD_ID_LEN    		= 128;        	记录ID
@param DPSDK_CORE_OPT_NOTE_LEN           	= 256;       	备注长度
@param DPSDK_CORE_TIME_LEN               	= 128;     		时间（以秒为单位）长度
@param DPSDK_CORE_COORDINATE_LEN        	= 4;        	车牌坐标长度
@param DPSDK_CORE_PERSON_CODE_LEN       	= 256;    		身份证ID
@param DPSDK_CORE_PERSON_NAME_LEN        	= 256;         	人员名称长度
@param DPSDK_CORE_PERSON_DEPTCODE_LEN    	= 128;       	所属部门长度
@param DPSDK_CORE_PERSON_SN_LEN         	= 256;    		人员唯一编号长度
@param DPSDK_CORE_PERSON_TYPE_LEN        	= 16;       	人员类型长度
@param DPSDK_CORE_PERSON_OFFICE_LEN      	= 256;      	人员办公地点  
@param DPSDK_CORE_PERSON_MOBILENUM_LEN    	= 64;       	人员移动电话
@param DPSDK_CORE_PERSON_VIRTUALNUM_LEN  	= 64;       	人员虚拟短号
@param DPSDK_CORE_PERSON_STATE_LEN       	= 16;        	人员状态 
@param DPSDK_CORE_CAR_CODE_LEN          	= 50;        	车辆code
@param DPSDK_CORE_CAR_COLOR_LEN         	= 16;        	车辆颜色10
@param DPSDK_CORE_CAR_TYPE_LEN          	= 16;         	车辆类型10
@param DPSDK_CORE_CAR_MODEL_LEN         	= 256;       	车辆品牌型号50
@param DPSDK_CORE_CAR_SIZE_LEN          	= 64;         	车辆尺寸50     
@param DPSDK_CORE_CAR_VIN_LEN             	= 64;        	车架号50
@param DPSDK_CORE_ENG_NO_LEN           		= 64;        	引擎号50
@param DPSDK_CORE_REGIST_LEN            	= 64;         	车牌注册地50
@param DPSDK_CORE_REGIST_DATE_LEN       	= 32;         	注册日期20
@param DPSDK_CORE_CAR_PICPATH_LEN        	= 256;       	车辆照片路径255
@param DPSDK_CORE_CAR_PLATENO_LEN       	= 64;       	车牌号码50
@param DPSDK_CORE_CAR_PLATECOLOR_LEN     	= 16;      		车辆颜色10
@param DPSDK_CORE_CAR_PLATETYPE_LEN     	= 16;        	车牌类型10
@param DPSDK_CORE_CAR_OWNERNAME_LEN      	= 256;       	业主名称50                  
@param DPSDK_CORE_CAR_OWNERPHONE_LEN    	= 64;        	业主电话50                     
@param DPSDK_CORE_DEPTCODE_LEN          	= 128;       	部门code
@param DPSDK_CORE_DBID_LEN              	= 32;      		数据库自增长ID长度
@param DH_MAX_CORE_LANE_NUM             	= 8;        	交通流量状态，最大支持8车道


@param DPSDK_CORE_TVWALL_NAME_LEN			= 256;     		电视墙名称长度

@param DPSDK_CORE_BAY_IP_LEN				= 64;         	IP长度              
@param DPSDK_CORE_CAR_NUM_LENGTH			= 32;
@param DPSDK_CORE_BAY_URL_LEN				= 1024;
*/

public class dpsdk_constant_value 
{ 
	public static final int DPSDK_CORE_LEN							= 16;
	public static final int DPSDK_CORE_IP_LEN						= 48;						// 远端IP地址长度
	public static final int DPSDK_CORE_USER_NAME_LEN				= 64;						// 设备登陆用户名长度
	public static final int DPSDK_CORE_PASSWORD_LEN					= 64;						// 密码长度
	public static final int DPSDK_CORE_REC_FILENAME_LEN				= 64;						// 录像文件名长度
	public static final int DPSDK_CORE_DEV_ID_LEN					= 64;						// 设备ID长度
	public static final int DPSDK_CORE_AREA_ID_LEN              	= 50;                      	// 区间长度
	public static final int DPSDK_CORE_AREA_NAME_LEN               	= 256;                     	// 区间名称长度
	public static final int DPSDK_CORE_MSG_LEN				        = (4*1024);				    // 消息上报信息长度
	public static final int DPSDK_CORE_REC_DISKID_LEN				= 64;						// 录像磁盘ID长度
	public static final int DPSDK_CORE_CHL_ID_LEN					= 64;						// 通道ID长度
	public static final int DPSDK_TAG_URL_LEN						= 1024;                    	// Url的长度
	public static final int DPSDK_CORE_POINT_COUNT					= 80;						// 预置点数量
	public static final int DPSDK_CORE_POINT_NAME_LEN              	= 32;                      	// 预置点名称长度
	public static final int DPSDK_CORE_ALARM_MSG_LEN				= (4*1024);					// 报警查询结果信息长度
	public static final int DPSDK_CORE_ALARM_TITLE_LEN				= 256;			      		// 报警查询结果title长度
	public static final int DPSDK_CORE_DEFAULT_TIMEOUT				= 10000;                    	// 默认超时 单位毫秒
	public static final int DPSDK_CORE_DGROUP_DGPNAME_LEN			= 256;						// 组织名称长度
	public static final int DPSDK_CORE_DGROUP_DGPCODE_LEN			= 128;						// 组织Code长度
	public static final int DPSDK_CORE_28181_SN_LENGTH				= 64;						// SN长度
	public static final int DPSDK_CORE_TIME_LENGTH					= 32;						// 时间串长度
	public static final int DPSDK_CORE_DGROUP_DEVICENAME_LEN		= 256;						// 设备名称长度
	public static final int DPSDK_CORE_FILEPATH_LEN					= 256;						// 文件路径长度
	public static final int DPSDK_CORE_IMG_PATH_LEN			    	= 256;						// 图片文件路径长度
	public static final int DPSDK_CORE_BAY_IMG_NUM					= 6;							// 图片数目
	public static final int DPSDK_CORE_IMG_URL					    = 1024;						// 客户端http请求的URL 的长度
	public static final int DPSDK_CORE_DGROUP_CHNNAME_LEN          	= 256;                     	// 设备通道名称长度
	public static final int DPSDK_CORE_POS_ID_LEN                  	= 50;                      	// 地点位置名称长度
	public static final int DPSDK_CORE_POS_NAME_LEN                	= 256;                     	// 地点名称长度
	public static final int DPSDK_CORE_ORG_CODE_LEN					= 128;                     	// 组织节点长度
	public static final int DPSDK_CORE_ORG_NAME_LEN                	= 256;                     	// 组织名称长度
	public static final int DPSDK_CORE_ORG_SN_LEN                  	= 256;                     	// 组织节点唯一码
	public static final int DPSDK_CORE_ORG_TYPE_LEN                	= 16;                      	// 组织节点类型
	public static final int DPSDK_CORE_ORG_GPS_LEN                 	= 64;                      	// 组织节点经度
	public static final int DPSDK_CORE_ORG_MEMO_LEN                	= 1024;                    	// 组织节点描述
	public static final int DPSDK_CORE_DIRECT_LEN                  	= 4;                       	// 方向编号
	public static final int DPSDK_CORE_CAR_RECORD_ID_LEN           	= 128;                     	// 记录ID
	public static final int DPSDK_CORE_OPT_NOTE_LEN                	= 256;                     	// 备注长度
	public static final int DPSDK_CORE_TIME_LEN                    	= 128;                     	// 时间（以秒为单位）长度
	public static final int DPSDK_CORE_COORDINATE_LEN              	= 4;                       	// 车牌坐标长度
	public static final int DPSDK_CORE_PERSON_CODE_LEN             	= 256;                     	// 身份证ID
	public static final int DPSDK_CORE_PERSON_NAME_LEN             	= 256;                     	// 人员名称长度
	public static final int DPSDK_CORE_PERSON_DEPTCODE_LEN         	= 128;                     	// 所属部门长度
	public static final int DPSDK_CORE_PERSON_SN_LEN               	= 256;                     	// 人员唯一编号长度
	public static final int DPSDK_CORE_PERSON_TYPE_LEN             	= 16;                      	// 人员类型长度
	public static final int DPSDK_CORE_PERSON_OFFICE_LEN           	= 256;                     	// 人员办公地点  
	public static final int DPSDK_CORE_PERSON_MOBILENUM_LEN        	= 64;                      	// 人员移动电话
	public static final int DPSDK_CORE_PERSON_VIRTUALNUM_LEN       	= 64;                      	// 人员虚拟短号
	public static final int DPSDK_CORE_PERSON_STATE_LEN            	= 16;                      	// 人员状态 
	public static final int DPSDK_CORE_CAR_CODE_LEN                	= 50;                      	// 车辆code
	public static final int DPSDK_CORE_CAR_COLOR_LEN               	= 16;                      	// 车辆颜色10
	public static final int DPSDK_CORE_CAR_TYPE_LEN                	= 16;                      	// 车辆类型10
	public static final int DPSDK_CORE_CAR_MODEL_LEN               	= 256;                     	// 车辆品牌型号50
	public static final int DPSDK_CORE_CAR_SIZE_LEN                	= 64;                      	// 车辆尺寸50     
	public static final int DPSDK_CORE_CAR_VIN_LEN                 	= 64;                      	// 车架号50
	public static final int DPSDK_CORE_ENG_NO_LEN                  	= 64;                      	// 引擎号50
	public static final int DPSDK_CORE_REGIST_LEN                  	= 64;                      	// 车牌注册地50
	public static final int DPSDK_CORE_REGIST_DATE_LEN             	= 32;                      	// 注册日期20
	public static final int DPSDK_CORE_CAR_PICPATH_LEN             	= 256;                     	// 车辆照片路径255
	public static final int DPSDK_CORE_CAR_PLATENO_LEN             	= 64;                      	// 车牌号码50
	public static final int DPSDK_CORE_CAR_PLATECOLOR_LEN          	= 16;                      	// 车辆颜色10
	public static final int DPSDK_CORE_CAR_PLATETYPE_LEN           	= 16;                      	// 车牌类型10
	public static final int DPSDK_CORE_CAR_OWNERNAME_LEN           	= 256;                     	// 业主名称50                  
	public static final int DPSDK_CORE_CAR_OWNERPHONE_LEN          	= 64;                      	// 业主电话50                     
	public static final int DPSDK_CORE_DEPTCODE_LEN                	= 128;                     	// 部门code
	public static final int DPSDK_CORE_DBID_LEN                    	= 32;                      	// 数据库自增长ID长度
	public static final int DH_MAX_CORE_LANE_NUM                   	= 8;                       	// 交通流量状态，最大支持8车道
	public static final int DPSDK_CORE_MEM_LEN						= 1024;						// 备注信息长度

	public static final int DPSDK_CORE_TVWALL_NAME_LEN				= 256;                     	// 电视墙名称长度
	public static final int DPSDK_CORE_TVWALL_TASK_NAME_LEN			= 64;                     	// 电视墙任务名称长度
	public static final int DPSDK_CORE_TVWALL_TASK_DES_LEN			= 256;                     	// 电视墙任务描述长度

	public static final int DPSDK_CORE_BAY_IP_LEN					= 64;                      	// IP长度              
	public static final int DPSDK_CORE_CAR_NUM_LENGTH				= 32;
	public static final int DPSDK_CORE_BAY_URL_LEN					= 1024;
	public static final int DPSDK_CORE_CHAR_LEN_256					= 256;
	
	public static final int DPSDK_CORE_SCHEME_NAME_LEN				= 256;
	public static final int DPSDK_CORE_SCHEME_DESC_LEN				= 512;
	public static final int DPSDK_CORE_OSDTEMPLAT_CONTENT_LEN		= 256;
	public static final int DPSDK_CORE_CHAR_LEN_32					= 32;
	public static final int DPSDK_CORE_CHAR_LEN_64					= 64;
	public static final int	DPSDK_CORE_IVS_EVENT_NAME_LEN			= 32;						// 规则事件名称长度
}