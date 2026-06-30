package md3;

/* loaded from: classes.dex */
public final class m extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f325857f = "";

    @Override // lc3.c0
    public java.lang.String f() {
        return "liveCustomBusiness";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i(this.f325857f, "[invoke] data = " + data);
        if (kotlin.jvm.internal.o.b(data.optString("type"), "5")) {
            byte[] Lj = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Lj();
            if (Lj != null) {
                if (!(Lj.length == 0)) {
                    yz5.l s17 = s();
                    lc3.a0 a0Var = new lc3.a0();
                    a0Var.put("live_cookie", android.util.Base64.encodeToString(Lj, 2));
                    m(a0Var);
                    s17.invoke(a0Var);
                    return;
                }
            }
            s().invoke(h(-1, ""));
        }
    }
}
