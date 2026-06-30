package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f211783a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f211784b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f211785c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f211786d;

    public f(long j17, int i17, kotlin.jvm.internal.i iVar) {
        this.f211783a = (i17 & 1) != 0 ? 300L : j17;
        this.f211784b = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final void a() {
        java.lang.Runnable runnable = this.f211786d;
        android.os.Handler handler = this.f211784b;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        this.f211786d = null;
        if (!kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            handler.post(new com.tencent.mm.ui.widget.dialog.d(this));
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f211785c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f211785c = null;
    }

    public final void b(android.content.Context context, java.lang.CharSequence charSequence, boolean z17, int i17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.tencent.mm.ui.widget.dialog.e eVar = new com.tencent.mm.ui.widget.dialog.e(context, this, charSequence, z17, i17, onCancelListener);
        this.f211786d = eVar;
        this.f211784b.postDelayed(eVar, this.f211783a);
    }
}
