package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class m7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.o7 f209099d;

    public m7(com.tencent.mm.ui.o7 o7Var) {
        this.f209099d = o7Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        android.os.IBinder windowToken;
        com.tencent.mm.ui.o7 o7Var = this.f209099d;
        java.lang.String charSequence = o7Var.f209454e.getText().toString();
        o7Var.f209454e.setText("");
        o7Var.f209454e.clearFocus();
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = o7Var.f209454e;
        int i18 = x51.t1.f452086a;
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = o7Var.f209450a;
        if (mMLimitedClearEditText != null && (inputMethodManager = (android.view.inputmethod.InputMethodManager) mMFragmentActivity.getSystemService("input_method")) != null && (windowToken = mMLimitedClearEditText.getWindowToken()) != null) {
            try {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            } catch (java.lang.IllegalArgumentException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Util", "hide VKB(View) exception %s", e17);
            }
        }
        if (charSequence == null || charSequence.equals("")) {
            db5.e1.m(mMFragmentActivity, com.tencent.mm.R.string.k67, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.ui.k7(this));
            return;
        }
        if (o7Var.f209458i == null) {
            o7Var.f209458i = new com.tencent.mm.ui.j7(o7Var);
        }
        c01.d9.e().a(384, o7Var.f209458i);
        com.tencent.mm.modelsimple.l1 l1Var = new com.tencent.mm.modelsimple.l1(1, charSequence, "", "", "", false);
        c01.d9.e().g(l1Var);
        o7Var.f209456g = db5.e1.Q(o7Var.f209450a, o7Var.c(com.tencent.mm.R.string.f490573yv), o7Var.c(com.tencent.mm.R.string.irw), true, true, new com.tencent.mm.ui.l7(this, l1Var));
    }
}
