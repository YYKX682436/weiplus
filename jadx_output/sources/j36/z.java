package j36;

/* loaded from: classes13.dex */
public class z extends j36.m0 {

    /* renamed from: f, reason: collision with root package name */
    public int f297548f = 0;

    public z() {
        this.f297540e = 312;
    }

    @Override // j36.m0
    public java.lang.Boolean h() {
        if (this.f297538c < 4) {
            return java.lang.Boolean.FALSE;
        }
        int g17 = oicq.wlogin_sdk.tools.util.g(this.f297539d, 4);
        this.f297548f = g17;
        return this.f297538c < (g17 * 10) + 4 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }

    public int i() {
        for (int i17 = 0; i17 < this.f297548f; i17++) {
            int i18 = 8 + (i17 * 10);
            if (oicq.wlogin_sdk.tools.util.f(this.f297539d, i18) == 266) {
                return oicq.wlogin_sdk.tools.util.g(this.f297539d, i18 + 2);
            }
        }
        return 0;
    }
}
