package pk2;

/* loaded from: classes3.dex */
public final class k9 implements pk2.g8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.ox f355924a;

    public k9(df2.ox oxVar) {
        this.f355924a = oxVar;
    }

    public void b(yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f355924a.W6(callback);
    }

    public kotlinx.coroutines.y0 c() {
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f355924a.f291099e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
        if (k0Var != null) {
            return k0Var.getViewScope();
        }
        return null;
    }
}
