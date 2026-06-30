package pm1;

/* loaded from: classes14.dex */
public final class u extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f356842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pm1.w f356843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f356844f;

    public u(java.util.HashMap hashMap, pm1.w wVar, int i17) {
        this.f356842d = hashMap;
        this.f356843e = wVar;
        this.f356844f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        pm1.w wVar = this.f356843e;
        java.util.HashMap hashMap = wVar.f356849d;
        java.util.HashMap hashMap2 = this.f356842d;
        boolean z17 = hashMap2 == hashMap;
        int i17 = this.f356844f;
        android.media.AudioManager audioManager = wVar.f356848c;
        int streamMaxVolume = z17 ? audioManager.getStreamMaxVolume(i17) : audioManager.getStreamVolume(i17);
        hashMap2.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(streamMaxVolume));
        com.tencent.mars.xlog.Log.i(wVar.f356846a, "update volume value=" + streamMaxVolume + ", type=" + i17 + ", isMax=" + z17);
    }
}
