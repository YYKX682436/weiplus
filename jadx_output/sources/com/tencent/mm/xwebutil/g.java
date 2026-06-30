package com.tencent.mm.xwebutil;

/* loaded from: classes11.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xwebutil.h f214832d;

    public g(com.tencent.mm.xwebutil.h hVar) {
        this.f214832d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Activity activity = this.f214832d.f214838i;
        com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.lch), null, activity, null, null);
    }
}
