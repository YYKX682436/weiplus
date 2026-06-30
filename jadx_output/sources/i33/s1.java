package i33;

/* loaded from: classes10.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.LivePhotoUseStateEvent f288244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.uic.ImagePreviewEventUIC f288245e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.tencent.mm.autogen.events.LivePhotoUseStateEvent livePhotoUseStateEvent, com.tencent.mm.plugin.gallery.ui.uic.ImagePreviewEventUIC imagePreviewEventUIC) {
        super(0);
        this.f288244d = livePhotoUseStateEvent;
        this.f288245e = imagePreviewEventUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.f2 adapter;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mediaId: ");
        com.tencent.mm.autogen.events.LivePhotoUseStateEvent livePhotoUseStateEvent = this.f288244d;
        sb6.append(livePhotoUseStateEvent.f54476g.f8566a);
        sb6.append(" isUseLivePhoto:");
        am.zi ziVar = livePhotoUseStateEvent.f54476g;
        sb6.append(ziVar.f8567b);
        sb6.append(" scene: ");
        sb6.append(ziVar.f8568c);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewEventUIC", sb6.toString());
        com.tencent.mm.plugin.gallery.ui.uic.ImagePreviewEventUIC imagePreviewEventUIC = this.f288245e;
        imagePreviewEventUIC.getClass();
        if (ziVar.f8568c == 1) {
            android.app.Activity context = imagePreviewEventUIC.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.ui.ImagePreviewUI");
            androidx.recyclerview.widget.RecyclerView recyclerView = ((com.tencent.mm.plugin.gallery.ui.ImagePreviewUI) context).f138581f;
            e33.h5 h5Var = (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) ? null : (e33.h5) adapter;
            if (h5Var != null && !android.text.TextUtils.isEmpty(ziVar.f8569d)) {
                int indexOf = h5Var.f247260h.indexOf(ziVar.f8569d);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewEventUIC", "notifyMediaDataChange index: " + indexOf);
                if (indexOf >= 0) {
                    h5Var.notifyItemChanged(indexOf);
                    android.app.Activity context2 = imagePreviewEventUIC.getContext();
                    kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.ui.ImagePreviewUI");
                    ((com.tencent.mm.plugin.gallery.ui.ImagePreviewUI) context2).s7();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
