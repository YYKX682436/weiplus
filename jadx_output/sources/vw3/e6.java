package vw3;

/* loaded from: classes5.dex */
public final class e6 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.udr.w f440942d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f440943e;

    public e6(com.tencent.wechat.aff.udr.w wVar, java.util.List projects, android.app.Activity context) {
        kotlin.jvm.internal.o.g(projects, "projects");
        kotlin.jvm.internal.o.g(context, "context");
        this.f440942d = wVar;
        this.f440943e = kz5.n0.S0(projects);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f440943e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) this.f440943e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(parent, "parent");
        if (view == null) {
            view = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.dpa, null);
            view.setTag(new vw3.d6(this, view));
        }
        java.lang.Object tag = view.getTag();
        vw3.d6 d6Var = tag instanceof vw3.d6 ? (vw3.d6) tag : null;
        if (d6Var != null) {
            java.lang.String str = (java.lang.String) this.f440943e.get(i17);
            d6Var.f440929d.setText(str);
            com.tencent.wechat.aff.udr.w wVar = this.f440942d;
            if (wVar != null && (linkedList = wVar.f217586d) != null) {
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.tencent.wechat.aff.udr.x xVar = (com.tencent.wechat.aff.udr.x) it.next();
                    boolean b17 = kotlin.jvm.internal.o.b(xVar.d(), str);
                    android.widget.TextView textView = d6Var.f440932g;
                    android.widget.TextView textView2 = d6Var.f440931f;
                    android.widget.TextView textView3 = d6Var.f440930e;
                    if (b17) {
                        textView3.setText(xVar.getName());
                        textView2.setText(xVar.getMd5());
                        textView.setText(java.lang.String.valueOf(xVar.f217590e));
                        break;
                    }
                    textView3.setText("");
                    textView2.setText("");
                    textView.setText("");
                }
            }
        }
        return view;
    }
}
