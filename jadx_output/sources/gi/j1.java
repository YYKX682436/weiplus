package gi;

/* loaded from: classes12.dex */
public class j1 implements android.app.Application.ActivityLifecycleCallbacks {
    public j1(gi.h1 h1Var) {
    }

    public final java.lang.String a(android.app.Activity activity) {
        ((vk.n) ((ob0.f3) i95.n0.c(ob0.f3.class))).getClass();
        kotlin.jvm.internal.o.g(activity, "activity");
        for (java.util.Map.Entry entry : ((java.util.HashMap) ((v40.u) ((c50.t0) i95.n0.c(c50.t0.class))).wi()).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            if (((java.util.List) entry.getValue()).contains(activity.getClass())) {
                return str;
            }
        }
        java.lang.Class<?> cls = activity.getClass();
        return kotlin.jvm.internal.o.b(cls, com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI.class) ? "Moment" : kotlin.jvm.internal.o.b(cls, com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewMMUI.class) ? "Biz" : kotlin.jvm.internal.o.b(cls, com.tencent.mm.plugin.brandservice.ui.flutter.BizFlutterTLFlutterViewActivity.class) ? "BizFeed" : kotlin.jvm.internal.o.b(cls, com.tencent.mm.plugin.webview.ui.tools.MMWebViewUI.class) ? "Web" : null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        ob0.f3 f3Var = (ob0.f3) i95.n0.c(ob0.f3.class);
        java.lang.String name = activity.getClass().getName();
        vk.n nVar = (vk.n) f3Var;
        nVar.getClass();
        vk.l lVar = vk.n.f437741d;
        synchronized (vk.l.a(lVar)) {
            vk.l.a(lVar).add(name);
        }
        nVar.Ai(name, true);
        java.lang.String a17 = a(activity);
        if (a17 != null) {
            ((com.tencent.mm.feature.performance.q) ((ob0.c3) i95.n0.c(ob0.c3.class))).Ai(a17);
            ((vk.n) ((ob0.f3) i95.n0.c(ob0.f3.class))).wi(a17, true);
            if (mm.o.f() && a17.equals("Finder")) {
                ((ku5.t0) ku5.t0.f312615d).g(new gi.i1(this));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        ob0.f3 f3Var = (ob0.f3) i95.n0.c(ob0.f3.class);
        java.lang.String name = activity.getClass().getName();
        vk.n nVar = (vk.n) f3Var;
        nVar.getClass();
        vk.l lVar = vk.n.f437741d;
        synchronized (vk.l.a(lVar)) {
            vk.l.a(lVar).remove(name);
        }
        nVar.Ai(name, false);
        java.lang.String a17 = a(activity);
        if (a17 != null) {
            ((com.tencent.mm.feature.performance.q) ((ob0.c3) i95.n0.c(ob0.c3.class))).Bi(a17);
            ((vk.n) ((ob0.f3) i95.n0.c(ob0.f3.class))).wi(a17, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }
}
