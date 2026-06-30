package i53;

/* loaded from: classes8.dex */
public class k0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f288622d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f288623e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f288624f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f288625g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f288626h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f288627i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public vl1.p f288628m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i53.n0 f288629n;

    public k0(i53.n0 n0Var, android.content.Context context) {
        this.f288629n = n0Var;
        this.f288622d = context;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f288627i.size() + (!this.f288625g.isEmpty() ? 1 : 0) + (!this.f288626h.isEmpty() ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (i17 >= 0 && i17 < getItemCount()) {
            java.util.LinkedList linkedList = this.f288625g;
            if (i17 == 0 && !linkedList.isEmpty()) {
                return Integer.MAX_VALUE;
            }
            if (i17 == getItemCount() - 1 && !this.f288626h.isEmpty()) {
                return 2147483646;
            }
            int i18 = i17 - (!linkedList.isEmpty() ? 1 : 0);
            if (i18 >= 0) {
                java.util.LinkedList linkedList2 = this.f288627i;
                if (i18 < linkedList2.size()) {
                    p33.l lVar = (p33.l) linkedList2.get(i18);
                    if (lVar != null && lVar.f351603e) {
                        return 1;
                    }
                    if (lVar != null && lVar.f351604f) {
                        return 2;
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r9, int r10) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i53.k0.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        if (i17 == Integer.MAX_VALUE) {
            if (this.f288623e == null) {
                this.f288623e = (android.view.ViewGroup) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cxf, viewGroup, false);
            }
            this.f288623e.removeAllViews();
            java.util.Iterator it = this.f288625g.iterator();
            while (it.hasNext()) {
                this.f288623e.addView((android.view.View) it.next());
            }
            return new i53.m0(this.f288623e);
        }
        if (i17 != 2147483646) {
            android.content.Context context = this.f288622d;
            return i17 == 1 ? new i53.m0(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489159bi2, viewGroup, false)) : i17 == 2 ? new i53.m0(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bg7, viewGroup, false)) : new i53.m0(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489157bi0, viewGroup, false));
        }
        if (this.f288624f == null) {
            this.f288624f = (android.view.ViewGroup) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cxf, viewGroup, false);
        }
        this.f288624f.removeAllViews();
        java.util.Iterator it6 = this.f288626h.iterator();
        while (it6.hasNext()) {
            this.f288624f.addView((android.view.View) it6.next());
        }
        return new i53.m0(this.f288624f);
    }

    public final int x(int i17) {
        if (i17 >= 0) {
            java.util.LinkedList linkedList = this.f288627i;
            if (i17 < linkedList.size()) {
                int i18 = 0;
                for (int i19 = 0; i19 < i17 + 1; i19++) {
                    p33.l lVar = (p33.l) linkedList.get(i19);
                    if (!lVar.f351603e && !lVar.f351604f) {
                        i18++;
                    }
                }
                return i18;
            }
        }
        return i17;
    }

    public final void y(int i17, int i18, java.lang.String str, java.lang.String str2) {
        i53.n0 n0Var = this.f288629n;
        int i19 = n0Var.f288668b2 == 8762 ? 7 : 6;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("videoid", str2);
        com.tencent.mm.game.report.l.f(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, n0Var.f288668b2, i17, i18, str, n0Var.f288669c2, lj0.a.a(i19, hashMap));
    }
}
