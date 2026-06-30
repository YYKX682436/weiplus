package gk5;

/* loaded from: classes9.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f272698d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f272699e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f272700f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f272701g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f272702h;

    /* renamed from: i, reason: collision with root package name */
    public int f272703i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f272704m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272705n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ gk0.k f272706o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ gk0.h f272707p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f272708q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f272709r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ gk5.r f272710s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272711t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String str, gk0.k kVar, gk0.h hVar, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, gk5.r rVar, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f272705n = str;
        this.f272706o = kVar;
        this.f272707p = hVar;
        this.f272708q = h0Var;
        this.f272709r = h0Var2;
        this.f272710s = rVar;
        this.f272711t = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        gk5.q qVar = new gk5.q(this.f272705n, this.f272706o, this.f272707p, this.f272708q, this.f272709r, this.f272710s, this.f272711t, continuation);
        qVar.f272704m = obj;
        return qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gk5.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [jz5.f0, java.lang.Object] */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        kotlin.jvm.internal.h0 h0Var2;
        gk5.r rVar;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f272703i;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f272704m;
            i95.m c17 = i95.n0.c(gk0.n0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            g75.z x66 = gk0.n0.x6((gk0.n0) c17, this.f272705n, this.f272706o, null, null, 8, null);
            x66.l("Common_HttpParams", this.f272707p);
            gk0.b Ni = ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ni();
            this.f272704m = y0Var;
            this.f272698d = x66;
            kotlin.jvm.internal.h0 h0Var3 = this.f272708q;
            this.f272699e = h0Var3;
            kotlin.jvm.internal.h0 h0Var4 = this.f272709r;
            this.f272700f = h0Var4;
            gk5.r rVar2 = this.f272710s;
            this.f272701g = rVar2;
            java.lang.String str2 = this.f272711t;
            this.f272702h = str2;
            this.f272703i = 1;
            java.lang.Object a17 = Ni.a(x66, this);
            if (a17 == aVar) {
                return aVar;
            }
            h0Var = h0Var3;
            obj = a17;
            h0Var2 = h0Var4;
            rVar = rVar2;
            str = str2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f272702h;
            rVar = (gk5.r) this.f272701g;
            h0Var2 = (kotlin.jvm.internal.h0) this.f272700f;
            h0Var = (kotlin.jvm.internal.h0) this.f272699e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        ?? r47 = jz5.f0.f302826a;
        byte[] bArr = null;
        if (bitmap != null) {
            h0Var.f310123d = bitmap;
            rVar.getClass();
            if (!bitmap.isRecycled()) {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            }
            h0Var2.f310123d = bArr;
            rVar.q7(str, bArr);
            bArr = r47;
        }
        if (bArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ForwardLiteAppUIC", "[processTransfer] load from network, bitmap is null");
            rVar.q7(str, (byte[]) h0Var2.f310123d);
        }
        return r47;
    }
}
