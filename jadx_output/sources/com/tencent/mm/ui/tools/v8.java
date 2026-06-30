package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class v8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.w8 f210846e;

    public v8(com.tencent.mm.ui.tools.w8 w8Var, android.view.View view) {
        this.f210846e = w8Var;
        this.f210845d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((android.view.inputmethod.InputMethodManager) this.f210846e.f210883d.getSystemService("input_method")).showSoftInput(this.f210845d.findViewById(com.tencent.mm.R.id.d98), 0);
    }
}
