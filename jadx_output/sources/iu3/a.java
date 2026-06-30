package iu3;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu3.e f294985d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(iu3.e eVar) {
        super(1);
        this.f294985d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        iu3.e eVar = this.f294985d;
        if (booleanValue) {
            ju3.d0.k(eVar.f294992e, ju3.c0.S, null, 2, null);
        } else {
            ju3.d0.k(eVar.f294992e, ju3.c0.W, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
