package k13;

/* loaded from: classes8.dex */
public final class s extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI f303263d;

    public s(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI forceNotifyListUI) {
        this.f303263d = forceNotifyListUI;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f303263d.f137340i.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        java.lang.Object obj = this.f303263d.f137340i.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        java.lang.String field_UserName = ((i13.j) obj).field_UserName;
        kotlin.jvm.internal.o.f(field_UserName, "field_UserName");
        return r26.i0.n(field_UserName, "@app", false) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        android.widget.TextView textView;
        k13.x holder = (k13.x) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI forceNotifyListUI = this.f303263d;
        java.lang.Object obj = forceNotifyListUI.f137340i.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        i13.j jVar = (i13.j) obj;
        int itemViewType = getItemViewType(i17);
        holder.f303281h = jVar.field_UserName;
        holder.f303282i = jVar.field_ForcePushId;
        android.view.ViewPropertyAnimator animate = holder.f303280g.animate();
        if (animate != null) {
            animate.cancel();
        }
        boolean z17 = jVar.field_Status == 1;
        android.widget.LinearLayout linearLayout = holder.f303279f;
        android.widget.TextView textView2 = holder.f303277d;
        if (z17) {
            textView2.setVisibility(0);
            linearLayout.setVisibility(8);
            textView2.setText(forceNotifyListUI.getContext().getResources().getString(com.tencent.mm.R.string.fey, new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date(jVar.field_ExpiredTime))));
        } else {
            textView2.setVisibility(8);
            linearLayout.setVisibility(0);
        }
        if (itemViewType != 1 || (textView = holder.f303278e) == null) {
            return;
        }
        textView.setText(jVar.field_ExtInfo);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI forceNotifyListUI = this.f303263d;
        android.view.View inflate = com.tencent.mm.ui.id.b(forceNotifyListUI.getContext()).inflate(com.tencent.mm.R.layout.bbc, (android.view.ViewGroup) null);
        if (i17 == 0) {
            ((android.view.ViewStub) inflate.findViewById(com.tencent.mm.R.id.kdo)).inflate();
        } else {
            ((android.view.ViewStub) inflate.findViewById(com.tencent.mm.R.id.jkp)).inflate();
        }
        kotlin.jvm.internal.o.d(inflate);
        return new k13.x(forceNotifyListUI, inflate);
    }
}
