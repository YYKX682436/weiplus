package zx0;

/* loaded from: classes5.dex */
public final class j implements com.tencent.maas.camstudio.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f477020a;

    /* renamed from: b, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f477021b;

    /* renamed from: c, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f477022c;

    public j(java.lang.ref.WeakReference weakReference) {
        kotlin.jvm.internal.o.g(weakReference, "weakReference");
        this.f477020a = weakReference;
    }

    @Override // com.tencent.maas.camstudio.j
    public void a(java.lang.String taskKey) {
        kotlin.jvm.internal.o.g(taskKey, "taskKey");
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin-CDNBridgeServiceListener", "AIGC onCancelUpload: taskKey = ".concat(taskKey));
    }

    @Override // com.tencent.maas.camstudio.j
    public void b(com.tencent.maas.camstudio.MJCDNDownloadRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        yx0.b8 b8Var = (yx0.b8) this.f477020a.get();
        if (b8Var == null) {
            return;
        }
        this.f477022c = kotlinx.coroutines.l.d(b8Var.L, null, null, new zx0.h(request, this, b8Var, null), 3, null);
    }

    @Override // com.tencent.maas.camstudio.j
    public void c(com.tencent.maas.camstudio.MJCDNUploadRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin-CDNBridgeServiceListener", "AIGC onBeginUpload: ");
        yx0.b8 b8Var = (yx0.b8) this.f477020a.get();
        if (b8Var == null) {
            return;
        }
        java.lang.String str = request.f47871c;
        kotlin.jvm.internal.o.f(str, "getFilePath(...)");
        b8Var.f467176b2 = str;
        this.f477021b = kotlinx.coroutines.l.d(b8Var.L, null, null, new zx0.i(request, this, b8Var, null), 3, null);
    }

    @Override // com.tencent.maas.camstudio.j
    public void d(java.lang.String taskKey) {
        kotlin.jvm.internal.o.g(taskKey, "taskKey");
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin-CDNBridgeServiceListener", "AIGC onCancelDownload: taskKey = ".concat(taskKey));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof zx0.g
            if (r0 == 0) goto L13
            r0 = r7
            zx0.g r0 = (zx0.g) r0
            int r1 = r0.f477011g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f477011g = r1
            goto L18
        L13:
            zx0.g r0 = new zx0.g
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f477009e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f477011g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.throwOnFailure(r7)
            goto L5f
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f477008d
            zx0.j r2 = (zx0.j) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4f
        L3c:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.r2 r7 = r6.f477021b
            if (r7 == 0) goto L4e
            r0.f477008d = r6
            r0.f477011g = r5
            java.lang.Object r7 = kotlinx.coroutines.v2.d(r7, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r2 = r6
        L4f:
            kotlinx.coroutines.r2 r7 = r2.f477022c
            if (r7 == 0) goto L5f
            r2 = 0
            r0.f477008d = r2
            r0.f477011g = r4
            java.lang.Object r7 = kotlinx.coroutines.v2.d(r7, r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zx0.j.e(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
