package kf3;

/* loaded from: classes12.dex */
public class k0 extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f307376o;

    /* renamed from: p, reason: collision with root package name */
    public short[] f307377p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f307378q;

    /* renamed from: r, reason: collision with root package name */
    public int f307379r;

    /* renamed from: s, reason: collision with root package name */
    public int f307380s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f307381t;

    /* renamed from: u, reason: collision with root package name */
    public kf3.i0 f307382u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.CharSequence f307383v;

    /* renamed from: w, reason: collision with root package name */
    public int f307384w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.LayoutInflater f307385x;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f307386y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.Map f307387z;

    public k0(android.content.Context context, java.lang.String str) {
        super(context, new if3.y());
        this.f307378q = "";
        this.f307383v = "";
        this.f307384w = 0;
        this.f307387z = new java.util.HashMap();
        this.f307381t = (com.tencent.mm.ui.MMActivity) context;
        new java.util.LinkedList();
        android.database.Cursor f17 = if3.k0.Ai().f291232d.f("SELECT count(*) FROM massendinfo", null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        this.f307380s = i17;
        this.f307379r = java.lang.Math.min(i17, 10);
        this.f307376o = str;
        this.f307385x = com.tencent.mm.ui.id.b(context);
        this.f307386y = new androidx.recyclerview.widget.RecyclerView(context, null);
    }

    public static java.lang.String t(kf3.k0 k0Var, java.lang.String str) {
        k0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str != null && !str.equals("")) {
            for (java.lang.String str2 : str.split(";")) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(str2)) {
                    arrayList.add(str2);
                }
            }
            int size = arrayList.size();
            k0Var.f307384w = size;
            if (size > 0) {
                return com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ";");
            }
            str = null;
        }
        return str;
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        if3.y yVar = (if3.y) obj;
        if (yVar == null) {
            yVar = new if3.y();
        }
        yVar.b(cursor);
        return yVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x05c3, code lost:
    
        if (r1 == null) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x06f3, code lost:
    
        if (r4 == null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0145, code lost:
    
        if (((kf3.j0) r21.getTag()).f307373k != 6) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x03fd, code lost:
    
        if (r11 == null) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0319  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r20, android.view.View r21, android.view.ViewGroup r22) {
        /*
            Method dump skipped, instructions count: 2706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf3.k0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        android.database.Cursor f17 = if3.k0.Ai().f291232d.f("SELECT count(*) FROM massendinfo", null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        this.f307380s = i17;
        java.lang.String str = this.f307376o;
        if3.y s07 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? null : if3.k0.Ai().s0(str);
        if (s07 != null) {
            int z07 = if3.k0.Ai().z0(s07.f291213f);
            s(if3.k0.Ai().u0(java.lang.Math.max(z07, this.f307379r)));
            this.f307379r = java.lang.Math.max(java.lang.Math.max(z07, this.f307379r), this.f307380s);
        } else {
            this.f307379r = java.lang.Math.max(this.f307379r, 10);
            s(if3.k0.Ai().u0(this.f307379r));
        }
        int count = getCount();
        if (count > 0) {
            this.f307377p = new short[count];
        }
        notifyDataSetChanged();
    }

    public final android.view.View u(android.view.View view, int i17, if3.y yVar) {
        kf3.j0 j0Var = new kf3.j0();
        if (view != null && ((kf3.j0) view.getTag()).f307373k == 1) {
            return view;
        }
        android.view.View inflate = this.f307385x.inflate(com.tencent.mm.R.layout.f489261bx1, (android.view.ViewGroup) null);
        j0Var.f307363a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jcj);
        j0Var.f307364b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jcm);
        j0Var.f307365c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jcn);
        j0Var.f307368f = (com.tencent.mm.ui.widget.button.WeButton) inflate.findViewById(com.tencent.mm.R.id.jch);
        j0Var.f307371i = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jcs);
        j0Var.f307370h = inflate.findViewById(com.tencent.mm.R.id.jci);
        j0Var.f307373k = (short) 1;
        inflate.setTag(j0Var);
        return inflate;
    }
}
