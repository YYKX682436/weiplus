package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class d6 implements com.tencent.wechat.iam.biz.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f154275a;

    public d6(kotlinx.coroutines.q qVar) {
        this.f154275a = qVar;
    }

    @Override // com.tencent.wechat.iam.biz.d
    public final void a(java.util.Optional optional) {
        this.f154275a.resumeWith(kotlin.Result.m521constructorimpl((optional == null || !optional.isPresent()) ? null : (com.tencent.wechat.iam.biz.w1) optional.get()));
    }
}
