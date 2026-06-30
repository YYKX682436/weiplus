package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class w implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.otherway.x f191014d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel f191015e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.feature.exdevice.NetworkDeviceInfo f191016f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.o0 f191017g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f191018h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f191019i;

    /* renamed from: m, reason: collision with root package name */
    public int f191020m;

    /* renamed from: n, reason: collision with root package name */
    public wj.t0 f191021n;

    /* renamed from: o, reason: collision with root package name */
    public xj.m f191022o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f191023p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f191024q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f191025r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f191026s = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Integer f191027t;

    public final java.lang.String a() {
        java.lang.CharSequence charSequence;
        java.lang.String obj;
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel;
        java.lang.String str;
        java.lang.Object obj2;
        java.lang.String d17;
        switch (h()) {
            case 1:
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.o_v);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                return string;
            case 2:
                com.tencent.mm.pluginsdk.ui.otherway.x xVar = this.f191014d;
                return (xVar == null || (charSequence = xVar.f191029e) == null || (obj = charSequence.toString()) == null) ? "" : obj;
            case 3:
                com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = this.f191015e;
                if (appBrandOpenMaterialDetailModel != null && (appBrandOpenMaterialModel = appBrandOpenMaterialDetailModel.f86255d) != null) {
                    r1 = appBrandOpenMaterialModel.f86267i;
                }
                return r1 == null ? "" : r1;
            case 4:
                com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = this.f191016f;
                r1 = networkDeviceInfo != null ? networkDeviceInfo.f66588f : null;
                return r1 == null ? "" : r1;
            case 5:
            case 7:
                com.tencent.mm.pluginsdk.model.o0 o0Var = this.f191017g;
                return (o0Var == null || (str = o0Var.f189390b) == null) ? "" : str;
            case 6:
                lb0.d dVar = lb0.d.f317669a;
                xj.m mVar = this.f191022o;
                r1 = mVar != null ? mVar.f454758f : null;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    ((ht.w) ((jt.c0) i95.n0.c(jt.c0.class))).getClass();
                    com.tencent.mm.pluginsdk.model.h4 h4Var = com.tencent.mm.pluginsdk.model.h4.f189337a;
                    if (kotlin.jvm.internal.o.b(r1, "com.tencent.hunyuan.app.chat")) {
                        d17 = dVar.d(com.tencent.mm.pluginsdk.model.a.f188775d, com.tencent.mm.sdk.platformtools.x2.f193071a);
                    } else {
                        ((ht.s) ((jt.a0) i95.n0.c(jt.a0.class))).getClass();
                        java.lang.String[] strArr = com.tencent.mm.pluginsdk.model.t3.f189442a;
                        d17 = kotlin.jvm.internal.o.b(r1, "com.tencent.mtt") ? dVar.d(com.tencent.mm.pluginsdk.model.a.f188776e, com.tencent.mm.sdk.platformtools.x2.f193071a) : "";
                    }
                    obj2 = kotlin.Result.m521constructorimpl(d17);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    obj2 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                return (java.lang.String) (kotlin.Result.m524exceptionOrNullimpl(obj2) == null ? obj2 : "");
            default:
                return "";
        }
    }

    public final java.lang.String b() {
        android.content.pm.ResolveInfo resolveInfo;
        android.content.pm.ActivityInfo activityInfo;
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel;
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel2;
        com.tencent.mm.pluginsdk.model.o0 o0Var;
        java.lang.String str2;
        int h17 = h();
        if (h17 == 2) {
            com.tencent.mm.pluginsdk.ui.otherway.x xVar = this.f191014d;
            if (xVar != null && (resolveInfo = xVar.f191028d) != null && (activityInfo = resolveInfo.activityInfo) != null) {
                r2 = activityInfo.packageName;
            }
            return r2 == null ? "" : r2;
        }
        if (h17 != 3) {
            if (h17 != 4) {
                return ((h17 != 5 && h17 != 7) || (o0Var = this.f191017g) == null || (str2 = o0Var.f189389a) == null) ? "" : str2;
            }
            com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = this.f191016f;
            r2 = networkDeviceInfo != null ? networkDeviceInfo.f66586d : null;
            return r2 == null ? "" : r2;
        }
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = this.f191015e;
        if (appBrandOpenMaterialDetailModel == null || (appBrandOpenMaterialModel = appBrandOpenMaterialDetailModel.f86255d) == null || (str = appBrandOpenMaterialModel.f86262d) == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append('_');
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel2 = this.f191015e;
        sb6.append((appBrandOpenMaterialDetailModel2 == null || (appBrandOpenMaterialModel2 = appBrandOpenMaterialDetailModel2.f86255d) == null) ? 0 : appBrandOpenMaterialModel2.f86263e);
        java.lang.String sb7 = sb6.toString();
        return sb7 == null ? "" : sb7;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel;
        android.content.pm.ResolveInfo resolveInfo;
        if (this.f191019i) {
            return 6;
        }
        if (this.f191020m > 0) {
            return 7;
        }
        if (this.f191018h) {
            return 1;
        }
        com.tencent.mm.pluginsdk.ui.otherway.x xVar = this.f191014d;
        if (((xVar == null || (resolveInfo = xVar.f191028d) == null) ? null : resolveInfo.activityInfo) != null) {
            return 2;
        }
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = this.f191015e;
        if (!com.tencent.mm.sdk.platformtools.t8.K0((appBrandOpenMaterialDetailModel == null || (appBrandOpenMaterialModel = appBrandOpenMaterialDetailModel.f86255d) == null) ? null : appBrandOpenMaterialModel.f86262d)) {
            return 3;
        }
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = this.f191016f;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(networkDeviceInfo != null ? networkDeviceInfo.f66586d : null)) {
            return 4;
        }
        com.tencent.mm.pluginsdk.model.o0 o0Var = this.f191017g;
        return !com.tencent.mm.sdk.platformtools.t8.K0(o0Var != null ? o0Var.f189389a : null) ? 5 : 0;
    }
}
