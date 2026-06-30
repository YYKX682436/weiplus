package qi4;

/* loaded from: classes11.dex */
public final class m implements com.tencent.wechat.aff.status.StatusStorageManager.cleanExpireDBCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final qi4.m f363773a = new qi4.m();

    @Override // com.tencent.wechat.aff.status.StatusStorageManager.cleanExpireDBCallback
    public final void complete(bw5.um0 um0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusDBWrapper", "clean finish >> code: " + um0Var.f33985e + " result: " + um0Var.f33984d);
    }
}
