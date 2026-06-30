package oy3;

/* loaded from: classes.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final oy3.f f350018d = new oy3.f();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ly3.m mVar = ly3.m.f322273a;
        com.tencent.mm.vfs.w6.f(mVar.c("wechat_rtos_service"));
        com.tencent.mm.sdk.platformtools.o4.L().putString("patch_id", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RepairerRtosWatchUI", "clean so " + mVar.c("wechat_rtos_service"));
        yj0.a.h(this, "com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
