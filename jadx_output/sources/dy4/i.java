package dy4;

/* loaded from: classes15.dex */
public final class i implements sf.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dy4.j f244665a;

    public i(dy4.j jVar) {
        this.f244665a = jVar;
    }

    @Override // sf.e
    public void a(int i17) {
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f244665a.f244668h;
        if (tXLivePlayer != null) {
            tXLivePlayer.pause();
        }
    }

    @Override // sf.e
    public void b() {
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f244665a.f244668h;
        if (tXLivePlayer != null) {
            tXLivePlayer.resume();
        }
    }

    @Override // sf.e
    public void onDestroy() {
        this.f244665a.t();
    }
}
