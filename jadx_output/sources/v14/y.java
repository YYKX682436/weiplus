package v14;

/* loaded from: classes5.dex */
public final class y extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f432591d;

    /* renamed from: e, reason: collision with root package name */
    public final v14.x f432592e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f432592e = new v14.x(this);
    }

    public final void T6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUserInfoStatusUIC", "unInitUserStatusListener");
        i95.m c17 = i95.n0.c(vd0.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        jm0.o oVar = (jm0.o) c17;
        if (!jm0.g.class.isAssignableFrom(xd0.a.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(oVar.getViewModel(), new jm0.e(oVar)).a(xd0.a.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        v14.x listener = this.f432592e;
        kotlin.jvm.internal.o.g(listener, "listener");
        ((xd0.a) ((jm0.g) a17)).f453613f.remove(listener);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUserInfoStatusUIC", "initUserStatusListener");
        i95.m c17 = i95.n0.c(vd0.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        jm0.o oVar = (jm0.o) c17;
        if (!jm0.g.class.isAssignableFrom(xd0.a.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(oVar.getViewModel(), new jm0.e(oVar)).a(xd0.a.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        v14.x listener = this.f432592e;
        kotlin.jvm.internal.o.g(listener, "listener");
        ((xd0.a) ((jm0.g) a17)).f453613f.add(listener);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        T6();
    }
}
