package r45;

/* loaded from: classes3.dex */
public enum n72 implements com.tencent.mm.protobuf.h {
    kActionType_ExplainProduct(6),
    /* JADX INFO: Fake field, exist only in values array */
    kActionType_UpdateTheme(9),
    kActionType_AiassistantFeedBack(14),
    kActionType_ShareLive(1),
    /* JADX INFO: Fake field, exist only in values array */
    kActionType_Pk(10),
    /* JADX INFO: Fake field, exist only in values array */
    kActionType_UnKnown(0),
    kActionType_AiassistantClose(13),
    kActionType_CreateNotice(8),
    kActionType_SetLiveRoomCoverImg(3),
    kActionType_CreateLottery(7),
    kActionType_AiassistantClicked(12),
    kActionType_AiassistantTextOutOfLimit(15),
    kActionType_SetWishList(5),
    kActionType_SetBackGroundMusic(2),
    /* JADX INFO: Fake field, exist only in values array */
    kActionType_ModVideoQualityLevel(16),
    kActionType_CreateFansClub(4),
    kActionType_AiassistantExposed(11);


    /* renamed from: d, reason: collision with root package name */
    public final int f381129d;

    n72(int i17) {
        this.f381129d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f381129d;
    }
}
