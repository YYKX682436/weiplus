package sz3;

/* loaded from: classes15.dex */
public final class s implements xz3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sz3.w f414115a;

    public s(sz3.w wVar) {
        this.f414115a = wVar;
    }

    @Override // xz3.g
    public void a(sz3.x0 result, int i17, long j17, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRetrievalFailed source: ");
        sb6.append(result.f414147a);
        sb6.append(", session: ");
        sb6.append(result.f414148b);
        sb6.append(", scanImageType: ");
        int i19 = result.f414149c;
        sb6.append(i19);
        sb6.append(", errCode: ");
        sb6.append(i18);
        sb6.append(", errMsg: ");
        sb6.append(str);
        com.tencent.mars.xlog.Log.e("MicroMsg.NewAiImageHandler", sb6.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 254);
        this.f414115a.k(result, i18, str);
        if (i19 == 1) {
            com.tencent.mm.plugin.scanner.model.d.a(15, result.f414152f);
        } else {
            com.tencent.mm.plugin.scanner.model.d.a(26, result.f414152f);
        }
    }

    @Override // xz3.k
    public void b(xz3.l task) {
        kotlin.jvm.internal.o.g(task, "task");
        if (task instanceof xz3.f) {
            sz3.p pVar = ((xz3.f) task).f458215d;
            sz3.y0 y0Var = pVar.f413945b.f413963e;
            if (y0Var.f414161b > 0) {
                y0Var.f414170k = java.lang.System.currentTimeMillis() - pVar.f413945b.f413963e.f414161b;
            }
        }
    }

    @Override // xz3.m
    public void c(sz3.x0 result) {
        sz3.y0 y0Var;
        kotlin.jvm.internal.o.g(result, "result");
        sz3.w0 w0Var = (sz3.w0) kz5.n0.Z(result.f414151e);
        java.lang.Long l17 = null;
        sz3.a1 a1Var = w0Var != null ? w0Var.f414134e : null;
        if (a1Var != null) {
            a1Var.f413963e.f414171l = java.lang.System.currentTimeMillis() - a1Var.f413963e.f414162c;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUploadSuccess source: ");
        sb6.append(result.f414147a);
        sb6.append(", session: ");
        sb6.append(result.f414148b);
        sb6.append(", scanImageType: ");
        sb6.append(result.f414149c);
        sb6.append(", uploadDuration: ");
        if (a1Var != null && (y0Var = a1Var.f413963e) != null) {
            l17 = java.lang.Long.valueOf(y0Var.f414171l);
        }
        sb6.append(l17);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewAiImageHandler", sb6.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 251);
        this.f414115a.n(result);
    }

    @Override // xz3.m
    public void d(sz3.x0 result, int i17, long j17, int i18, int i19, java.lang.String str) {
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUploadFailed source: ");
        sb6.append(result.f414147a);
        sb6.append(", session: ");
        sb6.append(result.f414148b);
        sb6.append(", scanImageType: ");
        int i27 = result.f414149c;
        sb6.append(i27);
        sb6.append(", errType: ");
        sb6.append(i18);
        sb6.append(", errCode: ");
        sb6.append(i19);
        sb6.append(", errMsg: ");
        sb6.append(str);
        com.tencent.mars.xlog.Log.e("MicroMsg.NewAiImageHandler", sb6.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR);
        this.f414115a.m(result, 1003, str);
        vz3.t.f441710a.j();
        com.tencent.mm.plugin.scanner.model.c cVar = result.f414152f;
        if (cVar != null) {
            cVar.f158828e = result.f414153g;
        }
        boolean z17 = true;
        if (i27 == 1) {
            com.tencent.mm.plugin.scanner.model.d.a(13, cVar);
            return;
        }
        if (i17 == 3) {
            com.tencent.mm.plugin.scanner.model.d.a(23, cVar);
            return;
        }
        if (i17 != 4) {
            return;
        }
        if (i19 != 1003) {
            java.util.ArrayList arrayList = result.f414151e;
            if (arrayList != null && !arrayList.isEmpty()) {
                z17 = false;
            }
            if (!z17) {
                return;
            }
        }
        com.tencent.mm.plugin.scanner.model.d.a(43, result.f414152f);
    }

    @Override // xz3.m
    public void e(sz3.p request) {
        kotlin.jvm.internal.o.g(request, "request");
        request.f413945b.f413963e.f414162c = java.lang.System.currentTimeMillis();
    }

    @Override // xz3.a
    public void f(sz3.c1 c1Var, sz3.x0 result, yz5.l addResultCallback) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(addResultCallback, "addResultCallback");
        dz3.i.p(new sz3.r(c1Var, this.f414115a, result, addResultCallback));
    }

    @Override // xz3.k
    public void g(xz3.l task) {
        kotlin.jvm.internal.o.g(task, "task");
        if (task instanceof xz3.f) {
            sz3.p pVar = ((xz3.f) task).f458215d;
            com.tencent.mars.xlog.Log.w("MicroMsg.NewAiImageHandler", "getProductTask onTaskCancel %s", java.lang.Integer.valueOf(pVar.f413944a));
            if (pVar.f413944a == 1) {
                com.tencent.mm.plugin.scanner.model.d.a(16, pVar.f413945b.f413964f);
            } else {
                com.tencent.mm.plugin.scanner.model.d.a(27, pVar.f413945b.f413964f);
            }
        }
    }

    @Override // xz3.g
    public void h(sz3.x0 result) {
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRetrievalSuccess source: ");
        sb6.append(result.f414147a);
        sb6.append(", session: ");
        long j17 = result.f414148b;
        sb6.append(j17);
        sb6.append(", scanImageType: ");
        int i17 = result.f414149c;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewAiImageHandler", sb6.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 252);
        this.f414115a.l(result);
        sz3.w0 w0Var = (sz3.w0) kz5.n0.Z(result.f414151e);
        sz3.a1 a1Var = w0Var != null ? w0Var.f414134e : null;
        if (a1Var != null) {
            sz3.y0 y0Var = a1Var.f413963e;
            java.lang.String valueOf = java.lang.String.valueOf(j17);
            y0Var.getClass();
            kotlin.jvm.internal.o.g(valueOf, "<set-?>");
            y0Var.f414164e = valueOf;
            sz3.y0 y0Var2 = a1Var.f413963e;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            sz3.y0 y0Var3 = a1Var.f413963e;
            y0Var2.f414172m = currentTimeMillis - y0Var3.f414163d;
            if (i17 == 1) {
                y0Var3.f414165f = 1;
            } else if (i17 == 2) {
                y0Var3.f414165f = 2;
            } else if (i17 == 3) {
                y0Var3.f414165f = 3;
            }
            y0Var3.f414176q = e04.j2.a();
            sz3.y0 y0Var4 = a1Var.f413963e;
            com.tencent.mm.sdk.platformtools.o4 o4Var = et5.c.f256672a;
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = et5.c.f256672a;
            y0Var4.f414175p = o4Var2 != null ? o4Var2.getInt("scan_code_last_frame_cost", 0) : 0;
            com.tencent.mm.plugin.scanner.model.e.f158874a.a(a1Var.f413963e);
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.scanner.model.d.a(19, result.f414152f);
        } else {
            com.tencent.mm.plugin.scanner.model.d.a(34, result.f414152f);
        }
    }

    @Override // xz3.g
    public void i(sz3.n request) {
        kotlin.jvm.internal.o.g(request, "request");
        request.f413945b.f413963e.f414163d = java.lang.System.currentTimeMillis();
    }

    @Override // xz3.k
    public void j(xz3.l task) {
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mars.xlog.Log.i("MicroMsg.NewAiImageHandler", "getProductTask onTaskFinish %d", java.lang.Integer.valueOf(task.hashCode()));
    }

    @Override // xz3.k
    public void k(xz3.l task) {
        kotlin.jvm.internal.o.g(task, "task");
        if (task instanceof xz3.f) {
            ((xz3.f) task).f458215d.f413945b.f413963e.f414161b = java.lang.System.currentTimeMillis();
        }
    }
}
