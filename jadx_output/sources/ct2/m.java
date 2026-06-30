package ct2;

/* loaded from: classes3.dex */
public final class m extends pf5.k0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f222289d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f222290e;

    /* renamed from: f, reason: collision with root package name */
    public wu5.c f222291f;

    /* renamed from: g, reason: collision with root package name */
    public long f222292g;

    public final void N6(int i17) {
        com.tencent.mars.xlog.Log.i("LiveReplayTransitionPreloadSlice", "cancelPreloadTask source:" + i17 + ",preloadId:" + this.f222290e + '!');
        wu5.c cVar = this.f222291f;
        if (cVar != null) {
            cVar.cancel(true);
        }
        this.f222290e = 0;
        this.f222291f = null;
    }

    public final void O6(java.lang.String str, r45.gv gvVar, r45.gn1 gn1Var) {
        java.lang.String str2 = gvVar.f375537e;
        long j17 = gn1Var.getLong(7);
        this.f222292g = j17;
        long currentTimeMillis = (j17 * 1000) - java.lang.System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        this.f222289d = str;
        this.f222291f = ((ku5.t0) ku5.t0.f312615d).k(new ct2.k(this, str, str2, gn1Var), currentTimeMillis);
        com.tencent.mars.xlog.Log.i("LiveReplayTransitionPreloadSlice", "execPreloadTask taskId(replayTransitionId):" + this.f222289d + ", preloadUrl:" + str2 + " ,lastWorkExcuteTime:" + this.f222292g + ",delayTime:" + currentTimeMillis + '!');
    }

    public final java.lang.String P6() {
        return "taskId:" + this.f222289d + ",preloadId:" + this.f222290e + ",preloadWork is null:true";
    }

    @Override // pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        com.tencent.mars.xlog.Log.i("LiveReplayTransitionPreloadSlice", "onCleared " + P6());
        N6(5);
        super.onCleared();
    }
}
