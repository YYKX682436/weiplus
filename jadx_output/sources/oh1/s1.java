package oh1;

/* loaded from: classes9.dex */
public final class s1 implements m31.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.message.WxaSubscribeMsgTipsUI f345290a;

    public s1(com.tencent.mm.plugin.appbrand.message.WxaSubscribeMsgTipsUI wxaSubscribeMsgTipsUI) {
        this.f345290a = wxaSubscribeMsgTipsUI;
    }

    @Override // m31.a0
    public void onDismiss() {
        this.f345290a.finish();
    }
}
