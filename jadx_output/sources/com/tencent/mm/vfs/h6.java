package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class h6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.l6 f212980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f212981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.m6 f212982f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(com.tencent.mm.vfs.l6 l6Var, int i17, com.tencent.mm.vfs.m6 m6Var) {
        super(1);
        this.f212980d = l6Var;
        this.f212981e = i17;
        this.f212982f = m6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.x1 fe6 = (com.tencent.mm.vfs.x1) obj;
        kotlin.jvm.internal.o.g(fe6, "fe");
        return java.lang.Boolean.valueOf(this.f212980d.c(this.f212981e, this.f212982f.f213075b, fe6));
    }
}
