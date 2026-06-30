package ql0;

/* loaded from: classes13.dex */
public class a implements com.tencent.wechat.aff.cara.CaraNativeLiveCellProphetContextBase {

    /* renamed from: a, reason: collision with root package name */
    public float f364453a = 0.5f;

    @Override // com.tencent.wechat.aff.cara.CaraNativeLiveCellProphetContextBase
    public boolean isHomePageLoaded() {
        return false;
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeLiveCellProphetContextBase
    public boolean isInHomePage() {
        return true;
    }

    @Override // com.tencent.wechat.aff.cara.CaraNativeLiveCellProphetContextBase
    public float predictProbThreshold() {
        return this.f364453a;
    }
}
