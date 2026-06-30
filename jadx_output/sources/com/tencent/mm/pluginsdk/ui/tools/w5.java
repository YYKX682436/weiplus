package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public final class w5 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.g6 f191969a;

    public w5(com.tencent.mm.pluginsdk.ui.tools.g6 g6Var) {
        this.f191969a = g6Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            com.tencent.mm.pluginsdk.ui.tools.g6 g6Var = this.f191969a;
            android.app.Activity activity = g6Var.f191644a;
            jt.v vVar2 = (jt.v) i95.n0.c(jt.v.class);
            android.app.Activity activity2 = g6Var.f191644a;
            com.tencent.mm.pluginsdk.ui.tools.x3 x3Var = g6Var.f191645b;
            java.lang.String str2 = x3Var.f191985h;
            java.lang.String str3 = x3Var.f191982e;
            java.lang.String str4 = x3Var.f191983f;
            ((ht.a) vVar2).getClass();
            android.content.Intent b17 = com.tencent.mm.pluginsdk.ui.tools.f.b(activity2, str2, str3, str4);
            b17.setPackage(g6Var.f191653j);
            ((ht.a) vVar).Ni(activity, b17);
        }
    }
}
