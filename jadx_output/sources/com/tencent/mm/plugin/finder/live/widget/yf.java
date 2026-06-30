package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class yf implements com.tencent.mm.plugin.finder.live.plugin.jp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.gg f120442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f120443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f120444c;

    public yf(com.tencent.mm.plugin.finder.live.widget.gg ggVar, int i17, kotlin.coroutines.Continuation continuation) {
        this.f120442a = ggVar;
        this.f120443b = i17;
        this.f120444c = continuation;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.jp
    public void a(boolean z17, int i17, com.tencent.mm.plugin.finder.live.plugin.ip errType, java.lang.String str, java.lang.Long l17, int i18, java.lang.String str2, java.lang.String str3, ek2.i2 i2Var) {
        kotlin.jvm.internal.o.g(errType, "errType");
        com.tencent.mm.plugin.finder.live.widget.gg ggVar = this.f120442a;
        if (z17) {
            ggVar.f118444y = l17 != null ? l17.longValue() : 0L;
        } else {
            int ordinal = errType.ordinal();
            if (ordinal == 1) {
                ggVar.getClass();
                pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.zf(str3, ggVar));
            } else if (ordinal == 2) {
                if (i17 == 10003) {
                    ggVar.getClass();
                    pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.eg(ggVar, this.f120443b));
                } else {
                    ggVar.getClass();
                    pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.zf(str3, ggVar));
                }
            }
        }
        this.f120444c.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
    }
}
