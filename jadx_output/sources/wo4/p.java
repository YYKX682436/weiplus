package wo4;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f448284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gs0.b f448285e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(wo4.y yVar, gs0.b bVar) {
        super(2);
        this.f448284d = yVar;
        this.f448285e = bVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogRemuxer", "on frame decode, pts:" + longValue + ", frameCount:" + intValue + ", remuxForThumb:" + this.f448284d.f448313t);
        if (intValue != 0) {
            this.f448285e.a(longValue);
        }
        return jz5.f0.f302826a;
    }
}
