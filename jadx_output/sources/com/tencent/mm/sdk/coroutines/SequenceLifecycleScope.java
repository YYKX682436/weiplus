package com.tencent.mm.sdk.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/sdk/coroutines/SequenceLifecycleScope;", "Lkotlinx/coroutines/y0;", "Landroidx/lifecycle/v;", "Lv65/i;", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "Landroidx/lifecycle/y;", "owner", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/y;)V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SequenceLifecycleScope implements kotlinx.coroutines.y0, androidx.lifecycle.v, v65.i {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f192354d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f192355e;

    /* renamed from: f, reason: collision with root package name */
    public final u26.w f192356f;

    public SequenceLifecycleScope(java.lang.String name, androidx.lifecycle.y yVar) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f192354d = name;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.SequenceLifecycleScope", hashCode() + " onCreate");
        if (yVar != null) {
            d75.b.g(new v65.o(yVar, this));
        }
        jz5.g b17 = jz5.h.b(new v65.p(this));
        this.f192355e = b17;
        u26.w a17 = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);
        kotlinx.coroutines.l.d(this, (kotlinx.coroutines.f2) ((jz5.n) b17).getValue(), null, new v65.q(a17, null), 2, null);
        this.f192356f = a17;
    }

    @Override // v65.i
    public kotlinx.coroutines.r2 a(kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.r2 c17 = kotlinx.coroutines.l.c(this, kotlinx.coroutines.internal.b0.f310484a, kotlinx.coroutines.a1.LAZY, block);
        ((u26.o) this.f192356f).e(c17);
        return c17;
    }

    @Override // v65.i
    public kotlinx.coroutines.r2 d(kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        kotlinx.coroutines.r2 c17 = kotlinx.coroutines.l.c(this, (kotlinx.coroutines.f2) ((jz5.n) this.f192355e).getValue(), kotlinx.coroutines.a1.LAZY, block);
        ((u26.o) this.f192356f).e(c17);
        return c17;
    }

    @Override // kotlinx.coroutines.y0
    /* renamed from: getCoroutineContext */
    public oz5.l getF11582e() {
        return (kotlinx.coroutines.f2) ((jz5.n) this.f192355e).getValue();
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        if (event == androidx.lifecycle.m.ON_DESTROY) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.SequenceLifecycleScope", hashCode() + " onDestroy");
            u26.x0.a(this.f192356f, null, 1, null);
            ((kotlinx.coroutines.f2) ((jz5.n) this.f192355e).getValue()).close();
        }
    }

    public /* synthetic */ SequenceLifecycleScope(java.lang.String str, androidx.lifecycle.y yVar, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? null : yVar);
    }
}
