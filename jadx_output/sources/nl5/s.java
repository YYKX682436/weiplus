package nl5;

/* loaded from: classes15.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final nl5.s0 f338339a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.PopupWindow f338340b;

    /* renamed from: c, reason: collision with root package name */
    public int f338341c;

    /* renamed from: d, reason: collision with root package name */
    public int f338342d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f338343e;

    /* renamed from: f, reason: collision with root package name */
    public final nl5.o f338344f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f338345g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f338346h;

    public s(nl5.s0 selectableEditTextHelper, android.content.Context context) {
        kotlin.jvm.internal.o.g(selectableEditTextHelper, "selectableEditTextHelper");
        this.f338339a = selectableEditTextHelper;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bon, (android.view.ViewGroup) null);
        inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f338341c = inflate.getMeasuredWidth();
        this.f338342d = inflate.getMeasuredHeight();
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(inflate, -2, -2, false);
        this.f338340b = popupWindow;
        popupWindow.setClippingEnabled(false);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.m8z);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        this.f338343e = recyclerView;
        android.content.Context context2 = selectableEditTextHelper.f338356g;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context2, 0, false));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String string = context2.getResources().getString(com.tencent.mm.R.string.f492531gv0);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        linkedList.add(new nl5.z(string, 1, 4));
        android.content.Context context3 = selectableEditTextHelper.f338356g;
        java.lang.String string2 = context3.getResources().getString(android.R.string.selectAll);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        linkedList.add(new nl5.z(string2, android.R.id.selectAll, 12));
        java.lang.String string3 = context3.getResources().getString(android.R.string.cut);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        linkedList.add(new nl5.z(string3, android.R.id.cut, 9));
        java.lang.String string4 = context3.getResources().getString(android.R.string.copy);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        linkedList.add(new nl5.z(string4, android.R.id.copy, 9));
        java.lang.String string5 = context3.getResources().getString(android.R.string.paste);
        kotlin.jvm.internal.o.f(string5, "getString(...)");
        linkedList.add(new nl5.z(string5, android.R.id.paste));
        this.f338345g = linkedList;
        nl5.o oVar = new nl5.o(linkedList, new nl5.q(this), selectableEditTextHelper.f338355f);
        this.f338344f = oVar;
        recyclerView.setAdapter(oVar);
        androidx.recyclerview.widget.i0 i0Var = new androidx.recyclerview.widget.i0(context2, 0);
        i0Var.d(new android.graphics.drawable.ColorDrawable(context2.getResources().getColor(com.tencent.mm.R.color.f479278uu)));
        recyclerView.N(i0Var);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f484006co5);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f338346h = (android.widget.ImageView) findViewById2;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nl5.s.a():void");
    }
}
