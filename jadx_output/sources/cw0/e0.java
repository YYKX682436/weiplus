package cw0;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f222626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f222627e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(java.lang.String str, java.lang.String str2) {
        super(1);
        this.f222626d = str;
        this.f222627e = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ex0.q vm6 = (ex0.q) obj;
        kotlin.jvm.internal.o.g(vm6, "vm");
        java.lang.String roleName = this.f222627e;
        kotlin.jvm.internal.o.f(roleName, "$roleName");
        java.lang.String roleID = this.f222626d;
        kotlin.jvm.internal.o.g(roleID, "roleID");
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment = vm6.f257162q;
        narrationSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D = narrationSegment.D();
        if (D != null) {
            com.tencent.maas.moviecomposing.segments.NarrationSegment.A1(narrationSegment, roleID, roleName, D);
        }
        return jz5.f0.f302826a;
    }
}
