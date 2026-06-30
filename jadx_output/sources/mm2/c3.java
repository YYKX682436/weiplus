package mm2;

/* loaded from: classes3.dex */
public final class c3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f328932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f328933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.o4 f328934f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.eh1 f328935g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ no0.a f328936h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(gk2.e eVar, java.lang.String str, mm2.o4 o4Var, r45.eh1 eh1Var, no0.a aVar) {
        super(1);
        this.f328932d = eVar;
        this.f328933e = str;
        this.f328934f = o4Var;
        this.f328935g = eh1Var;
        this.f328936h = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.HashMap hashMap = ((mm2.o4) this.f328932d.a(mm2.o4.class)).K;
        java.lang.String str = this.f328933e;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(str);
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "receive accept audience mic msg  enterRoomResp: " + intValue + " linkState: " + num);
        if (num != null && num.intValue() == 3) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "seesionId:" + str + " has closed. skip this accept.");
        } else {
            mm2.o4 o4Var = this.f328934f;
            if (intValue >= 0) {
                ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).wi(o4Var.f328963d, this.f328935g.getInteger(1));
                o4Var.H7(this.f328936h);
                ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                tn0.w0 w0Var = dk2.ef.f233378d;
                if (w0Var != null) {
                    w0Var.d0(false);
                }
                ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                tn0.w0 w0Var2 = dk2.ef.f233378d;
                if (w0Var2 != null) {
                    w0Var2.c0(false);
                }
                ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).Vi();
                ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                tn0.w0 w0Var3 = dk2.ef.f233378d;
                if (w0Var3 != null) {
                    w0Var3.C(((mm2.e1) o4Var.business(mm2.e1.class)).b7());
                }
            } else {
                c61.ac acVar = (c61.ac) i95.n0.c(c61.ac.class);
                long j17 = ((mm2.e1) o4Var.business(mm2.e1.class)).f328987q.f380304q;
                long j18 = ((mm2.e1) o4Var.business(mm2.e1.class)).f328988r.getLong(0);
                ((b92.g1) acVar).getClass();
                com.tencent.mars.xlog.Log.i("FinderLiveMicWatcher", "onVisitorEnterRoomMicFail errCode: " + intValue + " roomId: " + j17 + " liveId: " + j18);
                pm0.z.b(xy2.b.f458155b, "mic_visitorEnterRoomFail", false, null, null, false, false, new dk2.ta(intValue, j17, j18), 60, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
