package gx0;

/* loaded from: classes5.dex */
public final class ih extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.kh f276557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f276558f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.c f276559g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(gx0.kh khVar, java.util.List list, com.tencent.maas.moviecomposing.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276557e = khVar;
        this.f276558f = list;
        this.f276559g = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.ih(this.f276557e, this.f276558f, this.f276559g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ih) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object g17;
        com.tencent.maas.moviecomposing.ComposingSession composingSession;
        com.tencent.maas.moviecomposing.Timeline e17;
        androidx.lifecycle.j0 j0Var;
        androidx.lifecycle.j0 j0Var2;
        androidx.lifecycle.j0 j0Var3;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276556d;
        com.tencent.maas.moviecomposing.c cVar = this.f276559g;
        gx0.kh khVar = this.f276557e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.List list = this.f276558f;
                this.f276556d = 1;
                khVar.getClass();
                g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new gx0.dh(list, cVar, null), this);
                if (g17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                g17 = obj;
            }
            composingSession = (com.tencent.maas.moviecomposing.ComposingSession) g17;
            e17 = composingSession != null ? composingSession.e() : null;
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        } catch (java.lang.Exception unused) {
        }
        if (composingSession == null || e17 == null) {
            return null;
        }
        khVar.f276642r = new ex0.a0(khVar.f276644t, composingSession, e17, this.f276558f, khVar.getMainScope(), null, new mv0.b(cVar, true), 32, null);
        ex0.a0 a0Var = khVar.f276642r;
        if (a0Var != null && (j0Var3 = a0Var.f257116z) != null) {
            j0Var3.observe(khVar.getActivity(), new gx0.fh(khVar));
        }
        ex0.a0 a0Var2 = khVar.f276642r;
        if (a0Var2 != null && (j0Var2 = a0Var2.B) != null) {
            j0Var2.observe(khVar.getActivity(), new gx0.gh(khVar));
        }
        ex0.a0 a0Var3 = khVar.f276642r;
        if (a0Var3 != null && (j0Var = a0Var3.C) != null) {
            j0Var.observe(khVar.getActivity(), new gx0.hh(khVar));
        }
        ex0.a0 a0Var4 = khVar.f276642r;
        if (a0Var4 != null) {
            java.util.Iterator it = ((java.util.ArrayList) a0Var4.f257097g.f257177e).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                ug.m mVar = rVar.f257169c;
                if (mVar == ug.m.ImageClip || mVar == ug.m.VideoClip || mVar == ug.m.MovieClip) {
                    kotlinx.coroutines.l.d(a0Var4.f257093c, null, null, new ex0.z(a0Var4, rVar, null), 3, null);
                }
            }
        }
        gx0.kh.Y6(khVar);
        khVar.f276643s.setValue(jz5.f0.f302826a);
        return khVar.f276642r;
    }
}
