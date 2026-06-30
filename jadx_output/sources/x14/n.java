package x14;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView f451454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView) {
        super(0);
        this.f451454d = getHdHeadImageGalleryView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        x14.b bVar = this.f451454d.f161652y0;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        }
        return jz5.f0.f302826a;
    }
}
