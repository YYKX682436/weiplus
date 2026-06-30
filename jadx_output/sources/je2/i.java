package je2;

/* loaded from: classes10.dex */
public final class i extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public x91.h f299235f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f299236g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f299236g = new java.util.ArrayList();
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        this.f299235f = null;
        this.f299236g.clear();
    }
}
