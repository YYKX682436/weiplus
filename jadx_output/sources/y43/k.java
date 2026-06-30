package y43;

/* loaded from: classes2.dex */
public final class k implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459353d;

    public k(java.lang.String str) {
        this.f459353d = str;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.f fVar;
        if (i17 == 0 && i18 == 0 && (fVar = oVar.f70711b.f70700a) != null) {
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.luggage.game.GetUrlLiteConfResponse");
            o33.d dVar = (o33.d) fVar;
            java.util.LinkedList linkedList = dVar.f342731d;
            if (!(linkedList == null || linkedList.isEmpty())) {
                ((ku5.t0) ku5.t0.f312615d).g(new y43.j(dVar, this.f459353d));
            }
        }
        return 0;
    }
}
