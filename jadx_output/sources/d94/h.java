package d94;

/* loaded from: classes4.dex */
public class h extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f227563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d94.i f227564f;

    public h(d94.i iVar, android.view.View view) {
        this.f227564f = iVar;
        this.f227563e = view;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        d94.i iVar = this.f227564f;
        java.util.LinkedList linkedList = iVar.f227566b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        android.view.View view = this.f227563e;
        linkedList.remove(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        java.util.LinkedList linkedList2 = iVar.f227567c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        linkedList2.offerFirst(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator$1");
    }
}
