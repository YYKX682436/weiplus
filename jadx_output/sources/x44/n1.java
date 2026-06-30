package x44;

/* loaded from: classes4.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f451864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x44.o1 f451865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f451866f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vz.s1 f451867g;

    public n1(android.app.Activity activity, x44.o1 o1Var, long j17, vz.s1 s1Var) {
        this.f451864d = activity;
        this.f451865e = o1Var;
        this.f451866f = j17;
        this.f451867g = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask$resumeTask$1");
        android.app.Activity activity = this.f451864d;
        java.lang.String string = activity.getString(com.tencent.mm.R.string.l5x);
        android.app.Activity activity2 = this.f451864d;
        java.lang.String string2 = activity2.getString(com.tencent.mm.R.string.l5y);
        java.lang.String string3 = activity2.getString(com.tencent.mm.R.string.l5q);
        java.lang.String string4 = activity2.getString(com.tencent.mm.R.string.f490347sg);
        long j17 = this.f451866f;
        vz.s1 s1Var = this.f451867g;
        x44.o1 o1Var = this.f451865e;
        db5.e1.D(activity, string, string2, string3, string4, false, new x44.l1(o1Var, j17, s1Var), new x44.m1(o1Var), com.tencent.mm.R.color.aaq);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask$resumeTask$1");
    }
}
