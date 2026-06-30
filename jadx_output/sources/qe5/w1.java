package qe5;

/* loaded from: classes8.dex */
public final class w1 implements zh1.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel f362208a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.service.k5 f362209b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f362210c;

    public w1(qe5.z1 ui6, com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel, com.tencent.mm.plugin.appbrand.service.k5 openMaterialService) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(materialModel, "materialModel");
        kotlin.jvm.internal.o.g(openMaterialService, "openMaterialService");
        this.f362208a = materialModel;
        this.f362209b = openMaterialService;
        this.f362210c = new java.lang.ref.WeakReference(ui6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r9.G == true) goto L15;
     */
    @Override // zh1.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r9, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection r10) {
        /*
            r8 = this;
            java.lang.String r0 = "openMaterialCollection"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.ref.WeakReference r0 = r8.f362210c
            java.lang.Object r0 = r0.get()
            qe5.z1 r0 = (qe5.z1) r0
            java.lang.String r1 = "MicroMsg.File.LoadOpenMaterialsUIC"
            if (r0 != 0) goto L17
            java.lang.String r9 = "loadOpenMaterials#onMyOpenMaterialsGot, ui is null"
            com.tencent.mars.xlog.Log.i(r1, r9)
            return
        L17:
            if (r9 != 0) goto L1f
            java.lang.String r9 = "loadOpenMaterials#onMyOpenMaterialsGot, fail"
            com.tencent.mars.xlog.Log.i(r1, r9)
            return
        L1f:
            com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel r9 = r8.f362208a
            java.lang.String r9 = r9.f86271f
            r0.f362228d = r9
            r0.f362229e = r10
            kd5.e r9 = r0.T6()
            if (r9 == 0) goto L33
            boolean r9 = r9.G
            r2 = 1
            if (r9 != r2) goto L33
            goto L34
        L33:
            r2 = 0
        L34:
            if (r2 != 0) goto L3c
            java.lang.String r9 = "loadOpenMaterials#onMyOpenMaterialsGot, download not finish"
            com.tencent.mars.xlog.Log.i(r1, r9)
            return
        L3c:
            com.tencent.mm.plugin.appbrand.service.k5 r9 = r8.f362209b
            r9.getClass()
            zh1.a r2 = zh1.n.f472909o
            boolean r9 = r2.a(r10)
            if (r9 != 0) goto L4f
            java.lang.String r9 = "loadOpenMaterials#onMyOpenMaterialsGot, can not create"
            com.tencent.mars.xlog.Log.i(r1, r9)
            return
        L4f:
            zh1.v0 r9 = r0.f362230f
            if (r9 == 0) goto L56
            r9.dead()
        L56:
            bi1.g r9 = bi1.g.ATTACH
            r9.toString()
            zh1.n.f472910p = r9
            android.app.Activity r3 = r0.getContext()
            r4 = 0
            r6 = 0
            r7 = 0
            r5 = r10
            zh1.v0 r9 = r2.b(r3, r4, r5, r6, r7)
            r0.f362230f = r9
            androidx.appcompat.app.AppCompatActivity r9 = r0.getActivity()
            java.lang.String r10 = "activity"
            kotlin.jvm.internal.o.g(r9, r10)
            pf5.z r10 = pf5.z.f353948a
            pf5.v r9 = r10.a(r9)
            java.lang.Class<qe5.z> r10 = qe5.z.class
            androidx.lifecycle.c1 r9 = r9.a(r10)
            qe5.z r9 = (qe5.z) r9
            r9.getClass()
            java.lang.String r9 = "loadOpenMaterials#onMyOpenMaterialsGot, bottomSheet is null"
            com.tencent.mars.xlog.Log.i(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.w1.a(boolean, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection):void");
    }
}
