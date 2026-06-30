package vi5;

/* loaded from: classes.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi5.h f437628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f437629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ri5.j f437630f;

    public g(vi5.h hVar, in5.s0 s0Var, ri5.j jVar) {
        this.f437628d = hVar;
        this.f437629e = s0Var;
        this.f437630f = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/item/extension/conversation/SelectChatroomConversationListItemExtension$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f437629e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String userName = this.f437630f.f396111f;
        this.f437628d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectChatroomConversationListItemExtension", "goToRoomMember() called with: roomId = " + userName);
        ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
        java.util.List m17 = c01.v1.m(userName);
        if (!com.tencent.mm.sdk.platformtools.t8.L0(m17)) {
            android.content.Intent intent = new android.content.Intent();
            kotlin.jvm.internal.o.g(userName, "userName");
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String obj = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, c01.a2.e(userName), i65.a.h(context, com.tencent.mm.R.dimen.f479897ia)).toString();
            if (obj == null) {
                obj = "";
            }
            intent.putExtra("titile", obj);
            pf5.j0.a(intent, cj5.b.class);
            pf5.j0.a(intent, yi5.c.class);
            pf5.j0.a(intent, cj5.w2.class);
            pf5.j0.a(intent, cj5.l2.class);
            intent.putExtra("KEY_NEED_SEAR_HEADER", false);
            java.lang.String r17 = c01.z1.r();
            kotlin.jvm.internal.o.d(m17);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = m17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                java.lang.String str = (java.lang.String) next;
                kotlin.jvm.internal.o.d(str);
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                if (n17 != null && n17.r2()) {
                    arrayList2.add(next);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                java.lang.Object next2 = it6.next();
                if (!((java.lang.String) next2).equals(r17)) {
                    arrayList3.add(next2);
                }
            }
            intent.putExtra("custom_contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList3, ","));
            bh5.c cVar = new bh5.c();
            cVar.f20922a.f20924a = context;
            cVar.d(intent);
            cVar.e(true);
            cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
            cVar.b(com.tencent.mm.view.ChatRoomPreviewHalfScreen.class);
            cVar.g();
        }
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/item/extension/conversation/SelectChatroomConversationListItemExtension$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
