package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes.dex */
public class LivingStatusLayout extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f163666d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f163667e;

    public LivingStatusLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        super.onFinishInflate();
        try {
            this.f163666d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482655kd);
            this.f163666d.setTextSize(0, ca4.m0.I(com.tencent.mm.R.dimen.a_f));
            this.f163667e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f482654kc);
            this.f163667e.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.sns_ad_finder_live_logo, -1));
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
    }

    public void setLiveStatus(int i17) {
        java.lang.String str;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLiveStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        int i19 = i17 & 127;
        if (i19 == 3) {
            str = getContext().getString(com.tencent.mm.R.string.j7r);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        } else if (i19 == 1) {
            str = getContext().getString(com.tencent.mm.R.string.j7s);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        } else if (i19 == 2) {
            str = getContext().getString(com.tencent.mm.R.string.j7q);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
            str = "";
        }
        this.f163666d.setText(str);
        com.tencent.mars.xlog.Log.i("LivingStatusLayout", "setLiveStatus, status=" + i17 + ", text=" + str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStatusBackgroundResourceId", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        if (i19 == 2 || i19 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStatusBackgroundResourceId", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
            i18 = com.tencent.mm.R.drawable.f480740bf;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStatusBackgroundResourceId", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
            i18 = com.tencent.mm.R.drawable.f480741bg;
        }
        setBackgroundResource(i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLiveStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
    }

    public LivingStatusLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
