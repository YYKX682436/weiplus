package uj3;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.p f428315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(uj3.p pVar) {
        super(1);
        this.f428315d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        uj3.b1 thumbUiLayout;
        int intValue = ((java.lang.Number) obj).intValue();
        uj3.p pVar = this.f428315d;
        if ((intValue >= 0 && intValue < pVar.K) && (thumbUiLayout = pVar.getThumbUiLayout()) != null) {
            thumbUiLayout.d(intValue);
        }
        return jz5.f0.f302826a;
    }
}
