package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes5.dex */
public final class jn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mn f118766d;

    public jn(com.tencent.mm.plugin.finder.live.widget.mn mnVar) {
        this.f118766d = mnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.mn mnVar = this.f118766d;
        mnVar.f119090n.requestFocus();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) mnVar.f119083d.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(mnVar.f119090n, 0);
        }
    }
}
