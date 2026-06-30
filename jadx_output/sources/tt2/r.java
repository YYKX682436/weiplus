package tt2;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f421986d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(tt2.e1 e1Var) {
        super(1);
        this.f421986d = e1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        mm2.i7 recordableItem = (mm2.i7) obj;
        kotlin.jvm.internal.o.g(recordableItem, "recordableItem");
        this.f421986d.notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}
