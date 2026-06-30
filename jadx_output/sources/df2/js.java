package df2;

/* loaded from: classes10.dex */
public final class js implements ym5.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230497a;

    public js(df2.lt ltVar) {
        this.f230497a = ltVar;
    }

    @Override // ym5.n3
    public void a(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
    }

    @Override // ym5.n3
    public boolean b(int i17, android.view.MotionEvent event, boolean z17) {
        kotlin.jvm.internal.o.g(event, "event");
        if (event.getAction() == 0) {
            java.lang.String str = df2.lt.W;
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "bannerRv action down");
            kotlinx.coroutines.r2 r2Var = this.f230497a.B;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
        }
        return z17;
    }
}
