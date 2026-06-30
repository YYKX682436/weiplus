package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class p0 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122393a;

    public p0(com.tencent.mm.plugin.finder.playlist.s1 s1Var) {
        this.f122393a = s1Var;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.tencent.mm.plugin.finder.playlist.s1 s1Var = this.f122393a;
        if (s1Var.k()) {
            com.tencent.mm.plugin.finder.playlist.s1.b(s1Var, true);
        } else {
            kotlinx.coroutines.l.d(s1Var.f122427g, null, null, new com.tencent.mm.plugin.finder.playlist.l1(true, s1Var, s1Var.d(s1Var.f122437q, 1, null), null), 3, null);
        }
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f122393a.c();
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        com.tencent.mm.plugin.finder.playlist.s1 s1Var = this.f122393a;
        if (s1Var.k()) {
            com.tencent.mm.plugin.finder.playlist.s1.b(s1Var, false);
        } else {
            kotlinx.coroutines.l.d(s1Var.f122427g, null, null, new com.tencent.mm.plugin.finder.playlist.l1(false, s1Var, s1Var.d(s1Var.f122437q, 0, null), null), 3, null);
        }
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f122393a.c();
    }
}
