package gx0;

/* loaded from: classes5.dex */
public final class kb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ru0.e f276627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.q f276628g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f276629h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(gx0.ac acVar, ru0.e eVar, ex0.q qVar, com.tencent.mm.vfs.r6 r6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276626e = acVar;
        this.f276627f = eVar;
        this.f276628g = qVar;
        this.f276629h = r6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.kb(this.f276626e, this.f276627f, this.f276628g, this.f276629h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.kb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276625d;
        gx0.ac acVar = this.f276626e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ru0.e eVar = this.f276627f;
            acVar.j8(eVar.f399662a, vu0.w.f440168f);
            ex0.q qVar = this.f276628g;
            acVar.W7(qVar, eVar.f399666e);
            java.lang.String roleID = eVar.f399663b;
            kotlin.jvm.internal.o.g(roleID, "roleID");
            java.lang.String roleName = eVar.f399664c;
            kotlin.jvm.internal.o.g(roleName, "roleName");
            com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment = qVar.f257162q;
            narrationSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D = narrationSegment.D();
            if (D != null) {
                com.tencent.maas.moviecomposing.segments.NarrationSegment.A1(narrationSegment, roleID, roleName, D);
            }
            java.lang.String o17 = this.f276629h.o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            narrationSegment.getClass();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.tencent.maas.moviecomposing.Timeline D2 = narrationSegment.D();
            if (D2 != null) {
                bool = com.tencent.maas.moviecomposing.segments.NarrationSegment.O1(narrationSegment, o17, D2);
            }
            bool.booleanValue();
            this.f276625d = 1;
            if (qVar.G(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.i(acVar.A7(), false, 1, null);
        gx0.bf c86 = acVar.c8();
        this.f276625d = 2;
        if (gx0.bf.d7(c86, null, null, false, this, 7, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
