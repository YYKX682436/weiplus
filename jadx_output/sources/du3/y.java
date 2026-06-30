package du3;

/* loaded from: classes.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f243768d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f243769e;

    /* renamed from: f, reason: collision with root package name */
    public int f243770f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ du3.b0 f243771g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f243772h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(du3.b0 b0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243771g = b0Var;
        this.f243772h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du3.y(this.f243771g, this.f243772h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((du3.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long currentTimeMillis;
        java.util.ArrayList arrayList;
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243770f;
        du3.b0 b0Var = this.f243771g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            currentTimeMillis = java.lang.System.currentTimeMillis();
            b0Var.f243540y.clear();
            ck0.f fVar = (ck0.f) i95.n0.c(ck0.f.class);
            java.lang.String i18 = com.tencent.mm.vfs.w6.i(this.f243772h, false);
            kotlin.jvm.internal.o.d(i18);
            java.util.ArrayList d17 = kz5.c0.d(i18);
            this.f243768d = currentTimeMillis;
            this.f243770f = 1;
            oy4.c cVar = (oy4.c) fVar;
            cVar.getClass();
            obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new oy4.b(d17, cVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j17 = this.f243768d;
                arrayList = (java.util.ArrayList) this.f243769e;
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "loadImageTagList cost:" + (java.lang.System.currentTimeMillis() - j17) + ",count:" + arrayList.size() + " value:" + kz5.n0.g0(arrayList, null, null, null, 0, null, null, 63, null));
                return jz5.f0.f302826a;
            }
            currentTimeMillis = this.f243768d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.util.ArrayList arrayList3 = (java.util.ArrayList) it.next();
            java.util.ArrayList arrayList4 = b0Var.f243540y;
            kotlin.jvm.internal.o.d(arrayList3);
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
            java.util.Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                arrayList5.add(((ck0.a) it6.next()).f42296a);
            }
            arrayList4.addAll(arrayList5);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        du3.x xVar = new du3.x(b0Var, null);
        this.f243769e = arrayList2;
        this.f243768d = currentTimeMillis;
        this.f243770f = 2;
        if (kotlinx.coroutines.l.g(g3Var, xVar, this) == aVar) {
            return aVar;
        }
        arrayList = arrayList2;
        j17 = currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "loadImageTagList cost:" + (java.lang.System.currentTimeMillis() - j17) + ",count:" + arrayList.size() + " value:" + kz5.n0.g0(arrayList, null, null, null, 0, null, null, 63, null));
        return jz5.f0.f302826a;
    }
}
