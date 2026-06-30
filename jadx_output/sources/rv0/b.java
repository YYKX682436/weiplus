package rv0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.d f399927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rv0.d dVar) {
        super(1);
        this.f399927d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        rv0.d dVar = this.f399927d;
        return floatValue > 0.0f ? j65.q.a(dVar.getContext()).getDrawable(com.tencent.mm.R.drawable.f481036cn1, null) : j65.q.a(dVar.getContext()).getDrawable(com.tencent.mm.R.drawable.cni, null);
    }
}
