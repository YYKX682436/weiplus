package rr;

/* loaded from: classes9.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f399145a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiInfo f399146b;

    /* renamed from: c, reason: collision with root package name */
    public final rr.o f399147c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f399148d;

    public r(android.content.Context context, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, java.lang.String str, rr.o callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f399145a = context;
        this.f399146b = emojiInfo;
        this.f399147c = callback;
        this.f399148d = "MicroMsg.EmojiExchangeCheck";
        if (!n22.m.k(emojiInfo) && !n22.m.j(emojiInfo) && !com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo.field_groupId)) {
            if (!((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).S(emojiInfo.field_groupId) && !emojiInfo.k()) {
                java.lang.String field_groupId = emojiInfo.field_groupId;
                kotlin.jvm.internal.o.f(field_groupId, "field_groupId");
                new hr.b(field_groupId, 1, str).l().K(new rr.p(this));
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiExchangeCheck", "do exchange " + emojiInfo.field_md5 + ' ' + emojiInfo.field_groupId + ", " + str);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiExchangeCheck", "no need exchange %s %s", emojiInfo.field_md5, emojiInfo.field_groupId);
        callback.a(true);
    }

    public final void a(java.lang.String msg, yz5.a dismissCallback) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(dismissCallback, "dismissCallback");
        com.tencent.mm.ui.widget.dialog.j0 F = db5.e1.F(this.f399145a, msg, "", true);
        if (F != null) {
            F.setOnDismissListener(new rr.q(dismissCallback));
        }
    }
}
