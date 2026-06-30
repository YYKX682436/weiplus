package st2;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412431d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(st2.h1 h1Var) {
        super(0);
        this.f412431d = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        st2.h1 h1Var = this.f412431d;
        java.util.Iterator it = ((java.util.ArrayList) h1Var.f412354y0).iterator();
        while (true) {
            if (!it.hasNext()) {
                h1Var.W = null;
                return jz5.f0.f302826a;
            }
            android.view.View view = (android.view.View) it.next();
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            ((java.util.ArrayList) h1Var.f412354y0).remove(view);
        }
    }
}
