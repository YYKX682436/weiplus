package th;

/* loaded from: classes12.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f419249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ th.o f419250e;

    public h(th.o oVar, android.widget.TextView textView) {
        this.f419250e = oVar;
        this.f419249d = textView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int id6 = view.getId();
        th.o oVar = this.f419250e;
        if (id6 == com.tencent.mm.R.id.hwe) {
            oVar.f419272j.accept(oVar.f419269g);
            return;
        }
        if (view.getId() == com.tencent.mm.R.id.hxs) {
            android.widget.TextView textView = (android.widget.TextView) oVar.f419267e.findViewById(com.tencent.mm.R.id.op7);
            android.widget.PopupMenu popupMenu = new android.widget.PopupMenu(view.getContext(), textView);
            java.util.List n17 = sh.c.n(view.getContext());
            java.util.Iterator it = ((java.util.ArrayList) n17).iterator();
            while (it.hasNext()) {
                m3.d dVar = (m3.d) it.next();
                popupMenu.getMenu().add("Process :" + th.o.c((java.lang.String) dVar.f323093b));
            }
            popupMenu.setOnMenuItemClickListener(new th.e(this, n17, textView));
            popupMenu.show();
            return;
        }
        if (view.getId() == com.tencent.mm.R.id.hmp) {
            oVar.f419273k.run();
            return;
        }
        if (view.getId() == com.tencent.mm.R.id.f487444oo4) {
            android.view.View findViewById = oVar.f419267e.findViewById(com.tencent.mm.R.id.hyl);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = oVar.f419267e.findViewById(com.tencent.mm.R.id.hmq);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (view.getId() == com.tencent.mm.R.id.f485498hw0) {
            android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bsw);
            checkBox.setChecked(!checkBox.isChecked());
            oVar.f419270h = checkBox.isChecked();
            android.content.Context context = view.getContext();
            oVar.getClass();
            context.getSharedPreferences("Matrix_TopThreadIndicator", 0).edit().putBoolean("show-power", oVar.f419270h).apply();
            return;
        }
        android.view.View view2 = oVar.f419267e;
        if (view == view2 && view2.findViewById(com.tencent.mm.R.id.hyl).getVisibility() == 8) {
            android.widget.PopupMenu popupMenu2 = new android.widget.PopupMenu(view.getContext(), oVar.f419267e.findViewById(com.tencent.mm.R.id.hmq));
            popupMenu2.getMenu().add("Expand");
            popupMenu2.getMenu().add("Close");
            popupMenu2.setOnMenuItemClickListener(new th.g(this));
            popupMenu2.show();
        }
    }
}
