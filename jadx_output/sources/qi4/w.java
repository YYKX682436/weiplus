package qi4;

/* loaded from: classes10.dex */
public final class w implements com.tencent.wechat.aff.status.StatusInitManagerBase {
    @Override // com.tencent.wechat.aff.status.StatusInitManagerBase
    public java.lang.String getInitMediaPath() {
        return getInitRootPath() + "status/media/";
    }

    @Override // com.tencent.wechat.aff.status.StatusInitManagerBase
    public java.lang.String getInitRootPath() {
        return gm0.j1.u().h();
    }
}
