package zc0;

@j95.b
/* loaded from: classes11.dex */
public final class h extends jm0.o implements xs.i1 {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f471388m = new java.util.LinkedList();

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(uw3.a.class);
    }

    @Override // jm0.o
    public void Ni(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // jm0.o
    public void Vi() {
    }

    public java.lang.String Zi() {
        java.lang.String str = lp0.b.l() + "Repairer/";
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.u(str);
        }
        return str;
    }

    public java.lang.String aj(java.lang.String str, byte[] bArr, boolean z17) {
        if (str == null || bArr == null) {
            return "";
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(Zi() + str);
        java.lang.String o17 = r6Var.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        pm0.v.O("RepairerConfigThread", new zc0.g(o17, bArr, z17));
        java.lang.String o18 = r6Var.o();
        kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
        return o18;
    }

    public java.lang.String bj(java.lang.String str, com.tencent.mm.storage.z3 z3Var) {
        if (str == null || z3Var == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("UIN:" + z3Var.L + '\n');
        stringBuffer.append("Username:" + z3Var.d1() + '\n');
        stringBuffer.append("Alias:" + z3Var.t0() + '\n');
        stringBuffer.append("ConRemark:" + z3Var.w0() + '\n');
        stringBuffer.append("Nickname:" + z3Var.P0() + '\n');
        stringBuffer.append("ConRemarkPYFull:" + z3Var.y0() + '\n');
        stringBuffer.append("QuanPin:" + z3Var.U0() + '\n');
        stringBuffer.append("Type:" + java.lang.Integer.toBinaryString(z3Var.getType()) + '\n');
        stringBuffer.append("UiType:" + java.lang.Long.toBinaryString(z3Var.c1()) + '\n');
        stringBuffer.append("VerifyFlag:" + java.lang.Integer.toBinaryString(z3Var.f1()) + '\n');
        stringBuffer.append("BizType:" + z3Var.f236586x1 + '\n');
        stringBuffer.append("UsernameFlag:" + z3Var.e1() + '\n');
        stringBuffer.append("ShowHead:" + z3Var.W0() + '\n');
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(Zi() + str);
        java.lang.String o17 = r6Var.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.o.f(stringBuffer2, "toString(...)");
        byte[] bytes = stringBuffer2.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        pm0.v.O("RepairerConfigThread", new zc0.g(o17, bytes, true));
        java.lang.String o18 = r6Var.o();
        kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
        return o18;
    }
}
