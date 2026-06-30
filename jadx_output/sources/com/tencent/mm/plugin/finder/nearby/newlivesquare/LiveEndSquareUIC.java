package com.tencent.mm.plugin.finder.nearby.newlivesquare;

/* loaded from: classes2.dex */
public final class LiveEndSquareUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEndSquareUIC$liveScrollSquareEventListener$1 f121549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEndSquareUIC$liveScrollSquareEventListener$1] */
    public LiveEndSquareUIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f121549d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveScrollSquareStatusEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEndSquareUIC$liveScrollSquareEventListener$1
            {
                this.__eventId = -1886491044;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x00fd, code lost:
            
                if (r5.f121546x == true) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x0101, code lost:
            
                if (r1 == false) goto L41;
             */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveScrollSquareStatusEvent r15) {
                /*
                    Method dump skipped, instructions count: 275
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEndSquareUIC$liveScrollSquareEventListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
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
