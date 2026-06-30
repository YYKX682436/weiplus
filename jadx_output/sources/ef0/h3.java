package ef0;

@j95.b
/* loaded from: classes11.dex */
public final class h3 extends i95.w implements qk.t8 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f252224d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.ting.TingFlutterActivity f252225e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f252226f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f252227g = java.util.Collections.synchronizedList(new java.util.ArrayList());

    public h3() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.app.Application application = context instanceof android.app.Application ? (android.app.Application) context : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new ef0.g3(this));
        }
    }

    public boolean Ai() {
        return this.f252225e != null;
    }

    public final void Bi(com.tencent.mm.plugin.ting.TingFlutterActivity tingFlutterActivity) {
        this.f252225e = tingFlutterActivity;
        this.f252226f = tingFlutterActivity != null ? java.lang.Integer.valueOf(tingFlutterActivity.getTaskId()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingFlutterActivityManagerService", "updateCurrentTingActivityInstance instance: " + tingFlutterActivity + ", taskId: " + this.f252226f);
    }

    public boolean wi(boolean z17) {
        com.tencent.mm.plugin.ting.TingFlutterActivity tingFlutterActivity;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingFlutterActivityManagerService", "finishUtilTingFlutterActivity hasTingInstance: " + Ai() + ", withFinishTingActivity: " + z17);
        int i17 = 0;
        if (!Ai()) {
            return false;
        }
        java.util.List activityListAboveTing = this.f252227g;
        int size = activityListAboveTing.size();
        kotlin.jvm.internal.o.f(activityListAboveTing, "activityListAboveTing");
        for (java.lang.Object obj : activityListAboveTing) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.app.Activity activity = (android.app.Activity) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.TingFlutterActivityManagerService", "finishUtilTingFlutterActivity index: " + i17 + ", " + activity);
            if (activity != null) {
                activity.finish();
                if (i17 == size - 1) {
                    activity.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477889ed);
                } else if (i17 == 0) {
                    activity.overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477729q);
                } else {
                    activity.overridePendingTransition(com.tencent.mm.R.anim.f477729q, com.tencent.mm.R.anim.f477729q);
                }
            }
            i17 = i18;
        }
        activityListAboveTing.clear();
        if (z17 && (tingFlutterActivity = this.f252225e) != null) {
            tingFlutterActivity.finish();
        }
        return true;
    }
}
