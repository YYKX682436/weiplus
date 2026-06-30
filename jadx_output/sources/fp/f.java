package fp;

/* loaded from: classes14.dex */
public class f implements android.media.AudioManager.OnAudioFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp.g f265195d;

    public f(fp.g gVar) {
        this.f265195d = gVar;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i17) {
        fp.g gVar = this.f265195d;
        if (gVar.f265198c != null) {
            gVar.f265198c.onChange(i17);
        }
    }
}
