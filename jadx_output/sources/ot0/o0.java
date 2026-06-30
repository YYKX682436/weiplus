package ot0;

/* loaded from: classes9.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int f348616a;

    /* renamed from: b, reason: collision with root package name */
    public int f348617b;

    public static final ot0.o0 a(java.lang.String str) {
        java.util.Map map;
        ot0.o0 o0Var = new ot0.o0();
        ot0.q v17 = ot0.q.v(str);
        if (v17 != null && (map = v17.G2) != null) {
            o0Var.f348616a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.xmlfulllen"), 0);
            o0Var.f348617b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.realinnertype"), 0);
        }
        return o0Var;
    }
}
