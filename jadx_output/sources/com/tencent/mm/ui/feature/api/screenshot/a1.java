package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class a1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f208457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208458e;

    public a1(android.content.Context context, com.tencent.mm.ui.feature.api.screenshot.j1 j1Var) {
        this.f208457d = context;
        this.f208458e = j1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean result = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
        kotlin.jvm.internal.o.g(result, "result");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.feature.api.screenshot.z0(result, this.f208457d, this.f208458e));
    }
}
