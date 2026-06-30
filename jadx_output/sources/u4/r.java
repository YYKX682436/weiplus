package u4;

/* loaded from: classes13.dex */
public class r extends u4.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f424540d;

    /* renamed from: e, reason: collision with root package name */
    public final u4.e0 f424541e;

    public r(android.view.View view, u4.e0 e0Var) {
        this.f424540d = view;
        this.f424541e = e0Var;
    }

    @Override // u4.d1, u4.b1
    public void a(androidx.transition.Transition transition) {
        this.f424541e.setVisibility(0);
    }

    @Override // u4.d1, u4.b1
    public void c(androidx.transition.Transition transition) {
        this.f424541e.setVisibility(4);
    }

    @Override // u4.b1
    public void d(androidx.transition.Transition transition) {
        transition.E(this);
        if (!u4.d0.f424462g) {
            try {
                if (!u4.d0.f424458c) {
                    try {
                        u4.d0.f424457b = java.lang.Class.forName("android.view.GhostView");
                    } catch (java.lang.ClassNotFoundException unused) {
                    }
                    u4.d0.f424458c = true;
                }
                java.lang.reflect.Method declaredMethod = u4.d0.f424457b.getDeclaredMethod("removeGhost", android.view.View.class);
                u4.d0.f424461f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused2) {
            }
            u4.d0.f424462g = true;
        }
        java.lang.reflect.Method method = u4.d0.f424461f;
        android.view.View view = this.f424540d;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (java.lang.IllegalAccessException unused3) {
            } catch (java.lang.reflect.InvocationTargetException e17) {
                throw new java.lang.RuntimeException(e17.getCause());
            }
        }
        view.setTag(com.tencent.mm.R.id.oj9, null);
        view.setTag(com.tencent.mm.R.id.f486262kp3, null);
    }
}
