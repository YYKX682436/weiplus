package ng2;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.g f336961d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ng2.g gVar) {
        super(0);
        this.f336961d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ng2.g gVar = this.f336961d;
        ((android.view.WindowManager) ((jz5.n) gVar.f336965x).getValue()).removeView(gVar.f336964w);
        return jz5.f0.f302826a;
    }
}
