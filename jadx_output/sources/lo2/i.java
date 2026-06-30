package lo2;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI f320130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f320131e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI finderMemberFanListUI, com.tencent.mm.modelbase.f fVar) {
        super(0);
        this.f320130d = finderMemberFanListUI;
        this.f320131e = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = ((r45.bs0) this.f320131e.f70618d).f371019d;
        int i17 = com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI.B;
        com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI finderMemberFanListUI = this.f320130d;
        finderMemberFanListUI.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fans contact ");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberFanListUI", sb6.toString());
        java.util.ArrayList arrayList = finderMemberFanListUI.f121395y;
        if (linkedList != null) {
            arrayList.addAll(linkedList);
            lo2.g gVar = finderMemberFanListUI.f121394x;
            gVar.getClass();
            java.util.ArrayList arrayList2 = gVar.f320123e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            gVar.notifyDataSetChanged();
        }
        int size = arrayList.size();
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberFanListUI", "update title %s", java.lang.Integer.valueOf(size));
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberFanListUI", "update title %s", f0Var);
        if (size == 0) {
            finderMemberFanListUI.setMMTitle(finderMemberFanListUI.getString(com.tencent.mm.R.string.elg));
        } else {
            finderMemberFanListUI.setMMTitle(finderMemberFanListUI.getString(com.tencent.mm.R.string.em6, java.lang.Integer.valueOf(size)));
        }
        if (size == 0) {
            android.widget.TextView textView = finderMemberFanListUI.f121393w;
            if (textView == null) {
                kotlin.jvm.internal.o.o("emptyTip");
                throw null;
            }
            textView.setVisibility(0);
            android.widget.TextView textView2 = finderMemberFanListUI.f121393w;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("emptyTip");
                throw null;
            }
            textView2.setText(finderMemberFanListUI.getString(com.tencent.mm.R.string.cug));
        } else {
            android.widget.TextView textView3 = finderMemberFanListUI.f121393w;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("emptyTip");
                throw null;
            }
            textView3.setVisibility(8);
        }
        return f0Var;
    }
}
