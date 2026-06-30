package ph3;

/* loaded from: classes14.dex */
public class n implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph3.o f354437d;

    public n(ph3.o oVar) {
        this.f354437d = oVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        ph3.o oVar = this.f354437d;
        ph3.a aVar = oVar.f354451n;
        if (aVar == null) {
            return false;
        }
        int i17 = message.what;
        if (i17 == 1) {
            if (!aVar.m()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s audio track prepare error, release now.", this.f354437d.j());
                this.f354437d.f354451n.o();
                ph3.o oVar2 = this.f354437d;
                oVar2.f354450m = true;
                oVar2.f354451n = null;
            }
            ph3.o oVar3 = this.f354437d;
            oVar3.k(oVar3.f354440c, android.os.SystemClock.elapsedRealtime(), 0L);
        } else if (i17 != 2) {
            if (i17 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s start to play", aVar.i());
                aVar.f354406f = false;
                aVar.t(3);
                aVar.w();
                ph3.o oVar4 = this.f354437d;
                oVar4.k(oVar4.f354440c, android.os.SystemClock.elapsedRealtime(), 0L);
            } else if (i17 == 4) {
                oVar.k(oVar.f354440c, android.os.SystemClock.elapsedRealtime(), 0L);
                this.f354437d.f354451n.l();
            } else if (i17 == 7) {
                aVar.o();
                ph3.o oVar5 = this.f354437d;
                oVar5.f354450m = true;
                oVar5.f354441d.obtainMessage(0).sendToTarget();
            }
        } else if (ph3.e.a(aVar.f354401a)) {
            this.f354437d.f354441d.obtainMessage(9).sendToTarget();
            this.f354437d.f354440c.removeMessages(2);
        } else {
            if (this.f354437d.f354451n.f354401a == -1) {
                this.f354437d.f354438a.obtainMessage(-1, -1, -1).sendToTarget();
                this.f354437d.f354439b.removeMessages(2);
            } else {
                ph3.o oVar6 = this.f354437d;
                if (oVar6.f354451n.c(oVar6.f354445h, oVar6.f354444g) == 2) {
                    com.tencent.mm.sdk.platformtools.n3 n3Var = this.f354437d.f354441d;
                    n3Var.sendMessageDelayed(n3Var.obtainMessage(2), 10L);
                }
                ph3.o oVar7 = this.f354437d;
                int i18 = oVar7.f354447j;
                if (i18 == 3) {
                    oVar7.k(oVar7.f354440c, android.os.SystemClock.elapsedRealtime(), this.f354437d.f354446i.f354393h);
                } else if (i18 == 5) {
                    oVar7.k(oVar7.f354440c, android.os.SystemClock.elapsedRealtime(), 0L);
                } else if (i18 == 1) {
                    oVar7.k(oVar7.f354440c, android.os.SystemClock.elapsedRealtime(), 0L);
                } else if (i18 == 0) {
                    oVar7.k(oVar7.f354440c, android.os.SystemClock.elapsedRealtime(), 0L);
                } else {
                    oVar7.f354440c.removeMessages(2);
                }
            }
        }
        return false;
    }
}
