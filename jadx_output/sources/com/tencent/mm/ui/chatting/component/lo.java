package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class lo implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.jo f199452a;

    public lo(com.tencent.mm.ui.chatting.component.jo joVar) {
        this.f199452a = joVar;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.ui.chatting.component.jo joVar = this.f199452a;
        dp.a.makeText(joVar.f198580d.g(), joVar.f198580d.s().getString(com.tencent.mm.R.string.k7b, q75.c.c(str2)), 1).show();
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        android.app.Activity g17 = joVar.f198580d.g();
        ((ub0.r) oVar).getClass();
        q75.c.f(str2, g17);
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.ui.chatting.component.jo joVar = this.f199452a;
        dp.a.makeText(joVar.f198580d.g(), joVar.f198580d.s().getString(com.tencent.mm.R.string.k7a), 1).show();
    }
}
