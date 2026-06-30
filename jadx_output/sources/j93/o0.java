package j93;

/* loaded from: classes.dex */
public final class o0 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j93.r0 f298467a;

    public o0(j93.r0 r0Var) {
        this.f298467a = r0Var;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        int i18;
        j75.f stateCenter;
        java.lang.String stringExtra;
        java.util.ArrayList arrayList;
        j75.f stateCenter2;
        wi5.n0 n0Var;
        java.util.ArrayList arrayList2;
        j93.r0 r0Var = this.f298467a;
        if (intent == null || (stringExtra = intent.getStringExtra("KSelectUserList")) == null) {
            i18 = 0;
        } else {
            java.util.List f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
            com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) r0Var.f298488d).getValue()).k();
            kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
            if (a17 == null || (arrayList2 = a17.f152065o) == null) {
                arrayList = new java.util.ArrayList();
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (((ri5.j) next).f396126w) {
                        arrayList3.add(next);
                    }
                }
                arrayList = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
                java.util.Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    arrayList.add(((ri5.j) it6.next()).f396111f);
                }
            }
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = r0Var.P6();
            java.util.Set set = (P6 == null || (stateCenter2 = P6.getStateCenter()) == null || (n0Var = (wi5.n0) stateCenter2.getState()) == null) ? kz5.r0.f314002d : n0Var.Q;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj : f07) {
                if (true ^ arrayList.contains((java.lang.String) obj)) {
                    arrayList4.add(obj);
                }
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator it7 = arrayList4.iterator();
            while (it7.hasNext()) {
                java.lang.Object next2 = it7.next();
                java.lang.String userName = (java.lang.String) next2;
                kotlin.jvm.internal.o.g(userName, "userName");
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
                if ((n17 != null && n17.r2() && !n17.o2()) && !set.contains(userName)) {
                    arrayList5.add(next2);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PlusMenuLabelUIC", "startForResult:size:" + f07.size() + " contactList:" + arrayList5.size() + " newUserList:" + arrayList4.size() + " oldUserNameList:" + arrayList.size() + " excludeSize:" + set.size());
            j93.r0.T6(r0Var, arrayList5);
            i18 = arrayList5.size();
        }
        if (intent != null) {
            int intExtra = intent.getIntExtra("INTENT_KEY_SIZE", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.PlusMenuLabelUIC", "onImportContactFromChatRoomClick: count:" + intExtra);
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = r0Var.P6();
            if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
                return;
            }
            stateCenter.B3(new wi5.b0(intExtra, i18));
        }
    }
}
