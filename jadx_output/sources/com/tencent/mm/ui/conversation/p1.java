package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f207952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.l4 f207954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f207955g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f207956h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f207957i;

    public p1(android.content.Context context, java.lang.String str, com.tencent.mm.storage.l4 l4Var, com.tencent.mm.pointers.PBool pBool, android.app.ProgressDialog progressDialog, java.lang.Runnable runnable) {
        this.f207952d = context;
        this.f207953e = str;
        this.f207954f = l4Var;
        this.f207955g = pBool;
        this.f207956h = progressDialog;
        this.f207957i = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pointers.PBool pBool = this.f207955g;
        android.app.ProgressDialog progressDialog = this.f207956h;
        android.content.Context context = this.f207952d;
        java.lang.String str = this.f207953e;
        com.tencent.mm.ui.conversation.t1.d(context, str, this.f207954f, pBool, progressDialog, true);
        java.lang.Runnable runnable = this.f207957i;
        if (runnable != null) {
            runnable.run();
        }
        if (r01.z.n(str)) {
            r01.r1 Zi = r01.q3.Zi();
            Zi.b(str, 14, 0, 0.0f, 0.0f, 0, null, 0, Zi.f368227i, null);
        }
    }
}
