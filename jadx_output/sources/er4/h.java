package er4;

/* loaded from: classes14.dex */
public enum h implements com.tencent.mm.protobuf.h {
    VOIPMP_FINISH_REASON_UNKNOWN(0),
    VOIPMP_FINISH_REASON_ERROR(1),
    VOIPMP_FINISH_REASON_INVITE_TIMEOUT(2),
    VOIPMP_FINISH_REASON_CANCEL(3),
    VOIPMP_FINISH_REASON_REJECT(4),
    VOIPMP_FINISH_REASON_ANOTHER_REJECT(5),
    VOIPMP_FINISH_REASON_BUSY(6),
    VOIPMP_FINISH_REASON_ANOTHER_HANGUP(7),
    VOIPMP_FINISH_REASON_ANOTHER_CANCEL(8);


    /* renamed from: d, reason: collision with root package name */
    public final int f256098d;

    h(int i17) {
        this.f256098d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f256098d;
    }
}
