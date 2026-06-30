package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final t13.k f138176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.q2 f138177e;

    public s2(com.tencent.mm.plugin.fts.ui.q2 q2Var, t13.k kVar, java.lang.String str) {
        this.f138177e = q2Var;
        this.f138176d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        r45.di6 di6Var;
        com.tencent.mm.plugin.fts.ui.q2 q2Var = this.f138177e;
        boolean z17 = q2Var.I;
        t13.k kVar = this.f138176d;
        if (!z17) {
            java.util.List list = q2Var.f138152q;
            if (((t13.k) ((java.util.LinkedList) list).get(((java.util.LinkedList) list).size() - 1)).getType() == kVar.getType()) {
                q2Var.I = true;
            }
        }
        q2Var.f138153r.C = q2Var.I;
        java.util.Iterator it = q2Var.f138152q.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            i18 = ((t13.k) it.next()).j(i18);
        }
        g23.k kVar2 = q2Var.f138153r;
        ((java.util.ArrayList) kVar2.N).addAll(kVar.h(kVar2.f267937b));
        if ((kVar instanceof j23.y) && !((j23.y) kVar).f297296o) {
            q2Var.f138156u = false;
            q2Var.f138160y = i18;
        }
        if (q2Var.f138156u) {
            int i19 = q2Var.f138159x;
            boolean z18 = (i19 < 0 && q2Var.f138158w < 0) || (i19 >= 0 && q2Var.f138158w >= 0);
            if (!z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMainAdapter", "sugResortCanNotify, relevantSearchUIUnitIdx: %d, chatRoomUIUnitIdx: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(q2Var.f138158w));
            }
            if (z18) {
                q2Var.n(i18);
                q2Var.notifyDataSetChanged();
            }
        }
        q2Var.l(i18, q2Var.I);
        if (q2Var.I) {
            q2Var.f138153r.f267938c = c01.id.c();
        }
        if (q2Var.I) {
            if (i18 == q2Var.f138160y) {
                i17 = 0;
                for (t13.k kVar3 : q2Var.f138152q) {
                    if (kVar3 instanceof j23.y) {
                        ((j23.y) kVar3).f297296o = true;
                        q2Var.f138153r.L = q2Var.r(i17);
                    }
                    i17 = kVar3.j(i17);
                }
                q2Var.f138153r.f(i17);
                q2Var.getClass();
                q2Var.t(true, false);
            } else {
                i17 = 0;
                for (t13.k kVar4 : q2Var.f138152q) {
                    i17 = kVar4.j(i17);
                    if (kVar4 instanceof j23.y) {
                        q2Var.f138153r.L = q2Var.r(i17);
                        j23.y yVar = (j23.y) kVar4;
                        g23.k searchStaticsObj = q2Var.f138153r;
                        kotlin.jvm.internal.o.g(searchStaticsObj, "searchStaticsObj");
                        android.content.Context context = yVar.f414559e;
                        if (context instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) {
                            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity");
                            j75.f stateCenter = ((com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) context).getStateCenter();
                            if (stateCenter != null) {
                                java.lang.String str = yVar.f297294m;
                                if (str == null) {
                                    str = "";
                                }
                                java.lang.String str2 = str;
                                long j17 = yVar.f297295n;
                                java.util.LinkedList linkedList = yVar.f297298q;
                                if (linkedList == null) {
                                    linkedList = new java.util.LinkedList();
                                }
                                stateCenter.B3(new fi0.e(str2, j17, linkedList, yVar.f297301t));
                            }
                        }
                        int i27 = yVar.f297302u != 0 ? 3 : 2;
                        if (yVar.f297298q != null && (!r6.isEmpty())) {
                            java.lang.String str3 = yVar.f297294m;
                            java.util.LinkedList linkedList2 = yVar.f297298q;
                            com.tencent.mm.plugin.fts.ui.widget.o1.a(str3, searchStaticsObj, 0, "", "", "", (linkedList2 == null || (di6Var = (r45.di6) linkedList2.get(0)) == null) ? null : di6Var.f372513e, i27);
                        }
                    }
                }
                q2Var.f138153r.f(i17);
                q2Var.getClass();
                q2Var.t(false, false);
            }
            q2Var.n(i17);
            q2Var.notifyDataSetChanged();
        }
    }
}
