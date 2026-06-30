package er;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er.b f255924d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(er.b bVar) {
        super(1);
        this.f255924d = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("run: ");
        er.b bVar = this.f255924d;
        sb6.append(bVar.f255925q);
        sb6.append(", ");
        sb6.append(booleanValue);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCoverTask", sb6.toString());
        bVar.f(booleanValue);
        return jz5.f0.f302826a;
    }
}
