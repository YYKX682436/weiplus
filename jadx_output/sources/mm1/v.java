package mm1;

/* loaded from: classes11.dex */
public final class v implements com.tencent.wechat.iam.biz.m {
    @Override // com.tencent.wechat.iam.biz.m
    public void a(com.tencent.wechat.iam.biz.k kVar) {
        if (kVar != null) {
            kVar.a();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioRouter", "goToBizAudioFlutterActivity, loadlist failed");
        }
    }
}
