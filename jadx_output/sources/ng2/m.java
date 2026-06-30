package ng2;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.s f336973d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ng2.s sVar) {
        super(0);
        this.f336973d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ng2.s sVar = this.f336973d;
        ((android.view.WindowManager) ((jz5.n) sVar.f336989x).getValue()).removeView(sVar.f318572s);
        return jz5.f0.f302826a;
    }
}
