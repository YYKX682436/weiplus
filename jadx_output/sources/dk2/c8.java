package dk2;

/* loaded from: classes3.dex */
public final class c8 extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(r45.ch1 msg) {
        super(msg);
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (getType() != 20050) {
            return null;
        }
        r45.ti1 ti1Var = new r45.ti1();
        com.tencent.mm.protobuf.g byteString = this.f234101a.getByteString(4);
        ti1Var.parseFrom(byteString != null ? byteString.g() : null);
        return ti1Var;
    }
}
