package rn2;

/* loaded from: classes.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.w f397826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f397827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f397828f;

    public r(rn2.w wVar, com.tencent.mm.ui.MMActivity mMActivity, android.view.View view) {
        this.f397826d = wVar;
        this.f397827e = mMActivity;
        this.f397828f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftHelper$showGiftSelectorPanel$1$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        v65.i.c(this.f397826d.f397904c, null, new rn2.q(this.f397827e, this.f397828f, null), 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftHelper$showGiftSelectorPanel$1$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
