package g22;

/* loaded from: classes15.dex */
public final class u0 implements i22.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.o f267874d;

    /* renamed from: e, reason: collision with root package name */
    public final i22.b0 f267875e;

    public u0(androidx.lifecycle.o lifecycle, i22.b0 b0Var) {
        kotlin.jvm.internal.o.g(lifecycle, "lifecycle");
        this.f267874d = lifecycle;
        this.f267875e = b0Var;
    }

    @Override // i22.a0
    public void s(java.lang.String productId, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.o.g(productId, "productId");
        com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreExchangeTask emojiStoreExchangeTask = new com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreExchangeTask(productId, str, str2, str3, str4, new g22.t0(this, productId));
        androidx.lifecycle.o lifecycle = this.f267874d;
        kotlin.jvm.internal.o.g(lifecycle, "lifecycle");
        lifecycle.a(emojiStoreExchangeTask);
        gm0.j1.n().f273288b.a(com.tencent.wxmm.v2helper.EMethodSetNgStrength, emojiStoreExchangeTask);
        emojiStoreExchangeTask.f98512o.alive();
        emojiStoreExchangeTask.f98511n = new z12.l(emojiStoreExchangeTask.f98504d, emojiStoreExchangeTask.f98505e, emojiStoreExchangeTask.f98506f, emojiStoreExchangeTask.f98507g, emojiStoreExchangeTask.f98508h);
        gm0.j1.n().f273288b.g(emojiStoreExchangeTask.f98511n);
    }

    @Override // i22.a0
    public void x() {
    }
}
