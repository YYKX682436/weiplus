package dk2;

/* loaded from: classes.dex */
public final class y1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f234365b;

    public y1(dk2.r4 r4Var, int i17) {
        this.f234364a = r4Var;
        this.f234365b = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i(this.f234364a.f234009d, "doLoadMoreGiftByGroup groupId:" + this.f234365b + " errType:" + fVar.f70615a + ", errCode:" + fVar.f70616b);
        return jz5.f0.f302826a;
    }
}
