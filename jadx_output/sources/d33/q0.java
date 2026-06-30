package d33;

/* loaded from: classes4.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.MMMediaCropLayout f226268d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.plugin.gallery.picker.view.MMMediaCropLayout mMMediaCropLayout) {
        super(0);
        this.f226268d = mMMediaCropLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f226268d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new com.tencent.mm.ui.widget.cropview.CropLayout(context);
    }
}
