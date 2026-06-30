package tn0;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts0.r f420662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ts0.r rVar) {
        super(0);
        this.f420662d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ts0.r rVar = this.f420662d;
        if (rVar != null) {
            ((ts0.b) rVar).H();
        }
        if (rVar != null) {
            rVar.release();
        }
        return jz5.f0.f302826a;
    }
}
