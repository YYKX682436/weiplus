package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class m1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f137626n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.s1 f137627o;

    public m1(com.tencent.mm.plugin.fts.logic.s1 s1Var, java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f137627o = s1Var;
        this.f137626n = userName;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SetKefuContactDirtyTask";
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.plugin.fts.logic.s1 s1Var = this.f137627o;
        if (!s1Var.f137667h.add(this.f137626n)) {
            return true;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = s1Var.f137674r;
        long j17 = s1Var.f137668i;
        b4Var.c(j17, j17);
        return true;
    }
}
