package com.tencent.mm.plugin.gallery.ui.uic;

/* loaded from: classes10.dex */
public final class ImagePreviewEventUIC extends i33.d {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.gallery.ui.uic.ImagePreviewEventUIC$livePhotoUseStateEventListener$1 f138646d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.gallery.ui.uic.ImagePreviewEventUIC$livePhotoUseStateEventListener$1] */
    public ImagePreviewEventUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f138646d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LivePhotoUseStateEvent>(activity, this) { // from class: com.tencent.mm.plugin.gallery.ui.uic.ImagePreviewEventUIC$livePhotoUseStateEventListener$1

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.uic.ImagePreviewEventUIC f138647d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(activity);
                this.f138647d = this;
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                this.__eventId = -826057574;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LivePhotoUseStateEvent livePhotoUseStateEvent) {
                com.tencent.mm.autogen.events.LivePhotoUseStateEvent event = livePhotoUseStateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new i33.s1(event, this.f138647d));
                return false;
            }
        };
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewEventUIC", "onCreate");
        alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewEventUIC", "onDestroy");
        dead();
    }
}
