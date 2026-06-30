package my3;

/* loaded from: classes13.dex */
public final class a0 implements com.tencent.wechat.rtos.WeChatApi.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ my3.c0 f332781a;

    public a0(my3.c0 c0Var) {
        this.f332781a = c0Var;
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public void onAnswerVoIPEvent() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onAnswerVoIPEvent");
        com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), iy3.o.class);
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public void onCancelLoginEvent() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "receive watch cancel login");
        gy3.a aVar = this.f332781a.f332786a;
        if (aVar != null) {
            ((gy3.d) aVar).a();
        }
        com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), iy3.y.class);
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public void onCannotLoginEvent() {
        com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosWatchService", "onCannotLoginEvent");
        my3.v vVar = this.f332781a.f332792g;
        if (vVar != null) {
            ((iy3.e) vVar).a("", "");
        }
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public void onChannelHandshakeSuccessEvent() {
        com.tencent.wechat.rtos.WeChatApi weChatApi;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onChannelHandshakeSuccessEvent");
        my3.c0 c0Var = this.f332781a;
        if (c0Var.f332795j && (weChatApi = c0Var.f332787b) != null) {
            weChatApi.notifyUnbindWechat();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(26126, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 24, 0);
        c0Var.f332790e = true;
        com.tencent.wechat.rtos.WeChatApi weChatApi2 = c0Var.f332787b;
        if (weChatApi2 != null) {
            gy3.a aVar = c0Var.f332786a;
            weChatApi2.updateDeviceName(aVar != null ? ((gy3.d) aVar).c() : "RtosWatch");
        }
        my3.x xVar = c0Var.f332791f;
        if (xVar != null) {
            boolean z17 = c0Var.f332790e;
            gy3.a aVar2 = c0Var.f332786a;
            ((iy3.c) xVar).a(z17, aVar2 != null ? ((gy3.d) aVar2).c() : "");
        }
        c0Var.f332791f = null;
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public void onCloseChannelEvent(long j17) {
        gy3.j jVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onCloseChannelEvent " + j17);
        my3.c0 c0Var = this.f332781a;
        c0Var.f332790e = false;
        gy3.a aVar = c0Var.f332786a;
        if (aVar == null || (jVar = ((gy3.d) aVar).f277555c) == null) {
            return;
        }
        jVar.a();
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public void onCloudHandShakeEvent(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "begin handShake cgi " + str);
        my3.c0 c0Var = this.f332781a;
        c0Var.f332790e = false;
        android.os.Bundle bundle = new android.os.Bundle();
        h73.e.c(bundle, "taskid", i17);
        if (str == null) {
            str = "";
        }
        h73.e.d(bundle, "handshke", str);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, iy3.b.class, new my3.z(c0Var));
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public java.lang.String onGetExtSpamInfoEvent(int i17) {
        try {
            byte[] o37 = fo3.s.INSTANCE.o3(16);
            if (o37 != null) {
                if (!(o37.length == 0)) {
                    java.lang.String str = new java.lang.String(o37, r26.c.f368865a);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "spamInfo size in java = " + str.length());
                    return str;
                }
            }
        } catch (java.lang.NullPointerException unused) {
        }
        return "";
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public int onGetLicenseEvent(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onGetLicense " + str2 + ' ' + str);
        my3.c0 c0Var = this.f332781a;
        com.tencent.mm.sdk.platformtools.b4 b4Var = c0Var.f332788c;
        if (b4Var != null) {
            b4Var.d();
        }
        my3.v vVar = c0Var.f332792g;
        if (vVar == null) {
            return 0;
        }
        ((iy3.e) vVar).a(str, str2);
        return 0;
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public java.lang.String onGetLoginAvatarEvent() {
        java.lang.String str = this.f332781a.f332794i;
        return str == null ? "" : str;
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public void onHangupVoIPEvent() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onHangupVoIPEvent");
        com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), iy3.t.class);
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public boolean onIsForegroundEvent() {
        return true;
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public boolean onIsPhysicalLinkConnectedEvent() {
        return true;
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public void onListenServiceEvent(java.lang.String service_name) {
        kotlin.jvm.internal.o.g(service_name, "service_name");
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onListenServiceEvent ".concat(service_name));
        gy3.a aVar = this.f332781a.f332786a;
        if (aVar != null) {
            ((gy3.d) aVar).b();
        }
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public void onLoginResultEvent(int i17) {
        my3.c0 c0Var = this.f332781a;
        c0Var.getClass();
        c0Var.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(26126, 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(i17), 0);
        if (i17 == 0) {
            my3.w wVar = c0Var.f332793h;
            if (wVar != null) {
                iy3.j jVar = (iy3.j) wVar;
                kotlin.jvm.internal.h0 h0Var = jVar.f295921a;
                ((android.os.Bundle) h0Var.f310123d).putBoolean("result", true);
                com.tencent.mm.ipcinvoker.r rVar = jVar.f295922b;
                if (rVar != null) {
                    rVar.a(h0Var.f310123d);
                }
            }
            c0Var.f332793h = null;
            return;
        }
        my3.w wVar2 = c0Var.f332793h;
        if (wVar2 != null) {
            iy3.j jVar2 = (iy3.j) wVar2;
            kotlin.jvm.internal.h0 h0Var2 = jVar2.f295921a;
            ((android.os.Bundle) h0Var2.f310123d).putBoolean("result", false);
            com.tencent.mm.ipcinvoker.r rVar2 = jVar2.f295922b;
            if (rVar2 != null) {
                rVar2.a(h0Var2.f310123d);
            }
        }
        c0Var.f332793h = null;
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public void onLogoutEvent() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onLogoutEvent");
        com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), iy3.p.class);
        this.f332781a.a();
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public boolean onRequestUseCloudHandShakeEvent() {
        return true;
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public void onWriteChannelDataEvent(long j17, byte[] bArr) {
        gy3.a aVar;
        gy3.j jVar;
        gy3.i iVar;
        if (bArr == null || (aVar = this.f332781a.f332786a) == null || (jVar = ((gy3.d) aVar).f277555c) == null || (iVar = jVar.f277584d) == null) {
            return;
        }
        if (iVar.f277576g == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.SendThread", "Send thread has been close. Send data abort");
            return;
        }
        synchronized (iVar.f277579m) {
            iVar.f277577h.add(bArr);
            iVar.f277579m.notify();
        }
    }

    @Override // com.tencent.wechat.rtos.WeChatApi.Callback
    public boolean onisNetworkConnectedEvent() {
        this.f332781a.getClass();
        return com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }
}
