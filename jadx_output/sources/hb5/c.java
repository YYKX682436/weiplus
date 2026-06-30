package hb5;

/* loaded from: classes11.dex */
public class c implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI f280153d;

    public c(com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI bizChatAtSomeoneUI) {
        this.f280153d = bizChatAtSomeoneUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/bizchat/BizChatAtSomeoneUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI bizChatAtSomeoneUI = this.f280153d;
        if (i17 == 0 && com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI.f197886o) {
            intent.putExtra("Select_Conv_User", bizChatAtSomeoneUI.getString(com.tencent.mm.R.string.a6j, ""));
            intent.putExtra("select_raw_user_name", "notify@all");
        } else {
            s01.a0 a0Var = (s01.a0) bizChatAtSomeoneUI.f197888e.getItem(i17);
            s01.h hVar = bizChatAtSomeoneUI.f197891h;
            java.lang.String v07 = hVar == null ? null : hVar.v0(a0Var.field_userId);
            intent.putExtra("select_raw_user_name", a0Var.field_userId);
            intent.putExtra("Select_Conv_User", v07);
        }
        bizChatAtSomeoneUI.setResult(-1, intent);
        bizChatAtSomeoneUI.finish();
        yj0.a.h(this, "com/tencent/mm/ui/bizchat/BizChatAtSomeoneUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
