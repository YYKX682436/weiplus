package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class ya implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderHighLightTopicEditView f133388d;

    public ya(com.tencent.mm.plugin.finder.view.FinderHighLightTopicEditView finderHighLightTopicEditView) {
        this.f133388d = finderHighLightTopicEditView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.finder.view.FinderHighLightTopicEditView finderHighLightTopicEditView = this.f133388d;
        java.lang.String obj = finderHighLightTopicEditView.f131128f.getText().toString();
        finderHighLightTopicEditView.f131133n = obj;
        int b17 = com.tencent.mm.ui.tools.v4.b(32, obj) / 2;
        android.widget.TextView textView = finderHighLightTopicEditView.f131129g;
        textView.setText((16 - b17) + "/16");
        android.widget.TextView textView2 = finderHighLightTopicEditView.f131127e;
        if (b17 >= 0) {
            textView.setTextColor(finderHighLightTopicEditView.getResources().getColor(com.tencent.mm.R.color.FG_2));
            textView2.setEnabled(true);
            textView2.setTextColor(finderHighLightTopicEditView.getResources().getColor(com.tencent.mm.R.color.f478553an));
            textView2.setBackgroundResource(com.tencent.mm.R.drawable.f481557wj);
            return;
        }
        textView.setTextColor(finderHighLightTopicEditView.getResources().getColor(com.tencent.mm.R.color.Red_100));
        textView2.setEnabled(false);
        textView2.setTextColor(finderHighLightTopicEditView.getResources().getColor(com.tencent.mm.R.color.f478987mq));
        textView2.setBackgroundResource(com.tencent.mm.R.drawable.f481555wh);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
