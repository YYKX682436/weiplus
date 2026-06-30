package w51;

/* loaded from: classes15.dex */
public class e extends w51.d implements android.view.View.OnClickListener {

    /* renamed from: p, reason: collision with root package name */
    public final w51.i f442972p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Context f442973q;

    public e(android.content.Context context) {
        super(context);
        this.f442972p = new w51.i();
        this.f442973q = context;
    }

    @Override // w51.d
    public boolean c() {
        this.f442966g.getClass();
        return false;
    }

    public com.tencent.mm.picker.base.view.WheelView d() {
        w51.i iVar = this.f442972p;
        if (iVar.f442980a == null) {
            iVar.f442980a = new com.tencent.mm.picker.base.view.WheelView(this.f442973q);
        }
        return iVar.f442980a;
    }

    public void e() {
        if (this.f442966g.f424780a != null) {
            this.f442966g.f424780a.a(this.f442972p.f442981b.getCurrentItem());
        }
    }

    public void f(java.util.List list) {
        w51.i iVar = this.f442972p;
        iVar.f442982c = list;
        iVar.f442981b.setAdapter(new o51.a(list));
        iVar.f442981b.setCurrentItem(0);
        iVar.f442981b.setIsOptions(true);
        w51.h hVar = new w51.h(iVar);
        if (list != null) {
            iVar.f442981b.setOnItemSelectedListener(hVar);
        }
        int i17 = this.f442966g.f424784e;
        if (iVar.f442982c != null) {
            iVar.f442981b.setCurrentItem(i17);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/picker/view/OptionsPickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((java.lang.String) view.getTag()).equals("submit")) {
            e();
        }
        a();
        yj0.a.h(this, "com/tencent/mm/picker/view/OptionsPickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
