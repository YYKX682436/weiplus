package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public final class p6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.t6 f202083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f202084e;

    public p6(com.tencent.mm.ui.chatting.t6 t6Var, android.content.Intent intent) {
        this.f202083d = t6Var;
        this.f202084e = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        android.content.Context context = this.f202083d.f202704b;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.w.v(context, this.f202084e, "QQ", null, null);
    }
}
