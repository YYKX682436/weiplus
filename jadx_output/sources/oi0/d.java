package oi0;

/* loaded from: classes11.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f345585d;

    /* renamed from: e, reason: collision with root package name */
    public int f345586e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345587f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345588g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345589h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f345590i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f345587f = str;
        this.f345588g = str2;
        this.f345589h = str3;
        this.f345590i = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new oi0.d(this.f345587f, this.f345588g, this.f345589h, this.f345590i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((oi0.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f345586e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.wechat.aff.sns.h.f217503b.d(c01.z1.r(), com.tencent.mm.vfs.q7.c("sns_aff_db"), com.tencent.mm.vfs.q7.c("sns_aff_publish"));
            com.tencent.wechat.aff.sns.b.f217501b.a();
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "sns", null, false, null, 28, null);
            java.util.Map l17 = kz5.c1.l(new jz5.l("user_name", c01.z1.r()), new jz5.l("client_version", new java.lang.Integer(com.tencent.mm.sdk.platformtools.z.f193112h)), new jz5.l("home_user_name", this.f345587f), new jz5.l("signature", this.f345588g), new jz5.l("from_page", this.f345589h));
            this.f345585d = l1Var;
            this.f345586e = 1;
            if (l1Var.o("userHome", l17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            l1Var = (pi0.l1) this.f345585d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(kz5.c0.i(new si0.n1(), new defpackage.v(), new si0.r1(), new si0.o1(), ((r03.e) ((s03.g) i95.n0.c(s03.g.class))).wi(null), new si0.m1(), new si0.x0(), new si0.n0(), new si0.u1(), new si0.y0(), new si0.p1(), new si0.u0()));
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
        if (((java.lang.Boolean) ((jz5.n) di4.i.f232785d).getValue()).booleanValue()) {
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
            arrayList.add(new yi4.e());
        }
        l1Var.a(arrayList);
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        android.content.Context context = this.f345590i;
        this.f345585d = null;
        this.f345586e = 2;
        s17 = l1Var.s(context, flutterPageStyle, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, this);
        if (s17 == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
