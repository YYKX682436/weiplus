package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class x5 implements com.tencent.wechat.iam.biz.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f154694a;

    public x5(kotlinx.coroutines.q qVar) {
        this.f154694a = qVar;
    }

    @Override // com.tencent.wechat.iam.biz.c
    public final void complete(boolean z17) {
        this.f154694a.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
    }
}
