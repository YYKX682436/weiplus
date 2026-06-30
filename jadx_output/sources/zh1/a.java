package zh1;

/* loaded from: classes8.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public boolean a(com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection openMaterialCollection) {
        kotlin.jvm.internal.o.g(openMaterialCollection, "openMaterialCollection");
        java.util.List appBrandOpenMaterialDetailModels = openMaterialCollection.f86252g;
        kotlin.jvm.internal.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
        return !appBrandOpenMaterialDetailModels.isEmpty();
    }

    public zh1.v0 b(android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection openMaterialCollection, zh1.c1 c1Var, zh1.w0 w0Var) {
        zh1.w0 w0Var2;
        zh1.w0 w0Var3;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(openMaterialCollection, "openMaterialCollection");
        boolean a17 = a(openMaterialCollection);
        zh1.v0 v0Var = zh1.v0.f472953s1;
        if (!a17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "create, can not create, use dummy");
            return v0Var;
        }
        if (!zh1.w.a(context)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "create, context is invalid, use dummy");
            return v0Var;
        }
        if (((gb0.n) ((fb0.k) i95.n0.c(fb0.k.class))).isEnable()) {
            if (w0Var == null) {
                long j17 = zh1.n.f472911q;
                bi1.g gVar = zh1.n.f472910p;
                kotlin.jvm.internal.o.d(gVar);
                w0Var3 = new di1.f(j17, gVar, openMaterialCollection, null, 8, null);
            } else {
                w0Var3 = w0Var;
            }
            return new zh1.o(context, openMaterialCollection, w0Var3);
        }
        zh1.c1 c1Var2 = c1Var == null ? zh1.c1.f472869a : c1Var;
        if (w0Var == null) {
            long j18 = zh1.n.f472911q;
            bi1.g gVar2 = zh1.n.f472910p;
            kotlin.jvm.internal.o.d(gVar2);
            w0Var2 = new di1.f(j18, gVar2, openMaterialCollection, null, 8, null);
        } else {
            w0Var2 = w0Var;
        }
        return new zh1.n(context, k0Var, openMaterialCollection, c1Var2, w0Var2);
    }
}
