package cw2;

/* loaded from: classes2.dex */
public final class i0 implements cw2.w9 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.y f223761d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f223762e;

    /* renamed from: f, reason: collision with root package name */
    public cs2.j f223763f;

    public i0(androidx.lifecycle.y lifecycleOwner, android.content.Context context) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(context, "context");
        this.f223761d = lifecycleOwner;
        this.f223762e = context;
    }

    @Override // cw2.w9
    public boolean V0() {
        es2.g gVar;
        cs2.j jVar = this.f223763f;
        es2.a aVar = jVar instanceof es2.a ? (es2.a) jVar : null;
        return (aVar == null || (gVar = aVar.f256326e) == null || !gVar.f256358v) ? false : true;
    }

    @Override // cw2.w9
    public cs2.j d1() {
        return this.f223763f;
    }
}
