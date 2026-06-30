package gd2;

/* loaded from: classes8.dex */
public final class c implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.i f270525d;

    public c(gd2.i iVar) {
        this.f270525d = iVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        gd2.i iVar = this.f270525d;
        if (itemId == 1) {
            java.lang.String str = iVar.f270533b;
            if (r26.n0.N(str)) {
                com.tencent.mars.xlog.Log.w("FinderCommentImageMenu", "share image to friend fail, imgPath is blank");
                return;
            }
            if (com.tencent.mm.sdk.platformtools.y1.c(str)) {
                return;
            }
            i95.m c17 = i95.n0.c(n13.b0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            jd5.a aVar = new jd5.a();
            aVar.p(str);
            n13.r rVar = new n13.r();
            rVar.f334117a = true;
            rVar.f334120d.f334139a = 9;
            i95.m c18 = i95.n0.c(n13.b0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ((dk5.b0) ((n13.b0) c18)).Bi(iVar.f270532a, aVar, rVar);
            return;
        }
        if (itemId != 3) {
            if (itemId != 6) {
                return;
            }
            java.lang.String str2 = iVar.f270533b;
            if (r26.n0.N(str2)) {
                com.tencent.mars.xlog.Log.e("FinderCommentImageMenu", "gotoCircleToSearchUI curFilename is blank");
                return;
            }
            i95.m c19 = i95.n0.c(tg0.f1.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            ((sg0.e) ((tg0.f1) c19)).wi(iVar.f270532a, 3, 2, str2);
            return;
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity a17 = tm3.a.a(iVar.f270532a);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("FinderCommentImageMenu", "favImage failed: activity is null");
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        i95.m c27 = i95.n0.c(o72.c5.class);
        kotlin.jvm.internal.o.f(c27, "getService(...)");
        com.tencent.mm.pluginsdk.model.a2.g(doFavoriteEvent, 1, iVar.f270533b);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6323i = a17;
        c4Var.f6327m = 32;
        doFavoriteEvent.e();
    }
}
