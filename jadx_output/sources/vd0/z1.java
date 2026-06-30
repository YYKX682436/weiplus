package vd0;

/* loaded from: classes5.dex */
public final class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.setting.MuteModeService$VolumeBroadcastReceiver f435544d;

    public z1(com.tencent.mm.feature.setting.MuteModeService$VolumeBroadcastReceiver muteModeService$VolumeBroadcastReceiver) {
        this.f435544d = muteModeService$VolumeBroadcastReceiver;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.app.Activity activity;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/setting/MuteModeService$VolumeBroadcastReceiver$initPushBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MuteModeService", "open Temporary Play!!");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("care_mode_temp_voice_hint_play", "view_clk", new java.util.HashMap(), 29254);
        j65.e.m(true);
        cl5.n nVar = this.f435544d.f67802a;
        if (nVar != null) {
            nVar.a(false);
        }
        ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).Ai(false);
        vd0.d2 d2Var = (vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class));
        if (d2Var.f435387e == null) {
            d2Var.f435387e = (android.media.AudioManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        }
        if (d2Var.f435387e != null) {
            to.a.c(d2Var.f435387e, 3, (int) (r2.getStreamMaxVolume(3) * 0.2d), 1);
        }
        ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).getClass();
        com.tencent.mm.autogen.events.MuteModePlayChangeEvent muteModePlayChangeEvent = new com.tencent.mm.autogen.events.MuteModePlayChangeEvent();
        muteModePlayChangeEvent.f54514g.f7249a = true;
        muteModePlayChangeEvent.e();
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
            java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
            activity = j17 != null ? (android.app.Activity) j17.get() : null;
        }
        if (activity != null) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
            e4Var.f211776c = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492611lx2);
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
        } else {
            ((ft.e) i95.n0.c(ft.e.class)).m7(new com.tencent.mm.plugin.setting.model.ShowMuteModeToastEvent(2));
        }
        yj0.a.h(this, "com/tencent/mm/feature/setting/MuteModeService$VolumeBroadcastReceiver$initPushBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
