package ua1;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ua1.f f425952d;

    public d(ua1.f fVar) {
        this.f425952d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ua1.f fVar;
        if (this.f425952d.a() || this.f425952d.b()) {
            return;
        }
        if (!((java.util.HashMap) this.f425952d.f425955b).isEmpty()) {
            java.util.Iterator it = ((java.util.HashMap) this.f425952d.f425955b).entrySet().iterator();
            while (it.hasNext()) {
                ua1.b bVar = (ua1.b) ((java.util.Map.Entry) it.next()).getValue();
                if (bVar.f425924b) {
                    this.f425952d.f425956c.c(bVar.f425923a, bVar.f425926d, bVar.f425925c, bVar.a());
                }
            }
            byte[] a17 = this.f425952d.f425956c.a();
            if (a17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameRecordAudioLogic", "[hilive] getData fail");
                return;
            }
            float f17 = r1.f425959f / r1.f425958e;
            this.f425952d.getClass();
            for (int i17 = 0; i17 < a17.length; i17 += 2) {
                short s17 = (short) (((short) (((a17[r3] << 8) | (a17[i17] & 255)) & 65535)) * f17);
                a17[i17] = (byte) (s17 & 255);
                a17[i17 + 1] = (byte) ((s17 >> 8) & 255);
            }
            this.f425952d.getClass();
            tl.c cVar = this.f425952d.f425964k;
            if (cVar != null) {
                cVar.b(a17, a17.length);
            }
        }
        ua1.f fVar2 = this.f425952d;
        if (fVar2.f425962i == 0) {
            fVar2.f425962i = android.os.SystemClock.uptimeMillis();
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        while (true) {
            fVar = this.f425952d;
            long j17 = fVar.f425962i;
            if (j17 >= uptimeMillis) {
                break;
            } else {
                fVar.f425962i = j17 + 40;
            }
        }
        if (fVar.a() || this.f425952d.b()) {
            return;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        ua1.f fVar3 = this.f425952d;
        ((ku5.t0) u0Var).l(fVar3.f425963j, fVar3.f425962i - uptimeMillis, fVar3.f425954a);
    }
}
