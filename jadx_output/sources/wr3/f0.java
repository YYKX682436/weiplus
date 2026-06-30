package wr3;

/* loaded from: classes11.dex */
public abstract class f0 extends wr3.i {

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f448778m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f448779n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f448780o;

    /* renamed from: p, reason: collision with root package name */
    public final int f448781p;

    /* renamed from: q, reason: collision with root package name */
    public final long f448782q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f448783r;

    /* renamed from: s, reason: collision with root package name */
    public final sr3.g f448784s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.storage.z3 f448785t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f448786u;

    /* renamed from: v, reason: collision with root package name */
    public r45.ul f448787v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f448788w;

    public f0(android.content.Context context, java.lang.String bizUsername, boolean z17, int i17, long j17, boolean z18, sr3.g config, com.tencent.mm.storage.z3 contact) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(contact, "contact");
        this.f448778m = context;
        this.f448779n = bizUsername;
        this.f448780o = z17;
        this.f448781p = i17;
        this.f448782q = j17;
        this.f448783r = z18;
        this.f448784s = config;
        this.f448785t = contact;
        this.f448786u = new java.util.ArrayList();
    }

    @Override // wr3.i
    public android.content.Context B() {
        return this.f448778m;
    }

    @Override // wr3.i
    public long E() {
        return this.f448782q;
    }

    @Override // wr3.i
    public boolean J() {
        return this.f448780o;
    }

    @Override // wr3.i
    public boolean K() {
        return this.f448783r;
    }

    public abstract void L(androidx.recyclerview.widget.k3 k3Var, int i17);

    public java.util.List M(java.util.List msgList, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        java.util.LinkedList<r45.o5> linkedList3;
        r45.l5 l5Var;
        int i17;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (linkedList2 != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                vr3.h hVar = (vr3.h) it.next();
                r45.s5 s5Var = hVar.f439631a;
                if (s5Var != null && S(s5Var)) {
                    wr3.n0 n0Var = hVar.f439632b;
                    if (n0Var == null) {
                        n0Var = wr3.n0.f448842f;
                    }
                    arrayList.add(N(n0Var, s5Var, R()));
                }
            }
        }
        if (linkedList != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                r45.s5 s5Var2 = (r45.s5) it6.next();
                r45.p5 p5Var = s5Var2.f385514i;
                if (p5Var != null && (linkedList3 = p5Var.f382754e) != null) {
                    for (r45.o5 o5Var : linkedList3) {
                        kotlin.jvm.internal.o.d(o5Var);
                        r45.s5 s5Var3 = null;
                        try {
                            r45.p5 p5Var2 = s5Var2.f385514i;
                            if (p5Var2 != null && (l5Var = p5Var2.f382753d) != null) {
                                r45.s5 s5Var4 = new r45.s5();
                                r45.y5 y5Var = s5Var2.f385509d;
                                if (y5Var != null) {
                                    r45.y5 y5Var2 = new r45.y5();
                                    y5Var2.f390791e = y5Var.f390791e;
                                    y5Var2.f390792f = y5Var.f390792f;
                                    y5Var2.f390790d = y5Var.f390790d;
                                    y5Var2.f390793g = y5Var.f390793g;
                                    y5Var2.f390794h = y5Var.f390794h;
                                    y5Var2.f390795i = y5Var.f390795i;
                                    s5Var4.f385509d = y5Var2;
                                }
                                r45.z5 z5Var = o5Var.R;
                                if (z5Var != null) {
                                    i17 = z5Var.f391718e;
                                } else {
                                    com.tencent.mars.xlog.Log.w("BizProfileTabCommonAdapter", "expandFeaturedDetailInfoToMessage appMsgId use originAppMsgBaseInfo");
                                    i17 = l5Var.f379138d;
                                }
                                r45.p5 p5Var3 = new r45.p5();
                                r45.l5 l5Var2 = new r45.l5();
                                l5Var2.f379138d = i17;
                                l5Var2.f379139e = l5Var.f379139e;
                                l5Var2.f379140f = l5Var.f379140f;
                                l5Var2.f379141g = l5Var.f379141g;
                                l5Var2.f379142h = l5Var.f379142h;
                                l5Var2.f379143i = l5Var.f379143i;
                                p5Var3.f382753d = l5Var2;
                                p5Var3.f382754e.add(o5Var);
                                s5Var4.f385514i = p5Var3;
                                s5Var3 = s5Var4;
                            }
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("BizProfileTabCommonAdapter", "expandFeaturedDetailInfoToMessage failed: " + e17.getMessage(), e17);
                        }
                        if (s5Var3 != null && S(s5Var3)) {
                            arrayList.add(N(wr3.n0.f448846m, s5Var3, R()));
                        }
                    }
                }
            }
        }
        java.util.Iterator it7 = msgList.iterator();
        while (it7.hasNext()) {
            r45.s5 s5Var5 = (r45.s5) it7.next();
            if (S(s5Var5)) {
                arrayList.add(N(wr3.n0.f448842f, s5Var5, R()));
            }
        }
        return arrayList;
    }

    public abstract wr3.c0 N(wr3.n0 n0Var, r45.s5 s5Var, int i17);

    public abstract androidx.recyclerview.widget.k3 O(android.view.ViewGroup viewGroup, int i17);

    public abstract int P();

    public abstract int Q();

    public abstract int R();

    public boolean S(r45.s5 bizMessage) {
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(bizMessage, "bizMessage");
        r45.p5 p5Var = bizMessage.f385514i;
        return (p5Var == null || (linkedList = p5Var.f382754e) == null || !(linkedList.isEmpty() ^ true)) ? false : true;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.ArrayList arrayList = this.f448786u;
        if (arrayList.isEmpty()) {
            return 1;
        }
        return 1 + arrayList.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        java.util.ArrayList arrayList = this.f448786u;
        if (i17 >= arrayList.size()) {
            return this.f448788w ? P() : Q();
        }
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return ((wr3.c0) obj).a();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (!(holder instanceof wr3.d0)) {
            if (holder instanceof wr3.e0) {
                return;
            }
            L(holder, i17);
        } else {
            yz5.a aVar = this.f448815e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == P()) {
            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.a19, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new wr3.d0(inflate);
        }
        if (i17 != Q()) {
            return O(parent, i17);
        }
        android.view.View inflate2 = from.inflate(com.tencent.mm.R.layout.e3k, parent, false);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        return new wr3.e0(inflate2);
    }

    @Override // wr3.i
    public int x() {
        return this.f448781p;
    }

    @Override // wr3.i
    public sr3.g y() {
        return this.f448784s;
    }

    @Override // wr3.i
    public com.tencent.mm.storage.z3 z() {
        return this.f448785t;
    }
}
