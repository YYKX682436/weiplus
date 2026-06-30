package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class n2 implements android.widget.PopupWindow.OnDismissListener, android.widget.AdapterView.OnItemClickListener, android.view.View.OnKeyListener {

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f202000m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.LayoutInflater f202001n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f202002o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.m2 f202003p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMListPopupWindow f202004q;

    /* renamed from: s, reason: collision with root package name */
    public int f202006s;

    /* renamed from: u, reason: collision with root package name */
    public int f202008u;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f201994d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f201995e = java.lang.Boolean.FALSE;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f201996f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f201997g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f201998h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f201999i = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final int f202005r = com.tencent.mm.R.style.f494628rz;

    /* renamed from: t, reason: collision with root package name */
    public r01.g0 f202007t = null;

    public n2(android.content.Context context, android.view.ViewGroup viewGroup) {
        this.f202000m = null;
        this.f202003p = null;
        this.f202000m = context;
        this.f202002o = viewGroup;
        this.f202001n = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        a();
        this.f202003p = new com.tencent.mm.ui.chatting.m2(this, null);
    }

    public boolean a() {
        com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow = this.f202004q;
        if (!(mMListPopupWindow != null && mMListPopupWindow.f197477g.isShowing())) {
            return false;
        }
        this.f202004q.a();
        return true;
    }

    public boolean b(r01.g0 g0Var, int i17, int i18, boolean z17) {
        com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow = this.f202004q;
        if (!(mMListPopupWindow != null && mMListPopupWindow.f197477g.isShowing())) {
            return c(g0Var, i17, i18, z17);
        }
        boolean a17 = a();
        if (g0Var == null) {
            return a17;
        }
        r01.g0 g0Var2 = this.f202007t;
        return (g0Var2.f368073a == g0Var.f368073a && g0Var2.f368076d.equals(g0Var.f368076d)) ? a17 : a17 & c(g0Var, i17, i18, z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(r01.g0 r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.n2.c(r01.g0, int, int, boolean):boolean");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChatFooterCustomSubmenu", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChatFooterCustomSubmenu", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChatFooterCustomSubmenu", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/ui/chatting/ChatFooterCustomSubmenu", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
