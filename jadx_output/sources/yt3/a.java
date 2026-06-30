package yt3;

/* loaded from: classes3.dex */
public abstract class a implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final ju3.d0 f465332d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465333e;

    public a(ju3.d0 status, java.lang.String str) {
        kotlin.jvm.internal.o.g(status, "status");
        this.f465332d = status;
        this.f465333e = str;
        status.f(this);
    }

    @Override // yt3.r2
    public java.lang.String name() {
        return android.text.TextUtils.isEmpty(this.f465333e) ? getClass().getName() : this.f465333e;
    }

    public final android.view.View y(int i17) {
        java.lang.Object obj = this.f465332d;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.View findViewById = ((android.view.ViewGroup) obj).findViewById(i17);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }
}
