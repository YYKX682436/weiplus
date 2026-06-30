package wd4;

/* loaded from: classes4.dex */
public final class f0 implements com.tencent.mm.plugin.sns.ui.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f444899b;

    public f0(java.lang.String str, kotlin.jvm.internal.h0 h0Var) {
        this.f444898a = str;
        this.f444899b = h0Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.c3
    public final void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$mediaChangeListener$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials_FlipView", "onMediaChange, mediaPath: " + str);
        if (!kotlin.jvm.internal.o.b(str, this.f444898a)) {
            ((yz5.l) this.f444899b.f310123d).invoke(java.lang.Boolean.FALSE);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$mediaChangeListener$1");
    }
}
