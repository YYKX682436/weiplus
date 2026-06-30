package gx0;

/* loaded from: classes5.dex */
public final class ia implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.d f276534d;

    public ia(cw0.d dVar) {
        this.f276534d = dVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        gx0.fd fdVar = (gx0.fd) obj;
        gx0.fd.f276428d.getClass();
        if ((fdVar == gx0.fd.f276431g || fdVar == gx0.fd.f276433i) && uu0.c.e().f431207b) {
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.voice.MCVoiceInputLayout narrationLayout$plugin_mj_template_release = this.f276534d.getNarrationLayout$plugin_mj_template_release();
            narrationLayout$plugin_mj_template_release.performHapticFeedback(0, 2);
            narrationLayout$plugin_mj_template_release.B(false);
        }
    }
}
