package cq4;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cq4.n f221466d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(cq4.n nVar) {
        super(1);
        this.f221466d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        cq4.f fVar = this.f221466d.f221480g;
        if (fVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT", intValue);
            ((bp4.q1) fVar).f23352a.w(ju3.c0.P1, bundle);
        }
        return jz5.f0.f302826a;
    }
}
