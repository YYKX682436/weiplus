package px0;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment) {
        super(1);
        this.f358807d = materialImportPreviewFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Throwable) obj) instanceof java.util.concurrent.CancellationException) {
            com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment = this.f358807d;
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = materialImportPreviewFragment.f69653q;
            if (shootComposingPluginLayout != null) {
                shootComposingPluginLayout.z0();
            }
            com.tencent.mars.xlog.Log.i("MaterialImportPreviewFragment", "onAsyncRemindConfirm cancel asyncAigcTaskId:" + materialImportPreviewFragment.f69655s);
        }
        return jz5.f0.f302826a;
    }
}
