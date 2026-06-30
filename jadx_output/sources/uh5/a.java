package uh5;

/* loaded from: classes12.dex */
public final class a extends lf3.n implements sf3.e {

    /* renamed from: d, reason: collision with root package name */
    public final uh5.f f427996d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f427996d = new uh5.f();
    }

    @Override // sf3.e
    public sf3.d create() {
        return new uh5.d(getActivity(), this.f427996d);
    }
}
