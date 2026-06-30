package in4;

/* loaded from: classes9.dex */
public class q extends com.tencent.mm.ui.widget.dialog.k2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f292986d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f292987e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f292988f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f292989g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f292990h;

    public q(android.content.Context context, r45.xn6 xn6Var, in4.p pVar) {
        super(context, com.tencent.mm.R.style.f494618rs);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489589d26, (android.view.ViewGroup) null, false);
        this.f292986d = inflate;
        this.f292987e = inflate.findViewById(com.tencent.mm.R.id.f485974jr0);
        this.f292988f = inflate.findViewById(com.tencent.mm.R.id.jrx);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.osj);
        this.f292989g = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.dxu);
        this.f292990h = findViewById2;
        findViewById.setOnClickListener(new in4.l(this, pVar, xn6Var));
        findViewById2.setOnClickListener(new in4.m(this, pVar, xn6Var));
        findViewById2.setOnLongClickListener(new in4.n(this, pVar, xn6Var));
        setContentView(inflate);
        setCanceledOnTouchOutside(true);
        setOnDismissListener(new in4.o(this, pVar));
    }

    public void c(android.view.View view, boolean z17, int i17, int i18) {
        super.show();
        int[] a17 = in4.r.a(view.getContext(), view, this.f292986d, z17);
        if (z17) {
            android.view.View view2 = this.f292988f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f292987e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = this.f292988f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f292987e;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/widget/MorePopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        a17[0] = a17[0] + i17;
        a17[1] = a17[1] + i18;
        android.view.Window window = getWindow();
        window.setLayout(-2, -2);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.x = a17[0];
        attributes.y = a17[1];
        attributes.gravity = 8388659;
        window.setAttributes(attributes);
    }
}
