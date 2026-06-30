package ro2;

/* loaded from: classes2.dex */
public final class g extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f398045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f398047c;

    public g(com.tencent.mm.plugin.finder.convert.qe qeVar, android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f398045a = qeVar;
        this.f398046b = context;
        this.f398047c = baseFinderFeed;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        ro2.t tVar = ro2.t.f398098i;
        android.content.Context context = this.f398046b;
        kotlin.jvm.internal.o.f(context, "$context");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed item = this.f398047c;
        kotlin.jvm.internal.o.f(item, "$item");
        ro2.r.h(this.f398045a, tVar, context, item);
    }
}
