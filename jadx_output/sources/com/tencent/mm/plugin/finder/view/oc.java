package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class oc {

    /* renamed from: b, reason: collision with root package name */
    public static rl5.r f132782b;

    /* renamed from: c, reason: collision with root package name */
    public static db5.d5 f132783c;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.oc f132781a = new com.tencent.mm.plugin.finder.view.oc();

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f132784d = jz5.h.b(com.tencent.mm.plugin.finder.view.ic.f132299d);

    public final boolean a() {
        rl5.r rVar = f132782b;
        boolean z17 = true;
        if (rVar != null && rVar.d()) {
            rl5.r rVar2 = f132782b;
            if (rVar2 != null) {
                rVar2.a();
            }
            db5.d5 d5Var = f132783c;
            if (d5Var != null) {
                d5Var.dismiss();
            }
        } else {
            z17 = false;
        }
        f132782b = null;
        return z17;
    }

    public final boolean b() {
        rl5.r rVar = f132782b;
        return rVar != null && rVar.d();
    }

    public final void c(com.tencent.mm.plugin.finder.view.ec ecVar, com.tencent.mm.plugin.finder.view.fc fcVar, dk2.zf zfVar) {
        ml2.g5 g5Var;
        ml2.b5 b5Var;
        int i17 = fcVar.f132101i == 2 ? 2 : 1;
        if (zl2.r4.f473950a.w1()) {
            int ordinal = ecVar.ordinal();
            if (ordinal == 0) {
                b5Var = ml2.b5.f327286e;
            } else if (ordinal == 1) {
                b5Var = ml2.b5.f327287f;
            } else {
                if (ordinal != 2) {
                    throw new jz5.j();
                }
                b5Var = ml2.b5.f327288g;
            }
            ml2.b5 b5Var2 = b5Var;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.j0.Dj((ml2.j0) c17, b5Var2, zfVar, null, 4, null);
            return;
        }
        int ordinal2 = ecVar.ordinal();
        boolean z17 = fcVar.f132096d;
        if (ordinal2 == 0) {
            g5Var = z17 ? ml2.g5.I : ml2.g5.f327481e;
        } else if (ordinal2 == 1) {
            g5Var = ml2.g5.f327482f;
        } else {
            if (ordinal2 != 2) {
                throw new jz5.j();
            }
            g5Var = z17 ? ml2.g5.f327488o : ml2.g5.f327483g;
        }
        if (fcVar.f132098f) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).vj(g5Var, 1, fcVar.f132099g, fcVar.f132100h);
        } else {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Aj(g5Var, zfVar, i17);
        }
    }

    public final void d(int i17, int i18) {
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        gVar.o(ya.b.SOURCE, 1);
        gVar.o("identity", i18);
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        int i19 = 0;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).R6()) {
            i19 = 1;
        }
        gVar.o("display_type", i19 ^ 1);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        if (zl2.r4.f473950a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328347d2, gVar2, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.F2, gVar2, 0L, null, null, null, null, null, 252, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x041a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(db5.n4 r36, db5.t4 r37, android.widget.PopupWindow.OnDismissListener r38, com.tencent.mm.plugin.finder.view.fc r39, com.tencent.mm.plugin.finder.view.dc r40, dk2.zf r41) {
        /*
            Method dump skipped, instructions count: 1473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.oc.e(db5.n4, db5.t4, android.widget.PopupWindow$OnDismissListener, com.tencent.mm.plugin.finder.view.fc, com.tencent.mm.plugin.finder.view.dc, dk2.zf):void");
    }
}
