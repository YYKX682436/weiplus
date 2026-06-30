package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class z5 implements com.tencent.wechat.iam.biz.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f154713a;

    public z5(kotlinx.coroutines.q qVar) {
        this.f154713a = qVar;
    }

    @Override // com.tencent.wechat.iam.biz.b
    public final void a(com.tencent.wechat.iam.biz.h hVar) {
        this.f154713a.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(hVar != null ? hVar.f217748d : 0)));
    }
}
