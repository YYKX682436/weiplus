package zt1;

/* loaded from: classes8.dex */
public class c extends com.tencent.mm.sdk.event.n {
    public c() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.GetCardCountEvent getCardCountEvent = (com.tencent.mm.autogen.events.GetCardCountEvent) iEvent;
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreCard.cardGetCountListener", "deal with card notify event GetCardCountEvent");
        if (!(getCardCountEvent instanceof com.tencent.mm.autogen.events.GetCardCountEvent)) {
            return false;
        }
        xt1.t0.fj().f456587y.postDelayed(new zt1.b(this, getCardCountEvent), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        return false;
    }
}
