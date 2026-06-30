package tx2;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f422658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(tx2.i0 i0Var) {
        super(2);
        this.f422658d = i0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).intValue();
        com.tencent.mars.xlog.Log.i("FinderLiveNoticeBigCardWidget", "#initView next_confirm click");
        yz5.a aVar = this.f422658d.E;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
