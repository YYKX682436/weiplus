package m11;

/* loaded from: classes11.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f322697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f322698e;

    public g0(m11.l0 l0Var, long j17, long j18) {
        this.f322697d = j17;
        this.f322698e = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = m11.k0.f322727b;
        long j17 = o4Var.getLong("last_report_time", 0L);
        long c17 = c01.id.c();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.global.RepairerConfigImageIdErrorReport()) != 1 || c17 - j17 <= 86400000) {
            return;
        }
        o4Var.putLong("last_report_time", c17);
        com.tencent.mm.autogen.mmdata.rpt.ImageIdErrorStruct imageIdErrorStruct = new com.tencent.mm.autogen.mmdata.rpt.ImageIdErrorStruct();
        imageIdErrorStruct.f58463e = this.f322697d;
        imageIdErrorStruct.f58462d = this.f322698e;
        imageIdErrorStruct.f58464f = 1;
        imageIdErrorStruct.k();
        imageIdErrorStruct.o();
    }
}
