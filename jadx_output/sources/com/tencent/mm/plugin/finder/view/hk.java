package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public abstract class hk {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f132248a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f132249b = "";

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f132250c = new java.util.ArrayList();

    public final com.tencent.mm.plugin.finder.view.hk a(java.lang.String title, java.util.List dataList, int i17) {
        com.tencent.mm.plugin.finder.view.dk dkVar;
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f132249b = title;
        java.util.ArrayList arrayList = this.f132250c;
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(dataList, 10));
        java.util.Iterator it = dataList.iterator();
        while (it.hasNext()) {
            r45.u24 source = (r45.u24) it.next();
            kotlin.jvm.internal.o.g(source, "source");
            arrayList2.add(new com.tencent.mm.plugin.finder.view.qo(source));
        }
        arrayList.addAll(arrayList2);
        if (i17 >= 0 && i17 < arrayList.size() && (dkVar = (com.tencent.mm.plugin.finder.view.dk) kz5.n0.a0(arrayList, i17)) != null) {
            dkVar.f131901e = true;
        }
        return this;
    }

    public final com.tencent.mm.ui.widget.dialog.y1 b() {
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f132248a;
        if (y1Var != null) {
            return y1Var;
        }
        kotlin.jvm.internal.o.o("bottomSheet");
        throw null;
    }

    public final void c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f132248a = new com.tencent.mm.ui.widget.dialog.y1(context);
        com.tencent.mm.ui.widget.dialog.y1 b17 = b();
        b17.j(com.tencent.mm.R.layout.b9d);
        b17.f212027f.setBackground(null);
        b17.f212027f.findViewById(com.tencent.mm.R.id.euy).setOnClickListener(new com.tencent.mm.plugin.finder.view.ek(this));
        android.widget.TextView textView = (android.widget.TextView) b17.f212027f.findViewById(com.tencent.mm.R.id.mzj);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) b17.f212027f.findViewById(com.tencent.mm.R.id.mzi);
        textView.setText(this.f132249b);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.view.FinderSingleSelectBottomSheet$getAdapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.plugin.finder.view.so soVar = (com.tencent.mm.plugin.finder.view.so) com.tencent.mm.plugin.finder.view.hk.this;
                soVar.getClass();
                return new com.tencent.mm.plugin.finder.view.po(new com.tencent.mm.plugin.finder.view.ro(soVar));
            }
        }, this.f132250c, false);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.view.fk(this);
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        wxRecyclerView.setAdapter(wxRecyclerAdapter);
        b().o(new com.tencent.mm.plugin.finder.view.gk(this));
        b().s();
    }
}
