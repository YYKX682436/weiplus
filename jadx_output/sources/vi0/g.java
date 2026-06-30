package vi0;

/* loaded from: classes2.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f437253d;

    /* renamed from: e, reason: collision with root package name */
    public int f437254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437255f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437256g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437257h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437258i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f437255f = str;
        this.f437256g = str2;
        this.f437257h = str3;
        this.f437258i = str4;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vi0.g(this.f437255f, this.f437256g, this.f437257h, this.f437258i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vi0.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f437254e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getImageFile(");
            java.lang.String username = this.f437255f;
            sb6.append(username);
            sb6.append(", ");
            java.lang.String str2 = this.f437256g;
            sb6.append(str2);
            sb6.append(", ");
            java.lang.String str3 = this.f437257h;
            sb6.append(str3);
            sb6.append(", ");
            java.lang.String str4 = this.f437258i;
            sb6.append(str4);
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderDataSource", sb6.toString());
            r45.mb4 mb4Var = new r45.mb4();
            mb4Var.set(9, com.tencent.mm.sdk.platformtools.w2.a(str2));
            mb4Var.set(0, str2);
            mb4Var.set(18, str3);
            mb4Var.set(17, str4);
            mb4Var.set(1, str2);
            mb4Var.set(19, str3);
            java.lang.String string = mb4Var.getString(1);
            if (string == null || (str = com.tencent.mm.sdk.platformtools.w2.b(string.getBytes())) == null) {
                str = "";
            }
            mb4Var.set(46, str);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            ya2.l lVar = ya2.l.f460502a;
            com.tencent.mm.plugin.finder.storage.y90 y90Var = com.tencent.mm.plugin.finder.storage.y90.f128355e;
            kotlin.jvm.internal.o.g(username, "username");
            mn2.u0 u0Var = new mn2.u0(mb4Var, y90Var, username);
            this.f437253d = u0Var;
            this.f437254e = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(u0Var);
            vi0.e eVar = new vi0.e(rVar);
            a17.getClass();
            a17.f447876g = eVar;
            a17.f447879j = new vi0.f(rVar);
            a17.d();
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
