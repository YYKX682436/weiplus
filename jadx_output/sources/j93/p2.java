package j93;

/* loaded from: classes.dex */
public final class p2 extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f298476d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f298477e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f298478f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f298479g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f298480h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f298476d = jz5.h.b(new j93.o2(this));
        this.f298477e = jz5.h.b(new j93.k2(this));
        this.f298478f = jz5.h.b(new j93.n2(this));
    }

    public static final void U6(j93.p2 p2Var) {
        java.util.ArrayList arrayList;
        p2Var.getClass();
        android.content.Intent intent = new android.content.Intent(p2Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
        intent.putExtra("titile", p2Var.getContext().getString(com.tencent.mm.R.string.mbj));
        intent.putExtra("list_type", 0);
        intent.putExtra("list_attr", 64);
        intent.putExtra("menu_mode", 2);
        intent.putExtra("key_confirm_menu_name", p2Var.getContext().getString(com.tencent.mm.R.string.mbi));
        intent.putExtra("recommend_chatroom", true);
        intent.putExtra("need_show_expand_btn", true);
        intent.putExtra("need_show_multiSelect_bottom", true);
        intent.putExtra("key_label_click_source", ((java.lang.Number) ((jz5.n) p2Var.f298478f).getValue()).intValue());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(c01.z1.r());
        arrayList2.add("weixin");
        arrayList2.add("filehelper");
        arrayList2.addAll(c01.e2.i());
        arrayList2.addAll(c01.e2.h());
        arrayList2.addAll(((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ri());
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = p2Var.W6().k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        if (a17 != null && (arrayList = a17.f152065o) != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((ri5.j) it.next()).f396111f);
            }
            arrayList2.addAll(arrayList3);
            intent.putExtra("INTENT_KEY_ORIGIN_USER_COUNT", arrayList3.size());
        }
        if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList2)) {
            intent.putExtra("block_contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList2, ","));
        }
        pf5.j0.a(intent, cj5.d1.class);
        pf5.j0.a(intent, aj5.g1.class);
        pf5.j0.a(intent, aj5.i.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, cj5.b3.class);
        pf5.j0.a(intent, j93.v2.class);
        intent.putExtra("key_confirm_menu_name", p2Var.getActivity().getResources().getString(com.tencent.mm.R.string.f492366mb4));
        intent.putExtra("key_confirm_menu_color", 0);
        pf5.j0.a(intent, cj5.n1.class);
        pf5.j0.a(intent, cj5.o.class);
        pf5.j0.a(intent, j93.r0.class);
        intent.putExtra("INTENT_KEY_PAGE_SESSION_ID", en1.a.a() + '_' + c01.id.c());
        intent.putExtra("INTENT_KEY_SELECT_CONTACT_FROM_SCENE", 1);
        intent.putExtra("INTENT_KEY_SELECT_CONTACT_FROM_SCENE_SUB_TYPE", 23);
        pf5.j0.a(intent, bj5.r0.class);
        p2Var.getActivity().startActivityForResult(intent, 1);
    }

    public static final void V6(j93.p2 p2Var, boolean z17) {
        em.l2 W6 = p2Var.W6();
        if (W6.f254568y == null) {
            W6.f254568y = (android.widget.FrameLayout) W6.f254544a.findViewById(com.tencent.mm.R.id.gbu);
        }
        W6.f254568y.setVisibility(z17 ? 0 : 8);
    }

    public final em.l2 W6() {
        return (em.l2) ((jz5.n) this.f298476d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        jz5.f0 f0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectLabelFooterViewUIC", "onActivityResult() called with: requestCode = " + i17 + ", resultCode = " + i18 + ", data = " + intent);
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 && i18 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                return;
            }
            java.util.List O1 = com.tencent.mm.sdk.platformtools.t8.O1(stringExtra, ",");
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectLabelFooterViewUIC", "onActivityResult: userNameList:" + O1.size());
            java.util.LinkedList linkedList = new java.util.LinkedList();
            boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(O1);
            jz5.g gVar = this.f298477e;
            if (!L0) {
                for (java.lang.Object obj : O1) {
                    kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                    java.lang.String str = (java.lang.String) obj;
                    if (!kotlin.jvm.internal.o.b(str, c01.z1.r())) {
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
                        if (n17 != null) {
                            java.lang.String D0 = n17.D0();
                            java.lang.String b17 = b93.n.b(D0, (java.lang.String) ((jz5.n) gVar).getValue());
                            com.tencent.mars.xlog.Log.i("MicroMsg.SelectLabelFooterViewUIC", "labels:%s mixLabelIds:%s", D0, b17);
                            if (!r26.i0.p(b17, D0, true)) {
                                r45.gw6 gw6Var = new r45.gw6();
                                gw6Var.f375581d = n17.d1();
                                gw6Var.f375582e = b17;
                                linkedList.add(gw6Var);
                            }
                            f0Var = jz5.f0.f302826a;
                        } else {
                            f0Var = null;
                        }
                        if (f0Var == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.SelectLabelFooterViewUIC", "doUpdateContactList: contact is null");
                        }
                    }
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                this.f298479g = ((cj5.o) pf5.z.f353948a.a(activity).a(cj5.o.class)).T6();
                r45.ip4 ip4Var = new r45.ip4();
                ip4Var.f377256e = linkedList;
                ip4Var.f377255d = linkedList.size();
                ip4Var.b().l().K(new j93.h2(O1, this));
            }
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("label_id", (java.lang.String) ((jz5.n) gVar).getValue());
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectLabelFooterViewUIC", "setResult: labelId = " + ((java.lang.String) ((jz5.n) gVar).getValue()));
            activity2.setResult(-1, intent2);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new j93.m2(this));
    }
}
