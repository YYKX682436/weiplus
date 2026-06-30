package zh5;

/* loaded from: classes12.dex */
public final class a0 extends lf3.n implements sf3.e {

    /* renamed from: d, reason: collision with root package name */
    public final zh5.e0 f472997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f472997d = new zh5.e0();
    }

    @Override // sf3.e
    public sf3.d create() {
        return new zh5.d0(getActivity(), this.f472997d);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((lt0.f) this.f472997d.f473020a).clear();
    }
}
