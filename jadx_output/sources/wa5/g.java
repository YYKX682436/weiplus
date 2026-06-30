package wa5;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f444318a;

    public g(androidx.appcompat.app.AppCompatActivity activity, wa5.j uic) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(uic, "uic");
        this.f444318a = activity;
    }

    public static void b(wa5.g gVar, wa5.f fVar, xa5.d customCallback, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            fVar = null;
        }
        if ((i17 & 2) != 0) {
            customCallback = xa5.c.f452840a;
        }
        gVar.getClass();
        kotlin.jvm.internal.o.g(customCallback, "customCallback");
        wa5.d dVar = wa5.d.f444315a;
        androidx.appcompat.app.AppCompatActivity activity = gVar.f444318a;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("MM.Transition", "onEnterActivityReady() called with: activity = " + activity);
        java.util.Objects.toString(activity.getWindow().getSharedElementEnterTransition());
        activity.getWindow().getSharedElementEnterTransition().addListener(new xa5.b(fVar, activity));
        activity.startPostponedEnterTransition();
    }

    public final void a(wa5.a aVar) {
        wa5.d dVar = wa5.d.f444315a;
        androidx.appcompat.app.AppCompatActivity activity = this.f444318a;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("MM.Transition", "onEnterActivityOnCreate() called with: activity = " + activity);
        activity.postponeEnterTransition();
        dVar.b(activity, true, aVar);
        dVar.a(activity).f444310b = true;
        dVar.c(activity);
    }
}
