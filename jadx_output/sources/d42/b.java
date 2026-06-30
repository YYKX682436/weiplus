package d42;

/* loaded from: classes9.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static d42.b f226402b;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f226403a = null;

    public com.tencent.mm.sdk.platformtools.o4 a() {
        int n17 = j62.e.g().n();
        if (n17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExptIdMMKV", "uin err [%d]", java.lang.Integer.valueOf(n17));
            return null;
        }
        java.lang.String str = n17 + "_WxExptIdmmkv";
        if (!com.tencent.mm.sdk.platformtools.t8.D0(this.f226403a, str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExptIdMMKV", "%s get mmkv change uin old[%s] new[%s]", hashCode() + "", this.f226403a, str);
            this.f226403a = str;
        }
        return com.tencent.mm.sdk.platformtools.o4.M(this.f226403a);
    }

    public java.util.List b() {
        java.lang.String[] b17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.sdk.platformtools.o4 a17 = a();
        if (a17 != null && (b17 = a17.b()) != null && b17.length > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExptIdMMKV", "mmkv keys length is [%d] ", java.lang.Integer.valueOf(b17.length));
            for (int i17 = 0; i17 < b17.length; i17++) {
                r45.im0 im0Var = new r45.im0();
                j62.a g17 = j62.b.f().g(com.tencent.mm.sdk.platformtools.t8.P(b17[i17], 0));
                if (g17 != null) {
                    im0Var.f377144d = g17.f297879d;
                    im0Var.f377145e = g17.f297880e;
                    im0Var.f377146f = g17.f297881f;
                    im0Var.f377147g = a17.n(b17[i17]);
                    linkedList.add(im0Var);
                }
            }
        }
        return linkedList;
    }
}
