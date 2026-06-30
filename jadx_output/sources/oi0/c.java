package oi0;

/* loaded from: classes11.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f345581d;

    /* renamed from: e, reason: collision with root package name */
    public int f345582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345583f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f345584g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f345583f = str;
        this.f345584g = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new oi0.c(this.f345583f, this.f345584g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((oi0.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f345582e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "sns", null, false, null, 28, null);
            l1Var.a(kz5.c0.i(new si0.n1(), new si0.o1(), new si0.t0(), new si0.y0(), new si0.p1()));
            java.util.Map l17 = kz5.c1.l(new jz5.l("source_text", this.f345583f));
            this.f345581d = l1Var;
            this.f345582e = 1;
            if (l1Var.o("translateScreen", l17, this) == aVar) {
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
            l1Var = (pi0.l1) this.f345581d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        flutterPageStyle.f68125o = false;
        flutterPageStyle.f68117d = 1;
        flutterPageStyle.f68118e = -1;
        android.content.Context context = this.f345584g;
        this.f345581d = null;
        this.f345582e = 2;
        s17 = l1Var.s(context, flutterPageStyle, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, this);
        if (s17 == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
