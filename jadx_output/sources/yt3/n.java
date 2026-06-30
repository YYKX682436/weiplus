package yt3;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.p f465544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yt3.p pVar) {
        super(1);
        this.f465544d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yt3.p pVar = this.f465544d;
        if (booleanValue) {
            ju3.d0.k(pVar.f465575d, ju3.c0.G, null, 2, null);
        } else {
            ju3.d0.k(pVar.f465575d, ju3.c0.W, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
