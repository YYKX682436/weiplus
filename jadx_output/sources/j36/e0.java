package j36;

/* loaded from: classes13.dex */
public class e0 extends j36.m0 {

    /* renamed from: f, reason: collision with root package name */
    public int f297533f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f297534g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f297535h = 0;

    public e0() {
        this.f297540e = 326;
    }

    @Override // j36.m0
    public java.lang.Boolean h() {
        if (this.f297538c < 12) {
            return java.lang.Boolean.FALSE;
        }
        int f17 = oicq.wlogin_sdk.tools.util.f(this.f297539d, 8);
        if (this.f297538c < f17 + 12) {
            return java.lang.Boolean.FALSE;
        }
        this.f297533f = f17;
        int f18 = oicq.wlogin_sdk.tools.util.f(this.f297539d, 10 + f17);
        int i17 = this.f297538c;
        int i18 = this.f297533f;
        if (i17 < i18 + 12 + f18) {
            return java.lang.Boolean.FALSE;
        }
        this.f297534g = f18;
        int f19 = oicq.wlogin_sdk.tools.util.f(this.f297539d, 14 + i18 + f18);
        if (this.f297538c < this.f297533f + 12 + this.f297534g + f19) {
            return java.lang.Boolean.FALSE;
        }
        this.f297535h = f19;
        return java.lang.Boolean.TRUE;
    }
}
