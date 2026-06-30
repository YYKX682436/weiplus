package id2;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.l f290540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j01 f290541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.y6 f290542f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.neattextview.textview.view.NeatTextView f290543g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f290544h;

    public e(id2.l lVar, r45.j01 j01Var, mm2.y6 y6Var, com.tencent.neattextview.textview.view.NeatTextView neatTextView, android.widget.Button button) {
        this.f290540d = lVar;
        this.f290541e = j01Var;
        this.f290542f = y6Var;
        this.f290543g = neatTextView;
        this.f290544h = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.eq1 eq1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$beforeGotoLive$2$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        id2.l lVar = this.f290540d;
        intent.putExtra("KEY_PARAMS_FIRST_ENTER_WHITE_LIST", lVar.f290651e);
        intent.putExtra("KEY_PARAMS_WHITE_LIST_UNSELECT", lVar.f290652f);
        intent.putExtra("KEY_PARAMS_WHITE_LIST_CHATROOM_ID", lVar.f290650d);
        r45.j01 j01Var = this.f290541e;
        intent.putExtra("KEY_PARAMS_IS_SUPER_FANS_CLUB", (j01Var == null || (eq1Var = j01Var.A) == null) ? false : eq1Var.getBoolean(10));
        boolean z17 = lVar.f290651e;
        if (z17) {
            lVar.f290651e = !z17;
        }
        mm2.y6 y6Var = this.f290542f;
        y6Var.c(intent);
        intent.setClass(lVar.getContext(), com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI.class);
        androidx.appcompat.app.AppCompatActivity activity = lVar.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        ((com.tencent.mm.ui.bd) ((com.tencent.mm.ui.MMFragmentActivity) activity).startActivityForResult(intent)).f197877a = new id2.d(lVar, y6Var, this.f290543g, this.f290544h);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$beforeGotoLive$2$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
