package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class r1 extends com.tencent.mm.pluginsdk.ui.tools.s1 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191859o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI, com.tencent.mm.pluginsdk.ui.tools.a2 adapter) {
        super(fileSelectorUI, adapter);
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f191859o = fileSelectorUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0132, code lost:
    
        if (r15 != 18) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015d, code lost:
    
        if (r14.m() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d0, code lost:
    
        if (r14.m() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d7, code lost:
    
        if (r14.m() == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(com.tencent.mm.pluginsdk.ui.tools.r1 r24) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.tools.r1.d(com.tencent.mm.pluginsdk.ui.tools.r1):int");
    }

    public final java.util.List e(java.util.List list, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            o72.r2 r2Var = (o72.r2) it.next();
            int i19 = r2Var.field_type;
            if (i19 == 18 || i19 == 14) {
                try {
                    java.util.LinkedList linkedList = r2Var.field_favProto.f370964f;
                    kotlin.jvm.internal.o.f(linkedList, "getDataList(...)");
                    for (int i27 = r2Var.field_type == 18 ? 1 : 0; i27 < linkedList.size(); i27++) {
                        r45.gp0 gp0Var = (r45.gp0) linkedList.get(i27);
                        if (gp0Var.I == i17) {
                            o72.r2 clone = r2Var.clone();
                            clone.field_type = i18;
                            clone.B1 = true;
                            clone.C1 = r2Var;
                            clone.D1 = r2Var.field_localId + '_' + gp0Var.T;
                            clone.E1 = gp0Var.T;
                            r45.bq0 a17 = q72.c.a(r2Var.field_favProto);
                            clone.field_favProto = a17;
                            a17.f370964f = new java.util.LinkedList();
                            clone.field_favProto.f370964f.add(gp0Var);
                            clone.field_favProto.p(gp0Var.f375404d);
                            r45.hp0 hp0Var = gp0Var.J1;
                            if (hp0Var != null) {
                                if (i17 == 5) {
                                    clone.field_favProto.r(hp0Var.f376355f);
                                } else if (i17 == 6) {
                                    clone.field_favProto.j(hp0Var.f376354e);
                                }
                            }
                            arrayList.add(clone);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FileSelectorUI", "getSearchList() [%s] Exception:%s %s", java.lang.Integer.valueOf(i17), e17.getClass().getSimpleName(), e17.getMessage());
                }
            } else {
                arrayList.add(r2Var);
            }
        }
        return arrayList;
    }
}
