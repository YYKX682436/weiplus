package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class MusicMvSongControlUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f150998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMvSongControlUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f150998d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvSongControlUIC$musicPlayerListener$1
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                com.tencent.mm.autogen.events.MusicPlayerEvent event = musicPlayerEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (event.f54512g.f7036b != 7) {
                    return false;
                }
                fm3.z.f264170f++;
                kl3.t.g().d(b21.m.b());
                return false;
            }
        };
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        this.f150998d.dead();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        this.f150998d.alive();
    }
}
