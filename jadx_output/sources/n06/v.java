package n06;

/* loaded from: classes15.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n06.b0 f334011d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(n06.b0 b0Var) {
        super(1);
        this.f334011d = b0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        kotlin.jvm.internal.o.g(lVar, "<name for destructuring parameter 0>");
        java.lang.String str = (java.lang.String) lVar.f302833d;
        java.lang.String str2 = (java.lang.String) lVar.f302834e;
        p06.c a17 = p06.g.a(this.f334011d.f333940a.h(), "'" + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", null, true, 4, null);
        int i17 = p06.k.Z0;
        java.util.List c17 = kz5.b0.c(a17);
        return c17.isEmpty() ? p06.i.f350765a : new p06.l(c17);
    }
}
