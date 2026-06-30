package df2;

/* loaded from: classes.dex */
public final class vx extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f231641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.cy f231642e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az2.f f231643f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.cy cyVar, az2.f fVar) {
        super(2, continuation);
        this.f231641d = hVar;
        this.f231642e = cyVar;
        this.f231643f = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.vx(this.f231641d, continuation, this.f231642e, this.f231643f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.vx vxVar = (df2.vx) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vxVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f231641d).f454381b;
        df2.cy cyVar = this.f231642e;
        java.lang.String str = cyVar.f229915m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showAlertDialog cgi failed. ");
        rm0.j jVar = aVar2.f454379a;
        sb6.append(jVar != null ? new java.lang.Integer(jVar.f397425f) : null);
        sb6.append(", ");
        rm0.j jVar2 = aVar2.f454379a;
        sb6.append(jVar2 != null ? new java.lang.Integer(jVar2.f397424e) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        this.f231643f.b();
        db5.t7.makeText(cyVar.O6(), cyVar.O6().getString(com.tencent.mm.R.string.dgq), 0).show();
        return jz5.f0.f302826a;
    }
}
