package st2;

/* loaded from: classes3.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f412223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.k0 f412225f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(st2.h1 h1Var, cm2.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f412224e = h1Var;
        this.f412225f = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new st2.b0(this.f412224e, this.f412225f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((st2.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        st2.h1 h1Var;
        java.lang.String str;
        java.lang.Class cls;
        cm2.k0 k0Var;
        java.lang.Object g17;
        r45.ie ieVar;
        r45.du5 du5Var;
        java.lang.String str2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f412223d;
        cm2.k0 k0Var2 = this.f412225f;
        st2.h1 h1Var2 = this.f412224e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zl2.r4 r4Var = zl2.r4.f473950a;
            android.content.Context context = h1Var2.f412333d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r4Var.h3(context, true);
            dk2.q4 q4Var = dk2.q4.f233938a;
            android.content.Context context2 = h1Var2.f412333d.getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            gk2.e eVar = h1Var2.f412335f;
            boolean w17 = h1Var2.w();
            boolean z17 = ((mm2.f6) h1Var2.f412335f.a(mm2.f6.class)).f329033g;
            long j17 = ((mm2.e1) h1Var2.f412335f.a(mm2.e1.class)).f328988r.getLong(0);
            long j18 = ((mm2.e1) h1Var2.f412335f.a(mm2.e1.class)).f328983m;
            java.lang.String str3 = ((mm2.e1) h1Var2.f412335f.a(mm2.e1.class)).f328984n;
            java.lang.String str4 = ((mm2.c1) h1Var2.f412335f.a(mm2.c1.class)).f328852o;
            byte[] bArr = ((mm2.e1) h1Var2.f412335f.a(mm2.e1.class)).f328985o;
            java.lang.String str5 = ((mm2.c1) h1Var2.f412335f.a(mm2.c1.class)).P3;
            java.lang.String str6 = k0Var2.f43362x;
            java.lang.String str7 = ((mm2.c1) h1Var2.f412335f.a(mm2.c1.class)).f328844m5;
            this.f412223d = 1;
            h1Var = h1Var2;
            str = "getContext(...)";
            cls = mm2.f6.class;
            k0Var = k0Var2;
            g17 = q4Var.g((com.tencent.mm.ui.MMActivity) context2, eVar, w17, z17, j17, j18, str3, str4, bArr, str5, str6, 3, str7, (r37 & 8192) != 0 ? java.lang.Boolean.TRUE : null, this);
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            g17 = obj;
            h1Var = h1Var2;
            str = "getContext(...)";
            cls = mm2.f6.class;
            k0Var = k0Var2;
        }
        jz5.l lVar = (jz5.l) g17;
        zl2.r4 r4Var2 = zl2.r4.f473950a;
        st2.h1 h1Var3 = h1Var;
        android.content.Context context3 = h1Var3.f412333d.getContext();
        kotlin.jvm.internal.o.f(context3, str);
        r4Var2.h3(context3, false);
        if (((java.lang.Boolean) lVar.f302833d).booleanValue()) {
            mm2.f6 f6Var = (mm2.f6) h1Var3.f412335f.a(cls);
            java.lang.String string = k0Var.f43360v.getString(20);
            if (string == null) {
                string = "";
            }
            f6Var.U = string;
            h1Var3.d(java.lang.Boolean.FALSE);
        } else {
            r45.dv1 dv1Var = (r45.dv1) lVar.f302834e;
            if (dv1Var != null && (ieVar = (r45.ie) dv1Var.getCustom(0)) != null && (du5Var = ieVar.f376960e) != null && (str2 = du5Var.f372756d) != null) {
                db5.t7.g(h1Var3.f412333d.getContext(), str2);
            }
            h1Var3.G();
            com.tencent.mars.xlog.Log.w("Finder.LiveShoppingListPlugin", "get shop shelf failed on gotouse");
        }
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Fj((ml2.r0) c17, ml2.f4.D, this.f412225f, "0", null, 8, null);
        return jz5.f0.f302826a;
    }
}
