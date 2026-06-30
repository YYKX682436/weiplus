package rr3;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr3.z f399213d;

    public t(rr3.z zVar) {
        this.f399213d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoAuthScopeUIC$initManageBtnClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rr3.z zVar = this.f399213d;
        if (zVar.f399223f == 1) {
            zVar.f399223f = 2;
            zVar.P6().setText(zVar.getResources().getString(com.tencent.mm.R.string.f490441v5));
        } else {
            zVar.f399223f = 1;
            zVar.P6().setText(zVar.getResources().getString(com.tencent.mm.R.string.f492372g93));
        }
        com.tencent.mars.xlog.Log.i("NewBizInfoAuthScopeUIC", "btn state switched =  " + ((java.lang.Object) zVar.P6().getText()));
        androidx.recyclerview.widget.f2 adapter = zVar.O6().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoAuthScopeUIC$initManageBtnClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
