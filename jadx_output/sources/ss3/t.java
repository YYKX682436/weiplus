package ss3;

/* loaded from: classes8.dex */
public class t extends com.tencent.mm.sdk.event.n {
    public t() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        boolean z17;
        com.tencent.mm.autogen.events.ReaderAppOperationEvent readerAppOperationEvent = (com.tencent.mm.autogen.events.ReaderAppOperationEvent) iEvent;
        am.np npVar = readerAppOperationEvent.f54646g;
        int i17 = npVar.f7441a;
        if (i17 == 3) {
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = npVar.f7442b;
            int i18 = npVar.f7443c;
            java.lang.String str = npVar.f7444d;
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.GetFavDataSource", "fav info, newsSvrid is %d, tweetId is %s", java.lang.Integer.valueOf(i18), str);
            java.util.ArrayList arrayList = (java.util.ArrayList) ss3.d0.Di().D0(i18, 20);
            if (!arrayList.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Sns.GetFavDataSource", "fav news msgs");
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    if (str.equals(((c01.ta) arrayList.get(i19)).g())) {
                        z17 = ss3.q.a(doFavoriteEvent, (c01.ta) arrayList.get(i19), i19);
                        break;
                    }
                }
            }
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cac;
            z17 = false;
            readerAppOperationEvent.f54647h.f7571a = z17;
        } else if (i17 == 4) {
            ss3.d0.Di().m0(readerAppOperationEvent.f54646g.f7445e);
        }
        return false;
    }
}
