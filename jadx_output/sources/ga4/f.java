package ga4;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f269918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f269919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f269921g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j17, int i17, int i18, kotlin.jvm.internal.f0 f0Var) {
        super(1);
        this.f269918d = j17;
        this.f269919e = i17;
        this.f269920f = i18;
        this.f269921g = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2");
        java.lang.String keyword = (java.lang.String) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2");
        kotlin.jvm.internal.o.g(keyword, "keyword");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsKeywordMatcher", "click keyword:".concat(keyword));
        zy2.kb kbVar = (zy2.kb) ga4.m.a().get(keyword);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_type", 9);
        intent.putExtra("key_hot_word", keyword);
        intent.putExtra("key_jump_scene", 0);
        intent.putExtra("key_pass_by_info", kbVar != null ? kbVar.f477448e : null);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 17, 115, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el()) {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).kl(context);
        }
        com.tencent.mm.plugin.sns.model.l4.Uj().post(new ga4.e(this.f269918d, this.f269919e, keyword, this.f269920f, this.f269921g));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2");
        return f0Var;
    }
}
