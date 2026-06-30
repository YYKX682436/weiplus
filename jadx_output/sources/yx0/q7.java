package yx0;

/* loaded from: classes5.dex */
public final class q7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f467585f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f467586g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f467587h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f467588i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f467589m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f467590n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r45.to0 f467591o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r45.xy6 f467592p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r45.b70 f467593q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r45.mi0 f467594r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f467595s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ bs0.h f467596t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ java.util.List f467597u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(yx0.b8 b8Var, java.lang.String str, long j17, int i17, long j18, com.tencent.mm.protobuf.g gVar, boolean z17, boolean z18, r45.to0 to0Var, r45.xy6 xy6Var, r45.b70 b70Var, r45.mi0 mi0Var, int i18, bs0.h hVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467583d = b8Var;
        this.f467584e = str;
        this.f467585f = j17;
        this.f467586g = i17;
        this.f467587h = j18;
        this.f467588i = gVar;
        this.f467589m = z17;
        this.f467590n = z18;
        this.f467591o = to0Var;
        this.f467592p = xy6Var;
        this.f467593q = b70Var;
        this.f467594r = mi0Var;
        this.f467595s = i18;
        this.f467596t = hVar;
        this.f467597u = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.q7(this.f467583d, this.f467584e, this.f467585f, this.f467586g, this.f467587h, this.f467588i, this.f467589m, this.f467590n, this.f467591o, this.f467592p, this.f467593q, this.f467594r, this.f467595s, this.f467596t, this.f467597u, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.q7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yx0.p7 p7Var;
        jz5.f0 f0Var;
        pp0.p0 p0Var;
        rx0.h hVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int ordinal = this.f467583d.f467192s.ordinal();
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        switch (ordinal) {
            case 0:
            case 3:
            case 4:
            case 5:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingCorePlugin", "switchTemplate >> but state is " + this.f467583d.f467192s);
                yz5.l lVar = this.f467583d.f467190q;
                if (lVar != null) {
                    java.lang.String str = this.f467584e;
                    lVar.invoke(str != null ? str : "kEmptyTemplateId");
                }
                return f0Var2;
            case 1:
                kotlinx.coroutines.l.f(null, new yx0.h7(this.f467583d, null), 1, null);
                break;
            case 6:
                yz5.l lVar2 = this.f467583d.f467190q;
                if (lVar2 != null) {
                    java.lang.String str2 = this.f467584e;
                    if (str2 == null) {
                        str2 = "kEmptyTemplateId";
                    }
                    lVar2.invoke(str2);
                }
                kotlinx.coroutines.l.f(null, new yx0.j7(this.f467583d, null), 1, null);
                break;
            case 7:
                kotlinx.coroutines.l.f(null, new yx0.i7(this.f467583d, null), 1, null);
                break;
            case 8:
                kotlinx.coroutines.l.f(null, new yx0.k7(this.f467583d, null), 1, null);
                break;
            case 9:
                kotlinx.coroutines.l.f(null, new yx0.l7(this.f467583d, null), 1, null);
                break;
            case 10:
                kotlinx.coroutines.l.f(null, new yx0.m7(this.f467583d, null), 1, null);
                break;
            case 11:
                kotlinx.coroutines.l.f(null, new yx0.n7(this.f467583d, null), 1, null);
                break;
        }
        pp0.p0 p0Var2 = this.f467583d.K;
        if (p0Var2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "switchTemplate >> but setup is error");
            yz5.l lVar3 = this.f467583d.f467190q;
            if (lVar3 != null) {
                java.lang.String str3 = this.f467584e;
                lVar3.invoke(str3 != null ? str3 : "kEmptyTemplateId");
            }
            return f0Var2;
        }
        this.f467583d.q0(yx0.v.f467699m);
        int i17 = kotlinx.coroutines.r0.N0;
        yx0.p7 p7Var2 = new yx0.p7(kotlinx.coroutines.q0.f310567d);
        yx0.b8 b8Var = this.f467583d;
        java.lang.String str4 = this.f467584e;
        if (str4 != null) {
            f0Var = f0Var2;
            p7Var = p7Var2;
            p0Var = p0Var2;
            hVar = new rx0.f(str4, this.f467585f, this.f467586g, this.f467587h, this.f467588i, this.f467589m, this.f467590n, this.f467591o, this.f467592p, this.f467593q, this.f467594r);
        } else {
            p7Var = p7Var2;
            f0Var = f0Var2;
            p0Var = p0Var2;
            hVar = rx0.e.f400915a;
        }
        b8Var.S = hVar;
        yx0.b8 b8Var2 = this.f467583d;
        b8Var2.f467194u = kotlinx.coroutines.l.d(b8Var2.L, p7Var, null, new yx0.o7(b8Var2, p0Var, this.f467584e, this.f467585f, this.f467586g, this.f467587h, this.f467588i, this.f467595s, this.f467596t, this.f467589m, this.f467590n, this.f467597u, null), 2, null);
        return f0Var;
    }
}
