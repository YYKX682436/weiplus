package j36;

/* loaded from: classes13.dex */
public class v extends j36.m0 {

    /* renamed from: f, reason: collision with root package name */
    public int f297544f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f297545g = 0;

    public v() {
        this.f297540e = com.tencent.mm.plugin.appbrand.jsapi.audio.c0.CTRL_INDEX;
    }

    @Override // j36.m0
    public java.lang.Boolean h() {
        if (this.f297538c < 2) {
            return java.lang.Boolean.FALSE;
        }
        int f17 = oicq.wlogin_sdk.tools.util.f(this.f297539d, 4);
        this.f297544f = f17;
        if (this.f297538c < f17 + 2 + 2) {
            return java.lang.Boolean.FALSE;
        }
        this.f297545g = oicq.wlogin_sdk.tools.util.f(this.f297539d, 6 + f17);
        return java.lang.Boolean.TRUE;
    }
}
