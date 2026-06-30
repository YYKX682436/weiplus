package yt3;

/* loaded from: classes10.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.z f465712d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(yt3.z zVar) {
        super(1);
        this.f465712d = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yt3.z zVar = this.f465712d;
        if (booleanValue) {
            ju3.d0.k(zVar.f465733e, ju3.c0.V, null, 2, null);
        } else {
            ju3.d0.k(zVar.f465733e, ju3.c0.W, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
