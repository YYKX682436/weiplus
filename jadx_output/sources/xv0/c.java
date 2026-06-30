package xv0;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xv0.a f457377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xv0.g f457378e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xv0.a aVar, xv0.g gVar) {
        super(1);
        this.f457377d = aVar;
        this.f457378e = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        xv0.a aVar = this.f457377d;
        aVar.a(floatValue);
        float f17 = aVar.f457373d;
        xv0.g gVar = this.f457378e;
        gVar.L(f17);
        gVar.K();
        yz5.p onValueChangedCallback = gVar.getOnValueChangedCallback();
        if (onValueChangedCallback != null) {
            onValueChangedCallback.invoke(aVar.f457370a, java.lang.Float.valueOf(aVar.f457373d));
        }
        return jz5.f0.f302826a;
    }
}
