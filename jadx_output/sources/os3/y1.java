package os3;

/* loaded from: classes8.dex */
public class y1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailAddrListUI f348254d;

    public y1(com.tencent.mm.plugin.qqmail.ui.MailAddrListUI mailAddrListUI) {
        this.f348254d = mailAddrListUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.qqmail.ui.MailAddrListUI mailAddrListUI = this.f348254d;
        os3.f2 f2Var = mailAddrListUI.f154874h;
        ks3.u uVar = (ks3.u) f2Var.f348079f.f154875i.get(i17 - mailAddrListUI.f154872f.getHeaderViewsCount());
        java.lang.String str2 = uVar.f311751f;
        java.util.HashMap hashMap = (java.util.HashMap) f2Var.f348078e;
        if (hashMap.containsKey(str2)) {
            hashMap.remove(str2);
        } else {
            hashMap.put(str2, uVar);
        }
        f2Var.notifyDataSetChanged();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(mailAddrListUI.getString(com.tencent.mm.R.string.hjk));
        if (((java.util.HashMap) mailAddrListUI.f154874h.f348078e).size() > 0) {
            str = "(" + ((java.util.HashMap) mailAddrListUI.f154874h.f348078e).size() + ")";
        } else {
            str = "";
        }
        sb6.append(str);
        mailAddrListUI.setMMTitle(sb6.toString());
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
