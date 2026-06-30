package px0;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f358780e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(1);
        this.f358779d = materialImportPreviewFragment;
        this.f358780e = shootComposingPluginLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        androidx.fragment.app.Fragment fragment = this.f358779d;
        boolean isAdded = fragment.isAdded();
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f358780e;
        if (!isAdded || fragment.isDetached() || fragment.isRemoving()) {
            shootComposingPluginLayout.u0();
            com.tencent.mars.xlog.Log.w("MaterialImportPreviewFragment", "Fragment not associated with fragment manager, skip remove transaction");
        } else {
            androidx.fragment.app.i2 beginTransaction = fragment.getParentFragmentManager().beginTransaction();
            beginTransaction.j(fragment);
            beginTransaction.g();
            shootComposingPluginLayout.u0();
        }
        return jz5.f0.f302826a;
    }
}
