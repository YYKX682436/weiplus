package xc2;

/* loaded from: classes2.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f453146d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f453147e;

    /* renamed from: f, reason: collision with root package name */
    public int f453148f;

    /* renamed from: g, reason: collision with root package name */
    public int f453149g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f453150h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xc2.k0 f453151i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f453152m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(java.util.List list, xc2.k0 k0Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453150h = list;
        this.f453151i = k0Var;
        this.f453152m = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc2.h0(this.f453150h, this.f453151i, this.f453152m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc2.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        xc2.k0 k0Var;
        int i17;
        java.util.Iterator it;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f453149g;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : this.f453150h) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((com.tencent.mm.plugin.finder.storage.FinderItem) obj2).field_finderObject;
                boolean z17 = false;
                if (finderObject != null && finderObject.getId() == 0) {
                    z17 = true;
                }
                if (z17) {
                    arrayList.add(obj2);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            k0Var = this.f453151i;
            i17 = this.f453152m;
            it = it6;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f453148f;
            it = (java.util.Iterator) this.f453147e;
            k0Var = (xc2.k0) this.f453146d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) it.next();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            xc2.g0 g0Var = new xc2.g0(finderItem, k0Var, i17, null);
            this.f453146d = k0Var;
            this.f453147e = it;
            this.f453148f = i17;
            this.f453149g = 1;
            if (kotlinx.coroutines.l.g(g3Var, g0Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
