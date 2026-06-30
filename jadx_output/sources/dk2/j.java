package dk2;

/* loaded from: classes3.dex */
public final class j extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r45.ch1 msg) {
        super(msg);
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (getType() != 1000067) {
            return null;
        }
        r45.qq1 qq1Var = new r45.qq1();
        com.tencent.mm.protobuf.g byteString = this.f234101a.getByteString(4);
        qq1Var.parseFrom(byteString != null ? byteString.g() : null);
        return qq1Var;
    }
}
