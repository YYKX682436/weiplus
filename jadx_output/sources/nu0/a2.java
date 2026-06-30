package nu0;

/* loaded from: classes5.dex */
public final class a2 implements dy0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339864a;

    public a2(nu0.b4 b4Var) {
        this.f339864a = b4Var;
    }

    @Override // dy0.j
    public void a(android.view.View view, java.lang.Object obj) {
        dy0.a type = (dy0.a) obj;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(type, "type");
        nu0.b4 b4Var = this.f339864a;
        b4Var.f339880p0 = true;
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            yt0.c.Q5(b4Var, (nu0.s) ((jz5.n) b4Var.N).getValue(), null, false, zw0.b.f476554h, 6, null);
            nu0.i q76 = b4Var.q7();
            q76.V6("edit_word", "view_clk", q76.U6());
            return;
        }
        if (ordinal == 2) {
            yt0.c.Q5(b4Var, (nu0.p) ((jz5.n) b4Var.P).getValue(), null, false, zw0.b.f476553g, 6, null);
            nu0.i q77 = b4Var.q7();
            q77.V6("edit_page_paster", "view_clk", q77.U6());
            return;
        }
        if (ordinal == 4) {
            b4Var.Y1(b4Var.getActivity());
            return;
        }
        com.tencent.mars.xlog.Log.w("ImageComp.MainComposingUIC", "[initBottomBar] unknown type: " + type);
    }
}
