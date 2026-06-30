package mg2;

/* loaded from: classes10.dex */
public final class d extends jg2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mg2.e f326220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f326221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f326222f;

    public d(mg2.e eVar, yz5.l lVar, yz5.a aVar) {
        this.f326220d = eVar;
        this.f326221e = lVar;
        this.f326222f = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        mg2.e eVar = this.f326220d;
        com.tencent.mars.xlog.Log.i(eVar.f318557e, "switchInLiveRoom switch view success.");
        eVar.f326224w = true;
        eVar.D("onAnimationEnd1", this.f326221e, this.f326222f);
    }
}
