package im2;

/* loaded from: classes2.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.b f292241d;

    public a(im2.b bVar) {
        this.f292241d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        im2.b bVar = this.f292241d;
        android.content.Context context = bVar.f113668d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((im2.o6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(im2.o6.class)).f292475n = true;
        android.content.Context context2 = bVar.f113668d.getContext();
        android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if (activity != null) {
            activity.finish();
        }
        android.content.Context context3 = bVar.f113668d.getContext();
        kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ((androidx.appcompat.app.AppCompatActivity) context3).overridePendingTransition(0, 0);
    }
}
