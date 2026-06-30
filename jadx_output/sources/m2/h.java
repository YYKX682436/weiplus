package m2;

/* loaded from: classes13.dex */
public final class h implements androidx.activity.k {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.activity.i f322918d = new androidx.activity.i(null);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.tooling.ComposeViewAdapter f322919e;

    public h(androidx.compose.ui.tooling.ComposeViewAdapter composeViewAdapter) {
        this.f322919e = composeViewAdapter;
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f322919e.f10851w.f322920d;
    }

    @Override // androidx.activity.k
    public androidx.activity.i getOnBackPressedDispatcher() {
        return this.f322918d;
    }
}
