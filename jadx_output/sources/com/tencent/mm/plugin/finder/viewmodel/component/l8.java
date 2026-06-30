package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class l8 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f135028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135029e;

    public l8(com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str) {
        this.f135028d = wXMediaMessage;
        this.f135029e = str;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.Collection collection;
        if (i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            kotlin.jvm.internal.o.d(stringExtra);
            java.util.List g17 = new r26.t(",").g(stringExtra, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (listIterator.hasPrevious()) {
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = kz5.p0.f313996d;
            java.util.ArrayList<java.lang.String> P1 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) collection.toArray(new java.lang.String[0]));
            kotlin.jvm.internal.o.d(P1);
            for (java.lang.String str : P1) {
                com.tencent.mm.autogen.events.FinderSendMsgEvent finderSendMsgEvent = new com.tencent.mm.autogen.events.FinderSendMsgEvent();
                am.bd bdVar = finderSendMsgEvent.f54322g;
                bdVar.f6237a = this.f135028d;
                bdVar.f6238b = str;
                bdVar.f6239c = 4;
                bdVar.f6240d = this.f135029e;
                finderSendMsgEvent.e();
            }
        }
    }
}
