package kk4;

/* loaded from: classes15.dex */
public final class g implements ek4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kk4.v f308542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kk4.h f308543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f308544c;

    public g(kk4.v vVar, kk4.h hVar, long j17) {
        this.f308542a = vVar;
        this.f308543b = hVar;
        this.f308544c = j17;
    }

    @Override // ek4.v
    public void a(int i17) {
        kk4.v vVar = this.f308542a;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i(vVar.f308576a, "requestVideoData requestDataRet:" + i17 + " requestLength:" + this.f308544c);
            return;
        }
        com.tencent.mars.xlog.Log.w(vVar.f308576a, "requestedResource() requestVideoData fail, ret:" + i17 + ' ' + this);
        this.f308543b.f308549h = false;
    }
}
