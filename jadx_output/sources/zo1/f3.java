package zo1;

/* loaded from: classes5.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.v f474605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI f474606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f474607f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474608g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(wo1.v vVar, com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI, com.tencent.mm.ui.widget.dialog.u3 u3Var, java.lang.String str) {
        super(0);
        this.f474605d = vVar;
        this.f474606e = selectContactUI;
        this.f474607f = u3Var;
        this.f474608g = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f474607f;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI = this.f474606e;
        wo1.v vVar = this.f474605d;
        if (vVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectContactUI", "Fail to create adapter by class=" + this.f474608g);
            u3Var.dismiss();
            int[] iArr = com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI.f92846x;
            selectContactUI.U6();
        } else {
            androidx.recyclerview.widget.RecyclerView recyclerView = selectContactUI.f92851h;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("contactRv");
                throw null;
            }
            recyclerView.setAdapter(vVar);
            android.widget.TextView textView = selectContactUI.f92849f;
            if (textView == null) {
                kotlin.jvm.internal.o.o("sortTypeTv");
                throw null;
            }
            textView.setText(vVar.getSortTypeDescription());
            vVar.setOnMoreIconClicked(new zo1.l3(selectContactUI));
            wo1.l selectedListAdapter = vVar.getSelectedListAdapter();
            androidx.recyclerview.widget.RecyclerView recyclerView2 = selectContactUI.f92852i;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("avatarRv");
                throw null;
            }
            recyclerView2.setAdapter(selectedListAdapter);
            selectedListAdapter.f447980d = new zo1.m3(selectContactUI);
            selectedListAdapter.f447981e = new zo1.n3(selectContactUI, vVar);
            android.widget.TextView textView2 = selectContactUI.f92856p;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("selectAllTv");
                throw null;
            }
            textView2.setOnClickListener(new zo1.o3(vVar));
            android.widget.Button button = selectContactUI.f92854n;
            if (button == null) {
                kotlin.jvm.internal.o.o("finishBtn");
                throw null;
            }
            button.setOnClickListener(new zo1.p3(selectContactUI, vVar));
            java.util.ArrayList arrayList = selectContactUI.f92862v;
            vVar.setInitialSelection(arrayList);
            arrayList.clear();
            if (vVar.getSelectedList().isEmpty()) {
                android.widget.LinearLayout linearLayout = selectContactUI.f92853m;
                if (linearLayout == null) {
                    kotlin.jvm.internal.o.o("avatarLl");
                    throw null;
                }
                linearLayout.setVisibility(8);
            }
            selectContactUI.f92861u = vVar;
            u3Var.dismiss();
        }
        return jz5.f0.f302826a;
    }
}
