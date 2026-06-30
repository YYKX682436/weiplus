package f34;

/* loaded from: classes11.dex */
public class j implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f34.m f259356d;

    public j(f34.m mVar) {
        this.f259356d = mVar;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return true;
        }
        f34.m mVar = this.f259356d;
        if (mVar.f259370r != -85.0f || mVar.f259371s != -1000.0f) {
            return false;
        }
        mVar.f259370r = f18;
        mVar.f259371s = f17;
        c34.h0.Bi().f259325d = mVar.f259370r;
        c34.h0.Bi().f259326e = mVar.f259371s;
        if (!mVar.f259368p) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardService", "ShakeCardService do netscen from onGetLocation()");
        mVar.f();
        return false;
    }
}
