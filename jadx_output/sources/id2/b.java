package id2;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f290484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.l f290485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f290486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f290487g;

    public b(kotlin.jvm.internal.c0 c0Var, id2.l lVar, android.content.Intent intent, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f290484d = c0Var;
        this.f290485e = lVar;
        this.f290486f = intent;
        this.f290487g = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$beforeGotoLive$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = 1;
        this.f290484d.f310112d = true;
        id2.m.f290662a.b("room_live_start", "153");
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        ml2.y3 y3Var = ml2.y3.f328274i;
        j0Var.ck(y3Var);
        id2.l lVar = this.f290485e;
        java.lang.String str = lVar.f290650d;
        if (!(str == null || str.length() == 0)) {
            int wi6 = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str);
            com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
            java.lang.String r17 = c01.z1.r();
            if (z07 != null) {
                boolean L0 = z07.L0(r17);
                boolean G0 = z07.G0(r17);
                if (!L0) {
                    if (G0) {
                        i17 = 2;
                    }
                }
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var = ml2.j0.f327583i;
                y4Var.a("roomid", str);
                y4Var.a("roomrole", java.lang.String.valueOf(i17));
                y4Var.a("roomcount", java.lang.String.valueOf(wi6));
            }
            i17 = 3;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var2 = ml2.j0.f327583i;
            y4Var2.a("roomid", str);
            y4Var2.a("roomrole", java.lang.String.valueOf(i17));
            y4Var2.a("roomcount", java.lang.String.valueOf(wi6));
        }
        android.content.Intent intent = this.f290486f;
        intent.putExtra("KEY_PARAMS_SOURCE_TYPE", y3Var);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "goLive fromChatRoomId:" + lVar.f290650d);
        intent.putExtra("KEY_PARAMS_FROM_CHATROOM_ID", lVar.f290650d);
        this.f290487g.B();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$beforeGotoLive$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
