package ls5;

/* loaded from: classes10.dex */
public final class d implements ls5.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f321121a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f321122b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f321123c;

    /* renamed from: d, reason: collision with root package name */
    public long f321124d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f321125e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f321126f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f321127g;

    /* renamed from: h, reason: collision with root package name */
    public ls5.l f321128h;

    public d(java.lang.String eventTag) {
        kotlin.jvm.internal.o.g(eventTag, "eventTag");
        this.f321121a = eventTag;
        this.f321125e = "";
        this.f321126f = new java.util.LinkedList();
        this.f321127g = "";
    }

    public final void a(java.lang.String str) {
        if (kotlin.jvm.internal.o.b(str, this.f321127g)) {
            return;
        }
        this.f321126f.add(str);
        this.f321127g = str;
    }

    public void b(android.view.View view) {
        this.f321122b = view;
        com.tencent.mars.xlog.Log.i(this.f321121a, "bindMiniWindowView: " + view);
    }

    public final android.app.Activity c(android.view.View view) {
        if (view == null) {
            return null;
        }
        if (!(view.getContext() instanceof android.app.Activity)) {
            android.view.ViewParent parent = view.getParent();
            return c(parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null);
        }
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        return (android.app.Activity) context;
    }

    public final java.lang.String d(android.app.Activity activity) {
        if (activity != null) {
            java.lang.String str = activity.getClass().getSimpleName() + '@' + activity.hashCode();
            if (str != null) {
                return str;
            }
        }
        return "";
    }
}
