package cw1;

/* loaded from: classes12.dex */
public class u2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f223348d;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f223350f;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f223349e = java.util.Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View.OnClickListener f223351g = new cw1.u2$$a();

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnClickListener f223352h = new android.view.View.OnClickListener() { // from class: cw1.u2$$b
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            cw1.u2 u2Var = cw1.u2.this;
            u2Var.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(view);
            java.lang.Object[] array = arrayList.toArray();
            arrayList.clear();
            yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", u2Var, array);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(view);
            java.lang.Object[] array2 = arrayList2.toArray();
            arrayList2.clear();
            yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", u2Var, array2);
            java.lang.Integer num = (java.lang.Integer) view.getTag();
            android.widget.AdapterView.OnItemClickListener onItemClickListener = u2Var.f223350f;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(null, view, num.intValue(), -1L);
            }
            yj0.a.h(u2Var, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            yj0.a.h(u2Var, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    };

    public u2(android.app.Activity activity) {
        this.f223348d = activity;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public cw1.c getItem(int i17) {
        if (i17 < 0 || i17 >= this.f223349e.size()) {
            return null;
        }
        return (cw1.c) this.f223349e.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f223349e.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return -1L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        cw1.v2 v2Var;
        android.app.Activity activity = this.f223348d;
        if (view == null) {
            v2Var = new cw1.v2();
            view2 = android.view.LayoutInflater.from(activity).inflate(com.tencent.mm.R.layout.f488622yt, viewGroup, false);
            v2Var.f223367e = view2.findViewById(com.tencent.mm.R.id.bxc);
            v2Var.f223363a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.a_4);
            v2Var.f223364b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.odf);
            v2Var.f223365c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.cut);
            v2Var.f223366d = (android.widget.CheckBox) view2.findViewById(com.tencent.mm.R.id.mie);
            v2Var.f223368f = view2.findViewById(com.tencent.mm.R.id.ofy);
            v2Var.f223367e.setOnClickListener(this.f223352h);
            v2Var.f223363a.setOnClickListener(this.f223351g);
            view2.setTag(v2Var);
        } else {
            view2 = view;
            v2Var = (cw1.v2) view.getTag();
        }
        cw1.c item = getItem(i17);
        if (item == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CleanChattingAdapter", "get item is null. [%d]", java.lang.Integer.valueOf(i17));
            item = new cw1.c("", false);
        }
        v2Var.f223367e.setTag(java.lang.Integer.valueOf(i17));
        v2Var.f223363a.setTag(item);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(v2Var.f223363a, item.f222832a, null);
        java.util.Set set = item.f222836e;
        boolean z17 = set == null || (item.f222837f != null && ((java.util.HashSet) set).size() <= item.f222837f.size());
        long j17 = item.f222833b;
        long j18 = item.f222835d;
        v2Var.f223365c.setText((j18 <= 0 || z17) ? fp.n0.a(j17) : activity.getString(com.tencent.mm.R.string.n8k, fp.n0.a(j18)));
        java.lang.String str = item.f222832a;
        if (com.tencent.mm.storage.z3.R4(str)) {
            android.widget.TextView textView = v2Var.f223364b;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String f17 = c01.a2.f(str, str);
            float textSize = v2Var.f223364b.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(activity, f17, textSize));
        } else {
            android.widget.TextView textView2 = v2Var.f223364b;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str);
            float textSize2 = v2Var.f223364b.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(activity, e17, textSize2));
        }
        v2Var.f223366d.setChecked(j18 > 0);
        return view2;
    }
}
