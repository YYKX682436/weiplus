package er4;

/* loaded from: classes14.dex */
public enum o implements com.tencent.mm.protobuf.h {
    VoIPMP_MEMBER_STATUS_UNKOWN(0),
    VoIPMP_MEMBER_STATUS_JOINED(1),
    VoIPMP_MEMBER_STATUS_CALLEE(2),
    VoIPMP_MEMBER_STATUS_ACKED(3),
    VoIPMP_MEMBER_STATUS_EXIT(4),
    VoIPMP_MEMBER_STATUS_CANCEL(5),
    VoIPMP_MEMBER_STATUS_BUSY(6),
    VoIPMP_MEMBER_STATUS_REJECT(7),
    VoIPMP_MEMBER_STATUS_NO_RESP(8);


    /* renamed from: d, reason: collision with root package name */
    public final int f256146d;

    o(int i17) {
        this.f256146d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f256146d;
    }
}
