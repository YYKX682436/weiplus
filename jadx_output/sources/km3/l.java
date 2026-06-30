package km3;

/* loaded from: classes10.dex */
public final class l implements km3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f309248b;

    public l(int i17, int i18) {
        this.f309247a = i17;
        this.f309248b = i18;
    }

    public void a(km3.p pVar, int i17, boolean z17) {
        android.view.View view;
        if ((pVar != null ? pVar.f309252d : null) == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference = pVar.f309252d;
        kotlin.jvm.internal.o.d(weakReference);
        android.widget.TextView textView = (android.widget.TextView) weakReference.get();
        if (textView == null || (view = (android.view.View) pVar.f309253e.get()) == null) {
            return;
        }
        km3.p.f309250i.b(textView, view, i17, this.f309247a, this.f309248b, z17);
        km3.p.f309251m.remove(textView);
    }
}
