package dk2;

/* loaded from: classes3.dex */
public final class ce extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.MultiTalkActionEvent f233299d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(com.tencent.mm.autogen.events.MultiTalkActionEvent multiTalkActionEvent) {
        super(0);
        this.f233299d = multiTalkActionEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (gm0.j1.a()) {
            dk2.ef efVar = dk2.ef.f233372a;
            if (dk2.ef.I != null) {
                com.tencent.mm.autogen.events.MultiTalkActionEvent multiTalkActionEvent = this.f233299d;
                if (multiTalkActionEvent.f54504g.f6259a == 3) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "event.data.action = " + multiTalkActionEvent.f54504g.f6259a + ", isAnchor = " + dk2.ef.f233384g);
                    if (!dk2.ef.f233384g) {
                        dk2.ef.T(efVar, false, null, 3, null);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
