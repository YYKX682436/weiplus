package rf2;

/* loaded from: classes10.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f394956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f394958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394959g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394960h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(rf2.c2 c2Var, java.lang.String str, android.widget.TextView textView, android.view.View view, java.lang.String str2) {
        super(4);
        this.f394956d = c2Var;
        this.f394957e = str;
        this.f394958f = textView;
        this.f394959g = view;
        this.f394960h = str2;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        androidx.recyclerview.widget.f2 adapter = (androidx.recyclerview.widget.f2) obj;
        android.view.View view = (android.view.View) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        in5.s0 holder = (in5.s0) obj4;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        rf2.c2 c2Var = this.f394956d;
        boolean z17 = c2Var.f394685g;
        java.lang.String str = c2Var.f394681c;
        if (z17) {
            java.util.ArrayList arrayList = c2Var.f394683e;
            rf2.d2 d2Var = (rf2.d2) kz5.n0.a0(arrayList, intValue);
            if (d2Var != null) {
                boolean z18 = d2Var.f394696e;
                com.tencent.mars.xlog.Log.i(str, "click pos:" + intValue + ", preSelected:" + z18);
                if (z18) {
                    d2Var.f394696e = false;
                    this.f394956d.d(this.f394957e, this.f394958f, this.f394959g, this.f394960h, false);
                    this.f394958f.setOnClickListener(rf2.u1.f394910d);
                } else {
                    java.util.Iterator it = arrayList.iterator();
                    int i17 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i17 = -1;
                            break;
                        }
                        if (((rf2.d2) it.next()).f394696e) {
                            break;
                        }
                        i17++;
                    }
                    if (i17 >= 0 && i17 < arrayList.size()) {
                        com.tencent.mars.xlog.Log.i(str, "reset last:" + i17);
                        rf2.d2 d2Var2 = (rf2.d2) kz5.n0.a0(arrayList, i17);
                        if (d2Var2 != null) {
                            d2Var2.f394696e = false;
                        }
                        adapter.notifyItemChanged(i17);
                    }
                    d2Var.f394696e = true;
                    this.f394956d.d(this.f394957e, this.f394958f, this.f394959g, this.f394960h, false);
                    android.widget.TextView textView = this.f394958f;
                    textView.setOnClickListener(new rf2.w1(this.f394957e, this.f394956d, d2Var, this.f394960h, textView, this.f394959g));
                }
                adapter.notifyItemChanged(intValue);
            }
        } else {
            com.tencent.mars.xlog.Log.i(str, "enableChoiceClick false, ignore click");
        }
        return jz5.f0.f302826a;
    }
}
