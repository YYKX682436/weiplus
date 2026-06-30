package fq0;

/* loaded from: classes7.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.x f265472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f265473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f265474f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(fq0.x xVar, int i17, int i18) {
        super(0);
        this.f265472d = xVar;
        this.f265473e = i17;
        this.f265474f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fq0.x xVar = this.f265472d;
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = xVar.f265488l;
        android.view.ViewGroup.LayoutParams layoutParams = magicSclViewContainer != null ? magicSclViewContainer.getLayoutParams() : null;
        int i17 = xVar.f265482f;
        int i18 = this.f265474f;
        int i19 = this.f265473e;
        boolean z17 = ((i19 == i17 || i19 == 0) && (i18 == xVar.f265483g || i18 == 0)) ? false : true;
        if (i19 > 0 && i19 != i17) {
            xVar.f265482f = i19;
            if (layoutParams != null) {
                layoutParams.width = vp0.b.b(java.lang.Integer.valueOf(i19));
            }
        }
        if (i18 > 0 && i18 != xVar.f265483g) {
            xVar.f265483g = i18;
            if (layoutParams != null) {
                layoutParams.height = vp0.b.b(java.lang.Integer.valueOf(i18));
            }
        }
        if (z17) {
            hq0.e0 e0Var = xVar.f265479c;
            if (e0Var != null) {
                e0Var.i(xVar);
            }
            yz5.a aVar = xVar.f265485i;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer2 = xVar.f265488l;
        if (magicSclViewContainer2 != null) {
            magicSclViewContainer2.setLayoutParams(layoutParams);
        }
        return jz5.f0.f302826a;
    }
}
