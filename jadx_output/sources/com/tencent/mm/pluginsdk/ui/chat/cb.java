package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class cb implements android.widget.RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u1 f190249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.eb f190250b;

    public cb(com.tencent.mm.pluginsdk.ui.chat.eb ebVar, com.tencent.mm.ui.widget.dialog.u1 u1Var) {
        this.f190250b = ebVar;
        this.f190249a = u1Var;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.RadioGroup radioGroup, int i17) {
        com.tencent.mm.pluginsdk.ui.chat.eb ebVar = this.f190250b;
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = ebVar.f190302d;
        ibVar.R = i17;
        ibVar.f190408i.setText((java.lang.CharSequence) ibVar.S.get(i17));
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar2 = ebVar.f190302d;
        com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = ibVar2.f190403d;
        if (voiceInputLayout != null) {
            voiceInputLayout.setLangType(((java.lang.Integer) ibVar2.T.get(ibVar2.R)).intValue());
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f190249a.f211998c;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        ebVar.f190302d.l(2);
    }
}
