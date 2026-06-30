package r84;

/* loaded from: classes4.dex */
public final class c extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r84.d f393321a;

    public c(r84.d dVar) {
        this.f393321a = dVar;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter$buildDanmuItemView$2$1");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        int width = view.getWidth();
        int height = view.getHeight();
        this.f393321a.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemRadius", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemRadius", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        outline.setRoundRect(0, 0, width, height, r10.f393324f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter$buildDanmuItemView$2$1");
    }
}
