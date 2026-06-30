package com.tencent.mm.plugin.finder.member.all;

/* loaded from: classes2.dex */
public final class o implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.all.q f121102a;

    public o(com.tencent.mm.plugin.finder.member.all.q qVar) {
        this.f121102a = qVar;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        return com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f121102a.f121105e.f121090f, false, 1, null);
    }
}
