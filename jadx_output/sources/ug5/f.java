package ug5;

/* loaded from: classes3.dex */
public final class f {
    public f(kotlin.jvm.internal.i iVar) {
    }

    public final ug5.v a(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        ug5.f fVar = ug5.v.f427655g;
        java.lang.Object obj = ug5.v.f427657i.get(key);
        if (obj instanceof ug5.v) {
            return (ug5.v) obj;
        }
        return null;
    }

    public final ug5.v b(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        ug5.g gVar = (ug5.g) kotlin.jvm.internal.m0.c(ug5.v.f427656h).remove(activity.getIntent().getStringExtra("intent_key_view_performer_builder"));
        if (gVar == null) {
            return null;
        }
        gVar.f427594h = new java.lang.ref.WeakReference(activity);
        if (gVar.f427589c == null) {
            gVar.f427589c = activity.getWindow();
        }
        gVar.f427588b = activity.getWindow();
        gVar.f427596j.isEmpty();
        gVar.f427597k.isEmpty();
        android.view.Window window = gVar.f427588b;
        com.tencent.mars.xlog.Log.i("ViewFluentPerformer", "[build] " + gVar);
        ug5.v vVar = new ug5.v(gVar);
        vVar.h();
        return vVar;
    }
}
