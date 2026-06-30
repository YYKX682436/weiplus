package mm2;

/* loaded from: classes3.dex */
public final class n6 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public boolean f329293f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329294g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f329295h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329294g = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
    }

    public final void N6(boolean z17) {
        this.f329293f = z17;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        this.f329293f = false;
    }
}
