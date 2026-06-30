package zk3;

/* loaded from: classes8.dex */
public final class r implements kk3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f473496a;

    public r(zk3.g0 g0Var) {
        this.f473496a = g0Var;
    }

    @Override // kk3.b
    public final void a(java.util.List list) {
        zk3.g0.V6(this.f473496a, list, true, false, false);
        this.f473496a.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "initBallInfo");
        this.f473496a.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "transDataFilePath");
        boolean z17 = com.tencent.mm.sdk.platformtools.o4.M("multitask_tips_config").getBoolean("multitask_first_trans_img_path", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskTipsHelper", "needMultiTaskTransImgFile, needTrans: " + z17);
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).q(new zk3.f0(list));
        }
    }
}
