package zo1;

/* loaded from: classes5.dex */
public final class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo1.c3 f474553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI f474554e;

    public b3(zo1.c3 c3Var, com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI) {
        this.f474553d = c3Var;
        this.f474554e = selectContactUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zo1.d3 d3Var;
        while (!this.f474553d.f474572e) {
            try {
                java.lang.Thread.sleep(200L);
            } catch (java.lang.InterruptedException unused) {
            }
            if (this.f474553d.f474572e) {
                return;
            }
            java.lang.String str = this.f474553d.f474571d;
            if (!(str.length() == 0) && (d3Var = this.f474554e.f92860t) != null) {
                d3Var.s(str, com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI.f92846x, false);
            }
        }
    }
}
