package hl5;

/* loaded from: classes15.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.PopupWindow f282126a;

    /* renamed from: b, reason: collision with root package name */
    public int f282127b;

    /* renamed from: c, reason: collision with root package name */
    public int f282128c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f282129d;

    /* renamed from: e, reason: collision with root package name */
    public final hl5.f f282130e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f282131f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f282132g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f282133h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.cedit.edit.CustomTextView f282134i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f282135j;

    /* renamed from: l, reason: collision with root package name */
    public android.view.Menu f282137l;

    /* renamed from: k, reason: collision with root package name */
    public boolean f282136k = false;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f282138m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final int[] f282139n = new int[2];

    /* renamed from: o, reason: collision with root package name */
    public final gl5.d0 f282140o = new hl5.b(this);

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f282141p = new hl5.c(this);

    public g(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView) {
        this.f282134i = customTextView;
        android.content.Context context = customTextView.getContext();
        this.f282133h = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bon, (android.view.ViewGroup) null);
        this.f282135j = inflate;
        inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f282127b = inflate.getMeasuredWidth();
        this.f282128c = inflate.getMeasuredHeight();
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(inflate, -2, -2, false);
        this.f282126a = popupWindow;
        popupWindow.setClippingEnabled(false);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.m8z);
        this.f282129d = recyclerView;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new nl5.z(context.getResources().getString(android.R.string.selectAll), android.R.id.selectAll, 12));
        linkedList.add(new nl5.z(context.getResources().getString(android.R.string.cut), android.R.id.cut, 9));
        linkedList.add(new nl5.z(context.getResources().getString(android.R.string.copy), android.R.id.copy, 9));
        linkedList.add(new nl5.z(context.getResources().getString(android.R.string.paste), android.R.id.paste));
        this.f282131f = linkedList;
        hl5.f fVar = new hl5.f(this, linkedList, new hl5.a(this));
        this.f282130e = fVar;
        recyclerView.setAdapter(fVar);
        androidx.recyclerview.widget.i0 i0Var = new androidx.recyclerview.widget.i0(context, 0);
        i0Var.d(new android.graphics.drawable.ColorDrawable(context.getResources().getColor(com.tencent.mm.R.color.f479278uu)));
        recyclerView.N(i0Var);
        this.f282132g = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f484006co5);
        popupWindow.setAnimationStyle(com.tencent.mm.R.style.f494443nb);
        com.tencent.mars.xlog.Log.i("cmEdit.OperateWindow", "new OpWindow @%s", java.lang.Integer.valueOf(hashCode()));
    }

    public final void a(boolean z17) {
        android.widget.PopupWindow popupWindow = this.f282126a;
        if (z17) {
            android.view.View contentView = popupWindow.getContentView();
            contentView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            this.f282127b = contentView.getMeasuredWidth();
            this.f282128c = contentView.getMeasuredHeight();
        }
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.f282134i;
        int[] iArr = this.f282139n;
        customTextView.getLocationInWindow(iArr);
        android.text.Layout layout = customTextView.getLayout();
        android.content.Context context = this.f282133h;
        int n17 = wl5.y.n(context);
        int a17 = com.tencent.mm.ui.zk.a(context, 10);
        int i17 = n17 - (a17 * 2);
        if (this.f282127b >= i17) {
            this.f282127b = i17;
        }
        int selectionStart = customTextView.getSelectionStart();
        int selectionEnd = customTextView.getSelectionEnd();
        int primaryHorizontal = ((((((int) layout.getPrimaryHorizontal(selectionStart)) + ((int) layout.getPrimaryHorizontal(selectionEnd))) / 2) + iArr[0]) - (this.f282127b / 2)) + customTextView.getPaddingLeft();
        if (selectionStart != selectionEnd && layout.getLineForOffset(selectionStart) != layout.getLineForOffset(selectionEnd)) {
            primaryHorizontal = (iArr[0] + (customTextView.getWidth() / 2)) - (this.f282127b / 2);
        }
        int lineTop = ((((layout.getLineTop(layout.getLineForOffset(selectionStart)) + iArr[1]) - this.f282128c) + customTextView.getPaddingTop()) - customTextView.getScrollY()) - com.tencent.mm.ui.zk.a(context, 5);
        int a18 = (iArr[1] - this.f282128c) - com.tencent.mm.ui.zk.a(context, 5);
        int height = ((iArr[1] + customTextView.getHeight()) - this.f282128c) - com.tencent.mm.ui.zk.a(context, 5);
        int i18 = primaryHorizontal <= a17 ? a17 : primaryHorizontal;
        if (lineTop < a18) {
            lineTop = a18;
        }
        if (lineTop > height) {
            return;
        }
        int i19 = this.f282127b;
        if (i18 + i19 > n17) {
            i18 = (n17 - i19) - a17;
        }
        ((android.widget.LinearLayout.LayoutParams) this.f282132g.getLayoutParams()).leftMargin = primaryHorizontal - i18;
        popupWindow.setElevation(8.0f);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f282129d.getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/ui/widget/cedit/menu/OperateWindow", "positionView", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
            linearLayoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/ui/widget/cedit/menu/OperateWindow", "positionView", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
        }
        popupWindow.setWidth(this.f282127b);
        try {
            if (popupWindow.isShowing()) {
                popupWindow.update(i18, lineTop, popupWindow.getWidth(), popupWindow.getHeight());
            } else {
                popupWindow.showAtLocation(customTextView, 0, i18, lineTop);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
