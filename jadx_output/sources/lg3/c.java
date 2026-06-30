package lg3;

/* loaded from: classes8.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.media.view.download.MediaDownloadText f318576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.media.view.download.MediaDownloadText mediaDownloadText, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f318576d = mediaDownloadText;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lg3.c(this.f318576d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        lg3.c cVar = (lg3.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.HashSet hashSet = com.tencent.mm.plugin.media.view.download.MediaDownloadText.f148581u;
        com.tencent.mm.plugin.media.view.download.MediaDownloadText mediaDownloadText = this.f318576d;
        mediaDownloadText.getClass();
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setInterpolator(new android.view.animation.AccelerateInterpolator(10.0f));
        alphaAnimation.setAnimationListener(new lg3.b(mediaDownloadText));
        mediaDownloadText.startAnimation(alphaAnimation);
        return jz5.f0.f302826a;
    }
}
