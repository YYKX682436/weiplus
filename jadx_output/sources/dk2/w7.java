package dk2;

/* loaded from: classes3.dex */
public final class w7 extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(r45.ch1 msg) {
        super(msg);
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (getType() != 20031) {
            return null;
        }
        r45.qi1 qi1Var = new r45.qi1();
        com.tencent.mm.protobuf.g byteString = this.f234101a.getByteString(4);
        qi1Var.parseFrom(byteString != null ? byteString.g() : null);
        zl2.r4.f473950a.M2("FinderLiveGlobalLevelUpgradeMsg", "userlevelTest," + qi1Var);
        if (qi1Var.getInteger(0) == 1 || qi1Var.getInteger(0) == 2) {
            return qi1Var;
        }
        return null;
    }

    public java.lang.String toString() {
        java.lang.Object D = D();
        if (!(D instanceof r45.qi1)) {
            return super.toString();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nickNake:");
        sb6.append(k());
        sb6.append('-');
        sb6.append(y());
        sb6.append(",type:");
        r45.qi1 qi1Var = (r45.qi1) D;
        sb6.append(qi1Var.getInteger(0));
        sb6.append(",level:");
        sb6.append(qi1Var.getInteger(1));
        sb6.append('-');
        sb6.append(qi1Var.getInteger(2));
        sb6.append(",showFlag:");
        sb6.append(qi1Var.getLong(3));
        return sb6.toString();
    }
}
