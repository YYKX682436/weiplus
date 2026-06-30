package nd1;

/* loaded from: classes7.dex */
public final class w implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f336411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f336412e;

    public w(com.tencent.mm.plugin.appbrand.o6 o6Var, yz5.a aVar) {
        this.f336411d = o6Var;
        this.f336412e = aVar;
    }

    @Override // u81.f
    public void D(java.lang.String appId, u81.b state) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(state, "state");
        if (u81.b.BACKGROUND == state) {
            this.f336411d.N.c(this);
            this.f336412e.invoke();
        }
    }
}
