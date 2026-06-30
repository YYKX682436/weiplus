package xx3;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f458013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f458014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f458015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f458016g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f458017h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f458018i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f458019m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f458020n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f458021o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f458022p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f458023q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, int i18, long j17, java.lang.String str, int i19, int i27, java.lang.String str2, int i28, int i29, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f458014e = i17;
        this.f458015f = i18;
        this.f458016g = j17;
        this.f458017h = str;
        this.f458018i = i19;
        this.f458019m = i27;
        this.f458020n = str2;
        this.f458021o = i28;
        this.f458022p = i29;
        this.f458023q = str3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xx3.g(this.f458014e, this.f458015f, this.f458016g, this.f458017h, this.f458018i, this.f458019m, this.f458020n, this.f458021o, this.f458022p, this.f458023q, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xx3.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f458013d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveExclusiveRingtone: opType=");
                int i18 = this.f458014e;
                sb6.append(i18);
                sb6.append(" ,useRingtone=");
                int i19 = this.f458015f;
                sb6.append(i19);
                sb6.append(", objectId=");
                long j17 = this.f458016g;
                sb6.append(j17);
                sb6.append(", nonceId=");
                java.lang.String str = this.f458017h;
                sb6.append(str);
                sb6.append(", start=");
                int i27 = this.f458018i;
                sb6.append(i27);
                sb6.append(", end=");
                int i28 = this.f458019m;
                sb6.append(i28);
                sb6.append(", username=");
                java.lang.String str2 = this.f458020n;
                sb6.append(str2);
                sb6.append(",musicUrl = ");
                int i29 = this.f458021o;
                sb6.append(i29);
                sb6.append(", extBusinessScene:");
                int i37 = this.f458022p;
                sb6.append(i37);
                com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneSettingHelper", sb6.toString());
                t45.b1 b1Var = new t45.b1();
                b1Var.f415530g = i18;
                b1Var.f415527d = i19;
                t45.l0 l0Var = new t45.l0();
                l0Var.f415603f = i28;
                l0Var.f415602e = i27;
                if (i29 == 0) {
                    l0Var.f415601d = 2;
                } else {
                    l0Var.f415601d = 1;
                }
                t45.f fVar = new t45.f();
                fVar.f415550e = str;
                fVar.f415549d = j17;
                l0Var.f415605h = fVar;
                t45.e0 e0Var = new t45.e0();
                e0Var.f415547d = i29;
                l0Var.f415604g = e0Var;
                b1Var.f415528e = l0Var;
                b1Var.f415529f = str2;
                b1Var.f415532i = i37;
                b1Var.f415533m = this.f458023q;
                ux3.l lVar = new ux3.l(b1Var);
                this.f458013d = 1;
                obj = rm0.h.a(lVar, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return new rm0.i(true, (t45.c1) obj);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RingtoneSettingHelper", "error happened in save ringtone ");
            return new rm0.i(false, null, 2, null);
        }
    }
}
