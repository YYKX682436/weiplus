package yw;

/* loaded from: classes9.dex */
public final class o2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f466414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f466415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz.BizShareInfo f466416f;

    public o2(yz5.l lVar, com.tencent.mm.ui.MMActivity mMActivity, com.tencent.pigeon.biz.BizShareInfo bizShareInfo) {
        this.f466414d = lVar;
        this.f466415e = mMActivity;
        this.f466416f = bizShareInfo;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        yz5.l lVar = this.f466414d;
        if (itemId != 3) {
            if (menuItem.getItemId() != 4 || lVar == null) {
                return;
            }
            lVar.invoke(new com.tencent.pigeon.biz.BizShareActionResult(3L, java.lang.Boolean.TRUE));
            return;
        }
        if (lVar != null) {
            lVar.invoke(new com.tencent.pigeon.biz.BizShareActionResult(2L, java.lang.Boolean.TRUE));
        }
        yw.q2 q2Var = yw.q2.f466434a;
        com.tencent.pigeon.biz.BizShareInfo bizShareInfo = this.f466416f;
        if (bizShareInfo.getImgUrl() != null) {
            q2Var.c(bizShareInfo.getImgUrl(), new yw.z1(new java.lang.ref.WeakReference(this.f466415e)));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterShareMsgHelper", "doDownloadAndSaveImg img url is null");
        }
    }
}
