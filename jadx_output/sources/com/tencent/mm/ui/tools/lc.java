package com.tencent.mm.ui.tools;

/* loaded from: classes9.dex */
public class lc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210555d;

    public lc(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI) {
        this.f210555d = showVideoUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210555d;
        if (itemId != 1) {
            if (itemId == 2) {
                showVideoUI.a7(showVideoUI.f210221f, showVideoUI);
                return;
            }
            if (itemId != 3) {
                return;
            }
            if (showVideoUI.f210229q) {
                h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
                com.tencent.mm.ui.tools.ShowVideoUI showVideoUI2 = this.f210555d;
                ((g90.s) vVar).Zi(showVideoUI2, showVideoUI2.f210236x, showVideoUI2.K, 2, 4, 2);
            }
            showVideoUI.getClass();
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            int intExtra = showVideoUI.getIntent().getIntExtra("key_favorite_source_type", 1);
            com.tencent.mm.pluginsdk.model.a2.h(doFavoriteEvent, 1, showVideoUI.f210221f, showVideoUI.f210220e, 0, "", "", true);
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6323i = showVideoUI;
            c4Var.f6327m = intExtra;
            doFavoriteEvent.e();
            if (showVideoUI.f210229q) {
                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).oj(2);
                return;
            }
            return;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        jd5.c cVar = new jd5.c();
        java.lang.String str = showVideoUI.f210221f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        cVar.r(str);
        java.lang.String str2 = showVideoUI.f210220e;
        cVar.o(str2 != null ? str2 : "");
        cVar.q(showVideoUI.f210222g);
        n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
        androidx.appcompat.app.AppCompatActivity context = showVideoUI.getContext();
        n13.r a17 = n13.r.a(1);
        a17.f334120d.f334139a = 9;
        ((dk5.b0) b0Var).Bi(context, cVar, a17);
        if (showVideoUI.getIntent().hasExtra("jumpChat")) {
            jx3.f.INSTANCE.d(25464, 27, 0, 2);
        }
        if (showVideoUI.f210229q) {
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).oj(1);
            h90.v vVar2 = (h90.v) i95.n0.c(h90.v.class);
            com.tencent.mm.ui.tools.ShowVideoUI showVideoUI3 = this.f210555d;
            ((g90.s) vVar2).Zi(showVideoUI3, showVideoUI3.f210236x, showVideoUI3.K, 2, 4, 1);
        }
    }
}
