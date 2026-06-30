package w82;

/* loaded from: classes11.dex */
public class c0 implements w82.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView f443830d;

    public c0(com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView favSearchActionView) {
        this.f443830d = favSearchActionView;
    }

    @Override // db5.t6
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView favSearchActionView = this.f443830d;
        favSearchActionView.c(favSearchActionView.f101550e.getEditText());
        ((java.util.LinkedList) favSearchActionView.f101552g).remove(str);
        favSearchActionView.b();
        w82.e0 e0Var = favSearchActionView.f101554i;
        if (e0Var == null) {
            return;
        }
        ((com.tencent.mm.plugin.fav.ui.j5) e0Var).a(favSearchActionView.f101551f, favSearchActionView.f101553h, favSearchActionView.f101552g, true);
    }

    @Override // db5.t6
    public void c() {
        w82.e0 e0Var = this.f443830d.f101554i;
        if (e0Var == null) {
            return;
        }
        com.tencent.mm.plugin.fav.ui.j5 j5Var = (com.tencent.mm.plugin.fav.ui.j5) e0Var;
        j5Var.getClass();
        int i17 = com.tencent.mm.plugin.fav.ui.FavSearchUI.N;
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = j5Var.f101199a;
        if (favSearchUI.a7()) {
            return;
        }
        com.tencent.mm.plugin.fav.ui.FavSearchUI.Y6(favSearchUI);
    }

    @Override // db5.t6
    public void d(java.lang.String str) {
        int i17 = com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView.f101548m;
        com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView favSearchActionView = this.f443830d;
        favSearchActionView.c(str);
        ((com.tencent.mm.plugin.fav.ui.j5) favSearchActionView.f101554i).a(favSearchActionView.f101551f, favSearchActionView.f101553h, favSearchActionView.f101552g, false);
    }

    @Override // db5.t6
    public void f(java.lang.String str) {
        this.f443830d.f101550e.p(str);
        a(str);
    }

    @Override // db5.t6
    public void g(java.lang.String str) {
        com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView favSearchActionView = this.f443830d;
        favSearchActionView.c(favSearchActionView.f101550e.getEditText());
        favSearchActionView.b();
        w82.e0 e0Var = favSearchActionView.f101554i;
        if (e0Var == null) {
            return;
        }
        java.util.List list = favSearchActionView.f101551f;
        java.util.List list2 = favSearchActionView.f101553h;
        java.util.List list3 = favSearchActionView.f101552g;
        com.tencent.mm.plugin.fav.ui.j5 j5Var = (com.tencent.mm.plugin.fav.ui.j5) e0Var;
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = j5Var.f101199a;
        favSearchUI.f100402p.post(new com.tencent.mm.plugin.fav.ui.i5(j5Var, list2, list3, list));
        if (str != null) {
            favSearchUI.H = str;
            favSearchUI.F.f434073g = v82.b.a();
            favSearchUI.F.f434077k = java.lang.System.currentTimeMillis();
        } else {
            favSearchUI.H = "";
        }
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = favSearchUI.f100400n;
        if (cVar != null) {
            java.lang.String str2 = favSearchUI.H;
            if (str2 != null) {
                cVar.H = str2;
            } else {
                cVar.H = "";
            }
        }
    }

    @Override // db5.t6
    public void h(java.lang.String str) {
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
    }
}
