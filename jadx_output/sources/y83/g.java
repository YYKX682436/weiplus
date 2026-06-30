package y83;

/* loaded from: classes14.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI f459985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f459986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f459987f;

    public g(com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI, java.util.ArrayList arrayList, int i17) {
        this.f459985d = kidsWatchLoginCardChooseUI;
        this.f459986e = arrayList;
        this.f459987f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object obj = this.f459986e.get(this.f459987f);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.mm.plugin.kidswatch.model.KidsWatchAcctInfo kidsWatchAcctInfo = (com.tencent.mm.plugin.kidswatch.model.KidsWatchAcctInfo) obj;
        int i17 = com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI.f143111o;
        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI = this.f459985d;
        kidsWatchLoginCardChooseUI.getClass();
        r45.u44 u44Var = new r45.u44();
        u44Var.f387020d = kidsWatchAcctInfo.f143100g;
        u44Var.f387021e = kidsWatchAcctInfo.f143098e;
        u44Var.f387022f = kidsWatchAcctInfo.f143099f;
        u44Var.f387023g = kidsWatchAcctInfo.f143101h;
        u44Var.f387024h = kidsWatchAcctInfo.f143097d;
        kidsWatchLoginCardChooseUI.f143118m = u44Var;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchCardLayout");
        if (((com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchCardLayout) view).f143102d) {
            db5.e1.A(kidsWatchLoginCardChooseUI.getContext(), kidsWatchLoginCardChooseUI.getString(com.tencent.mm.R.string.g7i), "", kidsWatchLoginCardChooseUI.getString(com.tencent.mm.R.string.g7h), kidsWatchLoginCardChooseUI.getString(com.tencent.mm.R.string.g7g), new y83.f(kidsWatchLoginCardChooseUI), null);
        } else {
            r45.u44 u44Var2 = kidsWatchLoginCardChooseUI.f143118m;
            kotlin.jvm.internal.o.d(u44Var2);
            kidsWatchLoginCardChooseUI.U6(u44Var2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
