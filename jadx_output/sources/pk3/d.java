package pk3;

/* loaded from: classes8.dex */
public final class d implements kk3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk3.e f356440a;

    public d(pk3.e eVar) {
        this.f356440a = eVar;
    }

    @Override // kk3.e
    public void onOrientationChange(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        pk3.e eVar = this.f356440a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "whenOrientationChange new:%d, last:%d", valueOf, java.lang.Integer.valueOf(eVar.f356443c));
        if (eVar.f356443c == i17) {
            return;
        }
        eVar.f356443c = i17;
    }
}
