package f12;

/* loaded from: classes4.dex */
public final class e implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity f258598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f258599e;

    public e(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity, long j17) {
        this.f258598d = springLuckyEggActivity;
        this.f258599e = j17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity = this.f258598d;
        f12.c0 c0Var = springLuckyEggActivity.f97440f;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var.f258573b.setVisibility(8);
        f12.c0 c0Var2 = springLuckyEggActivity.f97440f;
        if (c0Var2 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var2.f258573b.y();
        f12.c0 c0Var3 = springLuckyEggActivity.f97440f;
        if (c0Var3 != null) {
            c0Var3.f258573b.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity = this.f258598d;
        f12.c0 c0Var = springLuckyEggActivity.f97440f;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var.f258573b.setVisibility(8);
        f12.c0 c0Var2 = springLuckyEggActivity.f97440f;
        if (c0Var2 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var2.f258573b.y();
        f12.c0 c0Var3 = springLuckyEggActivity.f97440f;
        if (c0Var3 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var3.f258573b.setVisibility(8);
        uq.n nVar = (uq.n) springLuckyEggActivity.X6().f258627q.getValue();
        if (nVar != null && (str = nVar.f430167o) != null) {
            if (str.length() > 0) {
                f12.c0 c0Var4 = springLuckyEggActivity.f97440f;
                if (c0Var4 == null) {
                    kotlin.jvm.internal.o.o("viewBinding");
                    throw null;
                }
                c0Var4.f258575d.setText(str);
            }
        }
        if (springLuckyEggActivity.X6().f258625o.getValue() != null) {
            f12.c0 c0Var5 = springLuckyEggActivity.f97440f;
            if (c0Var5 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            c0Var5.f258574c.setVisibility(0);
        } else {
            f12.c0 c0Var6 = springLuckyEggActivity.f97440f;
            if (c0Var6 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            c0Var6.f258574c.setVisibility(4);
        }
        uq.n nVar2 = (uq.n) springLuckyEggActivity.X6().f258627q.getValue();
        long j17 = nVar2 != null ? nVar2.f430173u : 0L;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f258599e;
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringEggRpt", "18916 eggRpt: " + b12.k.f17067h + ", 15, sessionId " + b12.k.f17064e + ", materialId " + j17 + " , appId " + b12.k.f17066g + ", timeMs: " + currentTimeMillis);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18916, b12.k.f17064e, "", 15, java.lang.Long.valueOf(currentTimeMillis), "", "", "", "", b12.k.f17066g, java.lang.Long.valueOf(j17), 0, 0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        f12.c0 c0Var = this.f258598d.f97440f;
        if (c0Var != null) {
            c0Var.f258583l.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
    }
}
