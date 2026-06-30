package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class l1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f207820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f207821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f207822f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207823g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f207824h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f207825i;

    public l1(android.app.ProgressDialog progressDialog, com.tencent.mm.pointers.PBool pBool, android.content.Context context, java.lang.String str, boolean z17, java.lang.Runnable runnable) {
        this.f207820d = progressDialog;
        this.f207821e = pBool;
        this.f207822f = context;
        this.f207823g = str;
        this.f207824h = z17;
        this.f207825i = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.app.ProgressDialog progressDialog = this.f207820d;
        progressDialog.show();
        com.tencent.mm.pointers.PBool pBool = this.f207821e;
        pBool.value = false;
        android.content.Context context = this.f207822f;
        java.lang.String str = this.f207823g;
        com.tencent.mm.ui.conversation.t1.b(context, str, pBool, progressDialog, true);
        if (this.f207824h) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14553, 1, 3, str);
        }
        java.lang.Runnable runnable = this.f207825i;
        if (runnable != null) {
            runnable.run();
        }
    }
}
