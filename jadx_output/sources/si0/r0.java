package si0;

/* loaded from: classes4.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si0.s0 f408159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.nk0 f408160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408161f;

    public r0(si0.s0 s0Var, bw5.nk0 nk0Var, java.lang.String str) {
        this.f408159d = s0Var;
        this.f408160e = nk0Var;
        this.f408161f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f408159d.f408165d;
        if (snsInfo == null) {
            return;
        }
        com.tencent.mm.protocal.protobuf.SnsObject f17 = com.tencent.mm.plugin.sns.model.s5.f(snsInfo);
        f17.VisibilityType = this.f408160e.b().f32151d;
        bw5.qk0 b17 = this.f408160e.b();
        int i17 = b17 == null ? -1 : si0.q0.f408152a[b17.ordinal()];
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PlatformChangeVisibilityDelegateImpl", "changeSnsInfoVisibility >> public " + this.f408161f);
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f408159d.f408165d;
            if (snsInfo2 != null) {
                snsInfo2.setPravited(0);
            }
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = this.f408159d.f408165d;
            if (snsInfo3 != null) {
                snsInfo3.unLocalPrivate();
            }
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo4 = this.f408159d.f408165d;
            if (snsInfo4 != null) {
                snsInfo4.setExtFlag();
            }
            si0.s0.b(this.f408159d, f17);
        } else if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PlatformChangeVisibilityDelegateImpl", "changeSnsInfoVisibility >> private " + this.f408161f);
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo5 = this.f408159d.f408165d;
            if (snsInfo5 != null) {
                snsInfo5.setPravited(1);
            }
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo6 = this.f408159d.f408165d;
            if (snsInfo6 != null) {
                snsInfo6.setLocalPrivate();
            }
            si0.s0.b(this.f408159d, f17);
        } else if (i17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PlatformChangeVisibilityDelegateImpl", "changeSnsInfoVisibility >> visible " + this.f408161f);
            si0.s0.a(this.f408159d, f17, this.f408160e);
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo7 = this.f408159d.f408165d;
            if (snsInfo7 != null) {
                snsInfo7.setPravited(0);
            }
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo8 = this.f408159d.f408165d;
            if (snsInfo8 != null) {
                snsInfo8.unLocalPrivate();
            }
        } else if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PlatformChangeVisibilityDelegateImpl", "changeSnsInfoVisibility >> invisible " + this.f408161f);
            si0.s0.a(this.f408159d, f17, this.f408160e);
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo9 = this.f408159d.f408165d;
            if (snsInfo9 != null) {
                snsInfo9.setPravited(0);
            }
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo10 = this.f408159d.f408165d;
            if (snsInfo10 != null) {
                snsInfo10.unLocalPrivate();
            }
        }
        try {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo11 = this.f408159d.f408165d;
            if (snsInfo11 != null) {
                snsInfo11.field_attrBuf = f17.toByteArray();
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PlatformChangeVisibilityDelegateImpl", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo12 = this.f408159d.f408165d;
        kotlin.jvm.internal.o.d(snsInfo12);
        Fj.v3(snsInfo12.field_snsId, this.f408159d.f408165d);
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
        }
        zc4.g gVar = (zc4.g) ((zc4.h) a17).P6(zc4.g.class);
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo13 = this.f408159d.f408165d;
        kotlin.jvm.internal.o.d(snsInfo13);
        long j17 = snsInfo13.field_snsId;
        o75.b bVar = o75.b.f343581b;
        gVar.i7(j17, o75.b.f343583d);
        com.tencent.mm.autogen.events.SnsVisibilityChangeByFlutterEvent snsVisibilityChangeByFlutterEvent = new com.tencent.mm.autogen.events.SnsVisibilityChangeByFlutterEvent();
        snsVisibilityChangeByFlutterEvent.f54853g.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PlatformChangeVisibilityDelegateImpl", "event publish, snsId is " + this.f408161f);
        snsVisibilityChangeByFlutterEvent.e();
    }
}
