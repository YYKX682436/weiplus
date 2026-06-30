package vr;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr.g f439395d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vr.g gVar) {
        super(0);
        this.f439395d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vr.g gVar = this.f439395d;
        gVar.f439405c.animate().translationY(gVar.f439405c.getHeight()).withEndAction(new vr.b(gVar)).setDuration(300L).start();
        return jz5.f0.f302826a;
    }
}
