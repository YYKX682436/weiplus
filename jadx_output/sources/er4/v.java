package er4;

/* loaded from: classes6.dex */
public enum v implements com.tencent.mm.protobuf.h {
    VOIPMP_SYSTEM_CALL_STATUS_IDLE(0),
    VOIPMP_SYSTEM_CALL_STATUS_RINGING(1),
    VOIPMP_SYSTEM_CALL_STATUS_OFFHOOK(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f256185d;

    v(int i17) {
        this.f256185d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f256185d;
    }
}
