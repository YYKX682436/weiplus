package oj5;

/* loaded from: classes8.dex */
public final class w extends oj5.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f345900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f345901c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f345902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f345903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oj5.b0 f345904f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f345905g;

    public w(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.List list, kotlin.jvm.internal.c0 c0Var, oj5.b0 b0Var, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f345900b = h0Var;
        this.f345901c = n3Var;
        this.f345902d = list;
        this.f345903e = c0Var;
        this.f345904f = b0Var;
        this.f345905g = recyclerView;
    }

    @Override // oj5.b
    public void a(androidx.recyclerview.widget.f2 adapter) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        oj5.v vVar = new oj5.v(this.f345902d, this, this.f345903e, this.f345904f, adapter, this.f345905g);
        this.f345900b.f310123d = vVar;
        this.f345901c.postAtFrontOfQueue(vVar);
    }
}
