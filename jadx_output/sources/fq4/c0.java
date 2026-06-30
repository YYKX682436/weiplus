package fq4;

/* loaded from: classes15.dex */
public final class c0 extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f265575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fq4.d0 f265576e;

    public c0(fq4.d0 d0Var) {
        this.f265576e = d0Var;
        this.f265575d = new fq4.b0(this, d0Var);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        fq4.d0 d0Var = this.f265576e;
        if (d0Var.f265580a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoicePrintRecoder", "Stop Record Failed recorder == null");
            return;
        }
        synchronized (d0Var) {
            java.lang.String a17 = fq4.u.a(this.f265576e.f265581b, true);
            this.f265576e.getClass();
            this.f265576e.f265585f.C(true);
            if (this.f265576e.f265580a.startRecord(a17)) {
                fq4.a0 a0Var = this.f265576e.f265586g;
                if (a0Var != null) {
                    a0Var.getClass();
                }
                this.f265576e.f265582c = android.os.SystemClock.elapsedRealtime();
                java.lang.String str = this.f265576e.f265581b;
                this.f265575d.sendEmptyMessageDelayed(0, 1L);
                return;
            }
            fq4.d0 d0Var2 = this.f265576e;
            d0Var2.f265581b = null;
            d0Var2.f265580a.stopRecord();
            fq4.d0 d0Var3 = this.f265576e;
            d0Var3.f265580a = null;
            d0Var3.f265585f.C(true);
            fq4.a0 a0Var2 = this.f265576e.f265586g;
            if (a0Var2 != null) {
                ((com.tencent.mm.plugin.voiceprint.ui.a) a0Var2).a();
            }
        }
    }
}
