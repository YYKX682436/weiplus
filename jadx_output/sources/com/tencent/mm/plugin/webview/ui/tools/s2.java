package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public final class s2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f186830d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f186831e;

    /* renamed from: f, reason: collision with root package name */
    public final o11.f f186832f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f186833g;

    /* renamed from: h, reason: collision with root package name */
    public int f186834h;

    public s2(android.content.Context context, java.util.LinkedList linkedList, int i17) {
        this.f186833g = context;
        this.f186831e = android.view.LayoutInflater.from(context);
        this.f186830d = linkedList;
        if (linkedList == null) {
            this.f186830d = new java.util.LinkedList();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "LoginAvatarListAdapter avatars size:%d", java.lang.Integer.valueOf(this.f186830d.size()));
        o11.f fVar = new o11.f();
        this.f186832f = fVar;
        fVar.f342091o = com.tencent.mm.R.raw.native_oauth_default_head_img;
        fVar.f342096t = true;
        fVar.f342097u = context.getResources().getDimension(com.tencent.mm.R.dimen.a9h);
        this.f186834h = i17;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r45.mx4 getItem(int i17) {
        java.util.LinkedList linkedList = this.f186830d;
        if (linkedList == null || i17 < 0 || i17 >= linkedList.size()) {
            return null;
        }
        return (r45.mx4) linkedList.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.LinkedList linkedList = this.f186830d;
        if (linkedList == null) {
            return 0;
        }
        return linkedList.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.tencent.mm.plugin.webview.ui.tools.r2 r2Var;
        r45.mx4 item = getItem(i17);
        if (item == null) {
            return view;
        }
        if (view == null) {
            r2Var = new com.tencent.mm.plugin.webview.ui.tools.r2(null);
            view2 = this.f186831e.inflate(com.tencent.mm.R.layout.f488166j1, (android.view.ViewGroup) null, false);
            r2Var.f186797a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.a_1);
            r2Var.f186798b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.a_f);
            r2Var.f186799c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.a9v);
            r2Var.f186800d = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.a_i);
            view2.setTag(r2Var);
        } else {
            view2 = view;
            r2Var = (com.tencent.mm.plugin.webview.ui.tools.r2) view.getTag();
        }
        android.widget.TextView textView = r2Var.f186798b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = item.f380894e;
        float textSize = r2Var.f186798b.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this.f186833g, str, textSize));
        n11.a.b().h(item.f380895f, r2Var.f186797a, this.f186832f.a());
        java.lang.String str2 = item.f380896g;
        if (str2 != null) {
            r2Var.f186799c.setText(str2);
            r2Var.f186799c.setVisibility(0);
        } else {
            r2Var.f186799c.setVisibility(8);
        }
        if (item.f380893d == this.f186834h) {
            r2Var.f186800d.setVisibility(0);
        } else {
            r2Var.f186800d.setVisibility(4);
        }
        return view2;
    }
}
