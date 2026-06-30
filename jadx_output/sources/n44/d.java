package n44;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f334915a;

    /* renamed from: b, reason: collision with root package name */
    public final int f334916b;

    /* renamed from: c, reason: collision with root package name */
    public final int f334917c;

    /* renamed from: d, reason: collision with root package name */
    public final int f334918d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f334919e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f334920f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f334921g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f334922h;

    public d(android.content.Context context, int i17, int i18, int i19, boolean z17, int i27, kotlin.jvm.internal.i iVar) {
        i17 = (i27 & 2) != 0 ? com.tencent.mm.R.color.f478605ae2 : i17;
        i18 = (i27 & 4) != 0 ? com.tencent.mm.R.color.adz : i18;
        i19 = (i27 & 8) != 0 ? com.tencent.mm.R.drawable.f481875cp4 : i19;
        z17 = (i27 & 16) != 0 ? true : z17;
        kotlin.jvm.internal.o.g(context, "context");
        this.f334915a = context;
        this.f334916b = i17;
        this.f334917c = i18;
        this.f334918d = i19;
        this.f334919e = z17;
        this.f334920f = jz5.h.b(new n44.c(this));
        this.f334921g = jz5.h.b(new n44.a(this));
        jz5.h.b(new n44.b(this));
    }

    public final android.view.View a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeaderLine", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
        android.view.View view = (android.view.View) ((jz5.n) this.f334920f).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeaderLine", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
        return view;
    }

    public final android.view.View b() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        android.view.View findViewById;
        android.view.View findViewById2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
        android.view.View view = this.f334922h;
        android.content.Context context = this.f334915a;
        if (view == null) {
            this.f334922h = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dji, (android.view.ViewGroup) null);
        }
        android.view.View view2 = this.f334922h;
        if (view2 != null && (findViewById2 = view2.findViewById(com.tencent.mm.R.id.f485216gy1)) != null) {
            findViewById2.setBackgroundResource(this.f334918d);
        }
        android.view.View view3 = this.f334922h;
        boolean z17 = this.f334919e;
        if (view3 != null && (findViewById = view3.findViewById(com.tencent.mm.R.id.gxy)) != null) {
            if (!z17) {
                findViewById.getLayoutParams().height = -2;
            }
            findViewById.setBackgroundColor(context.getResources().getColor(this.f334916b));
        }
        android.view.View view4 = this.f334922h;
        if (view4 != null && (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view4.findViewById(com.tencent.mm.R.id.gxz)) != null) {
            weImageView.setVisibility(z17 ? 0 : 8);
            weImageView.setIconColor(context.getResources().getColor(this.f334917c));
        }
        android.view.View view5 = this.f334922h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
        return view5;
    }

    public final void c(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTranslationChange", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
        if (!this.f334919e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTranslationChange", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
            return;
        }
        android.content.Context context = this.f334915a;
        float b17 = (f17 - 0) / (i65.a.b(context, 56) - 0);
        float f18 = (b17 - 0.5f) * 2.0f;
        if (f18 < 0.0f) {
            f18 = 0.0f;
        }
        if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        if (b17 > 1.0f) {
            b17 = 1.0f;
        }
        float f19 = 0.0f < b17 ? b17 : 0.0f;
        int b18 = i65.a.b(context, 16);
        int b19 = i65.a.b(context, 4);
        android.view.View a17 = a();
        android.view.ViewGroup.LayoutParams layoutParams = a().getLayoutParams();
        layoutParams.height = (int) (b19 + (f19 * (b18 - b19)));
        a17.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeaderArrow", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f334921g).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeaderArrow", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
        weImageView.setAlpha(f18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTranslationChange", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenDraggableHelper");
    }
}
