package in5;

/* loaded from: classes2.dex */
public abstract class r0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.y0 f293120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
    }

    public void i() {
        kotlinx.coroutines.y0 y0Var = this.f293120d;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f293120d = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a).plus(new kotlinx.coroutines.x0("ScopeViewHolder")));
    }

    public void j() {
        if (this.f293120d == null) {
            i();
        }
    }

    public final android.view.View k(int i17) {
        android.view.View findViewById = this.itemView.findViewById(i17);
        if (!(findViewById instanceof android.view.View)) {
            findViewById = null;
        }
        if (findViewById == null) {
            com.tencent.mars.xlog.Log.w("SimpleViewHolder", "getViewOrNull: " + i17 + " is null");
        }
        return findViewById;
    }
}
