package hz4;

/* loaded from: classes12.dex */
public abstract class s {
    public static void a(android.content.Context context, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WNNoteLogic", "dofavnotelink , but localid is null or nil");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WNNoteLogic", "doFavNoteLink: snsLocalid %s", str);
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        com.tencent.mm.autogen.events.SnsfillEventInfoEvent snsfillEventInfoEvent = new com.tencent.mm.autogen.events.SnsfillEventInfoEvent();
        am.kx kxVar = snsfillEventInfoEvent.f54854g;
        kxVar.f7188b = str;
        kxVar.f7189c = doFavoriteEvent;
        kxVar.f7187a = "";
        snsfillEventInfoEvent.e();
        boolean z17 = snsfillEventInfoEvent.f54855h.f7277a;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (z17) {
            c4Var.f6323i = (android.app.Activity) context;
            c4Var.f6327m = 28;
            doFavoriteEvent.e();
        } else {
            if (c4Var.f6326l == 0) {
                c4Var.f6326l = com.tencent.mm.R.string.cak;
            }
            db5.e1.i(context, c4Var.f6326l, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static hz4.r b(java.lang.Object r11, java.lang.String r12, java.util.List r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hz4.s.b(java.lang.Object, java.lang.String, java.util.List, boolean):hz4.r");
    }
}
