package com.tencent.mm.ui;

/* loaded from: classes.dex */
public class n3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f209401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f209402e;

    public n3(java.lang.Runnable runnable, android.content.Context context) {
        this.f209401d = runnable;
        this.f209402e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f209401d.run();
        if (com.tencent.mm.ui.bk.y()) {
            boolean A = com.tencent.mm.ui.bk.A();
            android.content.Context context = this.f209402e;
            if (A && context.getResources().getConfiguration().orientation == 1) {
                return;
            }
            j45.l.u(context, ".ui.EmptyActivity", new android.content.Intent(), null);
        }
    }
}
