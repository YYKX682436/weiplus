package k23;

/* loaded from: classes12.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.x f303636d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(k23.x xVar) {
        super(0);
        this.f303636d = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        k23.x xVar = this.f303636d;
        xVar.c();
        android.view.ViewParent parent = xVar.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(xVar);
        }
        return jz5.f0.f302826a;
    }
}
