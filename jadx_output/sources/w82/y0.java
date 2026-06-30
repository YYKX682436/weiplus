package w82;

/* loaded from: classes11.dex */
public final class y0 implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel f443947d;

    public y0(com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel favTopTagPanel) {
        this.f443947d = favTopTagPanel;
    }

    @Override // db5.t6
    public void a(java.lang.String str) {
    }

    @Override // db5.t6
    public void c() {
    }

    @Override // db5.t6
    public void d(java.lang.String str) {
    }

    @Override // db5.t6
    public void f(java.lang.String str) {
    }

    @Override // db5.t6
    public void g(java.lang.String str) {
        w82.o0 o0Var;
        com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel favTopTagPanel = this.f443947d;
        favTopTagPanel.f101564y0 = favTopTagPanel.f101563x0;
        favTopTagPanel.f101563x0 = str;
        favTopTagPanel.f101560l1 = 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTopTagPanel", "[onTagEditTextChange] lastText = " + favTopTagPanel.f101564y0 + ", currText = " + favTopTagPanel.f101563x0 + ", curText = " + str);
        if (kotlin.jvm.internal.o.b(favTopTagPanel.f101564y0, str) || (o0Var = favTopTagPanel.S) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "[onContentChange] content = " + str);
        com.tencent.mm.plugin.fav.ui.z7.a(((com.tencent.mm.plugin.fav.ui.u7) o0Var).f101472a);
    }

    @Override // db5.t6
    public void h(java.lang.String str) {
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
    }
}
