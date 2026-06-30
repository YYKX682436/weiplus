package on4;

/* loaded from: classes4.dex */
public class j extends com.tencent.mm.sdk.event.n {
    public j() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        ((ln4.g) i95.n0.c(ln4.g.class)).f319911g.post(new on4.i(this, (com.tencent.mm.autogen.events.TranslateMessageEvent) iEvent));
        return true;
    }
}
