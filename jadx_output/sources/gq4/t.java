package gq4;

/* loaded from: classes14.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq4.v f274605d;

    public t(gq4.v vVar) {
        this.f274605d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f274605d.f274608f) {
            com.tencent.mm.plugin.voip.ui.t0 t0Var = this.f274605d.f274608f[0];
            if (t0Var != null) {
                t0Var.a(true);
                this.f274605d.f274608f[0] = null;
            }
        }
    }
}
