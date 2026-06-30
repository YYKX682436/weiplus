package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class wh extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ai f136344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(com.tencent.mm.plugin.finder.viewmodel.component.ai aiVar) {
        super(1);
        this.f136344d = aiVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gx2.q it = (gx2.q) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.viewmodel.component.ai aiVar = this.f136344d;
        java.util.Iterator it6 = aiVar.f133779f.iterator();
        while (it6.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it6.next()).b();
        }
        aiVar.f133779f.clear();
        gx2.q qVar = aiVar.f133777d;
        if (qVar != null) {
            android.view.ViewParent parent = qVar.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(qVar);
            }
        }
        aiVar.f133777d = null;
        return jz5.f0.f302826a;
    }
}
