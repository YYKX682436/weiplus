package pn;

/* loaded from: classes11.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn.m f356929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(pn.m mVar) {
        super(0);
        this.f356929d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.storage.a3 a3Var = this.f356929d.f356936g;
        java.lang.String str = a3Var != null ? a3Var.field_roomowner : null;
        java.lang.Object r17 = c01.z1.r();
        if (r17 == null) {
            r17 = java.lang.Boolean.FALSE;
        }
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(str, r17));
    }
}
