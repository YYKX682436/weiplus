package dn0;

/* loaded from: classes10.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn0.j f241835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f241836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f241837f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f241838g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f241839h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(dn0.j jVar, long j17, byte[] bArr, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f241835d = jVar;
        this.f241836e = j17;
        this.f241837f = bArr;
        this.f241838g = i17;
        this.f241839h = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dn0.h(this.f241835d, this.f241836e, this.f241837f, this.f241838g, this.f241839h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dn0.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dn0.j jVar = this.f241835d;
        long j17 = this.f241836e;
        byte[] bArr = this.f241837f;
        int i17 = this.f241838g;
        int i18 = this.f241839h;
        synchronized (jVar) {
            if (!jVar.f241845e) {
                com.tencent.mars.xlog.Log.e(jVar.f241841a, "ScoreHandleInit is false");
                return jz5.f0.f302826a;
            }
            boolean z17 = true;
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            jVar.f241842b.Process(j17, bArr, i17, i18, iArr, new int[1], iArr2, iArr3);
            int i19 = iArr3[0];
            if (i19 != -1) {
                int i27 = jVar.f241847g + i19;
                jVar.f241847g = i27;
                int i28 = jVar.f241846f + 1;
                jVar.f241846f = i28;
                dn0.e eVar = jVar.f241844d;
                if (eVar != null) {
                    float f17 = i27 / i28;
                    float f18 = i18;
                    kh2.m mVar = (kh2.m) eVar;
                    jh2.a aVar2 = mVar.f308022a.f308029b;
                    if (aVar2 != null) {
                        aVar2.v1(mVar.f308023b.f346383a, i19, i27, f17, i28, f18);
                    }
                }
            }
            dn0.e eVar2 = jVar.f241844d;
            if (eVar2 != null) {
                if (iArr[0] != 1) {
                    z17 = false;
                }
                int i29 = iArr2[0];
                float f19 = i18;
                kh2.m mVar2 = (kh2.m) eVar2;
                jh2.a aVar3 = mVar2.f308022a.f308029b;
                if (aVar3 != null) {
                    aVar3.M4(mVar2.f308023b.f346383a, i29, z17, f19);
                }
            }
            return jz5.f0.f302826a;
        }
    }
}
