package in4;

/* loaded from: classes9.dex */
public class h extends com.tencent.mm.ui.widget.dialog.k2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f292964d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f292965e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f292966f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f292967g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f292968h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f292969i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.base.FlowLayout f292970m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.ir0 f292971n;

    public h(android.content.Context context, r45.xn6 xn6Var, in4.g gVar) {
        super(context, com.tencent.mm.R.style.f494618rs);
        this.f292965e = new java.util.HashSet();
        r45.ir0 ir0Var = new r45.ir0();
        this.f292971n = ir0Var;
        ir0Var.f377277d = "101";
        ir0Var.f377278e = context.getString(com.tencent.mm.R.string.f493388k02);
        r45.vn6 vn6Var = xn6Var.T;
        if (vn6Var != null) {
            java.util.Iterator it = vn6Var.f388401f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.ir0 ir0Var2 = (r45.ir0) it.next();
                if (ir0Var2.f377279f) {
                    r45.ir0 ir0Var3 = this.f292971n;
                    ir0Var3.f377277d = ir0Var2.f377277d;
                    ir0Var3.f377278e = ir0Var2.f377278e;
                    xn6Var.T.f388401f.remove(ir0Var2);
                    break;
                }
            }
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d1j, (android.view.ViewGroup) null, false);
        this.f292964d = inflate;
        this.f292966f = inflate.findViewById(com.tencent.mm.R.id.e0o);
        this.f292967g = inflate.findViewById(com.tencent.mm.R.id.f484362e10);
        this.f292969i = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.e0l);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.osi);
        this.f292968h = textView;
        textView.setOnClickListener(new in4.c(this, gVar));
        this.f292970m = (com.tencent.mm.ui.base.FlowLayout) inflate.findViewById(com.tencent.mm.R.id.e0p);
        java.util.Iterator it6 = xn6Var.T.f388401f.iterator();
        while (it6.hasNext()) {
            r45.ir0 ir0Var4 = (r45.ir0) it6.next();
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d1k, (android.view.ViewGroup) this.f292970m, false);
            android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.e0u);
            textView2.setText(ir0Var4.f377278e);
            textView2.setOnClickListener(new in4.d(this, ir0Var4, textView2, context));
            this.f292970m.addView(inflate2);
        }
        this.f292969i.setText(xn6Var.T.f388399d);
        this.f292969i.setOnClickListener(new in4.e(this, xn6Var));
        setContentView(this.f292964d);
        setCanceledOnTouchOutside(true);
        setOnDismissListener(new in4.f(this, gVar));
    }

    public void c(android.view.View view, boolean z17, int i17, int i18) {
        super.show();
        int[] a17 = in4.r.a(view.getContext(), view, this.f292964d, z17);
        if (z17) {
            android.view.View view2 = this.f292967g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f292966f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = this.f292967g;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f292966f;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow", "show", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
