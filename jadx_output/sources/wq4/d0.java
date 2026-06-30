package wq4;

/* loaded from: classes14.dex */
public class d0 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f448622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f448623c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f448624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wq4.k0 f448625e;

    public d0(wq4.k0 k0Var, java.lang.String str, long j17, boolean z17, int i17) {
        this.f448625e = k0Var;
        this.f448621a = str;
        this.f448622b = j17;
        this.f448623c = z17;
        this.f448624d = i17;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        wq4.k0 k0Var = this.f448625e;
        if (currentTimeMillis - k0Var.f448652f > 70000) {
            k0Var.getClass();
        }
        if (k0Var.f448651e) {
            java.lang.String str = this.f448621a;
            long j17 = this.f448622b;
            wq4.j0 j0Var = new wq4.j0(k0Var, str, j17, this.f448623c, this.f448624d);
            k0Var.f448656j = j0Var;
            k0Var.f448655i.postDelayed(j0Var, j17);
        }
    }
}
