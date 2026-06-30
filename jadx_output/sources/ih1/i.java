package ih1;

/* loaded from: classes7.dex */
public final class i extends jc3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ih1.m f291497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ih1.u f291498b;

    public i(ih1.m mVar, ih1.u uVar) {
        this.f291497a = mVar;
        this.f291498b = uVar;
    }

    @Override // jc3.a, jc3.l
    /* renamed from: c */
    public void b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        super.b(view);
        int hashCode = view.hashCode();
        java.lang.Runnable runnable = (java.lang.Runnable) this.f291497a.f291512f.remove(java.lang.Integer.valueOf(hashCode));
        if (runnable != null) {
            this.f291497a.f291511e.removeCallbacks(runnable);
        }
        ih1.v vVar = (ih1.v) this.f291497a.f291510d.get(java.lang.Integer.valueOf(hashCode));
        if (vVar != null) {
            ih1.u uVar = this.f291498b;
            mq0.d0 d0Var = (mq0.d0) i95.n0.c(mq0.d0.class);
            java.lang.String str = vVar.f291542a;
            java.lang.String a17 = vVar.f291543b.a();
            java.lang.String str2 = vVar.f291544c;
            ((mq0.s0) d0Var).Ai(str, a17, str2, mq0.a.f330515g, true, str2, kz5.b1.e(new jz5.l("appId", uVar.f291530a)));
            vVar.f291545d = false;
        }
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "maliCrash onRequestHide");
        ((com.tencent.mm.plugin.appbrand.service.i0) this.f291498b.f291531b).a();
    }

    @Override // jc3.a, jc3.l
    /* renamed from: d */
    public void a(android.view.View view) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "view");
        super.a(view);
        ih1.v vVar = (ih1.v) this.f291497a.f291510d.get(java.lang.Integer.valueOf(view.hashCode()));
        if (vVar != null) {
            ih1.u uVar = this.f291498b;
            ih1.m mVar = this.f291497a;
            mq0.d0 d0Var = (mq0.d0) i95.n0.c(mq0.d0.class);
            java.lang.String str2 = vVar.f291542a;
            java.lang.String a17 = vVar.f291543b.a();
            java.lang.String str3 = vVar.f291544c;
            ((mq0.s0) d0Var).Ai(str2, a17, str3, mq0.a.f330514f, true, str3, kz5.b1.e(new jz5.l("appId", uVar.f291530a)));
            vVar.f291545d = true;
            try {
                java.lang.String frameSetName = vVar.f291544c;
                kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
                if (frameSetName.length() == 0) {
                    str = "";
                } else {
                    java.util.List f07 = r26.n0.f0(frameSetName, new java.lang.String[]{"_"}, false, 0, 6, null);
                    if (f07.size() >= 3) {
                        frameSetName = (java.lang.String) f07.get(1);
                    }
                    str = frameSetName;
                }
                mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
                if (c0Var != null) {
                    mq0.c0.Xa(c0Var, mq0.z.f330634e, "MagicAdMiniProgram", "RewardAd", str, vVar.f291544c, mq0.a0.f330532e, null, kz5.b1.e(new jz5.l("appId", uVar.f291530a)), 64, null);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "[MBAd] report Expose failed", e17);
            }
            int hashCode = view.hashCode();
            ih1.h hVar = new ih1.h(vVar.f291544c, uVar, mVar, hashCode);
            java.lang.Runnable runnable = (java.lang.Runnable) mVar.f291512f.get(java.lang.Integer.valueOf(hashCode));
            if (runnable != null) {
                mVar.f291511e.removeCallbacks(runnable);
            }
            mVar.f291512f.put(java.lang.Integer.valueOf(hashCode), hVar);
            mVar.f291511e.postDelayed(hVar, 1000L);
        }
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "maliCrash onRequestShow");
        com.tencent.mm.plugin.appbrand.service.i0 i0Var = (com.tencent.mm.plugin.appbrand.service.i0) this.f291498b.f291531b;
        ae.q qVar = (ae.q) i0Var.f88685a.z1(ae.q.class);
        com.tencent.magicbrush.MagicBrush magicBrush = qVar == null ? null : ((ae.a) qVar).f3335y.f426569c;
        if (magicBrush != null) {
            magicBrush.e();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceWC", "[MBAd] MagicAdMiniProgramInstaller[%s], onShowMBAd, mb: %s", i0Var.f88685a.getAppId(), magicBrush);
    }
}
