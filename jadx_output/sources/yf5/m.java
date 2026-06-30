package yf5;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final yf5.w f461907a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f461908b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f461909c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f461910d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f461911e;

    /* renamed from: f, reason: collision with root package name */
    public final yf5.e f461912f;

    public m(androidx.fragment.app.FragmentActivity activity, yf5.w dataSource) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        this.f461907a = dataSource;
        this.f461908b = "MicroMsg.ConversationAdapter.ConversationDataController";
        this.f461909c = new com.tencent.mm.sdk.coroutines.LifecycleScope("loadMoreScope", activity, 0, 4, null);
        this.f461910d = new com.tencent.mm.sdk.coroutines.LifecycleScope("updateScope", activity, 0, 4, null);
        this.f461911e = new java.util.HashMap();
        this.f461912f = new yf5.e(com.tencent.wcdb.core.Database.DictDefaultMatchValue, 0);
    }

    public final java.util.List a() {
        int i17 = this.f461912f.f461864b;
        yf5.k0 k0Var = new yf5.k0();
        k0Var.f461896b = i17;
        k0Var.f461898d = 30;
        yf5.l0 g17 = this.f461907a.g(k0Var);
        d(i17, g17.f461906d);
        java.util.ArrayList arrayList = g17.f461904b;
        return arrayList != null ? arrayList : new java.util.ArrayList();
    }

    public final void b() {
        synchronized (this.f461912f) {
            yf5.e eVar = this.f461912f;
            eVar.f461864b++;
            eVar.f461863a = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
        yf5.w0 w0Var = this.f461907a.f461965i;
        if (w0Var != null) {
            w0Var.a();
        }
        v65.i.b(this.f461909c, null, new yf5.h(this, this.f461912f.f461864b, new yf5.i(this), null), 1, null);
    }

    public final void c(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        v65.i.b(this.f461910d, null, new yf5.j(this, username, this.f461912f.f461864b, null), 1, null);
    }

    public final void d(int i17, long j17) {
        synchronized (this.f461912f) {
            yf5.e eVar = this.f461912f;
            if (i17 == eVar.f461864b) {
                eVar.f461863a = j17;
            }
        }
    }
}
