package vd0;

/* loaded from: classes5.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final vd0.a2 f435366d = new vd0.a2();

    public a2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity activity;
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
            java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
            activity = j17 != null ? (android.app.Activity) j17.get() : null;
        }
        if (activity != null) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
            e4Var.f211776c = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lxa);
            e4Var.b(com.tencent.mm.R.raw.icons_outlined_volume_mute);
            e4Var.c();
        } else {
            ((ft.e) i95.n0.c(ft.e.class)).m7(new com.tencent.mm.plugin.setting.model.ShowMuteModeToastEvent(1));
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("care_mode_recover_quite_state_source", 2);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("care_mode_recover_quite_state", hashMap, 29254);
        return jz5.f0.f302826a;
    }
}
