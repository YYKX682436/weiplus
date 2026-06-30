package re5;

/* loaded from: classes8.dex */
public final class h implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re5.s f394575d;

    public h(re5.s sVar) {
        this.f394575d = sVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        gg3.c cVar;
        int itemId = menuItem.getItemId();
        re5.f[] fVarArr = re5.f.f394573d;
        re5.s sVar = this.f394575d;
        if (itemId == 0) {
            gg3.c cVar2 = sVar.f394595h;
            if (cVar2 != null) {
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity a17 = tm3.a.a(sVar.getContext());
                java.lang.String str = cVar2.f271728c;
                java.lang.String str2 = cVar2.f271729d;
                com.tencent.mm.xwebutil.i.f(a17, str, str2, com.tencent.mm.vfs.w6.n(str2), 0L, "", true);
                return;
            }
            return;
        }
        if (itemId == 2) {
            gg3.c cVar3 = sVar.f394595h;
            if (cVar3 != null) {
                zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                android.app.Activity context = sVar.getContext();
                re5.n nVar = new re5.n(sVar);
                ((yb0.g) b0Var).getClass();
                com.tencent.mm.platformtools.ExportFileUtil.e(context, cVar3.f271728c, cVar3.f271729d, nVar);
                return;
            }
            return;
        }
        if (itemId != 1 || (cVar = sVar.f394595h) == null) {
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        boolean k17 = com.tencent.mm.pluginsdk.model.a2.k(doFavoriteEvent, 1, cVar.f271728c, cVar.f271729d, "", "");
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (!k17) {
            dp.a.makeText(sVar.getContext(), c4Var.f6326l, 1).show();
            return;
        }
        c4Var.f6323i = tm3.a.a(sVar.getContext());
        c4Var.f6327m = 1;
        doFavoriteEvent.e();
    }
}
