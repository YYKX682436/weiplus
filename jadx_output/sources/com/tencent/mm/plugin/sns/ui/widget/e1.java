package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class e1 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f171118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f171119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView f171120f;

    public e1(com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView snsCardAdTagListView, android.widget.TextView textView, android.view.View view) {
        this.f171120f = snsCardAdTagListView;
        this.f171118d = textView;
        this.f171119e = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        java.lang.CharSequence text;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView$1");
        android.widget.TextView textView = this.f171118d;
        android.text.Layout layout = textView.getLayout();
        com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView snsCardAdTagListView = this.f171120f;
        if (layout != null && (text = textView.getLayout().getText()) != null) {
            java.lang.String charSequence = text.toString();
            if (com.tencent.mm.sdk.platformtools.t8.K0(charSequence) || charSequence.indexOf(8230) >= 0) {
                android.view.View view = this.f171119e;
                snsCardAdTagListView.removeView(view);
                int i17 = com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView.f170842i;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                java.util.List list = snsCardAdTagListView.f170843d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                ((java.util.ArrayList) list).remove(view);
            }
        }
        snsCardAdTagListView.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView$1");
        return true;
    }
}
