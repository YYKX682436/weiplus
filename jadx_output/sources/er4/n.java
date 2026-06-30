package er4;

/* loaded from: classes6.dex */
public enum n implements com.tencent.mm.protobuf.h {
    VoIPMP_MEMBER_SCREEN_STATUS_NONE(0),
    VoIPMP_MEMBER_SCREEN_STATUS_START(1),
    VoIPMP_MEMBER_SCREEN_STATUS_PAUSE(2),
    VoIPMP_MEMBER_SCREEN_STATUS_UNKOWN(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f256135d;

    n(int i17) {
        this.f256135d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f256135d;
    }
}
