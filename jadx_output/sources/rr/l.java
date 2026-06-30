package rr;

/* loaded from: classes.dex */
public final class l implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rr.n f399132a;

    public l(rr.n nVar) {
        this.f399132a = nVar;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public final void a() {
        rr.n nVar = this.f399132a;
        nVar.getClass();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = nVar.f399137c;
        g0Var.d(12789, 2, emojiInfo.getMd5(), 0, emojiInfo.field_designerID, emojiInfo.field_groupId, "", "", "", "", "", emojiInfo.field_activityid);
        java.lang.String str = emojiInfo.field_groupId;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        kotlin.jvm.internal.o.d(str);
        qk.c0 c0Var = new qk.c0(str);
        c0Var.f364198g = 25;
        c0Var.f364155a = 46;
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e(nVar.f399138d, "emoticon liteapp service not found");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(nVar.f399135a, c0Var);
        }
    }
}
