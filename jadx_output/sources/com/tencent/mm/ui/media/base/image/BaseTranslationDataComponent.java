package com.tencent.mm.ui.media.base.image;

/* loaded from: classes3.dex */
public final class BaseTranslationDataComponent extends lf3.n implements eg3.a {

    /* renamed from: d, reason: collision with root package name */
    public eg3.h f209133d;

    /* renamed from: e, reason: collision with root package name */
    public int f209134e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f209135f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f209136g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f209137h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTranslationDataComponent(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.Object filePath = (7 & 1) != 0 ? "" : null;
        java.lang.Object fileId = (7 & 2) != 0 ? "" : null;
        java.lang.String aesKey = (7 & 4) != 0 ? "" : null;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(fileId, "fileId");
        kotlin.jvm.internal.o.g(aesKey, "aesKey");
        this.f209135f = "";
        this.f209136g = new java.util.HashMap();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f209137h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanTranslationResultEvent>(a0Var) { // from class: com.tencent.mm.ui.media.base.image.BaseTranslationDataComponent$resultEventListener$1
            {
                this.__eventId = -1699517927;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent) {
                com.tencent.mm.autogen.events.ScanTranslationResultEvent event = scanTranslationResultEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MediaGallery.DefaultTranslateDataComponent", "scanTranslationResult " + event.f54739g.f6400a + ", " + event.f54739g.f6402c);
                ((ku5.t0) ku5.t0.f312615d).B(new rh5.h(com.tencent.mm.ui.media.base.image.BaseTranslationDataComponent.this, event));
                return true;
            }
        };
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f209137h.dead();
        ((java.util.HashMap) this.f209136g).clear();
    }

    @Override // lf3.o, com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        this.f209137h.alive();
    }
}
