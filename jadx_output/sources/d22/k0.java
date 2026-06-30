package d22;

/* loaded from: classes12.dex */
public final class k0 extends qk.l7 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiInfo f225852i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f225853j;

    /* renamed from: k, reason: collision with root package name */
    public final int f225854k;

    /* renamed from: l, reason: collision with root package name */
    public final int f225855l;

    /* renamed from: m, reason: collision with root package name */
    public final int f225856m;

    public k0(com.tencent.mm.storage.emotion.EmojiInfo safeEmojiInfo) {
        kotlin.jvm.internal.o.g(safeEmojiInfo, "safeEmojiInfo");
        this.f225852i = safeEmojiInfo;
        this.f225853j = "MicroMsg.emoji.MMEmotionMsgBrowseLiteAppLogic";
        this.f225854k = 1;
        this.f225855l = 2;
        this.f225856m = 3;
    }

    public final void a(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        arrayList.add(this.f364230h);
        intent.putStringArrayListExtra("k_outside_expose_proof_item_list", arrayList);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f364228f)) {
            intent.putExtra("k_username", this.f364225c);
        } else {
            intent.putExtra("k_username", this.f364228f);
        }
        intent.putExtra("k_expose_msg_id", this.f364229g);
        intent.putExtra("k_expose_msg_type", 47);
        intent.putExtra("showShare", false);
        java.lang.String KExposeH5Url = com.tencent.mm.ui.n2.f209398a;
        kotlin.jvm.internal.o.f(KExposeH5Url, "KExposeH5Url");
        java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{51}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void b(android.content.Context viewContext) {
        kotlin.jvm.internal.o.g(viewContext, "viewContext");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(viewContext, 1, false);
        k0Var.f211872n = new d22.i0(this);
        k0Var.f211881s = new d22.j0(this, viewContext);
        k0Var.v();
    }

    public final void c(int i17) {
        int i18 = this.f364223a != 9 ? 2 : 1;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f225852i;
        g0Var.d(12789, valueOf, emojiInfo.getMd5(), java.lang.Integer.valueOf(i18), emojiInfo.field_designerID, emojiInfo.field_groupId, this.f364225c, java.lang.String.valueOf(this.f364223a + 100000), "", "", emojiInfo.field_activityid, this.f364226d, null, "");
    }

    @Override // com.tencent.mm.plugin.lite.r
    public boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        return false;
    }
}
