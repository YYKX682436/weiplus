package com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoFourFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "Landroid/widget/AdapterView$OnItemClickListener;", "<init>", "()V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class DemoFourFragment extends com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f158085f;

    /* renamed from: g, reason: collision with root package name */
    public bx3.a f158086g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f158087h = true;

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cfa;
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void initData() {
        if (this.f158087h) {
            this.f158087h = false;
            m0().c();
        }
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void n0(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f486583lr1);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f158078e = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.i3a);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ListView listView = (android.widget.ListView) findViewById2;
        this.f158085f = listView;
        listView.setOnItemClickListener(this);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.d(context);
        bx3.a aVar = new bx3.a(context, this.f158077d);
        this.f158086g = aVar;
        android.widget.ListView listView2 = this.f158085f;
        if (listView2 == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        listView2.setAdapter((android.widget.ListAdapter) aVar);
        m0().setOnSimpleAction(new cx3.l(this));
    }

    @Override // com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment
    public void o0() {
        bx3.a aVar = this.f158086g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
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
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoFourFragment", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        dp.a.makeText(getContext(), i17 + "", 0).show();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoFourFragment", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
