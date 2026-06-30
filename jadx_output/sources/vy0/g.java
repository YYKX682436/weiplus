package vy0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final vy0.g f441414a = new vy0.g();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f441415b = jz5.h.b(vy0.a.f441405d);

    public boolean a(java.lang.String scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        boolean z17 = b().getBoolean(scene.concat("_enabled"), false);
        com.tencent.mars.xlog.Log.i("MaasPermissionCheckHelp", "checkPermission for " + scene + ", hasPermission: " + z17);
        return z17;
    }

    public final com.tencent.mm.sdk.platformtools.o4 b() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f441415b).getValue();
    }

    public void c(java.lang.String scene, android.content.Context context, yz5.l resultOk, yz5.l resultFail) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(resultOk, "resultOk");
        kotlin.jvm.internal.o.g(resultFail, "resultFail");
        d(scene, context, false, com.tencent.mm.R.layout.c9b, resultOk, resultFail);
    }

    public final void d(java.lang.String str, android.content.Context context, boolean z17, int i17, yz5.l lVar, yz5.l lVar2) {
        android.view.View view;
        if (b().getBoolean(str + "_enabled", false)) {
            com.tencent.mars.xlog.Log.i("MaasPermissionCheckHelp", "requestPermission has permission, no need to request for " + str);
            lVar.invoke(java.lang.Boolean.FALSE);
            return;
        }
        com.tencent.mars.xlog.Log.i("MaasPermissionCheckHelp", "requestPermission for " + str);
        b().putBoolean(str + "_requested", true);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 1, 0, true);
        z2Var.m(context.getText(com.tencent.mm.R.string.f490347sg), context.getText(com.tencent.mm.R.string.hh_));
        android.widget.Button button = z2Var.f212068t;
        if (button != null) {
            com.tencent.mm.ui.bk.s0(button.getPaint());
        }
        android.widget.Button button2 = z2Var.f212069u;
        if (button2 != null) {
            com.tencent.mm.ui.bk.s0(button2.getPaint());
        }
        z2Var.i(i17);
        if (kotlin.jvm.internal.o.b(str, "scene_finder_v2") && (view = z2Var.f212058g) != null) {
            ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.q9l)).setText(com.tencent.mm.R.string.lnd);
        }
        z2Var.l(new vy0.b(lVar2));
        vy0.d dVar = new vy0.d(lVar2, z2Var);
        vy0.f fVar = new vy0.f(str, lVar, z2Var);
        z2Var.D = dVar;
        z2Var.E = fVar;
        z2Var.C();
    }
}
