package com.tencent.mm.pluginsdk.ui.tools;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/QBFileShareProxyUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class QBFileShareProxyUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f191419m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f191420d = jz5.h.b(new com.tencent.mm.pluginsdk.ui.tools.r6(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f191421e = jz5.h.b(new com.tencent.mm.pluginsdk.ui.tools.i6(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f191422f = jz5.h.b(new com.tencent.mm.pluginsdk.ui.tools.j6(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f191423g = jz5.h.b(new com.tencent.mm.pluginsdk.ui.tools.h6(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f191424h = jz5.h.b(new com.tencent.mm.pluginsdk.ui.tools.m6(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f191425i = jz5.h.b(new com.tencent.mm.pluginsdk.ui.tools.n6(this));

    public final java.lang.String T6() {
        return (java.lang.String) ((jz5.n) this.f191422f).getValue();
    }

    public final long U6() {
        return ((java.lang.Number) ((jz5.n) this.f191424h).getValue()).longValue();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.pluginsdk.ui.tools.p6 p6Var = new com.tencent.mm.pluginsdk.ui.tools.p6(this);
        com.tencent.mm.pluginsdk.ui.tools.q6 q6Var = new com.tencent.mm.pluginsdk.ui.tools.q6(this);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k((java.lang.String) ((jz5.n) this.f191425i).getValue(), U6());
        v05.b bVar = new v05.b();
        java.lang.String j17 = k17 != null ? k17.j() : null;
        if (j17 == null) {
            j17 = "";
        }
        bVar.fromXml(j17);
        long k18 = com.tencent.mm.vfs.w6.k(T6());
        if (k18 <= 0) {
            v05.a aVar = (v05.a) bVar.getCustom(bVar.f432315e + 8);
            k18 = aVar != null ? aVar.getLong(aVar.f368364d + 0) : 0L;
        }
        ec5.a aVar2 = new ec5.a();
        n13.v vVar = n13.v.f334140a;
        jz5.g gVar = this.f191421e;
        aVar2.k(vVar.b((java.lang.String) ((jz5.n) gVar).getValue(), (java.lang.String) ((jz5.n) this.f191423g).getValue(), k18));
        aVar2.l(T6());
        e35.g.f247590a.a((java.lang.String) ((jz5.n) gVar).getValue(), 202);
        n13.t tVar = new n13.t();
        n13.a0.V0.getClass();
        tVar.f334135c = n13.y.f334141a;
        tVar.f334133a = p6Var;
        tVar.f334136d = q6Var;
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((dk5.y) a0Var).wi(context, aVar2, (java.lang.String) ((jz5.n) this.f191420d).getValue(), tVar);
    }
}
