package n8;

/* loaded from: classes15.dex */
public class o extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.media.AudioTrack f335538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n8.w f335539e;

    public o(n8.w wVar, android.media.AudioTrack audioTrack) {
        this.f335539e = wVar;
        this.f335538d = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        n8.w wVar = this.f335539e;
        android.media.AudioTrack audioTrack = this.f335538d;
        try {
            audioTrack.flush();
            audioTrack.release();
        } finally {
            wVar.f335566f.open();
        }
    }
}
