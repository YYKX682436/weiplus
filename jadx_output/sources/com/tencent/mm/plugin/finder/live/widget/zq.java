package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class zq implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mr f120606d;

    public zq(com.tencent.mm.plugin.finder.live.widget.mr mrVar) {
        this.f120606d = mrVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj;
        java.lang.String valueOf = java.lang.String.valueOf(editable);
        com.tencent.mm.ui.tools.t4 t4Var = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2;
        int e17 = com.tencent.mm.ui.tools.v4.e(valueOf, t4Var);
        java.lang.String str = "";
        com.tencent.mm.plugin.finder.live.widget.mr mrVar = this.f120606d;
        if (e17 > 32) {
            java.lang.String h17 = com.tencent.mm.ui.tools.v4.h(valueOf, 32);
            if (editable != null) {
                try {
                    editable.replace(h17.length(), valueOf.length(), "");
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e(mrVar.I, "etDesc replace: " + e18.getMessage());
                }
            }
        }
        if (editable != null && (obj = editable.toString()) != null) {
            str = obj;
        }
        ((kotlinx.coroutines.flow.h3) ((mm2.g1) mrVar.H.a(mm2.g1.class)).f329076q).k(str);
        mrVar.f119112x0 = str;
        com.tencent.mm.ui.widget.MMEditText mMEditText = mrVar.N;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("descEdt");
            throw null;
        }
        android.widget.TextView textView = mrVar.P;
        if (textView == null) {
            kotlin.jvm.internal.o.o("descEdtTips");
            throw null;
        }
        mrVar.getClass();
        ck5.f b17 = ck5.f.b(mMEditText);
        b17.f42561f = 0;
        b17.f42560e = 32;
        b17.f42562g = t4Var;
        b17.f42556a = true;
        b17.d(new com.tencent.mm.plugin.finder.live.widget.xq(textView, 32));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        int e17 = com.tencent.mm.ui.tools.v4.e(java.lang.String.valueOf(charSequence), com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2);
        boolean z17 = false;
        if (!(charSequence == null || charSequence.length() == 0) && e17 <= 32) {
            z17 = true;
        }
        this.f120606d.f0(z17);
    }
}
