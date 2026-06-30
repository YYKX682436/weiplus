package i81;

/* loaded from: classes7.dex */
public final class b implements al1.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final al1.b f289521d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f289522e;

    /* renamed from: f, reason: collision with root package name */
    public final mi1.i f289523f;

    public b(android.content.Context context, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        android.content.Context context2;
        com.tencent.mm.plugin.appbrand.page.ud s07;
        kotlin.jvm.internal.o.g(context, "context");
        al1.b bVar = new al1.b(context);
        this.f289521d = bVar;
        this.f289522e = appBrandRuntime;
        android.view.View findViewById = bVar.findViewById(com.tencent.mm.R.id.em9);
        kotlin.jvm.internal.o.d(findViewById);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        viewGroup.removeAllViews();
        if (appBrandRuntime == null || (s07 = appBrandRuntime.s0()) == null || (context2 = s07.b(com.tencent.mm.sdk.platformtools.x2.f193071a, mi1.i.class)) == null) {
            context2 = bVar.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
        }
        mi1.i iVar = new mi1.i(context2);
        this.f289523f = iVar;
        viewGroup.addView(iVar, new android.widget.FrameLayout.LayoutParams(-2, -2, 8388629));
        bVar.setCapsuleBarInteractionDelegate(new i81.a(this));
    }

    public void a(boolean z17, al1.h0 h0Var) {
        this.f289521d.l(z17, h0Var);
    }

    @Override // al1.k0
    public android.view.View getActionView() {
        return this.f289521d.getActionView();
    }

    @Override // al1.k0
    /* renamed from: getBackgroundColor */
    public int getF5791d() {
        return this.f289521d.getF5791d();
    }

    @Override // al1.k0
    public void setBackButtonClickListener(android.view.View.OnClickListener onClickListener) {
        this.f289521d.setBackButtonClickListener(onClickListener);
    }

    @Override // al1.k0
    public void setBackgroundColor(int i17) {
        this.f289521d.setBackgroundColor(i17);
    }

    @Override // al1.k0
    public void setCloseButtonClickListener(android.view.View.OnClickListener onClickListener) {
        this.f289521d.setCloseButtonClickListener(onClickListener);
    }

    @Override // al1.k0
    public void setForegroundColor(int i17) {
        this.f289521d.setForegroundColor(i17);
    }

    @Override // al1.k0
    public void setForegroundStyle(java.lang.String str) {
        this.f289521d.setForegroundStyle(str);
    }

    @Override // al1.k0
    public void setLoadingIconVisibility(boolean z17) {
        this.f289521d.setLoadingIconVisibility(z17);
    }

    @Override // al1.k0
    public void setMainTitle(java.lang.CharSequence charSequence) {
        this.f289521d.setMainTitle(charSequence);
    }

    @Override // al1.k0
    public void setNavHidden(boolean z17) {
        this.f289521d.setNavHidden(z17);
    }
}
