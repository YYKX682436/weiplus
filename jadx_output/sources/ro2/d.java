package ro2;

/* loaded from: classes2.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f398034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f398035e;

    public d(com.tencent.mm.plugin.finder.convert.qe qeVar, android.animation.AnimatorSet animatorSet) {
        this.f398034d = qeVar;
        this.f398035e = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f398034d;
        android.animation.AnimatorSet animatorSet = this.f398035e;
        qeVar.f104366q = animatorSet;
        animatorSet.addListener(new ro2.c(qeVar, qeVar));
        animatorSet.start();
    }
}
