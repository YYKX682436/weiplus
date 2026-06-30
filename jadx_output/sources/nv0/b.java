package nv0;

/* loaded from: classes5.dex */
public final class b implements nv0.e {

    /* renamed from: a, reason: collision with root package name */
    public final kz5.q f340424a = new kz5.q();

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n f340425b;

    public final boolean d(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel, android.view.ViewGroup viewGroup, zw0.e eVar, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.m mVar, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o oVar, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n nVar, boolean z17) {
        boolean z18;
        if (!com.tencent.mm.plugin.appbrand.utils.d5.a()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        java.lang.String name = baseComposingPanel.getClass().getName();
        kz5.q qVar = this.f340424a;
        if (!(qVar instanceof java.util.Collection) || !qVar.isEmpty()) {
            java.util.Iterator it = qVar.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel) it.next()).getClass().getName(), name)) {
                    z18 = true;
                    break;
                }
            }
        }
        z18 = false;
        if (!(!z18)) {
            return false;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.n nVar2 = this.f340425b;
        java.util.ArrayList arrayList = baseComposingPanel.f69210m;
        if (nVar2 != null) {
            nv0.b bVar = (nv0.b) baseComposingPanel.getChildPanelNavigation();
            bVar.getClass();
            if (bVar.f340425b == null) {
                bVar.f340425b = nVar2;
            }
            if (!arrayList.contains(nVar2)) {
                arrayList.add(nVar2);
            }
        }
        if (baseComposingPanel.getF69205e() == com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p.f69242d) {
            if (nVar != null && !arrayList.contains(nVar)) {
                arrayList.add(nVar);
            }
            if (viewGroup.getId() != com.tencent.mm.R.id.q8n) {
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            baseComposingPanel.d(viewGroup, this);
        }
        if (baseComposingPanel.getF69205e() == com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p.f69250o) {
            if (viewGroup.getId() != com.tencent.mm.R.id.q8n) {
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            baseComposingPanel.d(viewGroup, this);
        }
        if (baseComposingPanel.getF69205e() == com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p.f69245g || baseComposingPanel.getF69205e() == com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p.f69247i) {
            return false;
        }
        if (baseComposingPanel.isShown()) {
            java.util.Objects.toString(baseComposingPanel.getF69205e());
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            return false;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p f69205e = baseComposingPanel.getF69205e();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p pVar = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p.f69244f;
        if (f69205e != pVar) {
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p f69205e2 = baseComposingPanel.getF69205e();
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p pVar2 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p.f69248m;
            if (f69205e2 != pVar2) {
                java.util.Objects.toString(baseComposingPanel.getF69205e());
                pVar.toString();
                pVar2.toString();
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                return false;
            }
        }
        if (mVar != null) {
            baseComposingPanel.f69209i.add(mVar);
        }
        if (oVar != null) {
            baseComposingPanel.setPanelResultListener(oVar);
        }
        baseComposingPanel.A(z17, false, eVar);
        qVar.addFirst(baseComposingPanel);
        return true;
    }

    public boolean e(boolean z17) {
        if (!com.tencent.mm.plugin.appbrand.utils.d5.a()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close: ----> stack ");
        kz5.q qVar = this.f340424a;
        sb6.append(qVar.d());
        com.tencent.mars.xlog.Log.i("DefaultPanelNavigation", sb6.toString());
        if (qVar.isEmpty()) {
            return false;
        }
        if (qVar.isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel) qVar.f313999e[qVar.f313998d];
        if (!((nv0.b) baseComposingPanel.getChildPanelNavigation()).e(z17)) {
            return nv0.e.b(this, baseComposingPanel, z17, false, 4, null);
        }
        com.tencent.mars.xlog.Log.i("DefaultPanelNavigation", "close: ----> childPanelNavigation stack " + qVar.d());
        return false;
    }
}
