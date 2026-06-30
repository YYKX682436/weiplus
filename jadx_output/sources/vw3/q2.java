package vw3;

/* loaded from: classes5.dex */
public final class q2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f441080d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f441081e;

    public q2(java.util.List list, java.util.List biz, android.app.Activity context) {
        kotlin.jvm.internal.o.g(biz, "biz");
        kotlin.jvm.internal.o.g(context, "context");
        this.f441080d = list;
        this.f441081e = biz;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f441081e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) this.f441081e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (view == null) {
            view = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.f489408dd2, null);
            view.setTag(new vw3.p2(this, view));
        }
        java.lang.Object tag = view.getTag();
        vw3.p2 p2Var = tag instanceof vw3.p2 ? (vw3.p2) tag : null;
        if (p2Var != null) {
            java.lang.String str = (java.lang.String) this.f441081e.get(i17);
            p2Var.f441064d.setText(str);
            java.util.List list = this.f441080d;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo = (com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo) it.next();
                    java.lang.String str2 = wxaMagicPkgInfo.f147858d;
                    java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                    boolean equals = str2.equals(lowerCase);
                    android.widget.TextView textView = p2Var.f441066f;
                    android.widget.TextView textView2 = p2Var.f441065e;
                    if (equals) {
                        textView2.setText(wxaMagicPkgInfo.f147860f);
                        textView.setText(wxaMagicPkgInfo.f147866o);
                        break;
                    }
                    textView2.setText("");
                    textView.setText("");
                }
            }
        }
        return view;
    }
}
