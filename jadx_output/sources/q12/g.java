package q12;

/* loaded from: classes12.dex */
public class g extends com.tencent.mm.sdk.event.n {
    public g() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.storage.z4 Bi = ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Bi();
        Bi.getClass();
        java.lang.String lowerCase = com.tencent.mm.sdk.platformtools.m2.d().toLowerCase();
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiDescNewMgr", "[cpan] language change Current Language:%s LastLanguage:%s", lowerCase, Bi.f196393b);
        if (!Bi.f196392a || (!com.tencent.mm.sdk.platformtools.t8.K0(Bi.f196393b) && !Bi.f196393b.equalsIgnoreCase(lowerCase))) {
            Bi.g();
        }
        gr.t.g().o(true);
        return false;
    }
}
