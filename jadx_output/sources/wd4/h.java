package wd4;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f444911a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f444912b;

    /* renamed from: c, reason: collision with root package name */
    public final wd4.g f444913c;

    /* renamed from: d, reason: collision with root package name */
    public final wd4.b f444914d;

    /* renamed from: e, reason: collision with root package name */
    public final wd4.f f444915e;

    public h(kotlinx.coroutines.y0 coroutineScope, android.content.Context context, wd4.g materialInfo, wd4.b bottomSheetProvider, wd4.f curMaterialPathProvider) {
        kotlin.jvm.internal.o.g(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(materialInfo, "materialInfo");
        kotlin.jvm.internal.o.g(bottomSheetProvider, "bottomSheetProvider");
        kotlin.jvm.internal.o.g(curMaterialPathProvider, "curMaterialPathProvider");
        this.f444911a = coroutineScope;
        this.f444912b = context;
        this.f444913c = materialInfo;
        this.f444914d = bottomSheetProvider;
        this.f444915e = curMaterialPathProvider;
    }

    public final wd4.b a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomSheetProvider", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomSheetProvider", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
        return this.f444914d;
    }

    public final wd4.g b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
        return this.f444913c;
    }
}
