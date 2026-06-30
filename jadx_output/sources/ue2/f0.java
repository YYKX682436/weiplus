package ue2;

/* loaded from: classes3.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f426812d;

    public f0(yz5.a aVar) {
        this.f426812d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("FinderLiveChatPreviewMigrationHelper", "executeMigrationAnimation: 动画开始");
        yz5.a aVar = this.f426812d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
