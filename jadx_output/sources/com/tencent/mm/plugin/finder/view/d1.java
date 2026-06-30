package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e1 f131867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f131868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f131869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f131870g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f131871h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f131872i;

    public d1(com.tencent.mm.plugin.finder.view.e1 e1Var, android.content.Context context, java.lang.CharSequence charSequence, boolean z17, int i17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f131867d = e1Var;
        this.f131868e = context;
        this.f131869f = charSequence;
        this.f131870g = z17;
        this.f131871h = i17;
        this.f131872i = onCancelListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f131867d.f131951a = com.tencent.mm.ui.widget.dialog.u3.f(this.f131868e, this.f131869f, this.f131870g, this.f131871h, this.f131872i);
    }
}
