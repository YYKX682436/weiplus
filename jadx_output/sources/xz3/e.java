package xz3;

/* loaded from: classes15.dex */
public final class e implements xz3.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xz3.f f458214a;

    public e(xz3.f fVar) {
        this.f458214a = fVar;
    }

    @Override // xz3.k
    public void b(xz3.l task) {
        kotlin.jvm.internal.o.g(task, "task");
        xz3.f fVar = this.f458214a;
        fVar.f458216e.b(fVar);
    }

    @Override // xz3.m
    public void c(sz3.x0 result) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductTask", "getProductTask onUploadSuccess and run imageRetrievalTask");
        xz3.f fVar = this.f458214a;
        fVar.f458216e.c(result);
        if (result.f414149c == 1) {
            if (fVar.f458215d.f414089k) {
                xz3.f.a(fVar, result);
                return;
            } else {
                fVar.f458216e.j(fVar);
                return;
            }
        }
        if (!fVar.f458215d.f414090l) {
            fVar.f458216e.j(fVar);
            return;
        }
        sz3.w0 w0Var = (sz3.w0) kz5.n0.Z(result.f414151e);
        android.graphics.RectF rectF = w0Var != null ? w0Var.f414140k : null;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (rectF == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AiScanImageGetProductTask", "getProductTask uploadFullImage success but no goodsObject");
            com.tencent.mm.plugin.scanner.model.d1.o(false);
            fVar.f458216e.d(result, result.f414147a, result.f414148b, 4, -1, "upload full image no goodsObject");
            fVar.f458216e.j(fVar);
            return;
        }
        vz3.t tVar = vz3.t.f441710a;
        sz3.p pVar = fVar.f458215d;
        int i17 = pVar.f414091m;
        sz3.a1 a1Var = pVar.f413945b;
        byte[] bArr = pVar.f414092n;
        android.graphics.Point point = pVar.f414093o;
        tVar.e(i17, a1Var, result, rectF, bArr, point.x, point.y, new xz3.d(fVar, result));
    }

    @Override // xz3.m
    public void d(sz3.x0 result, int i17, long j17, int i18, int i19, java.lang.String str) {
        kotlin.jvm.internal.o.g(result, "result");
        xz3.f fVar = this.f458214a;
        fVar.f458216e.d(result, i17, j17, i18, i19, str);
        fVar.f458216e.j(fVar);
        if (result.f414149c == 1) {
            if (!(result.f414150d == 1002)) {
                return;
            }
        }
        com.tencent.mm.plugin.scanner.model.d1.o(false);
    }

    @Override // xz3.m
    public void e(sz3.p request) {
        kotlin.jvm.internal.o.g(request, "request");
        this.f458214a.f458216e.e(request);
    }

    @Override // xz3.k
    public void g(xz3.l task) {
        kotlin.jvm.internal.o.g(task, "task");
        xz3.f fVar = this.f458214a;
        fVar.f458216e.g(fVar);
    }

    @Override // xz3.k
    public void j(xz3.l task) {
        kotlin.jvm.internal.o.g(task, "task");
    }
}
