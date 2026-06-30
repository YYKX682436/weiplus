package sr2;

/* loaded from: classes2.dex */
public final class d implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.f f411534d;

    public d(sr2.f fVar) {
        this.f411534d = fVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        j92.a aVar;
        java.util.HashSet<com.tencent.mm.ui.component.UIComponent> uiComponents;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        j92.a aVar2 = (j92.a) holder.f293125i;
        if (aVar2.f298353e) {
            return;
        }
        sr2.f fVar = this.f411534d;
        java.util.ArrayList arrayList = fVar.f411557n;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            aVar = null;
            while (it.hasNext()) {
                j92.a aVar3 = (j92.a) it.next();
                if (aVar3.f298353e) {
                    aVar = aVar3;
                }
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.f298353e = false;
        }
        aVar2.f298353e = true;
        adapter.notifyDataSetChanged();
        l40.e eVar = (l40.e) i95.n0.c(l40.e.class);
        androidx.appcompat.app.AppCompatActivity context = fVar.getActivity();
        m92.b bVar = aVar2.f298352d;
        java.lang.String field_username = bVar.field_username;
        kotlin.jvm.internal.o.f(field_username, "field_username");
        ((k40.f) eVar).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        g92.b.f269769e.z0(context, field_username);
        java.lang.String e17 = xy2.c.e(fVar.getActivity());
        fVar.f411550d = e17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            fVar.f411551e = ya2.h.f460484a.b(fVar.f411550d);
        }
        fVar.P6();
        fVar.getActivity().getIntent().putExtra("KEY_FINDER_USERNAME_SELF", fVar.f411550d);
        androidx.appcompat.app.AppCompatActivity activity = fVar.getActivity();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity : null;
        if (mMFinderUI != null && (uiComponents = mMFinderUI.getUiComponents()) != null) {
            for (pf5.g gVar : uiComponents) {
                if (gVar instanceof ya2.r1) {
                    ((ya2.r1) gVar).w4(bVar);
                }
            }
        }
        com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer finderAccountSwitchDrawer = fVar.f411556m;
        if (finderAccountSwitchDrawer != null) {
            com.tencent.mm.view.drawer.RecyclerViewDrawer.o(finderAccountSwitchDrawer, false, 1, null);
        }
    }
}
