package yw;

/* loaded from: classes9.dex */
public final class f2 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz.BizShareInfo f466318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f466319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f466320c;

    public f2(com.tencent.pigeon.biz.BizShareInfo bizShareInfo, java.lang.String str, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f466318a = bizShareInfo;
        this.f466319b = str;
        this.f466320c = mMActivity;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        yw.q2 q2Var;
        com.tencent.pigeon.biz.BizShareInfo bizShareInfo;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage a17;
        if (!z17 || (a17 = yw.q2.a((q2Var = yw.q2.f466434a), (bizShareInfo = this.f466318a))) == null) {
            return;
        }
        java.lang.String str2 = this.f466319b;
        yw.q2.b(q2Var, a17, str2, bizShareInfo, str);
        com.tencent.mm.ui.MMActivity mMActivity = this.f466320c;
        db5.t7.h(mMActivity, j65.q.a(mMActivity).getString(com.tencent.mm.R.string.f490560yi));
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().g(str2);
    }
}
