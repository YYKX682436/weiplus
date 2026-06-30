package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes5.dex */
public final class o0 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public int f191797b;

    @Override // ot0.h
    public ot0.h a() {
        com.tencent.mm.pluginsdk.ui.tools.o0 o0Var = new com.tencent.mm.pluginsdk.ui.tools.o0();
        o0Var.f191797b = this.f191797b;
        return o0Var;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(sb6, "sb");
        sb6.append("<referfromscene>");
        sb6.append(this.f191797b);
        sb6.append("</referfromscene>");
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q content) {
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(content, "content");
        java.lang.String str = (java.lang.String) values.get(".msg.appmsg.referfromscene");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.f191797b = com.tencent.mm.sdk.platformtools.t8.D1(str, 0);
    }
}
