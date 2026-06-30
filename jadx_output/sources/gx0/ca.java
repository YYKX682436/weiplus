package gx0;

/* loaded from: classes5.dex */
public final class ca extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(gx0.ac acVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276289d = acVar;
        this.f276290e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.ca(this.f276289d, this.f276290e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ca) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ex0.q g17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gx0.ac acVar = this.f276289d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = acVar.f222645q;
        java.lang.String str = this.f276290e;
        java.util.concurrent.CountDownLatch countDownLatch = (java.util.concurrent.CountDownLatch) concurrentHashMap.get(str);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (countDownLatch == null) {
            return f0Var;
        }
        countDownLatch.await();
        ex0.a0 e86 = acVar.e8();
        if (e86 != null && (g17 = ex0.i0.g(e86, str)) != null) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (com.tencent.maas.moviecomposing.segments.CaptionItem captionItem : g17.I()) {
                java.lang.String text = captionItem.getText();
                kotlin.jvm.internal.o.f(text, "getText(...)");
                linkedHashMap.put(text, java.lang.Double.valueOf(captionItem.getTimeRange().getDuration().toSeconds()));
            }
            acVar.f222651w.put(g17.f257168b, linkedHashMap);
            yy0.m0 m0Var = (yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class));
            m0Var.getClass();
            boolean z17 = false;
            if (pp0.h0.Q2(m0Var, false, 1, null)) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.movie_composing.RepairerConfigMovieComposingAutoOpenTimbre()) == 1) {
                    z17 = true;
                }
            }
            com.tencent.maas.moviecomposing.segments.Segment segment = g17.f257167a;
            if (z17) {
                acVar.t7().getClass();
                if (!uu0.c.e().f431207b && !acVar.B) {
                    acVar.B = true;
                    com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment = segment instanceof com.tencent.maas.moviecomposing.segments.NarrationSegment ? (com.tencent.maas.moviecomposing.segments.NarrationSegment) segment : null;
                    if (narrationSegment != null) {
                        pf5.e.launchUI$default(acVar, null, null, new cw0.a0(acVar, narrationSegment, null), 3, null);
                    }
                }
            }
            java.lang.String a17 = dw0.f.a(acVar.f222647s);
            java.lang.String str2 = acVar.f222647s.f48226d;
            if (((gx0.w) ((jz5.n) acVar.f222644p).getValue()).g7(fv0.d.f266965q, a17)) {
                kotlin.jvm.internal.o.e(segment, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.NarrationSegment");
                com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment2 = (com.tencent.maas.moviecomposing.segments.NarrationSegment) segment;
                kotlin.jvm.internal.o.d(str2);
                com.tencent.maas.moviecomposing.Timeline D = narrationSegment2.D();
                if (D != null) {
                    com.tencent.maas.moviecomposing.segments.NarrationSegment.A1(narrationSegment2, a17, str2, D);
                }
                acVar.h8(narrationSegment2, a17, str2);
                java.lang.String string = acVar.getContext().getString(com.tencent.mm.R.string.f492507hj);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                acVar.U7(string);
            }
        }
        return f0Var;
    }
}
