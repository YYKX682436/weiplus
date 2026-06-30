package qn4;

/* loaded from: classes12.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn4.i f365240d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qn4.i iVar) {
        super(0);
        this.f365240d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.ref.WeakReference weakReference = this.f365240d.f365248d;
        android.widget.ProgressBar progressBar = weakReference != null ? (android.widget.ProgressBar) weakReference.get() : null;
        if (progressBar != null) {
            progressBar.setVisibility(8);
            com.tencent.mars.xlog.Log.i("TranslationSpeechSpeechIndicator", "hideLoading: set GONE");
        }
        return jz5.f0.f302826a;
    }
}
