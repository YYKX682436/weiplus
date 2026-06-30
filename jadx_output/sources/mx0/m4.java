package mx0;

/* loaded from: classes5.dex */
public final class m4 implements uy0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332153a;

    public m4(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        this.f332153a = shootComposingPluginLayout;
    }

    public boolean a() {
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332153a;
        kotlin.jvm.internal.o.g(shootComposingPluginLayout, "<this>");
        by0.c cVar = by0.c.f36323a;
        android.content.Context context = shootComposingPluginLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.app.Activity a17 = cVar.a(context);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ShootComposing.receiveReeditPostOkSync: activity=");
        sb6.append(a17 != null ? a17.getClass().getName() : null);
        sb6.append(", activityTaskId=");
        sb6.append(a17 != null ? java.lang.Integer.valueOf(a17.getTaskId()) : null);
        sb6.append(", isFinishing=");
        sb6.append(a17 != null ? java.lang.Boolean.valueOf(a17.isFinishing()) : null);
        sb6.append(", isDestroyed=");
        sb6.append(a17 != null ? java.lang.Boolean.valueOf(a17.isDestroyed()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", sb6.toString());
        if (a17 == null || a17.isFinishing() || a17.isDestroyed()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", "ShootComposing.receiveReeditPostOkSync skip invalid activity");
            return false;
        }
        a17.setResult(-1, new android.content.Intent());
        a17.finish();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", "ShootComposing.receiveReeditPostOkSync setResult OK, activity=".concat(a17.getClass().getName()));
        return true;
    }
}
