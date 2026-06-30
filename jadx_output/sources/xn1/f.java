package xn1;

/* loaded from: classes12.dex */
public final class f implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn1.h f455459d;

    public f(xn1.h hVar) {
        this.f455459d = hVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvChooseHelper", "clearChooseData");
        xn1.h hVar = this.f455459d;
        hVar.f455470s.clear();
        hVar.f455471t = null;
        hVar.f455465n = null;
        hVar.f455457f = false;
        return true;
    }
}
