package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public final class wa implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f147642d;

    public wa(android.widget.EditText editText) {
        this.f147642d = editText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        kotlin.jvm.internal.o.g(s17, "s");
        android.widget.EditText editText = this.f147642d;
        if (editText == null) {
            return;
        }
        editText.setContentDescription(s17.toString());
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
