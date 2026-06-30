package j36;

/* loaded from: classes13.dex */
public class x extends j36.m0 {

    /* renamed from: f, reason: collision with root package name */
    public int f297547f = 0;

    public x() {
        this.f297540e = com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET;
    }

    @Override // j36.m0
    public java.lang.Boolean h() {
        if (this.f297538c < 2) {
            return java.lang.Boolean.FALSE;
        }
        int f17 = oicq.wlogin_sdk.tools.util.f(this.f297539d, 4);
        this.f297547f = f17;
        return f17 + 2 > this.f297538c ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }
}
