package ir2;

/* loaded from: classes2.dex */
public final class b1 implements ir2.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f294112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ir2.c1 f294113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f294114c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.c f294115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f294116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f294117f;

    public b1(java.util.ArrayList arrayList, ir2.c1 c1Var, int i17, com.tencent.mm.plugin.finder.feed.model.c cVar, android.content.Intent intent, yz5.a aVar) {
        this.f294112a = arrayList;
        this.f294113b = c1Var;
        this.f294114c = i17;
        this.f294115d = cVar;
        this.f294116e = intent;
        this.f294117f = aVar;
    }

    @Override // ir2.u
    public void a(java.util.List dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f294112a.addAll(dataList);
        java.util.ArrayList arrayList = this.f294112a;
        ir2.c1 c1Var = this.f294113b;
        c1Var.f294121b.b(new com.tencent.mm.plugin.finder.feed.model.r9(arrayList, c1Var.f294121b.f108490a, this.f294114c, this.f294115d, null, 16, null), this.f294116e);
        yz5.a aVar = this.f294117f;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
