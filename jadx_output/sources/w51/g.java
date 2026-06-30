package w51;

/* loaded from: classes15.dex */
public class g extends w51.d implements android.view.View.OnClickListener {

    /* renamed from: p, reason: collision with root package name */
    public final w51.n f442975p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Context f442976q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f442977r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f442978s;

    public g(android.content.Context context) {
        super(context);
        this.f442977r = "TimePickerView";
        this.f442978s = false;
        this.f442975p = new w51.n(context);
        this.f442976q = context;
    }

    @Override // w51.d
    public boolean c() {
        this.f442966g.getClass();
        return false;
    }

    public android.view.View d() {
        w51.n nVar = this.f442975p;
        if (nVar.f442989a == null) {
            android.view.View inflate = android.view.LayoutInflater.from(this.f442976q).inflate(com.tencent.mm.R.layout.byu, (android.view.ViewGroup) null);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.o8w);
            ((android.view.ViewGroup) inflate).removeView(linearLayout);
            linearLayout.setBackgroundColor(-1);
            nVar.f442989a = linearLayout;
        }
        return nVar.f442989a;
    }

    public java.util.List e() {
        return this.f442975p.e();
    }

    public void f() {
        if (this.f442966g.f424781b != null) {
            try {
                this.f442966g.f424781b.a(w51.n.C.parse(this.f442975p.d()));
            } catch (java.text.ParseException e17) {
                com.tencent.mm.ui.yk.d(this.f442977r, e17, "", new java.lang.Object[0]);
            }
        }
    }

    public void g(float f17) {
        w51.n nVar = this.f442975p;
        if (nVar != null) {
            nVar.f442992d.setDividerHeight(f17);
            nVar.f442993e.setDividerHeight(f17);
            nVar.f442994f.setDividerHeight(f17);
            nVar.f442990b.setDividerHeight(f17);
            nVar.f442991c.setDividerHeight(f17);
            nVar.f442995g.setDividerHeight(f17);
        }
    }

    public void h(int i17, int i18, int i19, int i27) {
        w51.n nVar = this.f442975p;
        nVar.f442992d.setPadding(i17, i18, i19, i27);
        nVar.f442993e.setPadding(i17, i18, i19, i27);
        nVar.f442994f.setPadding(i17, i18, i19, i27);
        nVar.f442990b.setPadding(i17, i18, i19, i27);
        nVar.f442991c.setPadding(i17, i18, i19, i27);
        nVar.f442995g.setPadding(i17, i18, i19, i27);
    }

    public void i() {
        w51.n nVar = this.f442975p;
        com.tencent.mm.picker.base.view.WheelView[] wheelViewArr = {nVar.f442990b, nVar.f442991c, nVar.f442992d, nVar.f442993e, nVar.f442994f, nVar.f442995g};
        for (int i17 = 0; i17 < 6; i17++) {
            wheelViewArr[i17].a();
        }
        com.tencent.mm.picker.base.view.WheelView wheelView = nVar.f442990b;
        java.lang.Runnable runnable = wheelView.f72385m;
        wheelView.removeCallbacks(runnable);
        wheelView.postDelayed(runnable, 200L);
        java.lang.Runnable runnable2 = wheelView.f72385m;
        wheelView.removeCallbacks(runnable2);
        ((s51.a$$a) runnable2).run();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/picker/view/TimePickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((java.lang.String) view.getTag()).equals("submit")) {
            i();
            f();
        }
        a();
        yj0.a.h(this, "com/tencent/mm/picker/view/TimePickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public g(android.content.Context context, boolean z17) {
        super(context);
        this.f442977r = "TimePickerView";
        this.f442978s = false;
        this.f442975p = new w51.n(context, z17);
        this.f442976q = context;
    }
}
