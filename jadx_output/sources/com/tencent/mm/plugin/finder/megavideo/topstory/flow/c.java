package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes2.dex */
public final class c extends com.tencent.mm.plugin.finder.feed.model.internal.IResponse {

    /* renamed from: a, reason: collision with root package name */
    public final r45.l03 f120905a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.m03 f120906b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r45.l03 req, r45.m03 resp, int i17, int i18, java.lang.String str) {
        super(i17, i18, str);
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(resp, "resp");
        this.f120905a = req;
        this.f120906b = resp;
    }

    public java.lang.String toString() {
        return "req type=" + this.f120905a.getInteger(10) + '\t' + hc2.o0.k(this.f120906b.getList(1));
    }
}
