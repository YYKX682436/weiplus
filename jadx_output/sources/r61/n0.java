package r61;

/* loaded from: classes15.dex */
public class n0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f392909d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f392910e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f392911f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f392912g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f392913h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f392914i;

    /* renamed from: m, reason: collision with root package name */
    public final int f392915m;

    /* renamed from: n, reason: collision with root package name */
    public final r61.l0 f392916n;

    /* renamed from: o, reason: collision with root package name */
    public bb5.g f392917o;

    /* renamed from: p, reason: collision with root package name */
    public bb5.e f392918p;

    public n0(android.content.Context context, r61.l0 l0Var, int i17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f392910e = linkedList;
        this.f392911f = new java.util.LinkedList();
        this.f392913h = new java.util.LinkedList();
        this.f392915m = 1;
        this.f392917o = new bb5.g(15, new r61.g0(this));
        this.f392918p = null;
        this.f392909d = context;
        this.f392915m = i17;
        this.f392916n = l0Var;
        this.f392914i = new int[linkedList.size()];
    }

    public final void a(r45.g74 g74Var, java.lang.String[] strArr) {
        java.lang.String str;
        java.util.LinkedList linkedList = this.f392911f;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = ((r45.g74) it.next()).f374943d;
            if (str2 != null && (str = g74Var.f374943d) != null && str2.equals(str)) {
                return;
            }
        }
        linkedList.add(g74Var);
        ((java.util.LinkedList) this.f392913h).add(new java.lang.String[]{strArr[2], strArr[1]});
    }

    public int c() {
        int i17;
        int[] iArr = this.f392914i;
        int length = iArr.length;
        int i18 = 0;
        while (i17 < length) {
            int i19 = iArr[i17];
            int i27 = this.f392915m;
            if (i27 == 1) {
                i17 = i19 != 1 ? i17 + 1 : 0;
                i18++;
            } else {
                if (i27 == 2) {
                    if (i19 != 2) {
                    }
                    i18++;
                }
            }
        }
        return i18;
    }

    public boolean d() {
        int[] iArr = this.f392914i;
        if (iArr == null || iArr.length == 0) {
            return false;
        }
        int i17 = 0;
        while (true) {
            int[] iArr2 = this.f392914i;
            if (i17 >= iArr2.length) {
                return true;
            }
            int i18 = iArr2[i17];
            int i19 = this.f392915m;
            if (i19 == 1) {
                if (i18 == 0) {
                    return false;
                }
            } else if (i19 == 2 && i18 == 0) {
                return false;
            }
            i17++;
        }
    }

    public void f(boolean z17) {
        int i17 = 0;
        int i18 = this.f392915m;
        if (i18 == 1) {
            while (true) {
                int[] iArr = this.f392914i;
                if (i17 >= iArr.length) {
                    break;
                }
                iArr[i17] = z17 ? 1 : 0;
                i17++;
            }
        } else if (i18 == 2) {
            int i19 = 0;
            while (true) {
                int[] iArr2 = this.f392914i;
                if (i19 >= iArr2.length) {
                    break;
                }
                iArr2[i19] = z17 ? 2 : 0;
                i19++;
            }
        }
        notifyDataSetChanged();
    }

    public void g(java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2 = this.f392910e;
        java.util.LinkedList linkedList3 = this.f392911f;
        if (linkedList != null) {
            linkedList3.clear();
            linkedList2.clear();
            ((java.util.LinkedList) this.f392913h).clear();
            for (java.lang.String[] strArr : this.f392912g) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.g74 g74Var = (r45.g74) it.next();
                    int i17 = this.f392915m;
                    if (i17 == 1) {
                        int i18 = g74Var.f374945f;
                        if (i18 == 1 || i18 == 0) {
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(strArr[2]) && g74Var.f374943d.equals(kk.k.g(strArr[2].getBytes()))) {
                                a(g74Var, strArr);
                            }
                        }
                    } else if (i17 == 2 && g74Var.f374945f == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(strArr[2]) && g74Var.f374943d.equals(kk.k.g(strArr[2].getBytes()))) {
                        a(g74Var, strArr);
                    }
                }
            }
        }
        this.f392914i = new int[linkedList3.size()];
        linkedList2.addAll(linkedList3);
        linkedList3.clear();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f392910e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.g74) this.f392910e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return ((r45.g74) this.f392910e.get(i17)).hashCode();
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        r61.m0 m0Var;
        int i18 = this.f392915m;
        if (i18 == 1) {
            if (this.f392918p == null) {
                this.f392918p = new r61.h0(this);
            }
            bb5.g gVar = this.f392917o;
            if (gVar != null) {
                gVar.b(i17, this.f392918p);
            }
        }
        r45.g74 g74Var = (r45.g74) this.f392910e.get(i17);
        if (view == null) {
            m0Var = new r61.m0();
            android.content.Context context = this.f392909d;
            if (i18 == 1) {
                view = android.view.View.inflate(context, com.tencent.mm.R.layout.ad6, null);
                m0Var.f392900b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485946jn1);
                m0Var.f392901c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.jmu);
                m0Var.f392902d = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.jmv);
                m0Var.f392903e = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.jmx);
                m0Var.f392899a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ged);
                m0Var.f392904f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485947jn2);
                m0Var.f392905g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485950jn5);
                view.setTag(m0Var);
            } else if (i18 == 2) {
                view = android.view.View.inflate(context, com.tencent.mm.R.layout.ad7, null);
                m0Var.f392900b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485946jn1);
                m0Var.f392901c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.jmu);
                m0Var.f392902d = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.jmv);
                m0Var.f392903e = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.jmx);
                m0Var.f392904f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485947jn2);
                m0Var.f392905g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485950jn5);
                view.setTag(m0Var);
            }
        } else {
            m0Var = (r61.m0) view.getTag();
        }
        m0Var.f392905g.setOnClickListener(new r61.i0(this, i17));
        java.util.List list = this.f392913h;
        if (i18 == 1) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(((java.lang.String[]) ((java.util.LinkedList) list).get(i17))[1])) {
                m0Var.f392900b.setText(((java.lang.String[]) ((java.util.LinkedList) list).get(i17))[1]);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(g74Var.f374948i)) {
                m0Var.f392900b.setText(g74Var.f374944e);
            } else {
                m0Var.f392900b.setText(g74Var.f374948i);
            }
            m0Var.f392902d.setOnClickListener(new r61.j0(this, i17));
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(m0Var.f392899a, g74Var.f374944e, null);
        } else if (i18 == 2) {
            m0Var.f392900b.setText(((java.lang.String[]) ((java.util.LinkedList) list).get(i17))[1]);
            m0Var.f392903e.setOnClickListener(new r61.k0(this, i17));
        }
        int i19 = this.f392914i[i17];
        if (i19 != 0) {
            if (i19 == 1) {
                m0Var.f392902d.setVisibility(8);
                m0Var.f392901c.setVisibility(0);
                m0Var.f392904f.setVisibility(0);
                m0Var.f392905g.setVisibility(0);
            } else if (i19 == 2) {
                m0Var.f392902d.setVisibility(8);
                m0Var.f392903e.setVisibility(8);
                m0Var.f392901c.setVisibility(0);
                m0Var.f392904f.setVisibility(0);
                m0Var.f392905g.setVisibility(0);
            } else if (i19 == 3) {
                m0Var.f392902d.setVisibility(8);
                m0Var.f392901c.setVisibility(0);
                m0Var.f392904f.setVisibility(0);
                m0Var.f392905g.setVisibility(0);
            }
        } else if (i18 == 1) {
            m0Var.f392901c.setVisibility(8);
            m0Var.f392902d.setVisibility(0);
            m0Var.f392903e.setVisibility(8);
            m0Var.f392904f.setVisibility(8);
            m0Var.f392905g.setVisibility(8);
        } else if (i18 == 2) {
            m0Var.f392901c.setVisibility(8);
            m0Var.f392902d.setVisibility(8);
            m0Var.f392903e.setVisibility(0);
            m0Var.f392904f.setVisibility(8);
            m0Var.f392905g.setVisibility(8);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        r61.l0 l0Var = this.f392916n;
        if (l0Var != null) {
            l0Var.notifyDataSetChanged();
        }
    }
}
