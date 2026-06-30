package px0;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment) {
        super(0);
        this.f358814d = materialImportPreviewFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yx0.b8 f69557v;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f358814d.f69653q;
        if (shootComposingPluginLayout == null || (f69557v = shootComposingPluginLayout.getF69557v()) == null || (recordConfigProvider = f69557v.f467198x0) == null) {
            return null;
        }
        return recordConfigProvider.I;
    }
}
