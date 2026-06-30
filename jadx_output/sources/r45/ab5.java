package r45;

/* loaded from: classes11.dex */
public enum ab5 implements com.tencent.mm.protobuf.h {
    E_CMD_UNKNOWN(0),
    E_CMD_CLEAR_MSG(1),
    E_CMD_ENTER_FROMHB(2),
    E_CMD_ENTER_FROMCARD(3),
    E_CMD_ENTER_FROMSEARCH(4),
    /* JADX INFO: Fake field, exist only in values array */
    E_CMD_SEND_LOGIN_TOKEN(5),
    E_CMD_ENTER_FROM_QRSCAN(6);


    /* renamed from: d, reason: collision with root package name */
    public final int f369896d;

    ab5(int i17) {
        this.f369896d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f369896d;
    }
}
