package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f211767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f f211768e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f211769f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f211770g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f211771h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f211772i;

    public e(android.content.Context context, com.tencent.mm.ui.widget.dialog.f fVar, java.lang.CharSequence charSequence, boolean z17, int i17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f211767d = context;
        this.f211768e = fVar;
        this.f211769f = charSequence;
        this.f211770g = z17;
        this.f211771h = i17;
        this.f211772i = onCancelListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f211767d;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null || !(activity.isDestroyed() || activity.isFinishing())) {
            this.f211768e.f211785c = com.tencent.mm.ui.widget.dialog.u3.f(context, this.f211769f, this.f211770g, this.f211771h, this.f211772i);
        }
    }
}
