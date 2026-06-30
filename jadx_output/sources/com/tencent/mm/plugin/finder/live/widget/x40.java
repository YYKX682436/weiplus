package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class x40 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q50 f120287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f120288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.re2 f120289c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f120290d;

    public x40(com.tencent.mm.plugin.finder.live.widget.q50 q50Var, boolean z17, r45.re2 re2Var, boolean z18) {
        this.f120287a = q50Var;
        this.f120288b = z17;
        this.f120289c = re2Var;
        this.f120290d = z18;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        byte[] byteArrayExtra;
        if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("KEY_PARAMS_WHITE_LIST")) == null) {
            return;
        }
        r45.re2 re2Var = new r45.re2();
        re2Var.parseFrom(byteArrayExtra);
        com.tencent.mm.plugin.finder.live.widget.q50 q50Var = this.f120287a;
        r45.re2 re2Var2 = q50Var.f119504z1;
        re2Var2.getList(2).clear();
        re2Var2.getList(1).clear();
        re2Var2.getList(0).clear();
        re2Var2.getList(2).addAll(re2Var.getList(2));
        re2Var2.getList(1).addAll(re2Var.getList(1));
        re2Var2.getList(0).addAll(re2Var.getList(0));
        boolean z17 = this.f120288b;
        r45.re2 re2Var3 = this.f120289c;
        if (z17) {
            if (re2Var3 != null) {
                java.util.LinkedList list = re2Var.getList(0);
                kotlin.jvm.internal.o.f(list, "getChatroom_id_list(...)");
                pm0.v.d0(list, new com.tencent.mm.plugin.finder.live.widget.u40(re2Var3));
                java.util.LinkedList list2 = re2Var.getList(1);
                kotlin.jvm.internal.o.f(list2, "getUsername_list(...)");
                pm0.v.d0(list2, new com.tencent.mm.plugin.finder.live.widget.v40(re2Var3));
                java.util.LinkedList list3 = re2Var.getList(2);
                kotlin.jvm.internal.o.f(list3, "getContact_list(...)");
                pm0.v.d0(list3, new com.tencent.mm.plugin.finder.live.widget.w40(re2Var3));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add white-list, chatroom_id_list = ");
            java.util.LinkedList list4 = re2Var.getList(0);
            kotlin.jvm.internal.o.f(list4, "getChatroom_id_list(...)");
            sb6.append(kz5.n0.g0(list4, "|", null, null, 0, null, null, 62, null));
            sb6.append(", username_list = ");
            java.util.LinkedList list5 = re2Var.getList(1);
            kotlin.jvm.internal.o.f(list5, "getUsername_list(...)");
            sb6.append(kz5.n0.g0(list5, "|", null, null, 0, null, null, 62, null));
            sb6.append(", contact_list = ");
            java.util.LinkedList list6 = re2Var.getList(2);
            kotlin.jvm.internal.o.f(list6, "getContact_list(...)");
            sb6.append(kz5.n0.g0(list6, "|", null, null, 0, null, null, 62, null));
            sb6.append(", ");
            com.tencent.mars.xlog.Log.i("FinderLivingWhiteListPanel", sb6.toString());
        } else if (this.f120290d) {
            if (re2Var3 != null) {
                java.util.LinkedList list7 = re2Var3.getList(0);
                kotlin.jvm.internal.o.f(list7, "getChatroom_id_list(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list7) {
                    if (!re2Var.getList(0).contains((java.lang.String) obj)) {
                        arrayList.add(obj);
                    }
                }
                re2Var.set(0, new java.util.LinkedList(arrayList));
                java.util.LinkedList list8 = re2Var3.getList(1);
                kotlin.jvm.internal.o.f(list8, "getUsername_list(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list8) {
                    if (!re2Var.getList(1).contains((java.lang.String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                re2Var.set(1, new java.util.LinkedList(arrayList2));
                java.util.LinkedList list9 = re2Var3.getList(2);
                kotlin.jvm.internal.o.f(list9, "getContact_list(...)");
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj3 : list9) {
                    if (!re2Var.getList(2).contains((java.lang.String) obj3)) {
                        arrayList3.add(obj3);
                    }
                }
                re2Var.set(2, new java.util.LinkedList(arrayList3));
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("remove white-list, chatroom_id_list = ");
            java.util.LinkedList list10 = re2Var.getList(0);
            kotlin.jvm.internal.o.f(list10, "getChatroom_id_list(...)");
            sb7.append(kz5.n0.g0(list10, "|", null, null, 0, null, null, 62, null));
            sb7.append(", username_list = ");
            java.util.LinkedList list11 = re2Var.getList(1);
            kotlin.jvm.internal.o.f(list11, "getUsername_list(...)");
            sb7.append(kz5.n0.g0(list11, "|", null, null, 0, null, null, 62, null));
            sb7.append(", contact_list = ");
            java.util.LinkedList list12 = re2Var.getList(2);
            kotlin.jvm.internal.o.f(list12, "getContact_list(...)");
            sb7.append(kz5.n0.g0(list12, "|", null, null, 0, null, null, 62, null));
            sb7.append(", ");
            com.tencent.mars.xlog.Log.i("FinderLivingWhiteListPanel", sb7.toString());
        }
        r45.re2 re2Var4 = q50Var.f119503y1;
        if (re2Var4 == null) {
            q50Var.f119503y1 = re2Var;
        } else {
            if (re2Var4 != null) {
                re2Var4.set(0, re2Var.getList(0));
            }
            r45.re2 re2Var5 = q50Var.f119503y1;
            if (re2Var5 != null) {
                re2Var5.set(1, re2Var.getList(1));
            }
            r45.re2 re2Var6 = q50Var.f119503y1;
            if (re2Var6 != null) {
                re2Var6.set(2, re2Var.getList(2));
            }
        }
        q50Var.i0();
    }
}
