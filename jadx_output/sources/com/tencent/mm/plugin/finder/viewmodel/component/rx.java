package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class rx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f135838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f135839e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        super(0);
        this.f135838d = appCompatActivity;
        this.f135839e = sxVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f135838d;
        final com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f135839e;
        return new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent>(appCompatActivity) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderProjectionScreenUIC$videoEndListener$2$1
            {
                this.__eventId = -1291074182;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent) {
                com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent event = feedMegaVideoAnimPlayEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (!event.f54249g.f6661d) {
                    return false;
                }
                pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.qx(sxVar, event));
                return false;
            }
        };
    }
}
