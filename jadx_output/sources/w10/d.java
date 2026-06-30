package w10;

/* loaded from: classes9.dex */
public final class d extends t10.c {

    /* renamed from: c, reason: collision with root package name */
    public final int f441965c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
        this.f441965c = hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t10.c
    public boolean a(pq.a context, bw5.x7 jumpInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        g10.v vVar = (g10.v) ((c00.i4) i95.n0.c(c00.i4.class));
        vVar.getClass();
        if (jumpInfo.e() != null) {
            java.lang.String b17 = jumpInfo.e().b();
            if ((b17 == null || b17.length() == 0) == false) {
                java.lang.String b18 = jumpInfo.e().b();
                boolean z17 = jumpInfo.e().f32832n;
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "isBizPkgAvailable, bizName = " + b18 + ", forceUdrUpdate = " + z17);
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "shouldOpenWithNirvana, force open");
                    return true;
                }
                boolean Ni = vVar.Ni(jumpInfo.e());
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "shouldOpenWithNirvana, isLatest = " + Ni);
                ((ku5.t0) ku5.t0.f312615d).h(new q10.o(jumpInfo.e(), bw5.d5.EcsNirvanaUdrPkgCheckResult, !Ni ? 1 : 0), "MicroMsg.EcsNirvanaReportUtil");
                if (!Ni) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "shouldOpenWithNirvana, not latest, update async");
                    kotlinx.coroutines.l.d(vVar.f267552d, null, null, new g10.q(vVar, jumpInfo, null), 3, null);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "shouldOpenWithNirvana, isLatest = " + Ni);
                return Ni;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "isBizPkgAvailable, jumpInfo is invalid");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        java.lang.String b17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String valueOf = java.lang.String.valueOf(context.f357555e);
        if (jumpInfo.e() == null) {
            callback.c("mbAppInfo is null");
            return;
        }
        java.lang.String b18 = jumpInfo.e().b();
        if ((b18 == null || b18.length() == 0) == true) {
            callback.c("mbAppInfo.bizName is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("ECS_O.Router.MBApp", "handleOpen: " + jumpInfo.e().b());
        bw5.s7 e17 = jumpInfo.e();
        z20.e eVar = z20.e.f469543e;
        z20.b bVar = new z20.b();
        bVar.f469537a = eVar;
        bw5.q9 q9Var = new bw5.q9();
        q9Var.f31999d = "ecso_open";
        q9Var.f32013u[1] = true;
        q9Var.c(java.lang.System.currentTimeMillis());
        q9Var.b(2);
        bVar.f469538b = q9Var;
        bVar.f(valueOf);
        bVar.c("onOpen");
        bVar.b("mb_service");
        bVar.b("mb_page_start");
        bVar.b("mb_dart_load_start");
        bVar.b("mb_dart_load_end");
        bVar.e(kz5.c1.k(new jz5.l("bizName", e17.b()), new jz5.l("pageType", java.lang.String.valueOf(e17.f32826e)), new jz5.l("openType", java.lang.String.valueOf(e17.f32827f)), new jz5.l("startupParams", e17.c()), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(e17.f32833o))));
        bw5.q9 q9Var2 = bVar.f469538b;
        q9Var2.f32010r = 1;
        q9Var2.f32013u[16] = true;
        bVar.a();
        if (e17.f32826e != 0) {
            callback.c("unknown page type");
            return;
        }
        byte[] byteArray = e17.toByteArray();
        bw5.e8 c17 = context.f357552b.c();
        if (c17 != null && (b17 = c17.b()) != null) {
            try {
                org.json.JSONObject jSONObject = !com.tencent.mm.sdk.platformtools.t8.K0(b17) ? new org.json.JSONObject(b17) : new org.json.JSONObject();
                jSONObject.put("trackerId", valueOf);
                bw5.h8 h8Var = context.f357552b;
                bw5.e8 c18 = h8Var.c();
                if (c18 != null) {
                    c18.f26778d = jSONObject.toString();
                    c18.f26779e[1] = true;
                } else {
                    c18 = null;
                }
                h8Var.f28114h = c18;
                h8Var.f28116m[5] = true;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("ECS_O.Router.MBApp", "handleOpen exp:" + e18);
            }
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            org.json.JSONObject d17 = context.d();
            b00.p0 p0Var = b00.p0.f16747a;
            if (d17 != null) {
                org.json.JSONObject d18 = context.d();
                kotlin.jvm.internal.o.d(d18);
                jSONObject2 = p0Var.f(jSONObject2, d18);
            }
            if (context.f357552b.c() != null && !com.tencent.mm.sdk.platformtools.t8.K0(context.f357552b.c().b())) {
                jSONObject2 = p0Var.f(jSONObject2, new org.json.JSONObject(context.f357552b.c().b()));
            }
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ECS_O.Router.MBApp", e19, "nativeExtraData parse error", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("ECS_O.Router.MBApp", "[MBAppRouter] extraParamInfo: " + jSONObject2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("mbAppInfo", byteArray);
        intent.putExtra("nativeExtraData", jSONObject2.toString());
        com.tencent.mars.xlog.Log.i("ECS_O.Router.MBApp", "startActivity");
        w10.c cVar = new w10.c(this, context);
        boolean z17 = context.c() instanceof com.tencent.mm.ui.MMActivity;
        int i17 = this.f441965c;
        if (z17) {
            android.content.Context c19 = context.c();
            j45.l.w(c19 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) c19 : null, "com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI", intent, i17, new w10.a(cVar));
        } else if (context.c() instanceof com.tencent.mm.ui.MMFragmentActivity) {
            android.content.Context c27 = context.c();
            j45.l.x(c27 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) c27 : null, "com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI", intent, i17, new w10.b(cVar));
        }
        bw5.n8 n8Var = new bw5.n8();
        n8Var.f30543m = true;
        n8Var.f30544n[7] = true;
        callback.b(n8Var);
    }

    @Override // t10.c
    public void c(pq.a context, bw5.x7 jumpInfo, bw5.l8 l8Var, t10.d callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        g10.v vVar = (g10.v) ((c00.i4) i95.n0.c(c00.i4.class));
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "enablePreloadBiz: " + ((java.lang.Number) ((jz5.n) vVar.f267553e).getValue()).intValue());
        boolean z17 = true;
        if (!(((java.lang.Number) ((jz5.n) vVar.f267553e).getValue()).intValue() > 0)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "preload, not enable");
            return;
        }
        if (jumpInfo.e() != null) {
            java.lang.String b17 = jumpInfo.e().b();
            if (b17 != null && b17.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                boolean Ni = vVar.Ni(jumpInfo.e());
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "preload, isLatest = " + Ni);
                if (!Ni) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "preload, not latest, update async, not preload");
                    kotlinx.coroutines.l.d(vVar.f267552d, null, null, new g10.n(vVar, jumpInfo, null), 3, null);
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "preload, bizName = " + jumpInfo.e().b() + ", isMainProcess = " + com.tencent.mm.sdk.platformtools.x2.n());
                java.lang.String b18 = jumpInfo.e().b();
                if (com.tencent.mm.sdk.platformtools.x2.n()) {
                    pm0.v.X(new g10.o(b18, vVar, jumpInfo));
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "doBizPreload ipc, bizName = " + b18);
                java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putByteArray("key_jump_info_bytes", jumpInfo.toByteArray());
                com.tencent.mm.ipcinvoker.extension.l.a(str, bundle, q10.m.class, null);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MagicEcsNirvanaFeatureService", "preload, jumpInfo is invalid");
    }
}
