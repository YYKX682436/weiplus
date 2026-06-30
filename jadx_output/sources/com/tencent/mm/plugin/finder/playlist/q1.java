package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.tencent.mm.plugin.finder.playlist.s1 s1Var) {
        super(0);
        this.f122408d = s1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f122408d.i().getIntExtra("tab_type", 0));
    }
}
