package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class z0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f208282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f208283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f208284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208285g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.l4 f208286h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f208287i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f208288m;

    public z0(android.app.ProgressDialog progressDialog, com.tencent.mm.pointers.PBool pBool, android.content.Context context, java.lang.String str, com.tencent.mm.storage.l4 l4Var, java.lang.Runnable runnable, boolean z17) {
        this.f208282d = progressDialog;
        this.f208283e = pBool;
        this.f208284f = context;
        this.f208285g = str;
        this.f208286h = l4Var;
        this.f208287i = runnable;
        this.f208288m = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.app.ProgressDialog progressDialog = this.f208282d;
        progressDialog.show();
        com.tencent.mm.pointers.PBool pBool = this.f208283e;
        pBool.value = false;
        com.tencent.mm.storage.l4 l4Var = this.f208286h;
        android.content.Context context = this.f208284f;
        java.lang.String str = this.f208285g;
        com.tencent.mm.ui.conversation.t1.d(context, str, l4Var, pBool, progressDialog, true);
        java.lang.Runnable runnable = this.f208287i;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f208288m) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14553, 0, 3, str);
        }
    }
}
