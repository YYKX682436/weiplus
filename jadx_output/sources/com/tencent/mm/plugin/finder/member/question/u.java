package com.tencent.mm.plugin.finder.member.question;

/* loaded from: classes2.dex */
public final class u implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.question.w f121359a;

    public u(com.tencent.mm.plugin.finder.member.question.w wVar) {
        this.f121359a = wVar;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        return com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f121359a.f121371e.f121346f, false, 1, null);
    }
}
