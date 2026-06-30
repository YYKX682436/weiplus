package ee5;

/* loaded from: classes9.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f251993d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f251994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251995f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ee5.q0 f251996g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(java.util.ArrayList arrayList, ee5.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251995f = arrayList;
        this.f251996g = q0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ee5.p0 p0Var = new ee5.p0(this.f251995f, this.f251996g, continuation);
        p0Var.f251994e = obj;
        return p0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f251993d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f251994e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = this.f251995f.iterator();
            java.lang.String str = "";
            while (true) {
                boolean hasNext = it.hasNext();
                ee5.q0 q0Var = this.f251996g;
                if (hasNext) {
                    com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
                    if (!kotlinx.coroutines.z0.h(y0Var)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemEmojiUIC", "is no active");
                        return f0Var;
                    }
                    java.lang.String j17 = f9Var.j();
                    kotlin.jvm.internal.o.d(j17);
                    java.util.List f07 = r26.n0.f0(j17, new java.lang.String[]{":"}, false, 0, 6, null);
                    if (f07.size() > 3) {
                        com.tencent.mm.api.IEmojiInfo Di = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Di((java.lang.String) f07.get(3));
                        if (Di != null) {
                            zb5.c cVar = new zb5.c();
                            cVar.f471308a = (com.tencent.mm.storage.emotion.EmojiInfo) Di;
                            cVar.f471309b = f9Var;
                            cVar.f471310c = 0;
                            java.lang.String c17 = com.tencent.mm.ui.gridviewheaders.a.e().c(new java.util.Date(f9Var.getCreateTime()), q0Var.getContext());
                            if (!kotlin.jvm.internal.o.b(c17, str)) {
                                zb5.c cVar2 = new zb5.c();
                                cVar2.f471310c = 1;
                                kotlin.jvm.internal.o.d(c17);
                                cVar2.f471311d = c17;
                                arrayList.add(cVar2);
                                str = c17;
                            }
                            arrayList.add(cVar);
                        }
                    }
                } else {
                    if (!arrayList.isEmpty()) {
                        zb5.c cVar3 = new zb5.c();
                        cVar3.f471310c = 2;
                        arrayList.add(cVar3);
                    }
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                    ee5.o0 o0Var = new ee5.o0(q0Var, arrayList, null);
                    this.f251993d = 1;
                    if (kotlinx.coroutines.l.g(g3Var, o0Var, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
