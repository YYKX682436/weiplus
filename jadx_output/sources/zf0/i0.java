package zf0;

/* loaded from: classes12.dex */
public final class i0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f472445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qi3.d0 f472447f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(zf0.v0 v0Var, qi3.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f472446e = v0Var;
        this.f472447f = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new zf0.i0(this.f472446e, this.f472447f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((zf0.i0) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Long l17;
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f472445d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        qi3.d0 d0Var = this.f472447f;
        zf0.v0 v0Var = this.f472446e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            oi3.h hVar = v0Var.f472563i.f436178e;
            if (hVar == null) {
                d0Var.f363683a = -520009;
                return f0Var;
            }
            java.lang.Integer e17 = qi3.c.e(v0Var, false, 1, null);
            if (e17 != null) {
                d0Var.f363683a = e17.intValue();
                return f0Var;
            }
            t21.v2 e18 = vf0.m3.e(hVar);
            if (e18 == null) {
                d0Var.f363683a = -520009;
                return f0Var;
            }
            android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, e18.d(), false));
            r45.lr lrVar = new r45.lr();
            y15.c n17 = v0Var.f472563i.f436179f.n();
            java.lang.String string = n17.getString(n17.f458922d + 0);
            if (string == null) {
                string = "";
            }
            lrVar.f379765d = string;
            vf0.h3 h3Var = v0Var.f472563i;
            y15.c n18 = h3Var.f436179f.n();
            java.lang.String string2 = n18.getString(n18.f458922d + 1);
            if (string2 == null) {
                string2 = "";
            }
            lrVar.f379766e = string2;
            lrVar.f379767f = 43;
            y15.c n19 = h3Var.f436179f.n();
            lrVar.f379768g = n19.getInteger(n19.f458922d + 8);
            y15.c n27 = h3Var.f436179f.n();
            lrVar.f379769h = n27.getInteger(n27.f458922d + 10);
            y15.c n28 = h3Var.f436179f.n();
            java.lang.String string3 = n28.getString(n28.f458922d + 0);
            if (string3 == null) {
                string3 = "";
            }
            lrVar.f379770i = string3;
            y15.c n29 = h3Var.f436179f.n();
            java.lang.String string4 = n29.getString(n29.f458922d + 3);
            if (string4 == null) {
                string4 = "";
            }
            lrVar.f379771m = string4;
            y15.c n37 = h3Var.f436179f.n();
            lrVar.f379772n = n37.getInteger(n37.f458922d + 11);
            lrVar.f379773o = n07 != null ? n07.outWidth : 0;
            lrVar.f379774p = n07 != null ? n07.outHeight : 0;
            y15.c n38 = h3Var.f436179f.n();
            java.lang.String string5 = n38.getString(n38.f458922d + 18);
            if (string5 == null) {
                string5 = "";
            }
            lrVar.f379775q = string5;
            y15.c n39 = h3Var.f436179f.n();
            java.lang.String string6 = n39.getString(n39.f458922d + 19);
            if (string6 == null) {
                string6 = "";
            }
            lrVar.f379777s = string6;
            java.lang.String r17 = c01.z1.r();
            kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
            vf0.h3 h3Var2 = v0Var.f472563i;
            java.lang.String str2 = h3Var2.f436174a;
            oi3.h hVar2 = h3Var2.f436178e;
            java.lang.String a17 = c01.ia.a(hVar2 != null ? hVar2.getString(hVar2.f345617d + 12) : null);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(v0Var.f472563i.f436174a);
            oi3.h hVar3 = v0Var.f472563i.f436178e;
            if (hVar3 != null) {
                str = str2;
                l17 = new java.lang.Long(hVar3.getLong(hVar3.f345617d + 0));
            } else {
                str = str2;
                l17 = null;
            }
            sb6.append(l17);
            sb6.append('T');
            oi3.h hVar4 = v0Var.f472563i.f436178e;
            sb6.append(hVar4 != null ? new java.lang.Long(hVar4.getLong(hVar4.f345617d + 2)) : null);
            com.tencent.mm.modelbase.i b18 = qi3.m.f363747a.a(new qi3.n(r17, str, str, 0, a17, sb6.toString(), e18.d(), 8, null), 43, new qi3.i(lrVar)).b();
            this.f472445d = 1;
            b17 = rm0.h.b(b18, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            b17 = obj;
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) b17;
        d0Var.f363685c = fVar.f70615a;
        d0Var.f363686d = fVar.f70616b;
        java.lang.String str3 = fVar.f70617c;
        java.lang.String str4 = str3 != null ? str3 : "";
        d0Var.getClass();
        d0Var.f363687e = str4;
        d0Var.f363689g = (r45.ny3) fVar.f70618d;
        com.tencent.mm.modelbase.m1 m1Var = fVar.f70619e;
        d0Var.f363688f = m1Var != null ? m1Var.getType() : 0;
        if (!fVar.b()) {
            d0Var.f363683a = -520004;
            d0Var.f363684b.put("send_cgi_err_type", new java.lang.Integer(fVar.f70615a));
            d0Var.f363684b.put("send_cgi_err_code", new java.lang.Integer(fVar.f70616b));
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.SendVideoTask", v0Var.id() + " sendBypCgi err " + fVar);
        }
        return f0Var;
    }
}
