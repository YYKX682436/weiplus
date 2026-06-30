package qg3;

/* loaded from: classes.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.a f362890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(android.app.Activity activity, xg2.a aVar) {
        super(0);
        this.f362890d = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteSeeLater fail,");
        xg2.a aVar = this.f362890d;
        sb6.append(aVar != null ? aVar.f454379a : null);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("MicroMsg.NativeCgiJavaStatic", sb6.toString());
        return jz5.f0.f302826a;
    }
}
