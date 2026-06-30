package com.tencent.mm.plugin.product.ui;

/* loaded from: classes8.dex */
public class r0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f153340d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f153341e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f153342f;

    /* renamed from: g, reason: collision with root package name */
    public final wq3.j f153343g = vq3.e.wi().Ai();

    public r0(android.content.Context context) {
        this.f153340d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.LinkedList linkedList = this.f153341e;
        if (linkedList != null) {
            return linkedList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (xq3.m) this.f153341e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.product.ui.q0 q0Var;
        android.util.Pair pair;
        xq3.m mVar = (xq3.m) this.f153341e.get(i17);
        android.content.Context context = this.f153340d;
        if (view == null || view.getTag() == null) {
            q0Var = new com.tencent.mm.plugin.product.ui.q0(this);
            view = android.view.View.inflate(context, com.tencent.mm.R.layout.cai, null);
            q0Var.f153334a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485846ja5);
            q0Var.f153335b = (com.tencent.mm.plugin.product.ui.MaxGridView) view.findViewById(com.tencent.mm.R.id.f485844ja3);
            q0Var.f153336c = new com.tencent.mm.plugin.product.ui.s0(context);
            view.setTag(q0Var);
        } else {
            q0Var = (com.tencent.mm.plugin.product.ui.q0) view.getTag();
        }
        q0Var.f153334a.setText(mVar.f456103e);
        q0Var.f153335b.setOnItemClickListener(this.f153342f);
        com.tencent.mm.plugin.product.ui.s0 s0Var = q0Var.f153336c;
        java.lang.String str = mVar.f456102d;
        java.util.HashMap hashMap = (java.util.HashMap) this.f153343g.f448562o;
        java.lang.String str2 = hashMap.containsKey(str) ? (java.lang.String) hashMap.get(str) : null;
        s0Var.f153347e = mVar;
        s0Var.f153348f = str2;
        java.util.LinkedList linkedList = mVar.f456104f;
        int b17 = context.getResources().getDisplayMetrics().widthPixels - (i65.a.b(context, 16) * 2);
        android.text.TextPaint paint = ((android.widget.TextView) ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.cah, (android.view.ViewGroup) null)).getPaint();
        java.util.Iterator it = linkedList.iterator();
        float f17 = 0.0f;
        while (it.hasNext()) {
            float measureText = paint.measureText(((xq3.h) it.next()).f456088e);
            if (f17 < measureText) {
                f17 = measureText;
            }
        }
        int b18 = ((int) f17) + (i65.a.b(context, 10) * 2);
        int i18 = 4;
        int[] iArr = new int[4];
        int b19 = i65.a.b(context, 12);
        int i19 = 0;
        while (i19 < 4) {
            int i27 = i19 + 1;
            iArr[i19] = (b17 - (b19 * i19)) / i27;
            i19 = i27;
        }
        while (true) {
            if (i18 < 1) {
                pair = new android.util.Pair(1, java.lang.Integer.valueOf(b17));
                break;
            }
            int i28 = i18 - 1;
            if (b18 < iArr[i28]) {
                pair = new android.util.Pair(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(iArr[i28]));
                break;
            }
            i18 = i28;
        }
        pair.toString();
        q0Var.f153335b.setColumnWidth(((java.lang.Integer) pair.second).intValue());
        q0Var.f153336c.notifyDataSetChanged();
        q0Var.f153335b.setAdapter((android.widget.ListAdapter) q0Var.f153336c);
        return view;
    }
}
