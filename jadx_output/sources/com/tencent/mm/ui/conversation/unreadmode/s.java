package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class s extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final yf5.w f208157d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.mvvmlist.MvvmList f208158e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f208159f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f208160g;

    public s(yf5.w conversationDataSource) {
        kotlin.jvm.internal.o.g(conversationDataSource, "conversationDataSource");
        this.f208157d = conversationDataSource;
        this.f208159f = jz5.h.b(com.tencent.mm.ui.conversation.unreadmode.q.f208152d);
        this.f208160g = new java.util.LinkedHashSet();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.w a17 = u26.z.a(-1, null, null, 6, null);
        v65.i.b(scope, null, new com.tencent.mm.ui.conversation.unreadmode.r(request, this, dVar, a17, null), 1, null);
        return new kotlinx.coroutines.flow.e(a17, false, null, 0, null, 28, null);
    }
}
