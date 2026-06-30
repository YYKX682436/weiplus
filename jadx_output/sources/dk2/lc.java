package dk2;

/* loaded from: classes3.dex */
public final class lc extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(r45.ch1 msg) {
        super(msg);
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (getType() != 20123) {
            return null;
        }
        r45.tj1 tj1Var = new r45.tj1();
        com.tencent.mm.protobuf.g byteString = this.f234101a.getByteString(4);
        tj1Var.parseFrom(byteString != null ? byteString.g() : null);
        return tj1Var;
    }
}
