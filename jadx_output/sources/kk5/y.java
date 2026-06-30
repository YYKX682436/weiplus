package kk5;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.c0 f308701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f308702e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kk5.c0 c0Var, java.util.List list) {
        super(1);
        this.f308701d = c0Var;
        this.f308702e = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List commonChatroomList = (java.util.List) obj;
        kotlin.jvm.internal.o.g(commonChatroomList, "commonChatroomList");
        kk5.c0 c0Var = this.f308701d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = c0Var.f308624e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        c0Var.f308624e = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactCreateChatroomCheckDupUIC", "commonChatroomList: " + commonChatroomList);
        boolean isEmpty = commonChatroomList.isEmpty() ^ true;
        java.util.List list = this.f308702e;
        if (isEmpty) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((java.lang.String) it.next());
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("titile", c0Var.getActivity().getString(com.tencent.mm.R.string.me8));
            intent.putExtra("from_create_group_scene", c0Var.getActivity().getIntent().getIntExtra("from_create_group_scene", 0));
            pf5.j0.a(intent, kk5.h0.class);
            pf5.j0.a(intent, cj5.l4.class);
            pf5.j0.a(intent, aj5.i1.class);
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
            arrayList2.addAll(commonChatroomList);
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactCreateChatroomCheckDupUIC", "tipDuplicateChatroom, chatroomNames: " + arrayList2);
            java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
            arrayList3.addAll(arrayList);
            intent.putStringArrayListExtra("list_attr", arrayList2);
            intent.putStringArrayListExtra("chatroommemberlist", arrayList3);
            androidx.appcompat.app.AppCompatActivity activity = c0Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            intent.putExtra("create_group_session_id", ((aj5.l1) pf5.z.f353948a.a(activity).a(aj5.l1.class)).T6());
            bh5.c cVar = new bh5.c();
            cVar.f20922a.f20924a = c0Var.getActivity();
            cVar.b(com.tencent.mm.plugin.profile.ui.SayHiPictureHalfScreenDialogFragment.class);
            cVar.a(com.tencent.mm.ui.TipUseDuplicateGroupUI.class.getName());
            if (c0Var.getActivity().getIntent().getBooleanExtra("group_select_need_result", false)) {
                intent.putExtra("group_select_need_result", true);
                cVar.d(intent);
                cVar.h(0);
            } else {
                cVar.d(intent);
                cVar.g();
            }
        } else {
            androidx.appcompat.app.AppCompatActivity activity2 = c0Var.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            kk5.h0 h0Var = (kk5.h0) pf5.z.f353948a.a(activity2).a(kk5.h0.class);
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList4.add((java.lang.String) it6.next());
            }
            h0Var.T6(arrayList4);
        }
        return jz5.f0.f302826a;
    }
}
