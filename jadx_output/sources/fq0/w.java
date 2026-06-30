package fq0;

/* loaded from: classes7.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.x f265475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer f265476e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(fq0.x xVar, com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer) {
        super(0);
        this.f265475d = xVar;
        this.f265476e = magicSclViewContainer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fq0.x xVar = this.f265475d;
        hq0.e0 e0Var = xVar.f265479c;
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = this.f265476e;
        if (e0Var != null) {
            hq0.k0 k0Var = e0Var.f282988i.f282998m;
            k0Var.getClass();
            java.lang.String frameSetId = xVar.f265478b;
            kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
            java.util.Collection values = k0Var.f283028a.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : values) {
                if (kotlin.jvm.internal.o.b(((hq0.j0) obj).f283013b, frameSetId)) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                android.view.View view = ((hq0.j0) it.next()).f283018g;
                if (view != null) {
                    arrayList2.add(view);
                }
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                android.view.View view2 = (android.view.View) it6.next();
                android.view.ViewParent parent = view2.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view2);
                }
                if (magicSclViewContainer != null) {
                    magicSclViewContainer.addView(view2, view2.getLayoutParams());
                }
            }
        }
        android.view.ViewParent parent2 = magicSclViewContainer != null ? magicSclViewContainer.getParent() : null;
        android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
        if (viewGroup2 != null) {
            viewGroup2.setClipChildren(xVar.f265486j);
        }
        android.view.ViewGroup.LayoutParams layoutParams = magicSclViewContainer != null ? magicSclViewContainer.getLayoutParams() : null;
        int i17 = xVar.f265482f;
        if (i17 > 0 && layoutParams != null) {
            layoutParams.width = vp0.b.b(java.lang.Integer.valueOf(i17));
        }
        int i18 = xVar.f265483g;
        if (i18 > 0 && layoutParams != null) {
            layoutParams.height = vp0.b.b(java.lang.Integer.valueOf(i18));
        }
        if (magicSclViewContainer != null) {
            magicSclViewContainer.setLayoutParams(layoutParams);
        }
        return jz5.f0.f302826a;
    }
}
