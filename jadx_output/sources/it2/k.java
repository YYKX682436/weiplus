package it2;

/* loaded from: classes7.dex */
public final class k extends lc3.e {

    /* renamed from: d, reason: collision with root package name */
    public final it2.x f294511d;

    public k(it2.x service) {
        kotlin.jvm.internal.o.g(service, "service");
        this.f294511d = service;
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        android.widget.FrameLayout frameLayout = this.f294511d.f294533g;
        android.content.Context context = frameLayout != null ? frameLayout.getContext() : null;
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        return null;
    }
}
