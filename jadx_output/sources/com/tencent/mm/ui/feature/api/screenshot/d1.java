package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class d1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208468d;

    public d1(com.tencent.mm.ui.feature.api.screenshot.j1 j1Var) {
        this.f208468d = j1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean result = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
        kotlin.jvm.internal.o.g(result, "result");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.feature.api.screenshot.c1(result, this.f208468d));
    }
}
