package com.tencent.wechat.aff.wcrte;

/* loaded from: classes16.dex */
public enum c implements com.tencent.mm.protobuf.h {
    RTEAlertType_Recording(1),
    RTEAlertType_Recording_ClickCellStop(2),
    RTEAlertType_Recording_tryLater(3),
    RTEAlertType_NonTxtNum_Exceed(4),
    RTEAlertType_DownloadHtml_Fail(5),
    RTEAlertType_DownloadHtml_Expired(6),
    RTEAlertType_MultiTalk_Conflict(7),
    RTEAlertType_WNVersion_Conflict(8),
    RTEAlertType_Note_Too_Long(9),
    RTEAlertType_Note_Too_Much(10),
    RTEAlertType_Recording_Undo(11),
    RTEAlertType_Image_No_Exist(12),
    RTEAlertType_FileSize_Exceed_Max(13),
    RTEAlertType_Exceed_MaxSize(14),
    RTEAlertType_Max_Undo_Limit(15),
    RTEAlertType_Publish_Fail(16);


    /* renamed from: d, reason: collision with root package name */
    public final int f217627d;

    c(int i17) {
        this.f217627d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217627d;
    }
}
