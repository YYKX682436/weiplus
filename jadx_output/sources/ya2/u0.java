package ya2;

/* loaded from: classes10.dex */
public final class u0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460553a;

    public u0(android.content.Context context) {
        this.f460553a = context;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        if ((i17 == 0 && fVar.f70616b == 0) || hc2.p.b(i17, fVar.f70616b)) {
            com.tencent.mars.xlog.Log.i("FinderRouterApi", "FinderImmersiveFeedUI not exists");
        } else {
            ya2.e1.i(ya2.e1.f460472a, this.f460553a, fVar.f70616b, fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
