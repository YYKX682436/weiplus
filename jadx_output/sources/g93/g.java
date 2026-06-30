package g93;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g93.j f269778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g93.j jVar) {
        super(1);
        this.f269778d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.e0)) {
            g93.j jVar = this.f269778d;
            jVar.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("goToRoomMember() called with: roomId = ");
            java.lang.String userName = ((wi5.e0) dVar).f446287b;
            sb6.append(userName);
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, sb6.toString());
            ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
            java.util.List m17 = c01.v1.m(userName);
            if (!com.tencent.mm.sdk.platformtools.t8.L0(m17)) {
                java.lang.String r17 = c01.z1.r();
                kotlin.jvm.internal.o.d(m17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : m17) {
                    if (c01.e2.J((java.lang.String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (!((java.lang.String) next).equals(r17)) {
                        arrayList2.add(next);
                    }
                }
                android.content.Intent intent = new android.content.Intent();
                android.app.Activity context = jVar.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                kotlin.jvm.internal.o.g(userName, "userName");
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                java.lang.String obj3 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, c01.a2.e(userName), i65.a.h(context, com.tencent.mm.R.dimen.f479897ia)).toString();
                if (obj3 == null) {
                    obj3 = "";
                }
                intent.putExtra("titile", obj3 + ' ' + jVar.getActivity().getString(com.tencent.mm.R.string.n76, java.lang.Integer.valueOf(arrayList2.size())));
                intent.putExtra("list_attr", 64);
                intent.putExtra("always_select_contact", (java.lang.String) ((jz5.n) jVar.f269783f).getValue());
                intent.putExtra("need_show_all_selected", true);
                intent.putExtra("all_selected_checked", false);
                intent.putExtra("key_confirm_menu_name", jVar.getActivity().getResources().getString(com.tencent.mm.R.string.f490352sk));
                pf5.j0.a(intent, cj5.b.class);
                pf5.j0.a(intent, cj5.x4.class);
                pf5.j0.a(intent, cj5.d1.class);
                pf5.j0.a(intent, j93.l1.class);
                pf5.j0.a(intent, cj5.w2.class);
                pf5.j0.a(intent, cj5.l2.class);
                intent.putExtra("KEY_NEED_SEAR_HEADER", false);
                intent.putExtra("custom_contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList2, ","));
                bh5.c cVar = new bh5.c();
                cVar.d(intent);
                androidx.appcompat.app.AppCompatActivity activity = jVar.getActivity();
                bh5.d dVar2 = cVar.f20922a;
                dVar2.f20924a = activity;
                dVar2.f20927d.A(true);
                cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
                cVar.h(1);
                androidx.appcompat.app.AppCompatActivity activity2 = jVar.getActivity();
                com.tencent.mm.ui.MMActivity mMActivity = activity2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity2 : null;
                if (mMActivity != null) {
                    mMActivity.hideVKB();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
