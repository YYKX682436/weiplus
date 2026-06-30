package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class b6 implements com.tencent.wechat.iam.biz.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f154257a;

    public b6(kotlinx.coroutines.q qVar) {
        this.f154257a = qVar;
    }

    @Override // com.tencent.wechat.iam.biz.e
    public final void complete(boolean z17) {
        this.f154257a.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
    }
}
