package yw;

/* loaded from: classes9.dex */
public final class d2 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz.BizShareInfo f466303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f466304e;

    public d2(com.tencent.pigeon.biz.BizShareInfo bizShareInfo, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f466303d = bizShareInfo;
        this.f466304e = mMActivity;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        yw.q2 q2Var;
        com.tencent.pigeon.biz.BizShareInfo bizShareInfo;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage a17;
        if (yw.q2.f466435b == i17 && i18 == -1 && (a17 = yw.q2.a((q2Var = yw.q2.f466434a), (bizShareInfo = this.f466303d))) != null && i18 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
            if (stringExtra == null || stringExtra.length() == 0) {
                return;
            }
            yw.q2.b(q2Var, a17, stringExtra, bizShareInfo, intent.getStringExtra("custom_send_text"));
            com.tencent.mm.ui.MMActivity mMActivity = this.f466304e;
            db5.e1.T(mMActivity, j65.q.a(mMActivity).getString(com.tencent.mm.R.string.f490560yi));
        }
    }
}
