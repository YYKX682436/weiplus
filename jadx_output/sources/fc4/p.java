package fc4;

/* loaded from: classes4.dex */
public final class p extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f261192d;

    /* renamed from: e, reason: collision with root package name */
    public int f261193e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f261194f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f261195g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f261196h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f261197i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f261198m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f261194f = "";
        this.f261195g = "";
        this.f261196h = "";
        this.f261197i = "";
    }

    public final void O6(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeSameCutVisible", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        if (z17 && this.f261198m) {
            android.widget.LinearLayout linearLayout = this.f261192d;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        } else {
            android.widget.LinearLayout linearLayout2 = this.f261192d;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(4);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeSameCutVisible", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
    }

    public final void P6(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealCutSameJumpView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        android.widget.LinearLayout linearLayout = this.f261192d;
        if (linearLayout == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealCutSameJumpView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.onp);
        if (textView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealCutSameJumpView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
            return;
        }
        linearLayout.setVisibility(0);
        this.f261198m = true;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.e(this.f261194f, 1);
            java.lang.String a17 = dw3.j0.f244218a.a();
            if (android.text.TextUtils.isEmpty(a17)) {
                a17 = i65.a.r(getContext(), com.tencent.mm.R.string.je7);
            }
            java.lang.String str2 = a17;
            kotlin.jvm.internal.o.d(str2);
            if (r26.n0.B(str2, "X", false)) {
                android.text.SpannableString spannableString = new android.text.SpannableString(str2);
                android.graphics.drawable.Drawable i17 = i65.a.i(getContext(), com.tencent.mm.R.drawable.f482081cf0);
                int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479672c9);
                i17.setBounds(0, 0, (i17.getIntrinsicWidth() * h17) / i17.getIntrinsicHeight(), h17);
                android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(i17, 2);
                int L = r26.n0.L(str2, "X", 0, false, 6, null);
                spannableString.setSpan(imageSpan, L, L + 1, 33);
                textView.setText(spannableString);
            } else {
                textView.setText(str2);
            }
        } else {
            textView.setText(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealCutSameJumpView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlexibleSameStyleUIC", "on activity result reqCode:" + i17 + " resultCode:" + i18);
        if (4098 == i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlexibleSameStyleUIC", "REQUEST_CODE_CUT_SAME callback ");
            if (intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("key_export_video_path");
                java.lang.String stringExtra2 = intent.getStringExtra("key_export_video_cover_path");
                if (android.text.TextUtils.isEmpty(stringExtra)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlexibleSameStyleUIC", "template video path is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
                    return;
                }
                try {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("KSightPath", stringExtra);
                    boolean Di = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Di();
                    dw3.c0 c0Var = dw3.c0.f244182a;
                    kotlin.jvm.internal.o.d(stringExtra);
                    intent2.putExtra("KSightThumbPath", c0Var.e(stringExtra2, stringExtra, Di ? 288 : -1));
                    intent2.putExtra("Ksnsupload_type", 14);
                    intent2.putExtra("KSnsVideoTempalteInfo", intent.getByteArrayExtra("key_video_template_info"));
                    intent2.putExtra("key_extra_data", intent.getBundleExtra("key_extra_data"));
                    intent2.putExtra("KSnsFrom", 20);
                    j45.l.j(getContext(), "sns", ".ui.SnsUploadUI", intent2, null);
                    getActivity().finish();
                } catch (java.lang.Exception unused) {
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FlexibleSameStyleUIC", "REQUEST_CODE_TEMPLATE_VIDEO path:%s, mjCoverPath:%s", stringExtra, stringExtra2);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0195  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fc4.p.onCreate(android.os.Bundle):void");
    }
}
