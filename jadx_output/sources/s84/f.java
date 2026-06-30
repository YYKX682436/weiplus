package s84;

/* loaded from: classes4.dex */
public class f extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer f404899e;

    public f(com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer adDragViewContainer) {
        this.f404899e = adDragViewContainer;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$4");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer.f163558w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer adDragViewContainer = this.f404899e;
        s84.j jVar = adDragViewContainer.f163571s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        if (jVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
            s84.j jVar2 = adDragViewContainer.f163571s;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
            jVar2.c();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$4");
    }
}
