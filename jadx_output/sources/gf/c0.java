package gf;

/* loaded from: classes7.dex */
public class c0 implements com.tencent.skyline.ISkylineScrollViewChange {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gf.d0 f271028a;

    public c0(gf.d0 d0Var) {
        this.f271028a = d0Var;
    }

    @Override // com.tencent.skyline.ISkylineScrollViewChange
    public void onScrollViewChange(double d17, double d18, double d19, double d27, double d28, double d29) {
        if (d29 <= 0.0d) {
            java.util.Iterator it = new java.util.HashSet(this.f271028a.H).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.page.la laVar = (com.tencent.mm.plugin.appbrand.page.la) it.next();
                if (laVar != null) {
                    laVar.a(0, 0, false, true);
                }
            }
        }
    }
}
