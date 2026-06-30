package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class xh extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f212556d;

    /* renamed from: e, reason: collision with root package name */
    public final int f212557e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f212558f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.LayoutInflater f212559g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f212560h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f212561i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f212562m;

    /* renamed from: n, reason: collision with root package name */
    public final o11.g f212563n;

    public xh(android.content.Context context, android.view.LayoutInflater layoutInflater, int i17, java.lang.String str) {
        this.f212556d = context;
        this.f212557e = i17;
        this.f212558f = str;
        this.f212559g = layoutInflater;
        this.f212562m = new com.tencent.mm.ui.uh(this, i17);
        o11.f fVar = new o11.f();
        fVar.f342096t = true;
        fVar.f342094r = l01.a.h();
        this.f212563n = fVar.a();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f212560h.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.ui.vh) this.f212560h.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.wh whVar;
        com.tencent.mm.ui.vh vhVar = (com.tencent.mm.ui.vh) this.f212560h.get(i17);
        if (view == null) {
            view = this.f212559g.inflate(com.tencent.mm.R.layout.ckh, viewGroup, false);
            whVar = new com.tencent.mm.ui.wh(null);
            whVar.f211236a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a9o);
            whVar.f211237b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obg);
            whVar.f211238c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.m1y);
            view.setTag(whVar);
        } else {
            whVar = (com.tencent.mm.ui.wh) view.getTag();
        }
        n11.a.b().h(vhVar.f211158b, whVar.f211236a, this.f212563n);
        whVar.f211237b.setText(vhVar.f211159c);
        int i18 = this.f212557e;
        android.content.Context context = this.f212556d;
        if (i18 == 1) {
            whVar.f211238c.setText(context.getString(com.tencent.mm.R.string.hcu));
        } else {
            whVar.f211238c.setText(context.getString(com.tencent.mm.R.string.hcv));
        }
        whVar.f211238c.setTag(vhVar.f211157a);
        whVar.f211238c.setOnClickListener(this.f212562m);
        return view;
    }
}
