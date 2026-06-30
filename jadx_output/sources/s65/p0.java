package s65;

/* loaded from: classes11.dex */
public class p0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.Updater f403504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f403505e;

    public p0(com.tencent.mm.sandbox.updater.Updater updater, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f403504d = updater;
        this.f403505e = onCancelListener;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnCancelListener onCancelListener;
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(99);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 47L, 1L, true);
        com.tencent.mm.sandbox.updater.Updater.e(2);
        com.tencent.mm.sandbox.updater.Updater updater = this.f403504d;
        updater.d();
        if (updater.f192326g || (onCancelListener = this.f403505e) == null) {
            return;
        }
        onCancelListener.onCancel(dialogInterface);
    }
}
