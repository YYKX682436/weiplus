package fp;

/* loaded from: classes14.dex */
public class g implements fp.d {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f265196a;

    /* renamed from: b, reason: collision with root package name */
    public android.media.AudioManager f265197b;

    /* renamed from: c, reason: collision with root package name */
    public fp.c f265198c;

    /* renamed from: d, reason: collision with root package name */
    public final android.media.AudioManager.OnAudioFocusChangeListener f265199d = new fp.f(this);

    public g(android.content.Context context) {
        this.f265196a = context instanceof android.app.Activity ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
    }

    public boolean a() {
        android.content.Context context;
        if (this.f265197b == null && (context = this.f265196a) != null) {
            this.f265197b = (android.media.AudioManager) context.getSystemService("audio");
        }
        android.media.AudioManager audioManager = this.f265197b;
        return audioManager != null && 1 == audioManager.abandonAudioFocus(this.f265199d);
    }

    public int b() {
        android.content.Context context;
        if (this.f265197b == null && (context = this.f265196a) != null) {
            this.f265197b = (android.media.AudioManager) context.getSystemService("audio");
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f265199d;
        return i17 >= 26 ? this.f265197b.requestAudioFocus(new android.media.AudioFocusRequest.Builder(1).setAudioAttributes(new android.media.AudioAttributes.Builder().setContentType(2).setUsage(1).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(onAudioFocusChangeListener).build()) : this.f265197b.requestAudioFocus(onAudioFocusChangeListener, 3, 1);
    }

    public boolean c() {
        android.content.Context context;
        if (this.f265197b == null && (context = this.f265196a) != null) {
            this.f265197b = (android.media.AudioManager) context.getSystemService("audio");
        }
        android.media.AudioManager audioManager = this.f265197b;
        android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f265199d;
        boolean z17 = false;
        if (audioManager != null && 1 == audioManager.requestAudioFocus(onAudioFocusChangeListener, 3, 2)) {
            z17 = true;
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.AudioFocusHelper", "jacks requestFocus: %B, %x", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(onAudioFocusChangeListener.hashCode()));
        return z17;
    }
}
