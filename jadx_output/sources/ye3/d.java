package ye3;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f461216d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str) {
        super(0);
        this.f461216d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f461216d;
        if (com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "tryReInit delete DB: " + str + ", ret=" + com.tencent.mm.vfs.w6.h(str));
        }
        return jz5.f0.f302826a;
    }
}
