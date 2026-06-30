package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes13.dex */
public class ActivityTestMultilineEllipse extends com.tencent.mm.hellhoundlib.activities.HellActivity {
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.ActivityTestMultilineEllipse");
        super.onCreate(bundle);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-1);
        addContentView(linearLayout, new android.view.ViewGroup.LayoutParams(-1, -1));
        android.widget.ScrollView scrollView = new android.widget.ScrollView(this);
        scrollView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        linearLayout.addView(scrollView);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this);
        linearLayout2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        linearLayout2.setOrientation(1);
        linearLayout2.setBackgroundColor(-1);
        scrollView.addView(linearLayout2);
        com.tencent.mm.plugin.sns.ui.QTextView qTextView = new com.tencent.mm.plugin.sns.ui.QTextView(this);
        qTextView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        qTextView.setEllipsis("...");
        qTextView.setEllipsisMore(" Read More!");
        qTextView.setText("This is some short text. It won't need to be ellipsized.");
        qTextView.setMaxLines(3);
        qTextView.setPadding(10, 10, 10, 10);
        qTextView.setBackgroundColor(-1786127);
        linearLayout2.addView(qTextView);
        com.tencent.mm.plugin.sns.ui.QTextView qTextView2 = new com.tencent.mm.plugin.sns.ui.QTextView(this);
        qTextView2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        qTextView2.setEllipsis("...");
        qTextView2.setEllipsisMore(" Read More!");
        qTextView2.setMaxLines(3);
        qTextView2.setText("This is some longer text. It should wrap and then eventually be ellipsized once it gets way too long for the horizontal width of the current application screen. We should be fixed to max [N] lines height.");
        qTextView2.setPadding(10, 10, 10, 10);
        qTextView2.setBackgroundColor(-204878);
        qTextView2.setOnClickListener(new com.tencent.mm.plugin.sns.ui.a(this, qTextView2));
        linearLayout2.addView(qTextView2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.ActivityTestMultilineEllipse");
    }
}
