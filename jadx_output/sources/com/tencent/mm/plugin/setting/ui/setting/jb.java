package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class jb implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.nb f161191d;

    public jb(com.tencent.mm.plugin.setting.ui.setting.nb nbVar) {
        this.f161191d = nbVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        kotlin.jvm.internal.o.g(s17, "s");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(s17.toString());
        com.tencent.mm.plugin.setting.ui.setting.nb nbVar = this.f161191d;
        if (K0) {
            nbVar.T6().d().setEnabled(false);
        } else {
            nbVar.T6().d().setEnabled(true);
        }
        nbVar.U6("");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }
}
