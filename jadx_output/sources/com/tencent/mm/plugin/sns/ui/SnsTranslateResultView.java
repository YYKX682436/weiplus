package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsTranslateResultView extends com.tencent.mm.view.x2c.X2CLinearLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final int f167469q = android.graphics.Color.parseColor("#19000000");

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f167470d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f167471e;

    /* renamed from: f, reason: collision with root package name */
    public bd4.f2 f167472f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f167473g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f167474h;

    /* renamed from: i, reason: collision with root package name */
    public int f167475i;

    /* renamed from: m, reason: collision with root package name */
    public float f167476m;

    /* renamed from: n, reason: collision with root package name */
    public int f167477n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View.OnCreateContextMenuListener f167478o;

    /* renamed from: p, reason: collision with root package name */
    public db5.t4 f167479p;

    public SnsTranslateResultView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f167475i = -1;
        this.f167476m = -1.0f;
        this.f167477n = -1;
        i();
    }

    public final void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroySelectableTextHelper", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        bd4.f2 f2Var = this.f167472f;
        if (f2Var != null) {
            f2Var.k();
            this.f167472f = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroySelectableTextHelper", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    public void e(com.tencent.mm.plugin.sns.model.r6 r6Var, int i17, java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finishTranslate", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        this.f167475i = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateTranslateReusltSizeAndColor", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        float f17 = this.f167476m;
        if (f17 == -1.0f && this.f167477n == -1) {
            int i18 = this.f167475i;
            if (i18 == 2) {
                this.f167471e.setTextSize(1, i65.a.q(getContext()) * 14.0f);
            } else if (i18 == 1) {
                this.f167471e.setTextSize(1, i65.a.q(getContext()) * 15.0f);
            }
        } else {
            this.f167471e.setTextSize(this.f167477n, f17);
        }
        int i19 = this.f167475i;
        if (i19 == 2) {
            this.f167471e.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.a6k));
        } else if (i19 == 1) {
            this.f167471e.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.a6m));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateTranslateReusltSizeAndColor", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f167471e.setText(com.tencent.mm.R.string.jgm);
            c();
        } else {
            this.f167471e.setText(str);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(this.f167471e, 2);
            j();
        }
        this.f167471e.setCompoundDrawables(null, null, null, null);
        if (z17 && fp.h.c(11)) {
            com.tencent.mm.ui.tools.l5.b(this.f167471e, new com.tencent.mm.plugin.sns.ui.xs(this, r6Var));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            this.f167470d.setText(com.tencent.mm.R.string.b6e);
        } else {
            this.f167470d.setText(str2);
        }
        this.f167470d.setVisibility(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishTranslate", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    public android.widget.TextView getResultTextView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResultTextView", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        android.widget.TextView textView = this.f167471e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResultTextView", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        return textView;
    }

    public android.view.View getSplitlineView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSplitlineView", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        android.view.View view = this.f167473g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSplitlineView", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        return view;
    }

    public final void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.d2c, this);
        this.f167470d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nc6);
        this.f167471e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nc7);
        this.f167473g = findViewById(com.tencent.mm.R.id.ojf);
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.drawable.bng);
        this.f167474h = drawable;
        drawable.setBounds(0, 0, (int) (this.f167471e.getTextSize() * 0.8f), (int) (this.f167471e.getTextSize() * 0.8f));
        this.f167474h.setColorFilter(f167469q, android.graphics.PorterDuff.Mode.SRC_IN);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    public final void j() {
        android.widget.TextView textView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        if (!pc4.d.f353410a.b(false) || (textView = this.f167471e) == null || com.tencent.mm.sdk.platformtools.t8.K0(textView.getText().toString()) || this.f167478o == null || this.f167479p == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
            return;
        }
        java.lang.Object tag = this.f167471e.getTag();
        if (!(tag instanceof com.tencent.mm.plugin.sns.ui.go)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
            return;
        }
        c();
        this.f167471e.setBackground(null);
        bd4.f2 f2Var = new bd4.f2(getContext(), this.f167471e, com.tencent.mm.plugin.sns.model.l4.Fj().k1(((com.tencent.mm.plugin.sns.ui.go) tag).f168446b), this.f167478o, this.f167479p, null);
        this.f167472f = f2Var;
        f2Var.j();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    public void k(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startTranslate", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        c();
        this.f167471e.setCompoundDrawables(this.f167474h, null, null, null);
        this.f167471e.setCompoundDrawablePadding(i65.a.b(getContext(), 3));
        this.f167471e.setText(com.tencent.mm.R.string.jgo);
        com.tencent.mm.ui.tools.l5.b(this.f167471e, null);
        this.f167470d.setVisibility(4);
        this.f167475i = i17;
        this.f167471e.setTextSize(0, this.f167470d.getTextSize());
        this.f167471e.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.a6l));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startTranslate", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        c();
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    public void setCreateContextMenuListener(android.view.View.OnCreateContextMenuListener onCreateContextMenuListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCreateContextMenuListener", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        this.f167478o = onCreateContextMenuListener;
        j();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCreateContextMenuListener", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    public void setMenuItemSelectedListener(db5.t4 t4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMenuItemSelectedListener", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        this.f167479p = t4Var;
        j();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMenuItemSelectedListener", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    public void setResultTextSize(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setResultTextSize", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        this.f167471e.setTextSize(0, f17);
        this.f167476m = f17;
        this.f167477n = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setResultTextSize", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    public SnsTranslateResultView(android.content.Context context) {
        super(context);
        this.f167475i = -1;
        this.f167476m = -1.0f;
        this.f167477n = -1;
        i();
    }

    public SnsTranslateResultView(android.content.Context context, boolean z17) {
        super(context);
        this.f167475i = -1;
        this.f167476m = -1.0f;
        this.f167477n = -1;
        if (z17) {
            return;
        }
        i();
    }
}
