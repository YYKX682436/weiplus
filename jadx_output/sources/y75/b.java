package y75;

/* loaded from: classes10.dex */
public final class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f459787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f459788e;

    public b(com.tencent.mm.api.IEmojiInfo iEmojiInfo, android.content.Context context) {
        this.f459787d = iEmojiInfo;
        this.f459788e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String groupId = this.f459787d.getGroupId();
        kotlin.jvm.internal.o.f(groupId, "getGroupId(...)");
        qk.c0 c0Var = new qk.c0(groupId);
        c0Var.f364198g = 20;
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SimilarEmoji", "emoticon liteapp service not found");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(this.f459788e, c0Var);
        }
        dialogInterface.cancel();
    }
}
