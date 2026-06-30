package dk2;

/* loaded from: classes3.dex */
public final class de extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.MultiTalkStatusEvent f233331d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(com.tencent.mm.autogen.events.MultiTalkStatusEvent multiTalkStatusEvent) {
        super(0);
        this.f233331d = multiTalkStatusEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (gm0.j1.a()) {
            dk2.ef efVar = dk2.ef.f233372a;
            if (dk2.ef.I != null) {
                com.tencent.mm.autogen.events.MultiTalkStatusEvent multiTalkStatusEvent = this.f233331d;
                if (multiTalkStatusEvent.f54506g.f6474a) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "multiTalk event.result.isCreateMultiTalk = " + multiTalkStatusEvent.f54506g.f6474a + ", isAnchor = " + dk2.ef.f233384g);
                    if (!dk2.ef.f233384g) {
                        dk2.ef.T(efVar, false, null, 3, null);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
