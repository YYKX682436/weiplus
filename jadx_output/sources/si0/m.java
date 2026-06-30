package si0;

/* loaded from: classes.dex */
public final class m implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si0.v f408126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f408127e;

    public m(si0.v vVar, long j17) {
        this.f408126d = vVar;
        this.f408127e = j17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.flutter_pag.PAGViewListenerApi pAGViewListenerApi = this.f408126d.f408188k;
        kotlin.jvm.internal.o.d(pAGViewListenerApi);
        pAGViewListenerApi.onAnimationCancel(this.f408127e, si0.i.f408085d);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        si0.v vVar = this.f408126d;
        if (vVar.f408189l) {
            return;
        }
        vVar.f408191n = 0L;
        com.tencent.pigeon.flutter_pag.PAGViewListenerApi pAGViewListenerApi = vVar.f408188k;
        kotlin.jvm.internal.o.d(pAGViewListenerApi);
        pAGViewListenerApi.onAnimationEnd(this.f408127e, si0.j.f408089d);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.flutter_pag.PAGViewListenerApi pAGViewListenerApi = this.f408126d.f408188k;
        kotlin.jvm.internal.o.d(pAGViewListenerApi);
        pAGViewListenerApi.onAnimationRepeat(this.f408127e, si0.k.f408094d);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.flutter_pag.PAGViewListenerApi pAGViewListenerApi = this.f408126d.f408188k;
        kotlin.jvm.internal.o.d(pAGViewListenerApi);
        pAGViewListenerApi.onAnimationStart(this.f408127e, si0.l.f408097d);
    }
}
