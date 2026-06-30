package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class e1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f184114a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f184115b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.d1 f184116c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f184117d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f184118e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f184119f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f184120g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.j0 f184121h = new androidx.lifecycle.j0();

    /* renamed from: i, reason: collision with root package name */
    public int f184122i = 0;

    public e1(android.content.Context context, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        this.f184115b = context;
        this.f184114a = new com.tencent.mm.ui.widget.dialog.z2(context, 0, 3);
        this.f184119f = linkedList;
        this.f184120g = linkedList2;
        a(context);
    }

    public final void a(android.content.Context context) {
        android.content.Context context2 = this.f184115b;
        this.f184117d = new androidx.recyclerview.widget.RecyclerView(context2, null);
        this.f184117d.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f184117d.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context2));
        this.f184117d.setPadding(0, 0, 0, i65.a.b(context2, 98));
        com.tencent.mm.plugin.webview.ui.tools.d1 d1Var = new com.tencent.mm.plugin.webview.ui.tools.d1(this);
        this.f184116c = d1Var;
        this.f184117d.setAdapter(d1Var);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f184114a;
        if (z2Var != null) {
            z2Var.j(this.f184117d);
        }
    }
}
