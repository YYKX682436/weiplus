package rr;

/* loaded from: classes9.dex */
public final class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rr.n f399126a;

    public f(rr.n nVar) {
        this.f399126a = nVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        rr.n nVar = this.f399126a;
        com.tencent.mars.xlog.Log.i(nVar.f399138d, "CgiBackupEmojiOperate onResult: errType=" + i17 + ", errCode=" + i18);
        boolean z17 = true;
        if (i17 == 0 && i18 == 0) {
            rr.n.a(nVar, true);
        } else {
            android.app.Activity activity = nVar.f399135a;
            if (i18 != -2049) {
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = nVar.f399137c;
                if (i18 != -434) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10431, 0, emojiInfo.getMd5(), emojiInfo.field_designerID, emojiInfo.field_groupId, 1, 3, java.lang.Integer.valueOf(emojiInfo.field_size), nVar.f399136b, emojiInfo.field_activityid);
                    java.lang.String str = fVar.f70617c;
                    if (str != null && str.length() != 0) {
                        z17 = false;
                    }
                    db5.e1.s(activity, !z17 ? fVar.f70617c : activity.getString(com.tencent.mm.R.string.buj), "");
                } else {
                    com.tencent.mars.xlog.Log.i(nVar.f399138d, "[cpan] save emoji onSceneEnd error over size.");
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN, java.lang.Boolean.TRUE);
                    nVar.b();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10431, 0, emojiInfo.getMd5(), emojiInfo.field_designerID, emojiInfo.field_groupId, 1, 1, java.lang.Integer.valueOf(emojiInfo.field_size), nVar.f399136b, emojiInfo.field_activityid);
                }
            } else {
                java.lang.String string = activity.getString(com.tencent.mm.R.string.bul);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                com.tencent.mm.ui.widget.dialog.j0 y17 = db5.e1.y(activity, string, "", activity.getString(com.tencent.mm.R.string.by_), null);
                if (y17 != null) {
                    y17.show();
                }
            }
            rr.n.a(nVar, false);
        }
        return jz5.f0.f302826a;
    }
}
