package com.tencent.mm.ui.chatting.component;

/* loaded from: classes7.dex */
public final class j implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f199247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.k f199248f;

    public j(int i17, java.lang.String str, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.ui.chatting.component.k kVar) {
        this.f199246d = str;
        this.f199247e = h0Var;
        this.f199248f = kVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("framesetname:");
            java.lang.String frameSetName = this.f199246d;
            sb6.append(frameSetName);
            sb6.append(", msg id:");
            kotlin.jvm.internal.h0 h0Var = this.f199247e;
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) h0Var.f310123d;
            sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", sb6.toString());
            java.lang.Object obj = h0Var.f310123d;
            com.tencent.mm.ui.chatting.component.k kVar = this.f199248f;
            if (obj != null) {
                c01.w9.f(((com.tencent.mm.storage.f9) obj).getMsgId(), ((com.tencent.mm.storage.f9) h0Var.f310123d).Q0());
                kVar.f199323f.remove(frameSetName);
                g05.r rVar = (g05.r) ((g05.i) i95.n0.c(g05.i.class));
                rVar.getClass();
                kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
                iq0.c Di = rVar.Di();
                if (Di != null) {
                    i95.m c17 = i95.n0.c(gq0.t.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    gq0.t.u5((gq0.t) c17, Di, null, frameSetName, 2, null);
                }
            }
            if (kVar.f198580d.B()) {
                kVar.f198580d.L(true);
            }
        }
    }
}
