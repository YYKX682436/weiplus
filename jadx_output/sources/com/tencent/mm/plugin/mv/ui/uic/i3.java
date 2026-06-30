package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h4 f151201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.tencent.mm.plugin.mv.ui.uic.h4 h4Var) {
        super(0);
        this.f151201d = h4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = this.f151201d;
        final com.tencent.mm.plugin.mv.ui.uic.h3 h3Var = h4Var.f151168o;
        return new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s(h4Var, h3Var) { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$MusicMVVideoItemConverterFactory
            private final com.tencent.mm.plugin.mv.ui.uic.e3 sizeResolver;
            final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h4 this$0;

            {
                kotlin.jvm.internal.o.g(h3Var, "sizeResolver");
                this.sizeResolver = h3Var;
            }

            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new lm3.d(this.sizeResolver, new com.tencent.mm.plugin.mv.ui.uic.f3(this.this$0));
            }

            public final com.tencent.mm.plugin.mv.ui.uic.e3 getSizeResolver() {
                return this.sizeResolver;
            }
        }, h4Var.f151161e, true);
    }
}
