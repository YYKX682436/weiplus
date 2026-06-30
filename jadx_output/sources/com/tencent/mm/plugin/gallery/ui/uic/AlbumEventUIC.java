package com.tencent.mm.plugin.gallery.ui.uic;

/* loaded from: classes10.dex */
public final class AlbumEventUIC extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.gallery.ui.uic.AlbumEventUIC$livePhotoUseStateEventListener$1 f138644f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.gallery.ui.uic.AlbumEventUIC$livePhotoUseStateEventListener$1] */
    public AlbumEventUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f138644f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LivePhotoUseStateEvent>(activity, this) { // from class: com.tencent.mm.plugin.gallery.ui.uic.AlbumEventUIC$livePhotoUseStateEventListener$1

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.uic.AlbumEventUIC f138645d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(activity);
                this.f138645d = this;
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                this.__eventId = -826057574;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LivePhotoUseStateEvent livePhotoUseStateEvent) {
                com.tencent.mm.autogen.events.LivePhotoUseStateEvent event = livePhotoUseStateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new i33.i(event, this.f138645d));
                return false;
            }
        };
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        dead();
    }
}
