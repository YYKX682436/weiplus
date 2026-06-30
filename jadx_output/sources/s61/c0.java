package s61;

/* loaded from: classes8.dex */
public class c0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.LayoutInflater f403331d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f403332e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f403333f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f403334g;

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f403335h;

    public c0(android.view.LayoutInflater layoutInflater) {
        this.f403331d = layoutInflater;
    }

    public java.lang.String[] a() {
        int i17 = 0;
        for (boolean z17 : this.f403335h) {
            if (z17) {
                i17++;
            }
        }
        java.lang.String[] strArr = new java.lang.String[i17];
        int i18 = 0;
        for (int i19 = 0; i19 < this.f403332e.size(); i19++) {
            if (this.f403335h[i19]) {
                strArr[i18] = ((r45.ku4) this.f403332e.get(i19)).f378962h;
                i18++;
            }
        }
        return strArr;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f403334g) {
            java.util.LinkedList linkedList = this.f403333f;
            if (linkedList == null) {
                return 0;
            }
            return linkedList.size();
        }
        java.util.LinkedList linkedList2 = this.f403332e;
        if (linkedList2 != null) {
            return linkedList2.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f403334g ? this.f403333f.get(i17) : this.f403332e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        s61.b0 b0Var;
        java.lang.String[] split;
        s61.b0 b0Var2;
        boolean z17 = this.f403334g;
        android.view.LayoutInflater layoutInflater = this.f403331d;
        if (z17) {
            r45.e53 e53Var = (r45.e53) this.f403333f.get(i17);
            if (view == null || ((s61.b0) view.getTag()).f403327f != 2) {
                view = layoutInflater.inflate(com.tencent.mm.R.layout.ble, viewGroup, false);
                b0Var2 = new s61.b0();
                b0Var2.f403327f = 2;
                b0Var2.f403322a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ldd);
                view.setTag(b0Var2);
            } else {
                b0Var2 = (s61.b0) view.getTag();
            }
            b0Var2.f403322a.setText(e53Var.f373020e);
            return view;
        }
        r45.ku4 ku4Var = (r45.ku4) this.f403332e.get(i17);
        if (view == null || ((s61.b0) view.getTag()).f403327f != 1) {
            view = layoutInflater.inflate(com.tencent.mm.R.layout.bld, viewGroup, false);
            b0Var = new s61.b0();
            b0Var.f403327f = 1;
            b0Var.f403323b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hfd);
            b0Var.f403324c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hfb);
            b0Var.f403326e = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.hfe);
            b0Var.f403325d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485366hf0);
            view.setTag(b0Var);
        } else {
            b0Var = (s61.b0) view.getTag();
        }
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        if (m61.k.Ni().m0(ku4Var.f378962h)) {
            b0Var.f403325d.setVisibility(0);
        } else {
            b0Var.f403325d.setVisibility(8);
        }
        android.widget.TextView textView = b0Var.f403323b;
        java.lang.String str = ku4Var.f378961g;
        java.lang.String str2 = "";
        if ((str == null || str.length() <= 0) && (((str = ku4Var.f378959e) == null || str.length() <= 0) && (((str = new kk.v(ku4Var.f378958d).toString()) == null || str.length() <= 0) && ((str = ku4Var.f378960f) == null || str.length() <= 0)))) {
            str = "";
        }
        textView.setText(str);
        android.widget.TextView textView2 = b0Var.f403324c;
        int i18 = ku4Var.f378963i;
        if (i18 == 0) {
            str2 = ku4Var.f378962h;
        } else if (i18 == 2) {
            str2 = ku4Var.f378962h;
        } else if (i18 == 1) {
            java.lang.String str3 = ku4Var.f378962h;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && (split = str3.split("@")) != null && split.length >= 2 && !com.tencent.mm.sdk.platformtools.t8.K0(split[0])) {
                str2 = "@" + split[0];
            }
        }
        textView2.setText(str2);
        b0Var.f403326e.setChecked(this.f403335h[i17]);
        return view;
    }
}
