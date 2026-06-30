package pf5;

/* loaded from: classes14.dex */
public final class e0 implements pf5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.component.UIComponentActivity f353919a;

    public e0(com.tencent.mm.ui.component.UIComponentActivity uIComponentActivity) {
        this.f353919a = uIComponentActivity;
    }

    @Override // pf5.a
    public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.ui.component.UIComponentActivity uIComponentActivity = this.f353919a;
        if (kotlin.jvm.internal.o.b(activity, uIComponentActivity)) {
            com.tencent.mm.ui.component.UIComponentActivity.access$onPostCreated(uIComponentActivity, bundle);
        }
    }

    @Override // pf5.a
    public void onActivityPostDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.ui.component.UIComponentActivity uIComponentActivity = this.f353919a;
        if (kotlin.jvm.internal.o.b(activity, uIComponentActivity)) {
            uIComponentActivity.onPostDestroyed();
        }
    }

    @Override // pf5.a
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // pf5.a
    public void onActivityPreDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.ui.component.UIComponentActivity uIComponentActivity = this.f353919a;
        if (kotlin.jvm.internal.o.b(activity, uIComponentActivity)) {
            uIComponentActivity.onPreDestroyed();
        }
    }
}
