package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class i10 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z10 f112889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.y f112890e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i10(com.tencent.mm.plugin.finder.live.plugin.z10 z10Var, cm2.y yVar) {
        super(2);
        this.f112889d = z10Var;
        this.f112890e = yVar;
    }

    public static final void a(com.tencent.mm.plugin.finder.live.plugin.z10 z10Var, cm2.y yVar, java.lang.String str, r45.h32 h32Var, int i17, org.json.JSONObject jSONObject) {
        r45.h32 h32Var2;
        int i18;
        com.tencent.mars.xlog.Log.i(z10Var.f115260i, "reserve notice, id:" + yVar.f43408v.getString(4) + ", optype:" + i17);
        com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
        java.lang.String string = h32Var.getString(4);
        if (string == null) {
            string = "";
        }
        r45.h32 e17 = i1Var.e(str, string);
        if (e17 != null) {
            e17.set(1, java.lang.Integer.valueOf(h32Var.getInteger(1)));
        } else {
            java.lang.String string2 = h32Var.getString(4);
            if (string2 != null) {
                i1Var.a(str, string2, h32Var);
            }
        }
        java.lang.String string3 = h32Var.getString(4);
        if (string3 == null) {
            string3 = "";
        }
        java.lang.Integer num = z10Var.f115270v;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(num != null ? num.intValue() : 101);
        gk2.e eVar = z10Var.f115256e;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) eVar.a(mm2.c1.class)).f328846n;
        db2.e5 e5Var = new db2.e5(str, string3, i17, null, null, valueOf, java.lang.Long.valueOf(finderObject != null ? finderObject.getId() : -1L), null, jSONObject != null ? new org.json.JSONObject().put("ActionResult", jSONObject).toString() : null, null, com.tencent.mm.protobuf.g.b(((mm2.e1) eVar.a(mm2.e1.class)).f328985o), null, null, null, 14992, null);
        gm0.j1.d().a(6276, z10Var.f115267s);
        gm0.j1.d().g(e5Var);
        yz5.p pVar = z10Var.f115269u;
        if (pVar != null) {
            i18 = 1;
            h32Var2 = h32Var;
            pVar.invoke(java.lang.Boolean.valueOf(i17 == 1), h32Var2);
        } else {
            h32Var2 = h32Var;
            i18 = 1;
        }
        h32Var2.set(i18, java.lang.Integer.valueOf(h32Var2.getInteger(i18)));
        z10Var.b(yVar);
    }

    public static final void d(com.tencent.mm.plugin.finder.live.plugin.z10 z10Var, r45.h32 h32Var, cm2.y yVar, int i17, java.lang.String str) {
        org.json.JSONObject jSONObject;
        kotlinx.coroutines.r2 r2Var = z10Var.f115265q;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        h32Var.set(1, 1);
        if (z10Var.f115268t) {
            bf2.c cVar = bf2.c.f19598a;
            gk2.e eVar = z10Var.f115256e;
            java.lang.String string = yVar.f43408v.getString(4);
            if (string == null) {
                string = "";
            }
            java.lang.String str2 = string;
            r45.ov2 a17 = zl2.t.a(h32Var);
            jSONObject = bf2.c.c(cVar, eVar, 4, 1, str2, 0, a17 != null ? a17.getString(1) : null, i17 != 1 ? 0 : 1, 0, null, 0, sb1.a.CTRL_INDEX, null);
        } else {
            jSONObject = null;
        }
        a(z10Var, yVar, str, h32Var, 2, jSONObject);
        android.view.ViewGroup viewGroup = z10Var.f115261m;
        db5.t7.i(viewGroup.getContext(), viewGroup.getContext().getString(com.tencent.mm.R.string.cn8), com.tencent.mm.R.raw.icons_filled_done);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        int i18;
        android.view.ViewGroup viewGroup;
        org.json.JSONObject jSONObject;
        r45.h32 h32Var;
        r45.ov2 a17;
        xu2.u uVar;
        xu2.v vVar;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.finder.live.plugin.z10 z10Var = this.f112889d;
        yz5.l lVar = z10Var.f115258g;
        cm2.y yVar = this.f112890e;
        if (lVar != null) {
            lVar.invoke(yVar);
        }
        gk2.e eVar = z10Var.f115256e;
        if (((mm2.c1) eVar.a(mm2.c1.class)).M7()) {
            qo0.c cVar = z10Var.f115257f;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
            if (k0Var != null && (uVar = (xu2.u) k0Var.getPlugin(xu2.u.class)) != null && (vVar = uVar.f457232r) != null) {
                vVar.b();
            }
        }
        r45.h32 h32Var2 = z10Var.f115266r;
        if (h32Var2 == null) {
            h32Var2 = yVar.f43408v;
        }
        java.lang.String str = ((mm2.c1) eVar.a(mm2.c1.class)).f328852o;
        android.view.ViewGroup viewGroup2 = z10Var.f115261m;
        if (intValue != -1) {
            h32Var2.set(1, 0);
            if (intValue == 1) {
                if (z10Var.f115268t) {
                    bf2.c cVar2 = bf2.c.f19598a;
                    gk2.e eVar2 = z10Var.f115256e;
                    java.lang.String string = yVar.f43408v.getString(4);
                    java.lang.String str2 = string == null ? "" : string;
                    r45.ov2 a18 = zl2.t.a(h32Var2);
                    jSONObject = bf2.c.c(cVar2, eVar2, 3, 1, str2, 0, a18 != null ? a18.getString(1) : null, intValue2 == 1 ? 1 : 0, 0, null, 0, sb1.a.CTRL_INDEX, null);
                } else {
                    jSONObject = null;
                }
                i18 = 1;
                viewGroup = viewGroup2;
                a(this.f112889d, this.f112890e, str, h32Var2, 1, jSONObject);
                if (intValue2 == 0 && (h32Var = z10Var.f115266r) != null) {
                    if (!zl2.t.e(h32Var)) {
                        h32Var = null;
                    }
                    if (h32Var != null && (a17 = zl2.t.a(h32Var)) != null) {
                        if (!com.tencent.mm.plugin.finder.assist.o7.a(a17)) {
                            a17 = null;
                        }
                        if (a17 != null) {
                            r45.l1 l1Var = (r45.l1) a17.getCustom(19);
                            if ((l1Var != null && (com.tencent.mm.plugin.finder.assist.a.a(l1Var) ^ true)) && z10Var.f115268t) {
                                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                                java.lang.String string2 = h32Var.getString(4);
                                java.lang.String string3 = a17.getString(1);
                                r0Var.getClass();
                                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                ml2.f4 f4Var = ml2.f4.f327431e;
                                jSONObject2.put("commerceAction", 1013);
                                if (string2 == null) {
                                    string2 = "";
                                }
                                jSONObject2.put("noticeid", string2);
                                if (string3 == null) {
                                    string3 = "";
                                }
                                jSONObject2.put("coupon_id", string3);
                                ml2.r0.hj(r0Var, ml2.b4.f327264s, java.lang.String.valueOf(jSONObject2), 0L, null, null, null, null, null, 252, null);
                            }
                            com.tencent.mm.plugin.finder.view.ed edVar = com.tencent.mm.plugin.finder.view.ed.f131999a;
                            android.content.Context context = z10Var.f115255d;
                            java.lang.String string4 = h32Var.getString(3);
                            i17 = 0;
                            long integer = h32Var.getInteger(0) * 1000;
                            java.lang.String string5 = h32Var.getString(4);
                            if (string5 == null) {
                                string5 = "";
                            }
                            com.tencent.mm.plugin.finder.view.ed.b(edVar, context, h32Var, string4, integer, kz5.b0.c(new com.tencent.mm.plugin.finder.view.dd(a17, string5)), ((mm2.c1) eVar.a(mm2.c1.class)).f328852o, false, null, new com.tencent.mm.plugin.finder.live.plugin.v10(z10Var, h32Var, a17), 192, null);
                        }
                    }
                }
                i17 = 0;
            } else {
                i17 = 0;
                i18 = 1;
                viewGroup = viewGroup2;
            }
            if ((h32Var2.getInteger(9) == i18 ? i18 : i17) != 0) {
                java.lang.String string6 = h32Var2.getString(8);
                java.lang.String str3 = string6 == null ? "" : string6;
                java.lang.String string7 = h32Var2.getString(4);
                pq5.g l17 = new db2.b2(str3, null, null, 0L, 0L, string7 == null ? "" : string7, 1, false, 158, null).l();
                android.content.Context context2 = viewGroup.getContext();
                kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f((com.tencent.mm.ui.MMActivity) context2);
                l17.K(new com.tencent.mm.plugin.finder.live.plugin.k10(z10Var, str));
            }
        } else if (intValue2 != 0) {
            d(z10Var, h32Var2, yVar, intValue2, str);
        } else {
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0(viewGroup2.getContext(), 1, true);
            com.tencent.mm.plugin.finder.live.plugin.z10 z10Var2 = this.f112889d;
            k0Var2.f211872n = new com.tencent.mm.plugin.finder.live.plugin.g10(z10Var2);
            k0Var2.f211881s = new com.tencent.mm.plugin.finder.live.plugin.h10(z10Var2, h32Var2, this.f112890e, intValue2, str);
            k0Var2.v();
        }
        return jz5.f0.f302826a;
    }
}
