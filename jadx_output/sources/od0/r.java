package od0;

@j95.b(dependencies = {fo3.j.class})
/* loaded from: classes11.dex */
public class r extends i95.w {
    public static void Ai(int i17, byte[] bArr) {
        ((ku5.t0) ku5.t0.f312615d).h(new od0.o(i17, bArr), "SIRWorker");
    }

    public static void wi() {
        w04.l lVar = w04.l.INSTANCE;
        if (lVar.M5(3, 86400000L) || (!fo3.s.INSTANCE.He() && lVar.M5(10, 21600000L))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PSIR", "[+] req task posted.");
            if (com.tencent.mm.sdk.platformtools.a0.f192447j && com.tencent.mm.sdk.platformtools.a0.f192446i && com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getBoolean("gprs_alert", true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PSIR", "CTA alert is not checked Return here.");
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).h(new od0.q(), "SIRWorker");
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
    }
}
