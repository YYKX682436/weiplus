package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes7.dex */
public class x6 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f187601a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f187602b = "";

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.base.AuthorizeItemListView f187603c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f187604d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f187605e;

    public x6(android.content.Context context) {
        this.f187605e = context;
    }

    public boolean a(java.util.LinkedList linkedList, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.webview.ui.tools.widget.t6 t6Var) {
        this.f187602b = str;
        this.f187601a = str2;
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAuthorizeDialog", "scopeInfoList is empty or null");
            return false;
        }
        com.tencent.mm.ui.widget.dialog.k2 k2Var = new com.tencent.mm.ui.widget.dialog.k2(this.f187605e, com.tencent.mm.R.style.f494793wf);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((android.view.LayoutInflater) this.f187605e.getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.f488161iu, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.pjg);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            textView.setText(str3);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) linearLayout.findViewById(com.tencent.mm.R.id.a17);
        f3.i iVar = new f3.i(com.tencent.mm.sdk.platformtools.x2.f193075e, bp.b.decodeResource(com.tencent.mm.sdk.platformtools.x2.f193075e, com.tencent.mm.R.raw.default_avatar, null));
        iVar.b(true);
        if (imageView != null) {
            l01.d0.f314761a.b(imageView, this.f187601a, iVar, new l01.n0());
        }
        android.widget.TextView textView2 = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.a1p);
        if (this.f187602b == null) {
            this.f187602b = "";
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f187605e;
        java.lang.String string = context.getString(com.tencent.mm.R.string.ghf, this.f187602b);
        ((ke0.e) xVar).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
        this.f187603c = (com.tencent.mm.ui.base.AuthorizeItemListView) linearLayout.findViewById(com.tencent.mm.R.id.f483295a81);
        this.f187603c.setAdapter((android.widget.ListAdapter) new com.tencent.mm.plugin.webview.ui.tools.widget.w6(this, linkedList));
        if (linkedList.size() > 5) {
            this.f187603c.f197232d = linkedList.size();
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) linearLayout.findViewById(com.tencent.mm.R.id.a8b);
            this.f187604d = linearLayout2;
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
            layoutParams.height = this.f187605e.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a4b);
            this.f187604d.setLayoutParams(layoutParams);
        }
        ((android.widget.Button) linearLayout.findViewById(com.tencent.mm.R.id.ioc)).setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.p6(this, linkedList, t6Var, k2Var));
        ((android.widget.Button) linearLayout.findViewById(com.tencent.mm.R.id.ipb)).setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.q6(this, linkedList, t6Var, k2Var));
        k2Var.setCanceledOnTouchOutside(false);
        k2Var.setOnDismissListener(new com.tencent.mm.plugin.webview.ui.tools.widget.r6(this));
        k2Var.setOnCancelListener(new com.tencent.mm.plugin.webview.ui.tools.widget.s6(this, t6Var));
        k2Var.setContentView(linearLayout);
        try {
            k2Var.show();
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAuthorizeDialog", "dialog show failed %s", e17.getMessage());
            return false;
        }
    }
}
