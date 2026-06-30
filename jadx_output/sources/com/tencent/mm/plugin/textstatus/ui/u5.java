package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class u5 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity f174343d;

    public u5(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity textStatusDoWhatActivity) {
        this.f174343d = textStatusDoWhatActivity;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity textStatusDoWhatActivity = this.f174343d;
        android.widget.EditText editText = textStatusDoWhatActivity.f173530x;
        if (editText != null) {
            editText.removeTextChangedListener(textStatusDoWhatActivity.f173532z);
        }
        java.lang.String valueOf = java.lang.String.valueOf(editable);
        int e17 = com.tencent.mm.ui.tools.v4.e(valueOf, com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2);
        textStatusDoWhatActivity.V6();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivity", "afterTextChanged inputCount:" + e17);
        java.lang.String valueOf2 = java.lang.String.valueOf(editable);
        int i17 = textStatusDoWhatActivity.f173528v;
        boolean z17 = false;
        if (e17 > i17) {
            java.lang.String h17 = com.tencent.mm.ui.tools.v4.h(valueOf2, i17);
            if (editable != null) {
                editable.replace(h17.length(), valueOf2.length(), "");
            }
            android.widget.TextView textView = textStatusDoWhatActivity.B;
            if (textView != null) {
                textView.setVisibility(0);
            }
            bi4.d1 d1Var = textStatusDoWhatActivity.f173518i;
            if (d1Var != null) {
                d1Var.f354947q++;
            }
        } else {
            android.widget.TextView textView2 = textStatusDoWhatActivity.B;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
            java.util.HashMap hashMap = textStatusDoWhatActivity.f173525s;
            if (hashMap != null) {
                if (hashMap.containsKey(valueOf)) {
                    java.lang.String str = (java.lang.String) hashMap.get(valueOf);
                    bk4.f.V(bk4.i.a(), textStatusDoWhatActivity.f173531y, str, null, null, null, false, false, 124, null);
                    textStatusDoWhatActivity.f173517h = new lj4.d(valueOf, str);
                } else {
                    bk4.f.V(bk4.i.a(), textStatusDoWhatActivity.f173531y, "userdefine", null, null, null, false, false, 124, null);
                    textStatusDoWhatActivity.f173517h = new lj4.d(valueOf, "userdefine");
                }
            }
        }
        android.widget.EditText editText2 = textStatusDoWhatActivity.f173530x;
        if (editText2 != null) {
            editText2.addTextChangedListener(textStatusDoWhatActivity.f173532z);
        }
        android.view.View view = textStatusDoWhatActivity.f173529w;
        android.widget.Button button = view != null ? (android.widget.Button) view.findViewById(com.tencent.mm.R.id.c9z) : null;
        if (button == null) {
            return;
        }
        if (editable != null && editable.length() == 0) {
            z17 = true;
        }
        button.setEnabled(!z17);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
