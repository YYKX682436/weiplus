package sb2;

/* loaded from: classes2.dex */
public final class l extends tc2.c implements uc2.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public android.view.View Y6() {
        in5.s0 s0Var = this.f417141d.f417149i;
        if (s0Var != null) {
            return s0Var.p(com.tencent.mm.R.id.efr);
        }
        return null;
    }

    public cw2.da Z6() {
        in5.s0 s0Var = this.f417141d.f417149i;
        android.view.View p17 = s0Var != null ? s0Var.p(com.tencent.mm.R.id.f484869fs3) : null;
        com.tencent.mm.plugin.finder.view.FinderVideoBanner finderVideoBanner = p17 instanceof com.tencent.mm.plugin.finder.view.FinderVideoBanner ? (com.tencent.mm.plugin.finder.view.FinderVideoBanner) p17 : null;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout mediaView = finderVideoBanner != null ? finderVideoBanner.getMediaView() : null;
        if (mediaView != null) {
            return mediaView.getVideoView();
        }
        return null;
    }

    public boolean a7(com.tencent.mm.protocal.protobuf.FinderObject feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        in5.r rVar = this.f417141d.f417150m;
        if ((rVar instanceof com.tencent.mm.plugin.finder.convert.zf ? (com.tencent.mm.plugin.finder.convert.zf) rVar : null) != null) {
            return ((java.lang.Boolean) nv2.n1.f340551h.k(feed).f302833d).booleanValue();
        }
        return false;
    }

    public android.view.View b7() {
        in5.s0 s0Var = this.f417141d.f417149i;
        if (s0Var != null) {
            return s0Var.p(com.tencent.mm.R.id.a_x);
        }
        return null;
    }

    public r45.qt2 c7() {
        android.content.Context context;
        in5.s0 s0Var = this.f417141d.f417149i;
        if (s0Var == null || (context = s0Var.f293121e) == null) {
            return null;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null) {
            return nyVar.V6();
        }
        return null;
    }

    public android.view.View d7() {
        in5.s0 s0Var = this.f417141d.f417149i;
        if (s0Var != null) {
            return s0Var.p(com.tencent.mm.R.id.f486682m44);
        }
        return null;
    }

    public android.view.View e7() {
        in5.s0 s0Var = this.f417141d.f417149i;
        if (s0Var != null) {
            return s0Var.p(com.tencent.mm.R.id.msw);
        }
        return null;
    }

    public void f7(java.lang.String clickShareType, in5.s0 holder, so2.h1 item, android.view.View it, int i17) {
        kotlin.jvm.internal.o.g(clickShareType, "clickShareType");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(it, "it");
        in5.r rVar = this.f417141d.f417150m;
        com.tencent.mm.plugin.finder.convert.zf zfVar = rVar instanceof com.tencent.mm.plugin.finder.convert.zf ? (com.tencent.mm.plugin.finder.convert.zf) rVar : null;
        if (zfVar != null) {
            java.lang.String str = com.tencent.mm.plugin.finder.convert.zf.D1;
            com.tencent.mm.plugin.finder.convert.zf.D1 = clickShareType;
            zfVar.n0(holder, item, it, i17);
        }
    }
}
