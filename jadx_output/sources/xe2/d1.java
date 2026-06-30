package xe2;

/* loaded from: classes3.dex */
public final class d1 extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xe2.f1 f453848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.c94 f453849c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(xe2.f1 f1Var, r45.c94 c94Var, java.lang.Class cls) {
        super(cls);
        this.f453848b = f1Var;
        this.f453849c = c94Var;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.y23 y23Var;
        r45.hd5 hd5Var;
        r45.y23 y23Var2;
        r45.hd5 hd5Var2;
        qm0.a aVar;
        java.lang.Object obj;
        r45.nt2 nt2Var;
        r45.hd5 hd5Var3;
        r45.hd5 hd5Var4;
        r45.hd5 hd5Var5;
        r45.yy2 result = (r45.yy2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        xe2.f1 f1Var = this.f453848b;
        com.tencent.mars.xlog.Log.i(f1Var.f453860c, "[onPollingSuccess], result:" + pm0.b0.g(result));
        r45.y23 y23Var3 = (r45.y23) result.getCustom(0);
        boolean z17 = (y23Var3 == null || (hd5Var5 = (r45.hd5) y23Var3.getCustom(24)) == null || hd5Var5.getInteger(5) != 1000) ? false : true;
        java.lang.String str = f1Var.f453860c;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "[onPollingSuccess], status is recording, return");
            return;
        }
        r45.y23 y23Var4 = (r45.y23) result.getCustom(0);
        if ((y23Var4 == null || (hd5Var4 = (r45.hd5) y23Var4.getCustom(24)) == null || hd5Var4.getInteger(5) != 2) ? false : true) {
            r45.y23 y23Var5 = (r45.y23) result.getCustom(0);
            int integer = (y23Var5 == null || (hd5Var3 = (r45.hd5) y23Var5.getCustom(24)) == null) ? 0 : hd5Var3.getInteger(3) - hd5Var3.getInteger(2);
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            mm2.f6 f6Var = (mm2.f6) dk2.ef.f233372a.i(mm2.f6.class);
            int integer2 = (f6Var == null || (nt2Var = f6Var.E) == null) ? 0 : nt2Var.getInteger(1);
            r45.y23 y23Var6 = (r45.y23) result.getCustom(0);
            j0Var.Pj(3, integer2, y23Var6 != null ? y23Var6.getLong(0) : 0L, integer);
            dk2.ef.f233392k.f(this.f453849c.getInteger(0));
        }
        java.lang.String string = result.getString(1);
        if (string != null) {
            if (string.length() > 0) {
                com.tencent.mars.xlog.Log.i(str, "update request id: ".concat(string));
                mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
                if (c1Var != null) {
                    c1Var.y9(string);
                }
            }
        }
        mm2.f6 f6Var2 = (mm2.f6) dk2.ef.f233372a.i(mm2.f6.class);
        if (f6Var2 == null || (aVar = f6Var2.f329039o) == null) {
            y23Var = null;
        } else {
            java.util.List b17 = aVar.b(xe2.c1.f453841d);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
            java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                kotlin.jvm.internal.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowShelfProductItem");
                arrayList.add(((cm2.m0) j5Var).f43368v);
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it6.next();
                r45.y23 y23Var7 = (r45.y23) obj;
                r45.y23 y23Var8 = (r45.y23) result.getCustom(0);
                if (y23Var8 != null && y23Var7.getLong(0) == y23Var8.getLong(0)) {
                    break;
                }
            }
            y23Var = (r45.y23) obj;
        }
        if (y23Var != null && (hd5Var = (r45.hd5) y23Var.getCustom(24)) != null) {
            if (!(hd5Var.getInteger(5) == 1000)) {
                hd5Var = null;
            }
            if (hd5Var != null && (y23Var2 = (r45.y23) result.getCustom(0)) != null && (hd5Var2 = (r45.hd5) y23Var2.getCustom(24)) != null) {
                if (!kz5.c0.i(0, 2, 100).contains(java.lang.Integer.valueOf(hd5Var2.getInteger(5)))) {
                    hd5Var2 = null;
                }
                if (hd5Var2 != null) {
                    i95.m c17 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ml2.j0.Qj((ml2.j0) c17, 7, 0, 0L, 0, 12, null);
                    pm0.v.X(xe2.b1.f453838d);
                }
            }
        }
        if (y23Var != null) {
            r45.y23 y23Var9 = (r45.y23) result.getCustom(0);
            y23Var.set(24, y23Var9 != null ? (r45.hd5) y23Var9.getCustom(24) : null);
        }
        mm2.f6 f6Var3 = (mm2.f6) dk2.ef.f233372a.i(mm2.f6.class);
        if (f6Var3 != null) {
            qm0.a value = f6Var3.f329039o;
            kotlin.jvm.internal.o.g(value, "value");
            f6Var3.S6(f6Var3.f329039o);
            f6Var3.f329039o = value;
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            k0Var.statusChange(qo0.b.f365372k2, null);
        }
    }
}
