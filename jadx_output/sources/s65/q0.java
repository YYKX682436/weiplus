package s65;

/* loaded from: classes11.dex */
public class q0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.Updater f403507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f403508e;

    public q0(com.tencent.mm.sandbox.updater.Updater updater, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f403507d = updater;
        this.f403508e = onCancelListener;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnCancelListener onCancelListener;
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(99);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 49L, 1L, true);
        com.tencent.mm.sandbox.updater.Updater.e(2);
        com.tencent.mm.sandbox.updater.Updater updater = this.f403507d;
        updater.d();
        if (updater.f192326g || (onCancelListener = this.f403508e) == null) {
            return;
        }
        onCancelListener.onCancel(dialogInterface);
    }
}
