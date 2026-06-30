package vn2;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.a f438340e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.content.Context context, java.lang.String str, xg2.a aVar) {
        super(0);
        this.f438339d = str;
        this.f438340e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteSeeLater fail,");
        xg2.a aVar = this.f438340e;
        sb6.append(aVar != null ? aVar.f454379a : null);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i(this.f438339d, sb6.toString());
        return jz5.f0.f302826a;
    }
}
