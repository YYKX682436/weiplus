package eh0;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f252892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh0.o f252893e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(eh0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252893e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new eh0.m(this.f252893e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((eh0.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f252892d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f252892d = 1;
            if (kotlinx.coroutines.k1.b(androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        e70.a0 wi6 = ((i70.g) ((e70.b0) i95.n0.c(e70.b0.class))).wi(false);
        eh0.o oVar = this.f252893e;
        oVar.f252897f = wi6;
        e70.a0 a0Var = oVar.f252897f;
        if (a0Var == null) {
            kotlin.jvm.internal.o.o("streamController");
            throw null;
        }
        ((d83.t0) a0Var).c();
        fh0.k kVar = fh0.k.f262530a;
        if (!fh0.k.f262532c) {
            fh0.k.f262532c = true;
            boolean z17 = !kotlin.jvm.internal.o.b(bm5.o1.f22719a.d(new com.tencent.mm.repairer.config.chatting.markdown.RepairerConfigMarkdownStreamDataShower()), 0);
            fh0.k.f262533d = z17;
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.DataShower", "onInit: enabled, creating float view");
                d75.b.g(fh0.f.f262526d);
                com.tencent.mm.app.w.INSTANCE.a(new fh0.i());
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.DataShower", "onInit: disabled by RepairerConfig");
            }
        }
        oVar.getClass();
        eh0.g gVar = eh0.g.f252875a;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String[] b17 = gVar.a().b();
        if (b17 != null) {
            for (java.lang.String str : b17) {
                java.lang.String string = eh0.g.f252875a.a().getString(str, null);
                if (string != null) {
                    try {
                        eh0.i a17 = eh0.i.f252877j.a(string);
                        kotlin.jvm.internal.o.d(str);
                        linkedHashMap.put(str, a17);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.StreamMMKVHelper", "parse stream info error: %s", e17.getMessage());
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.StreamMMKVHelper", "getAllUnfinishedStreams count:%d", java.lang.Integer.valueOf(linkedHashMap.size()));
        }
        linkedHashMap.forEach(new eh0.n(oVar));
        return jz5.f0.f302826a;
    }
}
