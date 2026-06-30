package d33;

/* loaded from: classes4.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.MMMediaCropLayout f226270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.gallery.picker.view.MMMediaCropLayout mMMediaCropLayout) {
        super(0);
        this.f226270d = mMMediaCropLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.pluginsdk.ui.CommonVideoView(this.f226270d.getContext());
    }
}
