package rk4;

/* loaded from: classes11.dex */
public final class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ting.TingShareConfig f396838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f396839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f396840f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f396841g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ting.TingShareDataWrap f396842h;

    public m2(com.tencent.pigeon.ting.TingShareConfig tingShareConfig, rk4.l3 l3Var, android.app.Activity activity, bw5.lp0 lp0Var, com.tencent.pigeon.ting.TingShareDataWrap tingShareDataWrap) {
        this.f396838d = tingShareConfig;
        this.f396839e = l3Var;
        this.f396840f = activity;
        this.f396841g = lp0Var;
        this.f396842h = tingShareDataWrap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bw5.d60 d60Var;
        com.tencent.pigeon.ting.TingShareConfig tingShareConfig = this.f396838d;
        long shareScene = tingShareConfig.getShareScene();
        bw5.lp0 tingItem = this.f396841g;
        android.app.Activity activity = this.f396840f;
        rk4.l3 l3Var = this.f396839e;
        if (shareScene == 1) {
            cl4.v b17 = l3Var.b();
            kotlin.jvm.internal.o.f(tingItem, "$tingItem");
            b17.k(activity, tingItem, tingShareConfig);
            return;
        }
        if (shareScene == 2) {
            cl4.v b18 = l3Var.b();
            kotlin.jvm.internal.o.f(tingItem, "$tingItem");
            b18.l(activity, tingItem);
        } else if (shareScene == 3) {
            cl4.v b19 = l3Var.b();
            kotlin.jvm.internal.o.f(tingItem, "$tingItem");
            b19.c(activity, tingItem);
        } else if (shareScene == 4) {
            try {
                d60Var = new bw5.d60().parseFrom(this.f396842h.getCommentInfoData());
            } catch (java.lang.Exception unused) {
                d60Var = null;
            }
            cl4.v b27 = l3Var.b();
            kotlin.jvm.internal.o.f(tingItem, "$tingItem");
            b27.h(activity, tingItem, d60Var);
        }
    }
}
