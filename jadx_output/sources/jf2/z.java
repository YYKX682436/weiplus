package jf2;

/* loaded from: classes3.dex */
public final class z implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jf2.k0 f299411d;

    public z(jf2.k0 k0Var) {
        this.f299411d = k0Var;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        jf2.k0 k0Var = this.f299411d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(k0Var.f299379n.indexOf(java.lang.Integer.valueOf(((jf2.o) obj).type())));
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : Integer.MAX_VALUE);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(k0Var.f299379n.indexOf(java.lang.Integer.valueOf(((jf2.o) obj2).type())));
        java.lang.Integer num = valueOf3.intValue() >= 0 ? valueOf3 : null;
        return mz5.a.b(valueOf2, java.lang.Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE));
    }
}
