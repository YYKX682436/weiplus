package eg4;

/* loaded from: classes11.dex */
public class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.s1 f252743d;

    public j1(eg4.t1 t1Var, eg4.s1 s1Var) {
        this.f252743d = s1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        eg4.s1 s1Var = this.f252743d;
        s1Var.f252800i.setSingleLine(false);
        s1Var.f252801j.setVisibility(8);
        com.tencent.mm.autogen.mmdata.rpt.NewFriendAssistActionStruct newFriendAssistActionStruct = new com.tencent.mm.autogen.mmdata.rpt.NewFriendAssistActionStruct();
        newFriendAssistActionStruct.f59674d = s1Var.f252803l.getVisibility() == 0 ? 1L : 2L;
        int[] iArr = s1Var.f252806o;
        newFriendAssistActionStruct.f59675e = iArr[0];
        newFriendAssistActionStruct.f59676f = iArr[1];
        newFriendAssistActionStruct.f59677g = iArr[2];
        newFriendAssistActionStruct.f59678h = 5L;
        newFriendAssistActionStruct.f59679i = newFriendAssistActionStruct.b(dm.i4.COL_USERNAME, s1Var.f252807p, true);
        newFriendAssistActionStruct.k();
        newFriendAssistActionStruct.o();
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
