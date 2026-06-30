package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class i extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f197825d;

    /* renamed from: e, reason: collision with root package name */
    public final int f197826e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence[] f197827f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence[] f197828g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f197829h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f197830i = new java.util.HashMap();

    public i(android.content.Context context, int i17) {
        this.f197825d = context;
        this.f197826e = i17;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f197828g.length;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = com.tencent.mm.ui.id.b(this.f197825d).inflate(com.tencent.mm.R.layout.f489291c05, (android.view.ViewGroup) null);
            com.tencent.mm.ui.base.preference.h hVar = new com.tencent.mm.ui.base.preference.h();
            hVar.f197802a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o3b);
            hVar.f197803b = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bs7);
            hVar.f197804c = (android.widget.RadioButton) view.findViewById(com.tencent.mm.R.id.lhs);
            view.setTag(hVar);
        }
        com.tencent.mm.ui.base.preference.h hVar2 = (com.tencent.mm.ui.base.preference.h) view.getTag();
        hVar2.f197802a.setText(this.f197827f[i17]);
        int i18 = this.f197826e;
        if (i18 == 1) {
            hVar2.f197803b.setVisibility(8);
            hVar2.f197804c.setVisibility(0);
            hVar2.f197804c.setChecked(this.f197828g[i17].equals(this.f197829h));
        } else if (i18 != 2) {
            hVar2.f197803b.setVisibility(8);
            hVar2.f197804c.setVisibility(8);
        } else {
            hVar2.f197803b.setVisibility(0);
            hVar2.f197804c.setVisibility(8);
            hVar2.f197803b.setChecked(this.f197828g[i17].equals(this.f197829h));
        }
        return view;
    }
}
