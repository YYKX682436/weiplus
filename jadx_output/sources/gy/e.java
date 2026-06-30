package gy;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy.g f277478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(gy.g gVar) {
        super(1);
        this.f277478d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        yz5.l lVar = this.f277478d.f277487h;
        if (lVar != null) {
            lVar.invoke(java.lang.Float.valueOf(floatValue));
        }
        return jz5.f0.f302826a;
    }
}
