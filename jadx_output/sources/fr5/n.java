package fr5;

/* loaded from: classes15.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr5.q f266002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(fr5.q qVar) {
        super(1);
        this.f266002d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        fr5.q qVar = this.f266002d;
        qVar.f266015f.setAlpha(a06.d.b(floatValue));
        qVar.f266010a.invalidate();
        return jz5.f0.f302826a;
    }
}
