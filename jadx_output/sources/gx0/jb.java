package gx0;

/* loaded from: classes5.dex */
public final class jb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(gx0.ac acVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276583e = acVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.jb(this.f276583e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.jb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276582d;
        gx0.ac acVar = this.f276583e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf c86 = acVar.c8();
            this.f276582d = 1;
            if (gx0.bf.t7(c86, false, this, 1, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        acVar.getClass();
        com.tencent.maas.base.MJID mjid = (com.tencent.maas.base.MJID) com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.V6(acVar, "NARRATION_SEGMENT_ID", null, 2, null);
        if (mjid != null) {
            acVar.C7(mjid);
        }
        return jz5.f0.f302826a;
    }
}
