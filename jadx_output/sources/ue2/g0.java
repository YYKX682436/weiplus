package ue2;

/* loaded from: classes3.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f426814d;

    public g0(yz5.a aVar) {
        this.f426814d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.tencent.mars.xlog.Log.i("FinderLiveChatPreviewMigrationHelper", "executeMigrationAnimation: 动画完成");
            yz5.a aVar = this.f426814d;
            if (aVar != null) {
                aVar.invoke();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveChatPreviewMigrationHelper", "executeMigrationAnimation: 动画结束处理异常", e17);
        }
    }
}
