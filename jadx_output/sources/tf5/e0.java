package tf5;

/* loaded from: classes11.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.address.MvvmAddressUIFragment f418974e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418974e = mvvmAddressUIFragment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tf5.e0(this.f418974e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tf5.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.view.View rootView;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418973d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f418973d = 1;
            if (kotlinx.coroutines.k1.b(100L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int i18 = com.tencent.mm.ui.contact.address.MvvmAddressUIFragment.S;
        com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment = this.f418974e;
        android.view.View findViewById = mvvmAddressUIFragment.findViewById(com.tencent.mm.R.id.imk);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment", "markLoadingGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment", "markLoadingGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.ui.contact.ContactCountView contactCountView = new com.tencent.mm.ui.contact.ContactCountView(mvvmAddressUIFragment.getContext());
        contactCountView.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, -2));
        com.tencent.mm.ui.a4 a4Var = com.tencent.mm.ui.a4.f197117a;
        androidx.fragment.app.FragmentActivity thisActivity = mvvmAddressUIFragment.thisActivity();
        kotlin.jvm.internal.o.f(thisActivity, "thisActivity(...)");
        if (a4Var.h(thisActivity)) {
            contactCountView.setBackgroundColor(mvvmAddressUIFragment.getResources().getColor(com.tencent.mm.R.color.f478491c));
            android.view.View view = mvvmAddressUIFragment.getView();
            com.tencent.mm.ui.LauncherUIBottomTabView launcherUIBottomTabView = (view == null || (rootView = view.getRootView()) == null) ? null : (com.tencent.mm.ui.LauncherUIBottomTabView) rootView.findViewById(com.tencent.mm.R.id.huj);
            if (launcherUIBottomTabView != null) {
                contactCountView.setPadding(0, 0, 0, launcherUIBottomTabView.getHeight());
            }
        }
        in5.n0.P(mvvmAddressUIFragment.y0(), contactCountView, contactCountView.hashCode(), false, 4, null);
        mvvmAddressUIFragment.f206612y = contactCountView;
        return jz5.f0.f302826a;
    }
}
