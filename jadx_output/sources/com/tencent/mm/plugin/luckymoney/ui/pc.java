package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public final class pc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f147313d;

    public pc(android.widget.EditText editText) {
        this.f147313d = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.EditText editText = this.f147313d;
        if (editText.findFocus() == null) {
            editText.requestFocus();
        }
    }
}
