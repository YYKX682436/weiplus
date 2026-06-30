package ut2;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.p f430886d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ut2.p pVar) {
        super(1);
        this.f430886d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        mm2.i7 productInfo = (mm2.i7) obj;
        kotlin.jvm.internal.o.g(productInfo, "productInfo");
        this.f430886d.f431028f.notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}
