package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class m1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f207858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f207860f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f207861g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f207862h;

    public m1(android.content.Context context, java.lang.String str, com.tencent.mm.pointers.PBool pBool, android.app.ProgressDialog progressDialog, java.lang.Runnable runnable) {
        this.f207858d = context;
        this.f207859e = str;
        this.f207860f = pBool;
        this.f207861g = progressDialog;
        this.f207862h = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.conversation.t1.b(this.f207858d, this.f207859e, this.f207860f, this.f207861g, true);
        java.lang.Runnable runnable = this.f207862h;
        if (runnable != null) {
            runnable.run();
        }
    }
}
