package wr3;

/* loaded from: classes11.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str) {
        super(1);
        this.f448807d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i(this.f448807d, "user click topic arrow");
        if (booleanValue) {
            tr3.b bVar = new tr3.b();
            bVar.f421430a = 2002;
            bVar.f421431b = true;
            tr3.a.f421426a.a(bVar);
        }
        return jz5.f0.f302826a;
    }
}
