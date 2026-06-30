package rt1;

/* loaded from: classes7.dex */
public final class r0 extends androidx.recyclerview.widget.f2 implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f399479d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI f399480e;

    public r0(com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI carLicensePlateListUI) {
        this.f399480e = carLicensePlateListUI;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f399479d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        if (((java.lang.String) kz5.n0.a0(this.f399479d, i17)) != null) {
            return r3.hashCode();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        rt1.u0 u0Var = (rt1.u0) holder;
        java.lang.Object obj = this.f399479d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        if (str.length() < 7) {
            return;
        }
        java.lang.String str2 = u46.l.t(str, 0, 2) + " · " + u46.l.t(str, 2, str.length());
        android.widget.TextView textView = u0Var.f399489d;
        textView.setText(str2);
        textView.setContentDescription(str);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.app.Activity d17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String plateNo = (java.lang.String) kz5.n0.a0(this.f399479d, x(view));
        if (!(plateNo == null || plateNo.length() == 0)) {
            rt1.z0 z0Var = this.f399480e.f94617f;
            if (z0Var == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            rt1.p1 p1Var = (rt1.p1) z0Var;
            kotlin.jvm.internal.o.g(plateNo, "plateNo");
            rt1.b1 b1Var = p1Var.f399473b;
            if (b1Var == null || (d17 = b1Var.d()) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CarLicensePlateListViewPresenter", "startEditUIForUpdate(plate:" + plateNo + ") get NULL activity");
            } else {
                kotlinx.coroutines.l.d(p1Var.a(), null, null, new rt1.k1(d17, plateNo, p1Var, null), 3, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488268om, parent, false);
        inflate.setOnClickListener(this);
        inflate.setOnLongClickListener(this);
        return new rt1.u0(inflate);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        java.lang.String str = (java.lang.String) kz5.n0.a0(this.f399479d, x(view));
        if (str == null || str.length() == 0) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        rt1.n0 n0Var = new rt1.n0(view, view.getContext());
        rt1.o0 o0Var = rt1.o0.f399462d;
        rt1.q0 q0Var = new rt1.q0(this.f399480e, str);
        int i17 = com.tencent.mm.view.TouchableLayout.f213511d;
        n0Var.h(view, o0Var, q0Var, com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
        yj0.a.i(true, this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }

    public final int x(android.view.View view) {
        com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI carLicensePlateListUI = this.f399480e;
        com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView mRecyclerView = carLicensePlateListUI.f94618g;
        if (mRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.k3 w07 = mRecyclerView.w0(view);
        if (w07 == null) {
            return -1;
        }
        com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView mRecyclerView2 = carLicensePlateListUI.f94618g;
        if (mRecyclerView2 != null) {
            return mRecyclerView2.g1(w07);
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }
}
