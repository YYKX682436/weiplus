package je2;

/* loaded from: classes3.dex */
public final class n extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f299245f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f299246g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f299247h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f299248i;

    /* renamed from: m, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f299249m;

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f299250n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f299245f = "Finder.LiveGameDataBannerSlice";
        this.f299246g = jz5.h.b(je2.m.f299244d);
        u26.u uVar = u26.u.DROP_OLDEST;
        this.f299247h = kotlinx.coroutines.flow.r2.a(1, 1, uVar);
        this.f299248i = kotlinx.coroutines.flow.r2.a(1, 1, uVar);
        this.f299249m = kotlinx.coroutines.flow.r2.a(1, 1, uVar);
        this.f299250n = kotlinx.coroutines.flow.r2.a(1, 1, uVar);
    }

    public final void N6(r45.vq1 gameData) {
        kotlin.jvm.internal.o.g(gameData, "gameData");
        pm0.v.X(new je2.k(gameData, this));
    }

    public final r45.wq1 O6(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        com.tencent.mm.protobuf.e fromJson = new r45.wq1().fromJson(str);
        if (fromJson instanceof r45.wq1) {
            return (r45.wq1) fromJson;
        }
        return null;
    }

    public final synchronized je2.j P6() {
        java.lang.Object obj;
        java.util.Iterator it = Q6().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((je2.j) obj).a()) {
                break;
            }
        }
        return (je2.j) obj;
    }

    public final java.util.concurrent.ConcurrentLinkedQueue Q6() {
        return (java.util.concurrent.ConcurrentLinkedQueue) ((jz5.n) this.f299246g).getValue();
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        Q6().clear();
    }
}
