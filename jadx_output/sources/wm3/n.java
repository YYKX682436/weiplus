package wm3;

/* loaded from: classes10.dex */
public abstract class n extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public j75.f f447282d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public abstract j75.a T6();

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        j75.a initState = T6();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(initState, "initState");
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(context.getViewModel(), new j75.t(initState, context)).a(j75.r.class);
        j75.r rVar = a17 instanceof j75.r ? (j75.r) a17 : null;
        if (rVar == null) {
            throw new j75.s();
        }
        if (!kotlin.jvm.internal.o.b(rVar.f298086d.f192351e, context)) {
            rVar.f298086d = new com.tencent.mm.sdk.coroutines.LifecycleScope("UIStateCenter.LifecycleScope", context, 0, 4, null);
        }
        this.f447282d = rVar;
    }
}
