package h84;

/* loaded from: classes4.dex */
public abstract class h extends com.tencent.mm.plugin.sns.ui.widget.l {

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f279566o;

    /* renamed from: p, reason: collision with root package name */
    public final w64.n f279567p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f279568q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f279569r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f279570s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f279571t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f279572u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f279573v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f279574w;

    public h(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, int i17, i64.b1 b1Var, w64.n nVar) {
        super(str, yVar, view);
        this.f279566o = view;
        this.f279567p = nVar;
        this.f279568q = jz5.h.b(new h84.c(this));
        this.f279571t = jz5.h.b(new h84.d(this));
        this.f279572u = jz5.h.b(new h84.g(this));
        this.f279573v = jz5.h.b(new h84.e(this));
        this.f279574w = jz5.h.b(new h84.f(this));
        jz5.h.b(new h84.b(this));
    }

    public static final /* synthetic */ android.widget.FrameLayout y(h84.h hVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMWxaGameGiftTagViewContent$p", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        android.widget.FrameLayout frameLayout = hVar.f279570s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMWxaGameGiftTagViewContent$p", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        return frameLayout;
    }

    public final android.widget.ImageView A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMWxaTagClickIcon", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f279573v).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMWxaTagClickIcon", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        return imageView;
    }

    public final android.widget.TextView B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMWxaTagClickText", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f279574w).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMWxaTagClickText", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        return textView;
    }

    public final android.widget.TextView C() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMWxaTagText", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f279572u).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMWxaTagText", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        return textView;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void d(java.lang.Object obj, boolean z17) {
        java.lang.Object m521constructorimpl;
        android.content.Context context;
        android.content.res.Resources resources;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo model = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        kotlin.jvm.internal.o.g(model, "model");
        java.lang.Integer num = null;
        android.view.View view = this.f279566o;
        android.content.Context context2 = view != null ? view.getContext() : null;
        if (context2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        } else {
            if (!this.f279569r) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMWxaGameGiftTagViewStub", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
                android.view.ViewStub viewStub = (android.view.ViewStub) ((jz5.n) this.f279568q).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMWxaGameGiftTagViewStub", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
                android.view.View h17 = a84.y0.h(viewStub);
                this.f279570s = h17 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) h17 : null;
                this.f279569r = true;
            }
            s34.c1 c1Var = model.getAdXml().adWeAppGameGiftTagInfo;
            if (c1Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
            } else {
                java.lang.String str = c1Var.f402603e;
                android.widget.FrameLayout frameLayout = this.f279570s;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scaleHeightWithText", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
                if (frameLayout == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scaleHeightWithText", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
                } else if (frameLayout.getLayoutParams() == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scaleHeightWithText", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
                } else {
                    frameLayout.getLayoutParams().height = (int) (i65.a.b(context2, 36) * i65.a.q(context2));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scaleHeightWithText", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
                }
                a84.v0.a(context2, z(), 36, 36);
                a84.v0.a(context2, A(), 16, 16);
                android.widget.TextView C = C();
                android.view.ViewGroup.LayoutParams layoutParams = C != null ? C.getLayoutParams() : null;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIcon", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIcon", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                java.lang.String str2 = c1Var.f402599a;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    android.widget.ImageView z18 = z();
                    if (z18 != null) {
                        z18.setVisibility(8);
                    }
                    if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = a84.d0.a(12);
                    }
                } else {
                    android.widget.ImageView z19 = z();
                    if (z19 != null) {
                        z19.setVisibility(0);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIcon", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIcon", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                    a84.m.a(str2, z());
                    if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = a84.d0.a(8);
                    }
                }
                android.widget.TextView C2 = C();
                if (C2 != null) {
                    C2.setLayoutParams(layoutParams);
                }
                com.tencent.mm.smiley.x1 Di = com.tencent.mm.smiley.x1.Di();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDescText", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDescText", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                android.text.SpannableString Ri = Di.Ri(c1Var.f402600b, true);
                android.widget.TextView C3 = C();
                if (C3 != null) {
                    C3.setText(Ri);
                }
                android.widget.TextView B = B();
                if (B != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickText", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickText", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                    B.setText(c1Var.f402601c);
                }
                android.widget.TextView B2 = B();
                android.view.ViewGroup.LayoutParams layoutParams2 = B2 != null ? B2.getLayoutParams() : null;
                if (com.tencent.mm.sdk.platformtools.t8.K0(c1Var.b()) || com.tencent.mm.sdk.platformtools.t8.K0(c1Var.c())) {
                    android.widget.ImageView A = A();
                    if (A != null) {
                        A.setVisibility(8);
                    }
                    if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = a84.d0.a(8);
                    }
                } else {
                    android.widget.ImageView A2 = A();
                    if (A2 != null) {
                        A2.setVisibility(0);
                    }
                    a84.m.a(com.tencent.mm.ui.bk.C() ? c1Var.c() : c1Var.b(), A());
                    if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = a84.d0.a(2);
                    }
                }
                android.widget.TextView B3 = B();
                if (B3 != null) {
                    B3.setLayoutParams(layoutParams2);
                }
                android.widget.TextView C4 = C();
                if (C4 != null && (context = C4.getContext()) != null && (resources = context.getResources()) != null) {
                    num = java.lang.Integer.valueOf(resources.getColor(com.tencent.mm.R.color.Link_100));
                }
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickTextColor", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickTextColor", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                    num = java.lang.Integer.valueOf(android.graphics.Color.parseColor(c1Var.f402602d));
                    if (com.tencent.mm.ui.bk.C()) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickTextColorDark", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickTextColorDark", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickTextColorDark", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickTextColorDark", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                            num = java.lang.Integer.valueOf(android.graphics.Color.parseColor(str));
                        }
                    }
                    m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                    ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
                }
                kotlin.Result.m527isFailureimpl(m521constructorimpl);
                if (num != null) {
                    int intValue = num.intValue();
                    android.widget.TextView B4 = B();
                    if (B4 != null) {
                        B4.setTextColor(intValue);
                    }
                }
                android.widget.FrameLayout frameLayout2 = this.f279570s;
                if (frameLayout2 != null) {
                    frameLayout2.setClipToOutline(true);
                }
                android.widget.FrameLayout frameLayout3 = this.f279570s;
                if (frameLayout3 != null) {
                    frameLayout3.setOutlineProvider(new al5.z1(a84.d0.a(4)));
                }
                android.widget.FrameLayout frameLayout4 = this.f279570s;
                if (frameLayout4 != null) {
                    frameLayout4.setOnClickListener(new h84.a(this, c1Var, model));
                }
                android.widget.FrameLayout frameLayout5 = this.f279570s;
                if (frameLayout5 != null) {
                    frameLayout5.setVisibility(0);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void v(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        super.v((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        android.widget.FrameLayout frameLayout = this.f279570s;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
    }

    public final android.widget.ImageView z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMWxaGameIcon", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f279571t).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMWxaGameIcon", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        return imageView;
    }
}
