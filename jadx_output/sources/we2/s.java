package we2;

/* loaded from: classes3.dex */
public final class s extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f445254f;

    /* renamed from: g, reason: collision with root package name */
    public final we2.p f445255g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f445256h;

    /* renamed from: i, reason: collision with root package name */
    public int f445257i;

    /* renamed from: m, reason: collision with root package name */
    public final we2.a f445258m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f445254f = "FinderLiveCommentItemService";
        this.f445255g = new we2.p();
        this.f445256h = jz5.h.b(we2.r.f445253d);
        this.f445257i = -1;
        this.f445258m = new we2.q(liveContext, this);
    }

    public final dk2.t5 N6() {
        return (dk2.t5) ((jz5.n) this.f445256h).getValue();
    }

    public final void O6() {
        this.f445255g.g(this.f445258m);
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        this.f445255g.h();
    }
}
