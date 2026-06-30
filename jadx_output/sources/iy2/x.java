package iy2;

/* loaded from: classes11.dex */
public final class x implements android.widget.RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel f295912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u1 f295913b;

    public x(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel, com.tencent.mm.ui.widget.dialog.u1 u1Var) {
        this.f295912a = finderLiveVoiceInputPanel;
        this.f295913b = u1Var;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.RadioGroup group, int i17) {
        java.lang.Integer num;
        kotlin.jvm.internal.o.g(group, "group");
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel = this.f295912a;
        finderLiveVoiceInputPanel.A = i17;
        android.widget.TextView textView = finderLiveVoiceInputPanel.f136768i;
        if (textView != null) {
            java.lang.String str = (java.lang.String) kz5.n0.a0(finderLiveVoiceInputPanel.B, i17);
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
        if (finderLiveVoiceInputPanel.f136764e != null && (num = (java.lang.Integer) kz5.n0.a0(finderLiveVoiceInputPanel.C, finderLiveVoiceInputPanel.A)) != null) {
            int intValue = num.intValue();
            com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout = finderLiveVoiceInputPanel.f136764e;
            if (finderLiveVoiceInputLayout != null) {
                finderLiveVoiceInputLayout.setLangType(intValue);
            }
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f295913b.f211998c;
        if (j0Var != null) {
            j0Var.dismiss();
        }
    }
}
