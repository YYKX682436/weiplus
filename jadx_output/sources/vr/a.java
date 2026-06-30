package vr;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr.g f439390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f439391e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(vr.g gVar, yz5.l lVar) {
        super(0);
        this.f439390d = gVar;
        this.f439391e = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float a17 = vr.g.a(this.f439390d);
        boolean z17 = a17 == 0.0f;
        yz5.l lVar = this.f439391e;
        if (z17) {
            lVar.invoke(0);
        } else {
            lVar.invoke(java.lang.Integer.valueOf(java.lang.Math.round(qk.w9.a(r0.f439403a) / a17)));
        }
        return jz5.f0.f302826a;
    }
}
