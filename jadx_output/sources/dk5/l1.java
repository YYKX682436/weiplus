package dk5;

/* loaded from: classes12.dex */
public class l1 implements m11.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk5.n1 f234720a;

    public l1(dk5.n1 n1Var) {
        this.f234720a = n1Var;
    }

    @Override // m11.a0
    public void a(int i17, int i18, long j17, java.lang.String str) {
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String str2 = this.f234720a.f234745f;
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(str2);
        if (i17 == 0 && i18 == 0) {
            h17.f415011i = 111;
            h17.U = 256;
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.o2.Ui().C(h17);
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(h17.h(), h17.f415016n);
            int i19 = com.tencent.mm.ui.transmit.MsgRetransmitUI.H1;
            com.tencent.mm.autogen.events.ReportForwardCdnEvent reportForwardCdnEvent = new com.tencent.mm.autogen.events.ReportForwardCdnEvent();
            reportForwardCdnEvent.f54685g.f6184a = Li;
            reportForwardCdnEvent.e();
        }
    }
}
