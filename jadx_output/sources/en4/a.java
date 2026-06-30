package en4;

/* loaded from: classes8.dex */
public final class a extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f255335d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f255335d = true;
    }

    public final void T6() {
        j75.f Ai;
        if (this.f255335d) {
            return;
        }
        ((ra0.v) i95.n0.c(ra0.v.class)).getClass();
        if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).wi()) {
            int i17 = ra0.y.f393481g1;
            ra0.y Di = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Di();
            if (Di != null && (Ai = ((en3.l0) Di).Ai()) != null) {
                Ai.B3(new sa0.d());
            }
        }
        this.f255335d = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (!wm4.u.q()) {
            this.f255335d = false;
        } else {
            final androidx.appcompat.app.AppCompatActivity activity = getActivity();
            new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.event.TopStoryLauncherStartEvent>(activity) { // from class: com.tencent.mm.plugin.topstory.ui.uic.TopStoryClearRedDotUIC$onCreate$1
                {
                    this.__eventId = 1309741231;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.plugin.event.TopStoryLauncherStartEvent topStoryLauncherStartEvent) {
                    com.tencent.mm.plugin.event.TopStoryLauncherStartEvent event = topStoryLauncherStartEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    en4.a.this.T6();
                    return false;
                }
            }.alive();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        T6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (wm4.u.q()) {
            this.f255335d = false;
        }
    }
}
