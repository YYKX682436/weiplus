package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f209761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f209762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f209763f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f209764g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(boolean z17, android.view.View view, android.view.View view2, boolean z18) {
        super(4);
        this.f209761d = z17;
        this.f209762e = view;
        this.f209763f = view2;
        this.f209764g = z18;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        android.view.View v17 = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        e3.d dVar = (e3.d) obj3;
        ((java.lang.Number) obj4).intValue();
        kotlin.jvm.internal.o.g(v17, "v");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("avoidNavigationBarForApi35CompatLandscapeMode navHeight=");
        sb6.append(intValue);
        sb6.append(" bottom=");
        sb6.append(dVar != null ? java.lang.Integer.valueOf(dVar.f247047d) : null);
        sb6.append(" left=");
        sb6.append(dVar != null ? java.lang.Integer.valueOf(dVar.f247044a) : null);
        sb6.append(" right=");
        sb6.append(dVar != null ? java.lang.Integer.valueOf(dVar.f247046c) : null);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("MicroMsg.Edge2EdgeHelper", sb6.toString());
        boolean z17 = this.f209761d;
        android.view.View view = this.f209762e;
        if (z17) {
            view.setPadding(dVar != null ? dVar.f247044a : view.getPaddingLeft(), view.getPaddingTop(), dVar != null ? dVar.f247046c : view.getPaddingRight(), view.getPaddingBottom());
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(dVar != null ? dVar.f247046c : marginLayoutParams.getMarginEnd());
            }
        }
        com.tencent.mm.ui.a4.b(com.tencent.mm.ui.a4.f197117a, intValue, dVar, this.f209763f, this.f209761d, this.f209764g);
        return jz5.f0.f302826a;
    }
}
