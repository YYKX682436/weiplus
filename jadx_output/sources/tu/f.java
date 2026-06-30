package tu;

/* loaded from: classes3.dex */
public final class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.appmsg.ui.RecordDetailUI f422063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f422064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu.f f422065f;

    public f(com.tencent.mm.feature.appmsg.ui.RecordDetailUI recordDetailUI, com.tencent.mm.storage.f9 f9Var, hu.f fVar) {
        this.f422063d = recordDetailUI;
        this.f422064e = f9Var;
        this.f422065f = fVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.feature.appmsg.ui.RecordDetailUI recordDetailUI = this.f422063d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            o72.c5 c5Var = (o72.c5) i95.n0.c(o72.c5.class);
            hu.f fVar = this.f422065f;
            long n17 = fVar.n();
            java.lang.String q17 = fVar.q();
            ((com.tencent.mm.pluginsdk.model.b2) c5Var).getClass();
            com.tencent.mm.pluginsdk.model.a2.i(doFavoriteEvent, n17, q17);
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6327m = 9;
            c4Var.f6323i = recordDetailUI;
            doFavoriteEvent.e();
            return;
        }
        java.lang.Object l17 = gm0.j1.u().c().l(327714, java.lang.Boolean.FALSE);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean b17 = kotlin.jvm.internal.o.b(l17, bool);
        com.tencent.mm.storage.f9 f9Var = this.f422064e;
        if (b17) {
            com.tencent.mm.feature.appmsg.ui.RecordDetailUI.U6(recordDetailUI, f9Var);
            return;
        }
        gm0.j1.u().c().w(327714, bool);
        androidx.appcompat.app.AppCompatActivity context = recordDetailUI.getContext();
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211729s = recordDetailUI.getResources().getString(com.tencent.mm.R.string.odd);
        aVar.f211709a = recordDetailUI.getResources().getString(com.tencent.mm.R.string.f490573yv);
        aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.f492294fz1);
        aVar.E = new tu.e(recordDetailUI, f9Var);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
    }
}
