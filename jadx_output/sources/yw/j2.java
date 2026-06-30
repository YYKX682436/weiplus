package yw;

/* loaded from: classes9.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f466364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz.BizShareInfo f466365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f466366f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(yz5.l lVar, com.tencent.pigeon.biz.BizShareInfo bizShareInfo, com.tencent.mm.ui.MMActivity mMActivity) {
        super(1);
        this.f466364d = lVar;
        this.f466365e = bizShareInfo;
        this.f466366f = mMActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        android.content.res.Resources resources;
        java.lang.String string;
        java.lang.String username = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        yz5.l lVar = this.f466364d;
        if (lVar != null) {
            lVar.invoke(new com.tencent.pigeon.biz.BizShareActionResult(1L, java.lang.Boolean.TRUE));
        }
        com.tencent.pigeon.biz.BizShareInfo bizShareInfo = this.f466365e;
        java.lang.Long shareType = bizShareInfo.getShareType();
        if (shareType != null && ((int) shareType.longValue()) == com.tencent.pigeon.biz.BizShareInfoType.TYPE_IMAGE.ordinal()) {
            yw.q2 q2Var = yw.q2.f466434a;
            if (bizShareInfo.getImgUrl() != null) {
                q2Var.c(bizShareInfo.getImgUrl(), new yw.a2(new java.lang.ref.WeakReference(this.f466366f), username, bizShareInfo));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterShareMsgHelper", "doDownloadAndSendImageRecentForward img url is null");
            }
        } else {
            yw.q2 q2Var2 = yw.q2.f466434a;
            com.tencent.mm.ui.MMActivity mMActivity = this.f466366f;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.f9.a(bizShareInfo.getImgUrl());
            if (mMActivity == null || (resources = mMActivity.getResources()) == null || (string = resources.getString(com.tencent.mm.R.string.f490589za)) == null) {
                str = null;
            } else {
                str = string + bizShareInfo.getTitle();
            }
            ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).Ri(mMActivity, username, str, new yw.f2(bizShareInfo, username, mMActivity), new yw.g2(mMActivity, bizShareInfo), null);
        }
        return jz5.f0.f302826a;
    }
}
