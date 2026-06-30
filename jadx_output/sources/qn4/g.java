package qn4;

/* loaded from: classes12.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn4.i f365243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(qn4.i iVar) {
        super(0);
        this.f365243d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.base.AnimImageView animImageView;
        qn4.i iVar = this.f365243d;
        if (iVar.b()) {
            java.lang.ref.WeakReference weakReference = iVar.f365247c;
            android.widget.FrameLayout frameLayout = weakReference != null ? (android.widget.FrameLayout) weakReference.get() : null;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            java.lang.ref.WeakReference weakReference2 = iVar.f365248d;
            android.widget.ProgressBar progressBar = weakReference2 != null ? (android.widget.ProgressBar) weakReference2.get() : null;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            java.lang.ref.WeakReference weakReference3 = iVar.f365249e;
            if (weakReference3 != null && (animImageView = (com.tencent.mm.ui.base.AnimImageView) weakReference3.get()) != null) {
                animImageView.setVisibility(0);
                animImageView.b();
            }
            com.tencent.mars.xlog.Log.i("TranslationSpeechSpeechIndicator", "showSpeechAnim: Loading GONE, speechAnim VISIBLE + startAnim");
        } else {
            com.tencent.mars.xlog.Log.w("TranslationSpeechSpeechIndicator", "showSpeechAnim: failed to create wrapper");
        }
        return jz5.f0.f302826a;
    }
}
