package s84;

/* loaded from: classes4.dex */
public class h extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer f404901e;

    public h(com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer adDragViewContainer) {
        this.f404901e = adDragViewContainer;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$6");
        com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer.a(this.f404901e).setVisibility(8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$6");
    }
}
