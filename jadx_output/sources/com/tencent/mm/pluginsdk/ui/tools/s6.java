package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public final class s6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.pluginsdk.ui.tools.s6 f191898a = new com.tencent.mm.pluginsdk.ui.tools.s6();

    public static final com.tencent.mm.plugin.scanner.CodePointRect b(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
        am.cq cqVar;
        java.util.ArrayList arrayList;
        if (recogQBarOfImageFileResultEvent == null || (cqVar = recogQBarOfImageFileResultEvent.f54661g) == null || (arrayList = cqVar.f6380m) == null) {
            return null;
        }
        return (com.tencent.mm.plugin.scanner.CodePointRect) arrayList.get(0);
    }

    public final java.util.ArrayList a(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
        am.cq cqVar;
        java.util.ArrayList arrayList;
        am.cq cqVar2;
        am.cq cqVar3;
        am.cq cqVar4;
        am.cq cqVar5;
        am.cq cqVar6;
        am.cq cqVar7;
        am.cq cqVar8;
        am.cq cqVar9;
        am.cq cqVar10;
        am.cq cqVar11;
        am.cq cqVar12;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        if (recogQBarOfImageFileResultEvent != null && (cqVar12 = recogQBarOfImageFileResultEvent.f54661g) != null && (arrayList2 = cqVar12.f6369b) != null) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (next instanceof java.lang.String) {
                    arrayList4.add(next);
                }
            }
        }
        int i17 = 1;
        int i18 = (recogQBarOfImageFileResultEvent == null || (cqVar11 = recogQBarOfImageFileResultEvent.f54661g) == null) ? 1 : cqVar11.f6374g;
        if (recogQBarOfImageFileResultEvent != null && (cqVar10 = recogQBarOfImageFileResultEvent.f54661g) != null) {
            i17 = cqVar10.f6375h;
        }
        int i19 = 0;
        boolean z17 = (recogQBarOfImageFileResultEvent == null || (cqVar9 = recogQBarOfImageFileResultEvent.f54661g) == null) ? false : cqVar9.f6379l;
        java.lang.String str = (recogQBarOfImageFileResultEvent == null || (cqVar8 = recogQBarOfImageFileResultEvent.f54661g) == null) ? null : cqVar8.f6368a;
        if (str == null) {
            str = "";
        }
        for (java.lang.Object obj : arrayList4) {
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = new com.tencent.mm.plugin.scanner.ImageQBarDataBean();
            imageQBarDataBean.f158619d = (java.lang.String) obj;
            com.tencent.mm.pluginsdk.ui.tools.s6 s6Var = f191898a;
            imageQBarDataBean.f158622g = s6Var.h((recogQBarOfImageFileResultEvent == null || (cqVar7 = recogQBarOfImageFileResultEvent.f54661g) == null) ? null : cqVar7.f6371d, i19);
            imageQBarDataBean.f158620e = s6Var.g((recogQBarOfImageFileResultEvent == null || (cqVar6 = recogQBarOfImageFileResultEvent.f54661g) == null) ? null : cqVar6.f6370c, i19);
            imageQBarDataBean.f158621f = s6Var.g((recogQBarOfImageFileResultEvent == null || (cqVar5 = recogQBarOfImageFileResultEvent.f54661g) == null) ? null : cqVar5.f6372e, i19);
            imageQBarDataBean.f158628p = s6Var.g((recogQBarOfImageFileResultEvent == null || (cqVar4 = recogQBarOfImageFileResultEvent.f54661g) == null) ? null : cqVar4.f6373f, i19);
            imageQBarDataBean.f158623h = s6Var.f((recogQBarOfImageFileResultEvent == null || (cqVar3 = recogQBarOfImageFileResultEvent.f54661g) == null) ? null : cqVar3.f6376i, i19) / i18;
            imageQBarDataBean.f158624i = s6Var.f((recogQBarOfImageFileResultEvent == null || (cqVar2 = recogQBarOfImageFileResultEvent.f54661g) == null) ? null : cqVar2.f6377j, i19) / i17;
            imageQBarDataBean.f158625m = i18;
            imageQBarDataBean.f158626n = i17;
            imageQBarDataBean.f158627o = str;
            imageQBarDataBean.f158629q = z17;
            imageQBarDataBean.f158630r = (recogQBarOfImageFileResultEvent == null || (cqVar = recogQBarOfImageFileResultEvent.f54661g) == null || (arrayList = cqVar.f6380m) == null) ? null : (com.tencent.mm.plugin.scanner.CodePointRect) arrayList.get(i19);
            arrayList3.add(imageQBarDataBean);
            i19 = i27;
        }
        return arrayList3;
    }

    public final int c(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
        am.cq cqVar;
        int g17 = g((recogQBarOfImageFileResultEvent == null || (cqVar = recogQBarOfImageFileResultEvent.f54661g) == null) ? null : cqVar.f6370c, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", "getEventCodeType " + g17);
        return g17;
    }

    public final int d(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
        am.cq cqVar;
        int g17 = g((recogQBarOfImageFileResultEvent == null || (cqVar = recogQBarOfImageFileResultEvent.f54661g) == null) ? null : cqVar.f6372e, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", "getEventCodeVersion " + g17);
        return g17;
    }

    public final java.lang.String e(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
        am.cq cqVar;
        java.lang.String h17 = h((recogQBarOfImageFileResultEvent == null || (cqVar = recogQBarOfImageFileResultEvent.f54661g) == null) ? null : cqVar.f6369b, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", "getEventResult ".concat(h17));
        return h17;
    }

    public final float f(java.util.ArrayList arrayList, int i17) {
        float f17 = 0.0f;
        if (!(arrayList == null || arrayList.isEmpty()) && i17 >= 0 && i17 < arrayList.size()) {
            try {
                java.lang.Object obj = arrayList.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                f17 = ((java.lang.Float) obj).floatValue();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", e17, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", "getValueFloat:" + f17 + "   index:" + i17);
        return f17;
    }

    public final int g(java.util.ArrayList arrayList, int i17) {
        int i18 = 0;
        if (!(arrayList == null || arrayList.isEmpty()) && i17 >= 0 && i17 < arrayList.size()) {
            try {
                java.lang.Object obj = arrayList.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                i18 = ((java.lang.Integer) obj).intValue();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", e17, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", "getValueInt:" + i18 + "   index:" + i17);
        return i18;
    }

    public final java.lang.String h(java.util.ArrayList arrayList, int i17) {
        java.lang.String str = "";
        if (!(arrayList == null || arrayList.isEmpty()) && i17 >= 0 && i17 < arrayList.size()) {
            try {
                java.lang.Object obj = arrayList.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                str = (java.lang.String) obj;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", e17, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", "getValueString:" + str + "   index:" + i17);
        return str;
    }
}
