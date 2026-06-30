package com.tencent.mm.vfs;

/* loaded from: classes8.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f213012d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(boolean z17) {
        super(1);
        this.f213012d = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.ref.WeakReference it = (java.lang.ref.WeakReference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.vfs.k3 k3Var = (com.tencent.mm.vfs.k3) it.get();
        if (k3Var == null) {
            return java.lang.Boolean.TRUE;
        }
        k3Var.f213028b = this.f213012d;
        return java.lang.Boolean.FALSE;
    }
}
