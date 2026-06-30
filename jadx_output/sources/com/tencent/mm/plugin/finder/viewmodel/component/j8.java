package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class j8 extends com.tencent.mm.plugin.finder.viewmodel.component.q4 {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f134827i;

    /* renamed from: m, reason: collision with root package name */
    public final int f134828m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f134829n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134827i = "Finder.FinderCreateAccountHalfScreenUIC";
        this.f134828m = 20002;
        this.f134829n = "";
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.q4
    public int O6() {
        return this.f134828m;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.q4
    public void Q6() {
        android.view.View view;
        if (getIntent().getIntExtra("create_account_style", 0) == 1) {
            if (!(this.f135660f.length() == 0)) {
                android.app.Activity context = getContext();
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = getContext().getString(com.tencent.mm.R.string.m7n);
                e4Var.c();
                Z6(4);
                return;
            }
            java.lang.String stringExtra = getIntent().getStringExtra("param_extra_info");
            android.widget.TextView textView = null;
            cl0.g gVar = (stringExtra == null || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) ? null : new cl0.g(stringExtra);
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
                    this.f134829n = optString2;
                }
            }
            super.Q6();
            if (this.f134829n.length() > 0) {
                com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f135658d;
                if (y1Var != null && (view = y1Var.f212027f) != null) {
                    textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ebe);
                }
                if (textView != null) {
                    textView.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.m9n, this.f134829n));
                }
            }
            U6();
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.q4
    public void R6() {
        Z6(2);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.q4
    public void S6() {
        Z6(1);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.q4
    public void T6() {
        android.app.Activity context = getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = getContext().getString(com.tencent.mm.R.string.m7m);
        e4Var.c();
        Z6(5);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.q4
    public void V6(r45.r01 r01Var) {
        super.V6(r01Var);
        android.app.Activity context = getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = getContext().getString(com.tencent.mm.R.string.m7m);
        e4Var.c();
        Z6(5);
    }

    public final void Z6(int i17) {
        com.tencent.mars.xlog.Log.i(this.f134827i, "sendEvent :" + i17);
        com.tencent.mm.autogen.events.FinderCreateAccountResultEvent finderCreateAccountResultEvent = new com.tencent.mm.autogen.events.FinderCreateAccountResultEvent();
        finderCreateAccountResultEvent.f54268g.f8448a = i17;
        finderCreateAccountResultEvent.e();
        if (getActivity().isFinishing()) {
            return;
        }
        getActivity().finish();
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.q4, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 != this.f134828m || i18 == 1) {
            return;
        }
        getActivity().finish();
    }
}
