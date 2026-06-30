package rf3;

/* loaded from: classes12.dex */
public final class b extends lf3.n implements sf3.e {

    /* renamed from: d, reason: collision with root package name */
    public final rf3.a f394980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f394980d = new rf3.a();
    }

    @Override // sf3.e
    public sf3.d create() {
        return new rf3.e(getActivity(), this.f394980d);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((lt0.f) this.f394980d.f394979a).clear();
    }
}
