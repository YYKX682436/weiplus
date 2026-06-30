package lf0;

@j95.b
/* loaded from: classes.dex */
public final class f0 extends i95.w implements pm4.u {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f318208d = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());

    /* renamed from: e, reason: collision with root package name */
    public boolean f318209e;

    public android.content.Context wi() {
        java.util.Set set = this.f318208d;
        kotlin.jvm.internal.o.d(set);
        android.app.Activity activity = (android.app.Activity) kz5.n0.j0(set);
        if (activity != null) {
            return activity;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return context;
    }
}
