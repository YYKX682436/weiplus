package com.tencent.mm.udr;

@j95.b
/* loaded from: classes12.dex */
public final class a1 extends i95.w implements com.tencent.mm.udr.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.udr.UDRFeatureService$preCleanFileEvent$1 f196449d;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.udr.UDRFeatureService$preCleanFileEvent$1] */
    public a1() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f196449d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent>(a0Var) { // from class: com.tencent.mm.udr.UDRFeatureService$preCleanFileEvent$1
            {
                this.__eventId = 1489935310;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent beforeAggressiveCleanCacheEvent) {
                com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent event = beforeAggressiveCleanCacheEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.p0 p0Var = event.f53999g;
                com.tencent.mars.xlog.Log.i("UDRFeatureService", "leonl: received clean event, flag is " + p0Var.f7589a + ", is system " + ((p0Var.f7589a & 1) != 0));
                return false;
            }
        };
    }

    public static final void wi(com.tencent.mm.udr.a1 a1Var, android.os.Bundle bundle, ea5.k kVar) {
        a1Var.getClass();
        long j17 = bundle.getLong("taskId");
        java.lang.String string = bundle.getString("projectId");
        java.lang.String string2 = bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        if (string2 == null) {
            string2 = "";
        }
        java.lang.String str = string2;
        int i17 = bundle.getInt("version");
        com.tencent.wechat.aff.udr.r a17 = com.tencent.wechat.aff.udr.r.a(bundle.getInt("type"));
        com.tencent.mars.xlog.Log.i("UDRFeatureService", "crossProcessCallBack projectId:" + string + ", name:" + str);
        if (string == null) {
            return;
        }
        com.tencent.mm.udr.z0 z0Var = new com.tencent.mm.udr.z0(string, str, j17, i17, a17);
        com.tencent.mm.udr.y0 y0Var = new com.tencent.mm.udr.y0(string, str, bundle, j17, i17, a17);
        java.lang.String string3 = bundle.getString("state");
        if (string3 != null && string3.hashCode() == -1867169789 && string3.equals(ya.b.SUCCESS)) {
            z0Var.invoke(kVar);
        } else {
            y0Var.invoke(kVar);
        }
    }

    public void Ai(com.tencent.wechat.aff.udr.p parameter, ea5.k kVar) {
        kotlin.jvm.internal.o.g(parameter, "parameter");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.wechat.aff.udr.a.f217529b.a(parameter, java.util.Optional.ofNullable(kVar).map(com.tencent.mm.udr.s0.f196508a));
            return;
        }
        try {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, parameter, com.tencent.mm.udr.j0.class, new com.tencent.mm.udr.t0(this, kVar));
        } catch (android.os.BadParcelableException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("UDRFeatureService", e17, "batchCheck BadParcelableException ", new java.lang.Object[0]);
        }
    }

    public void Bi(com.tencent.wechat.aff.udr.q parameter) {
        kotlin.jvm.internal.o.g(parameter, "parameter");
        Di(parameter, null);
    }

    public void Di(com.tencent.wechat.aff.udr.q parameter, ea5.k kVar) {
        kotlin.jvm.internal.o.g(parameter, "parameter");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.wechat.aff.udr.a.f217529b.c(parameter, java.util.Optional.ofNullable(kVar).map(com.tencent.mm.udr.u0.f196513a));
            return;
        }
        try {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, parameter, com.tencent.mm.udr.n0.class, new com.tencent.mm.udr.v0(this, kVar));
        } catch (android.os.BadParcelableException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("UDRFeatureService", e17, "check BadParcelableException ", new java.lang.Object[0]);
        }
    }

    public void Ni(com.tencent.wechat.aff.udr.q parameter, ea5.k callback) {
        kotlin.jvm.internal.o.g(parameter, "parameter");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.wechat.aff.udr.a.f217529b.b(parameter, java.util.Optional.ofNullable(callback).map(com.tencent.mm.udr.w0.f196517a));
            return;
        }
        try {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, parameter, com.tencent.mm.udr.l0.class, new com.tencent.mm.udr.x0(this, callback));
        } catch (android.os.BadParcelableException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("UDRFeatureService", e17, "checkNoLogin BadParcelableException ", new java.lang.Object[0]);
        }
    }

    public void Ri() {
        if (!com.tencent.mm.sdk.platformtools.s9.f192975c) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return;
        }
        com.tencent.wechat.aff.udr.a aVar = com.tencent.wechat.aff.udr.a.f217529b;
        aVar.d();
        aVar.q();
    }

    public com.tencent.wechat.aff.udr.x Ui(java.lang.String projectId, java.lang.String name) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return (com.tencent.wechat.aff.udr.x) com.tencent.wechat.aff.udr.a.f217529b.k(projectId, name).orElse(null);
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("projectId", projectId);
            bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, name);
            return (com.tencent.wechat.aff.udr.x) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.udr.q0.class);
        } catch (android.os.BadParcelableException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("UDRFeatureService", e17, "getResource BadParcelableException ", new java.lang.Object[0]);
            return null;
        }
    }

    public byte[] Vi(java.lang.String projectId, java.lang.String name) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return (byte[]) com.tencent.wechat.aff.udr.a.f217529b.i(projectId, name).orElse(null);
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("projectId", projectId);
            bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, name);
            return (byte[]) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.udr.o0.class);
        } catch (android.os.BadParcelableException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("UDRFeatureService", e17, "getResourceDecrypt BadParcelableException ", new java.lang.Object[0]);
            return null;
        }
    }

    public com.tencent.wechat.aff.udr.w Zi(java.lang.String projectId) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return (com.tencent.wechat.aff.udr.w) com.tencent.wechat.aff.udr.a.f217529b.j(projectId).orElse(null);
        }
        try {
            return (com.tencent.wechat.aff.udr.w) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(projectId), com.tencent.mm.udr.p0.class);
        } catch (android.os.BadParcelableException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("UDRFeatureService", e17, "getResourceList BadParcelableException ", new java.lang.Object[0]);
            return null;
        }
    }

    public void aj(java.lang.String projectId, java.lang.String className) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(className, "className");
        ((com.tencent.mm.udr.e1) ((com.tencent.mm.udr.c0) i95.n0.c(com.tencent.mm.udr.c0.class))).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.UDRGlobalConfigFeatureService", "register projectId:%s,class name:%s", projectId, className);
        java.lang.Iterable all = ((fs.c) fs.g.f(ea5.l.class)).all();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((fs.e) all).iterator();
        while (it.hasNext()) {
            ea5.l lVar = (ea5.l) ((fs.q) it.next()).get();
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ea5.l lVar2 = (ea5.l) it6.next();
            if (kotlin.jvm.internal.o.b(className, lVar2.getClass().getName())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.UDRGlobalConfigFeatureService", "dynamic register class:%s for projectId:%s", className, projectId);
                com.tencent.mm.udr.e1.f196480e.put(projectId, lVar2);
                com.tencent.mm.udr.e1.f196481f.add(projectId);
                com.tencent.wechat.aff.udr.a.f217529b.o(projectId, lVar2.addToPeriod(), lVar2.getParameter(), new com.tencent.wechat.aff.udr.g(lVar2));
            }
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("UDRFeatureService", "onAccountInitialized call alive");
            alive();
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("UDRFeatureService", "onAccountReleased call dead");
            dead();
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("UDRFeatureService", "onCreate");
        super.onCreate(context);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            da5.r rVar = da5.r.f227817a;
            if (rVar.b()) {
                rVar.c();
            }
        }
    }
}
