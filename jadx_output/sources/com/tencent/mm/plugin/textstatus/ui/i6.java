package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class i6 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f173974d;

    public i6(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f173974d = textStatusDoWhatActivityV2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f173974d;
        android.widget.EditText editText = textStatusDoWhatActivityV2.f173561y1;
        if (editText != null) {
            editText.removeTextChangedListener(textStatusDoWhatActivityV2.A1);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = textStatusDoWhatActivityV2.C;
        if (mMEditText != null) {
            mMEditText.removeTextChangedListener(textStatusDoWhatActivityV2.A1);
        }
        java.lang.String valueOf = java.lang.String.valueOf(editable);
        boolean z17 = false;
        h12.m mVar = new h12.m(java.lang.String.valueOf(editable), 0);
        com.tencent.mm.ui.tools.t4 t4Var = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2;
        int a17 = mVar.a(t4Var);
        textStatusDoWhatActivityV2.W6();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "afterTextChanged inputCount:" + a17);
        java.lang.String.valueOf(editable);
        int i17 = textStatusDoWhatActivityV2.f173548p1;
        if (a17 > i17) {
            java.lang.String b17 = mVar.b(i17, t4Var);
            android.widget.EditText editText2 = textStatusDoWhatActivityV2.C;
            if (editText2 == null && (editText2 = textStatusDoWhatActivityV2.f173561y1) == null) {
                editText2 = null;
            }
            if (editText2 != null) {
                editText2.setText(pg5.d.a(textStatusDoWhatActivityV2, b17));
                editText2.setSelection(editText2.getText().length());
            }
            bi4.d1 d1Var = textStatusDoWhatActivityV2.f173544n;
            if (d1Var != null) {
                d1Var.f354947q++;
            }
            android.widget.TextView textView = textStatusDoWhatActivityV2.b7().f173411m;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.widget.TextView textView2 = textStatusDoWhatActivityV2.f173538f;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = textStatusDoWhatActivityV2.f173537e;
            if (wxRecyclerView != null) {
                wxRecyclerView.performHapticFeedback(3, 2);
            }
        } else {
            android.widget.TextView textView3 = textStatusDoWhatActivityV2.b7().f173411m;
            if (textView3 != null) {
                textView3.setVisibility(4);
            }
            android.widget.TextView textView4 = textStatusDoWhatActivityV2.f173538f;
            if (textView4 != null) {
                textView4.setVisibility(4);
            }
            java.util.HashMap hashMap = textStatusDoWhatActivityV2.Z;
            if (hashMap != null) {
                if (textStatusDoWhatActivityV2.c7().z()) {
                    if (hashMap.containsKey(valueOf)) {
                        java.lang.String str = (java.lang.String) hashMap.get(valueOf);
                        textStatusDoWhatActivityV2.N = str != null ? str : "userdefine";
                        bk4.f.V(textStatusDoWhatActivityV2.c7(), textStatusDoWhatActivityV2.F, textStatusDoWhatActivityV2.N, null, null, null, false, false, 124, null);
                    } else {
                        textStatusDoWhatActivityV2.N = "userdefine";
                        bk4.f.V(textStatusDoWhatActivityV2.c7(), textStatusDoWhatActivityV2.F, textStatusDoWhatActivityV2.N, null, null, null, false, false, 124, null);
                    }
                } else if (textStatusDoWhatActivityV2.c7().x()) {
                    if (hashMap.containsKey(valueOf)) {
                        java.lang.String str2 = (java.lang.String) hashMap.get(valueOf);
                        bk4.f.V(bk4.i.a(), textStatusDoWhatActivityV2.f173563z1, str2, null, null, null, false, false, 124, null);
                        textStatusDoWhatActivityV2.f173543m = new lj4.d(valueOf, str2);
                    } else {
                        bk4.f.V(bk4.i.a(), textStatusDoWhatActivityV2.f173563z1, "userdefine", null, null, null, false, false, 124, null);
                        textStatusDoWhatActivityV2.f173543m = new lj4.d(valueOf, "userdefine");
                    }
                }
            }
        }
        android.widget.EditText editText3 = textStatusDoWhatActivityV2.f173561y1;
        if (editText3 != null) {
            editText3.addTextChangedListener(textStatusDoWhatActivityV2.A1);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = textStatusDoWhatActivityV2.C;
        if (mMEditText2 != null) {
            mMEditText2.addTextChangedListener(textStatusDoWhatActivityV2.A1);
        }
        android.view.View view = textStatusDoWhatActivityV2.f173558x1;
        android.widget.Button button = view != null ? (android.widget.Button) view.findViewById(com.tencent.mm.R.id.c9z) : null;
        if (button != null) {
            if (editable != null && editable.length() == 0) {
                z17 = true;
            }
            button.setEnabled(!z17);
        }
        textStatusDoWhatActivityV2.Y6();
        com.tencent.mm.ui.widget.MMEditText mMEditText3 = textStatusDoWhatActivityV2.C;
        if (mMEditText3 != null) {
            mMEditText3.getText();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.String obj;
        java.util.Objects.toString(charSequence);
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f173974d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = textStatusDoWhatActivityV2.C;
        if (mMEditText != null) {
            boolean z17 = false;
            if (charSequence != null && (obj = charSequence.toString()) != null) {
                if (!(obj.length() == 0)) {
                    z17 = true;
                }
            }
            if (z17) {
                mMEditText.setHint("");
            } else {
                mMEditText.setHint(textStatusDoWhatActivityV2.getString(com.tencent.mm.R.string.jva));
            }
        }
    }
}
