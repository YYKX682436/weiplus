package rx3;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f401000d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f401001e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f401002f;

    /* renamed from: g, reason: collision with root package name */
    public int f401003g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ox3.a f401004h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vx3.i f401005i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401006m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ox3.a aVar, vx3.i iVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f401004h = aVar;
        this.f401005i = iVar;
        this.f401006m = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rx3.a(this.f401004h, this.f401005i, this.f401006m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx3.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        vx3.i iVar;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f401003g;
        ox3.a aVar2 = this.f401004h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qx3.b bVar = qx3.b.f367341a;
            long itemId = aVar2.getItemId();
            this.f401003g = 1;
            obj = bVar.b(itemId, this.f401005i, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = (vx3.i) this.f401002f;
                aVar2 = (ox3.a) this.f401001e;
                str = (java.lang.String) this.f401000d;
                kotlin.ResultKt.throwOnFailure(obj);
                mx3.i0.l(str, iVar, aVar2.f349721d.f415591g);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        vx3.i iVar2 = (vx3.i) obj;
        if (iVar2 != null) {
            mx3.i0 i0Var = mx3.i0.f332577a;
            java.lang.String str2 = this.f401006m;
            this.f401000d = str2;
            this.f401001e = aVar2;
            this.f401002f = iVar2;
            this.f401003g = 2;
            if (i0Var.a(str2, iVar2, true, this) == aVar) {
                return aVar;
            }
            iVar = iVar2;
            str = str2;
            mx3.i0.l(str, iVar, aVar2.f349721d.f415591g);
        }
        return jz5.f0.f302826a;
    }
}
