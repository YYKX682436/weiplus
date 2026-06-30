package y83;

/* loaded from: classes11.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst f459995d;

    public o(com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst kidsWatchLoginFirst) {
        this.f459995d = kidsWatchLoginFirst;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst kidsWatchLoginFirst = this.f459995d;
        db5.e1.j(kidsWatchLoginFirst.getContext(), com.tencent.mm.R.string.g7d, com.tencent.mm.R.string.g7e, com.tencent.mm.R.string.f490358sq, com.tencent.mm.R.string.f490347sg, new y83.n(kidsWatchLoginFirst), null);
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
