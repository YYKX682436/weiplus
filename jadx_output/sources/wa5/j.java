package wa5;

/* loaded from: classes14.dex */
public final class j extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final wa5.g f444323d;

    /* renamed from: e, reason: collision with root package name */
    public final wa5.h f444324e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f444325f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f444326g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f444323d = new wa5.g(activity, this);
        this.f444324e = new wa5.h(activity, this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onBeforeFinishAfterTransition() {
        super.onBeforeFinishAfterTransition();
        this.f444326g = true;
        java.util.Iterator it = wa5.d.f444315a.a(getActivity()).f444313e.iterator();
        while (it.hasNext()) {
            ya5.a aVar = (ya5.a) ((java.lang.ref.WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.q();
                aVar.k(false);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f444325f) {
            this.f444325f = false;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onStartActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        this.f444325f = true;
        if (bundle != null && android.os.Build.VERSION.SDK_INT >= 29 && !getActivity().isFinishing()) {
            new android.app.Instrumentation().callActivityOnSaveInstanceState(getActivity(), new android.os.Bundle());
        }
        super.onStartActivityForResult(intent, i17, bundle);
    }
}
