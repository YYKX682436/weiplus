package gk5;

/* loaded from: classes9.dex */
public final class a0 extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new ld5.b();
    }

    @Override // m50.x
    public void h7(java.lang.String str) {
        if (gk5.b0.a((ld5.b) c7())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ForwardMultiUIC", "handleClawBotForward: picture paths mode, not supported");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str == null ? "" : str);
        X6(arrayList);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleClawBotForward: toUser=");
        sb6.append(str);
        sb6.append(", talker=");
        ld5.b bVar = (ld5.b) c7();
        sb6.append(bVar.getString(bVar.f43702d + 1));
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMultiUIC", sb6.toString());
    }

    @Override // m50.x
    public void i7() {
        if (gk5.b0.a((ld5.b) c7())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ForwardMultiUIC", "handleOtherAppsForward: picture paths mode, not supported");
        } else {
            super.i7();
        }
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        kotlin.jvm.internal.o.g(action, "action");
        if (gk5.b0.a((ld5.b) c7())) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList k17 = ((ld5.b) c7()).k();
        if (k17 != null) {
            java.util.Iterator it = k17.iterator();
            while (it.hasNext()) {
                long longValue = ((java.lang.Number) it.next()).longValue();
                pt0.e0 e0Var = pt0.f0.f358209b1;
                ld5.b bVar = (ld5.b) c7();
                com.tencent.mm.storage.f9 k18 = e0Var.k(bVar.getString(bVar.f43702d + 1), longValue);
                if (k18 != null) {
                    arrayList.add(k18);
                }
            }
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((gk5.m1) pf5.z.f353948a.a(activity).a(gk5.m1.class)).V6(arrayList, com.tencent.mm.ui.chatting.hd.d(action.f454741b), 1);
        return true;
    }

    @Override // m50.x
    public void l7() {
        java.util.ArrayList arrayList;
        if (gk5.b0.a((ld5.b) c7())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ForwardMultiUIC", "handleYuanBaoForward: picture paths mode, not supported");
            return;
        }
        java.util.LinkedList k17 = ((ld5.b) c7()).k();
        if (k17 == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = k17.iterator();
            while (it.hasNext()) {
                long longValue = ((java.lang.Number) it.next()).longValue();
                pt0.e0 e0Var = pt0.f0.f358209b1;
                ld5.b bVar = (ld5.b) c7();
                com.tencent.mm.storage.f9 k18 = e0Var.k(bVar.getString(bVar.f43702d + 1), longValue);
                if (k18 != null) {
                    arrayList2.add(k18);
                }
            }
            if (!(!arrayList2.isEmpty())) {
                arrayList2 = null;
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ForwardMultiUIC", "handleYuanBaoForward: msgList is null or empty");
            return;
        }
        ld5.b bVar2 = (ld5.b) c7();
        java.lang.String string = bVar2.getString(bVar2.f43702d + 1);
        ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).fj(getContext(), arrayList, string != null ? ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(string) : null, true, new gk5.z(this));
    }

    @Override // m50.x
    public boolean m7() {
        if (gk5.b0.a((ld5.b) c7())) {
            return false;
        }
        return super.m7();
    }

    @Override // m50.x
    public void n7() {
        ot0.f3 f3Var;
        java.lang.ref.WeakReference weakReference = com.tencent.mm.ui.chatting.x3.f206228a.f206203c;
        if (weakReference == null || (f3Var = (ot0.f3) weakReference.get()) == null) {
            return;
        }
        f3Var.f2(ot0.e3.trans);
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x03f8, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0((r0 == null || (r0 = (s05.d) r0.getCustom(r0.f432315e + 39)) == null || (r0 = r0.s()) == null) ? null : r0.k()) != false) goto L190;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0771 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0753 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023d  */
    @Override // m50.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o7(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 1924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gk5.a0.o7(java.lang.String):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.f490491wk);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        ld5.b bVar = (ld5.b) c7();
        int i17 = 0;
        if (gk5.b0.a(bVar)) {
            java.util.LinkedList l17 = bVar.l();
            if (l17 != null) {
                i17 = l17.size();
            }
        } else {
            java.util.LinkedList k17 = bVar.k();
            if (k17 != null) {
                i17 = k17.size();
            }
        }
        if (i17 > 0) {
            string = string + ' ' + getResources().getString(com.tencent.mm.R.string.f492837i25, java.lang.Integer.valueOf(i17));
        }
        ((ld5.b) c7()).n(string);
    }
}
