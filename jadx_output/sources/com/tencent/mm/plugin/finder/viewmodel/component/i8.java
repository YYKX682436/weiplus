package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class i8 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f134713d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f134714e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f134715f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f134716g;

    /* renamed from: h, reason: collision with root package name */
    public int f134717h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.e3 f134718i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f134719m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134713d = "";
        this.f134714e = "";
        this.f134715f = "";
        this.f134716g = "";
        this.f134717h = 15;
    }

    public static final void O6(com.tencent.mm.plugin.finder.viewmodel.component.i8 i8Var, int i17) {
        i8Var.getClass();
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "sendEvent :" + i17);
        i8Var.f134719m = true;
        com.tencent.mm.autogen.events.FinderCreateAccountResultEvent finderCreateAccountResultEvent = new com.tencent.mm.autogen.events.FinderCreateAccountResultEvent();
        finderCreateAccountResultEvent.f54268g.f8448a = i17;
        finderCreateAccountResultEvent.e();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (getIntent().getIntExtra("create_account_style", 0) == 0) {
            android.app.Activity context = getContext();
            java.lang.String stringExtra = getIntent().getStringExtra("param_extra_info");
            cl0.g gVar = (stringExtra == null || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) ? null : new cl0.g(stringExtra);
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "showCreateContactDialog");
            if (gVar != null) {
                cl0.g b17 = gVar.b("tipsWording");
                if (b17 == null) {
                    java.lang.String optString = gVar.optString("tipsWording");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                        b17 = new cl0.g(optString);
                    }
                }
                if (b17 != null) {
                    java.lang.String optString2 = b17.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    kotlin.jvm.internal.o.f(optString2, "optString(...)");
                    this.f134713d = optString2;
                    java.lang.String optString3 = b17.optString("tip");
                    kotlin.jvm.internal.o.f(optString3, "optString(...)");
                    this.f134714e = optString3;
                    java.lang.String optString4 = b17.optString("cancelWording");
                    kotlin.jvm.internal.o.f(optString4, "optString(...)");
                    this.f134715f = optString4;
                    java.lang.String optString5 = b17.optString("confirmWording");
                    kotlin.jvm.internal.o.f(optString5, "optString(...)");
                    this.f134716g = optString5;
                }
                this.f134717h = gVar.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            }
            if (this.f134714e.length() == 0) {
                java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f491329cr5);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                this.f134714e = string;
            }
            if (this.f134715f.length() == 0) {
                java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.f491327cr3);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                this.f134715f = string2;
            }
            if (this.f134716g.length() == 0) {
                java.lang.String string3 = context.getResources().getString(com.tencent.mm.R.string.f491328cr4);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                this.f134716g = string3;
            }
            com.tencent.mm.plugin.finder.view.e3 e3Var = this.f134718i;
            if (e3Var != null) {
                if (e3Var.e()) {
                    return;
                }
                e3Var.i();
                return;
            }
            com.tencent.mm.plugin.finder.view.e3 e3Var2 = new com.tencent.mm.plugin.finder.view.e3(context);
            this.f134718i = e3Var2;
            e3Var2.f(com.tencent.mm.R.layout.akn);
            android.widget.TextView textView = (android.widget.TextView) e3Var2.f131959f.findViewById(com.tencent.mm.R.id.e8l);
            if (textView != null) {
                if (this.f134713d.length() > 0) {
                    textView.setText(this.f134713d);
                    com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            }
            android.widget.TextView textView2 = (android.widget.TextView) e3Var2.f131959f.findViewById(com.tencent.mm.R.id.e8f);
            if (textView2 != null) {
                textView2.setText(this.f134714e);
                com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
            }
            android.widget.TextView textView3 = (android.widget.TextView) e3Var2.f131959f.findViewById(com.tencent.mm.R.id.ei_);
            if (textView3 != null) {
                textView3.setText(this.f134715f);
                com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
                textView3.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.f8(e3Var2));
            }
            android.widget.TextView textView4 = (android.widget.TextView) e3Var2.f131959f.findViewById(com.tencent.mm.R.id.eia);
            if (textView4 != null) {
                textView4.setText(this.f134716g);
                com.tencent.mm.ui.bk.r0(textView4.getPaint(), 0.8f);
            }
            if (textView4 != null) {
                textView4.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.g8(context, this, e3Var2));
            }
            e3Var2.f131968r = new com.tencent.mm.plugin.finder.viewmodel.component.h8(this);
            com.tencent.mm.plugin.finder.view.e3 e3Var3 = this.f134718i;
            if (e3Var3 != null) {
                e3Var3.i();
            }
        }
    }
}
