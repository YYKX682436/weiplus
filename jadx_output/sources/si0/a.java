package si0;

/* loaded from: classes13.dex */
public final class a implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ si0.b f408034a;

    public a(si0.b bVar) {
        this.f408034a = bVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(android.media.MediaPlayer mediaPlayer) {
        si0.b bVar = this.f408034a;
        int i17 = bVar.f408039c;
        int i18 = bVar.f408038b;
        if (i17 < i18 || i18 == -1) {
            bVar.f408039c = i17 + 1;
            mediaPlayer.seekTo(0);
            mediaPlayer.start();
        }
    }
}
