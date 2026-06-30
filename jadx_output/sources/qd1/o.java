package qd1;

/* loaded from: classes7.dex */
public final class o implements com.tencent.mm.plugin.appbrand.widget.input.k2 {

    /* renamed from: d, reason: collision with root package name */
    public final fl1.b f361667d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f361668e;

    /* renamed from: f, reason: collision with root package name */
    public int f361669f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f361670g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f361671h = -1;

    public o(fl1.b bVar, com.tencent.mm.plugin.appbrand.e9 e9Var, qd1.i iVar) {
        this.f361667d = bVar;
        this.f361668e = e9Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public void a(boolean z17) {
        if (z17 == this.f361670g) {
            return;
        }
        this.f361670g = z17;
        b(z17, this.f361669f);
    }

    public final void b(boolean z17, int i17) {
        fl1.b bVar = this.f361667d;
        if (!z17) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) bVar.getContentView().getLayoutParams();
            layoutParams.addRule(14);
            layoutParams.removeRule(12);
            layoutParams.addRule(13);
            layoutParams.bottomMargin = 0;
            bVar.getContentView().setLayoutParams(layoutParams);
            return;
        }
        if (i17 > 0) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) bVar.getContentView().getLayoutParams();
            layoutParams2.removeRule(13);
            layoutParams2.addRule(12);
            layoutParams2.addRule(14);
            int i18 = this.f361671h;
            if (i18 <= 0) {
                com.tencent.mm.plugin.appbrand.page.v5 V0 = this.f361668e.V0();
                if (V0 == null) {
                    i18 = this.f361671h;
                } else {
                    int i19 = com.tencent.mm.plugin.appbrand.utils.f5.a(V0)[1];
                    xi1.e navigationBar = V0.getWindowAndroid().getNavigationBar();
                    int height = ((((i19 + i17) - V0.r1().getHeight()) - (navigationBar != null ? navigationBar.f454701a : 0)) - bVar.getContentView().getHeight()) / 2;
                    this.f361671h = height;
                    if (height <= i17) {
                        this.f361671h = i17 + 12;
                    }
                    i18 = this.f361671h;
                }
            }
            layoutParams2.bottomMargin = i18;
            bVar.getContentView().setLayoutParams(layoutParams2);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public void d(int i17) {
        if (this.f361669f != i17 && this.f361670g) {
            b(true, i17);
        }
        this.f361669f = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public int getHeight() {
        return this.f361669f;
    }
}
