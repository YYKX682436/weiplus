package dn0;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f241830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn0.j f241831e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f241832f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f241833g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(dn0.j jVar, long j17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f241831e = jVar;
        this.f241832f = j17;
        this.f241833g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        dn0.f fVar = new dn0.f(this.f241831e, this.f241832f, this.f241833g, continuation);
        fVar.f241830d = obj;
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dn0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f241830d;
        dn0.j jVar = this.f241831e;
        long j17 = this.f241832f;
        yz5.l lVar = this.f241833g;
        synchronized (jVar) {
            if (!jVar.f241845e) {
                com.tencent.mars.xlog.Log.e(jVar.f241841a, "ScoreHandleInit is false");
                return jz5.f0.f302826a;
            }
            int GetNoteInfoNum = jVar.f241842b.GetNoteInfoNum(j17);
            if (GetNoteInfoNum <= 0) {
                com.tencent.mars.xlog.Log.e(jVar.f241841a, "GetNoteNums error: " + GetNoteInfoNum);
                if (lVar != null) {
                    lVar.invoke(null);
                }
                return jz5.f0.f302826a;
            }
            int[] iArr = new int[GetNoteInfoNum];
            int[] iArr2 = new int[GetNoteInfoNum];
            int[] iArr3 = new int[GetNoteInfoNum];
            int[] iArr4 = new int[1];
            int GetNoteInfo = jVar.f241842b.GetNoteInfo(j17, iArr, iArr2, new int[GetNoteInfoNum], iArr3, iArr4);
            java.lang.String str = jVar.f241841a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GetNoteInfo res: ");
            sb6.append(GetNoteInfo);
            sb6.append(" numArray: ");
            sb6.append(iArr4[0]);
            sb6.append(" num: ");
            sb6.append(GetNoteInfoNum);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (GetNoteInfo != 0) {
                if (lVar != null) {
                    lVar.invoke(null);
                }
                return jz5.f0.f302826a;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(GetNoteInfoNum);
            for (int i17 = 0; i17 < GetNoteInfoNum; i17++) {
                arrayList.add(new jh2.b());
            }
            for (int i18 = 0; i18 < GetNoteInfoNum; i18++) {
                ((jh2.b) arrayList.get(i18)).f299803a = iArr[i18];
                ((jh2.b) arrayList.get(i18)).f299804b = iArr2[i18];
                ((jh2.b) arrayList.get(i18)).f299805c = iArr[i18] + iArr2[i18];
                ((jh2.b) arrayList.get(i18)).f299806d = iArr3[i18];
            }
            if (kotlinx.coroutines.z0.h(y0Var) && lVar != null) {
                lVar.invoke(arrayList);
            }
            return jz5.f0.f302826a;
        }
    }
}
