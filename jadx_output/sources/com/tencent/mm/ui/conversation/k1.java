package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class k1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f207794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f207795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f207796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207797g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f207798h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f207799i;

    public k1(com.tencent.mm.pointers.PBool pBool, android.content.Context context, boolean z17, java.lang.String str, boolean z18, java.lang.Runnable runnable) {
        this.f207794d = pBool;
        this.f207795e = context;
        this.f207796f = z17;
        this.f207797g = str;
        this.f207798h = z18;
        this.f207799i = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f207794d.value = true;
        android.content.Context context = this.f207795e;
        boolean z17 = this.f207796f;
        java.lang.String str = this.f207797g;
        com.tencent.mm.ui.conversation.t1.a(context, z17, str);
        if (this.f207798h) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14553, 1, 4, str);
        }
        java.lang.Runnable runnable = this.f207799i;
        if (runnable != null) {
            runnable.run();
        }
    }
}
