package com.tencent.mm.sdk.coroutines;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "Lkotlinx/coroutines/y0;", "Landroidx/lifecycle/x;", "Lv65/i;", "Ljz5/f0;", "onDestroy", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "Landroidx/lifecycle/y;", "owner", "", "threadCount", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/y;I)V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class LifecycleScope implements kotlinx.coroutines.y0, androidx.lifecycle.x, v65.i {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f192350d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.y f192351e;

    /* renamed from: f, reason: collision with root package name */
    public final int f192352f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f192353g;

    public LifecycleScope(java.lang.String name, androidx.lifecycle.y yVar, int i17) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f192350d = name;
        this.f192351e = yVar;
        this.f192352f = i17;
        if (yVar != null) {
            d75.b.g(new v65.j(this));
        }
        this.f192353g = jz5.h.b(new v65.k(this));
    }

    public static kotlinx.coroutines.f1 e(com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope, kotlinx.coroutines.a1 start, yz5.p block, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            start = kotlinx.coroutines.a1.DEFAULT;
        }
        lifecycleScope.getClass();
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        return kotlinx.coroutines.l.a(lifecycleScope, lifecycleScope.f(), start, block);
    }

    @Override // v65.i
    public kotlinx.coroutines.r2 a(kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        return kotlinx.coroutines.l.c(this, kotlinx.coroutines.internal.b0.f310484a, start, block);
    }

    @Override // v65.i
    public kotlinx.coroutines.r2 d(kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        return kotlinx.coroutines.l.c(this, f(), start, block);
    }

    public final kotlinx.coroutines.f2 f() {
        return (kotlinx.coroutines.f2) ((jz5.n) this.f192353g).getValue();
    }

    @Override // kotlinx.coroutines.y0
    public oz5.l getCoroutineContext() {
        return f();
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.LifecycleScope", "onDestroy");
        kotlinx.coroutines.v2.c(f(), null, 1, null);
        f().close();
    }

    public /* synthetic */ LifecycleScope(java.lang.String str, androidx.lifecycle.y yVar, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(str, (i18 & 2) != 0 ? null : yVar, (i18 & 4) != 0 ? 1 : i17);
    }
}
