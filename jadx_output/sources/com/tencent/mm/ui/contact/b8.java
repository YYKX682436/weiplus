package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class b8 extends com.tencent.mm.ui.contact.e {
    public final java.util.HashSet T;
    public final java.lang.String U;
    public com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment V;
    public java.util.List W;

    public b8(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, boolean z17, java.lang.String str3) {
        super(context, str, str2, i17, z17);
        this.T = new java.util.HashSet();
        this.W = null;
        this.U = str3;
    }

    public final java.util.List D() {
        java.util.List list = this.W;
        if (list != null) {
            return list;
        }
        this.W = new java.util.ArrayList();
        int count = super.getCount();
        boolean z17 = false;
        for (int i17 = 0; i17 < count; i17++) {
            this.W.add(super.getItem(i17));
        }
        if (E()) {
            com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).q("wxid_wi_1d142z0zdj03");
            com.tencent.mm.storage.g gVar = new com.tencent.mm.storage.g();
            gVar.b(q17);
            int i18 = 0;
            while (true) {
                if (i18 >= this.W.size()) {
                    break;
                }
                java.lang.String str = ((com.tencent.mm.storage.g) this.W.get(i18)).field_descWordingQuanpin;
                java.lang.String str2 = gVar.field_descWordingQuanpin;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && str.compareTo(str2) > 0) {
                    this.W.add(i18, gVar);
                    z17 = true;
                    break;
                }
                i18++;
            }
            if (!z17) {
                this.W.add(gVar);
            }
        }
        return this.W;
    }

    public final boolean E() {
        com.tencent.mm.storage.z3 q17;
        if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Ai("wxid_wi_1d142z0zdj03") && (q17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).q("wxid_wi_1d142z0zdj03")) != null) {
            return q17.r2();
        }
        return false;
    }

    @Override // com.tencent.mm.ui.contact.e, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj != null && (obj instanceof java.lang.String) && a1Var == c01.d9.b().q() && com.tencent.mm.storage.z3.m4((java.lang.String) obj)) {
            this.V.f206526o = true;
        }
    }

    @Override // com.tencent.mm.ui.contact.e, com.tencent.mm.ui.k3, android.widget.Adapter
    public int getCount() {
        return E() ? super.getCount() + 1 : super.getCount();
    }

    @Override // com.tencent.mm.ui.contact.e
    public void s(com.tencent.mm.storage.g gVar, com.tencent.mm.ui.contact.d dVar) {
        java.lang.CharSequence charSequence;
        gVar.getClass();
        try {
            if (com.tencent.mm.storage.z3.m4(gVar.e())) {
                j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.lang.String c17 = gVar.c();
                i65.a.h(this.f209021h, com.tencent.mm.R.dimen.f479897ia);
                ((l41.q2) b0Var).getClass();
                charSequence = com.tencent.mm.pluginsdk.ui.span.c0.i(context, c17);
            } else {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = this.f209021h;
                java.lang.String c18 = gVar.c();
                java.lang.String e17 = gVar.e();
                if (c18 == null || c18.length() <= 0) {
                    c18 = e17;
                }
                charSequence = ((ke0.e) xVar).bj(context2, c18, i65.a.h(this.f209021h, com.tencent.mm.R.dimen.f479897ia));
            }
        } catch (java.lang.Exception unused) {
            charSequence = null;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        dVar.f206649b.setText(charSequence);
    }

    @Override // com.tencent.mm.ui.contact.e
    public void t(com.tencent.mm.storage.g gVar, com.tencent.mm.ui.contact.d dVar) {
        java.lang.String str = gVar.field_descWordingId;
        java.util.HashSet hashSet = this.T;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(gVar.field_openImAppid, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        r0.close();
        r0 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).R(r6.f206674x, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if ((r0 instanceof e95.h) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        r0 = new e95.j(new e95.h[]{(e95.h) d95.d.a(), (e95.h) r0});
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x002b, code lost:
    
        if (r0.moveToFirst() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x002d, code lost:
    
        r2 = r0.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r2) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        r1.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
    
        if (r0.moveToNext() != false) goto L15;
     */
    @Override // com.tencent.mm.ui.contact.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.database.Cursor v() {
        /*
            r6 = this;
            java.lang.System.currentTimeMillis()
            java.lang.Class<i41.l> r0 = i41.l.class
            i95.m r0 = i95.n0.c(r0)
            i41.l r0 = (i41.l) r0
            u41.d r0 = r0.Ai()
            r0.getClass()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.lang.String r2 = r6.U
            java.lang.String[] r2 = new java.lang.String[]{r2}
            l75.k0 r0 = r0.f424625d
            java.lang.String r3 = "select distinct appid from OpenIMAppIdInfo where acctTypeId=? "
            r4 = 2
            android.database.Cursor r0 = r0.f(r3, r2, r4)
            boolean r2 = r0.moveToFirst()
            r3 = 0
            if (r2 == 0) goto L40
        L2d:
            java.lang.String r2 = r0.getString(r3)
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            if (r5 != 0) goto L3a
            r1.add(r2)
        L3a:
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L2d
        L40:
            r0.close()
            c01.f r0 = c01.d9.b()
            com.tencent.mm.storage.e8 r0 = r0.q()
            java.util.List r2 = r6.f206674x
            android.content.Context r5 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r5 = com.tencent.mm.sdk.platformtools.m2.f(r5)
            com.tencent.mm.storage.k4 r0 = (com.tencent.mm.storage.k4) r0
            android.database.Cursor r0 = r0.R(r2, r5, r1)
            boolean r1 = r0 instanceof e95.h
            if (r1 == 0) goto L72
            e95.j r1 = new e95.j
            e95.h[] r2 = new e95.h[r4]
            android.database.Cursor r4 = d95.d.a()
            e95.h r4 = (e95.h) r4
            r2[r3] = r4
            r3 = 1
            e95.h r0 = (e95.h) r0
            r2[r3] = r0
            r1.<init>(r2)
            r0 = r1
        L72:
            java.lang.System.currentTimeMillis()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.b8.v():android.database.Cursor");
    }

    @Override // com.tencent.mm.ui.contact.e
    public java.lang.String w(com.tencent.mm.storage.g gVar, int i17) {
        java.lang.String str = gVar.field_descWording;
        return com.tencent.mm.sdk.platformtools.t8.K0(str) ? "#" : str;
    }

    @Override // com.tencent.mm.ui.contact.e, android.widget.Adapter
    /* renamed from: x */
    public com.tencent.mm.storage.g getItem(int i17) {
        if (!E()) {
            return super.getItem(i17);
        }
        if (i17 < 0 || i17 >= D().size()) {
            return null;
        }
        com.tencent.mm.storage.g gVar = (com.tencent.mm.storage.g) D().get(i17);
        gVar.f();
        return gVar;
    }

    @Override // com.tencent.mm.ui.contact.e
    public int y(com.tencent.mm.storage.g gVar, int i17) {
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e("OpenIMContactAdapter", "contact is null, position:%d", java.lang.Integer.valueOf(i17));
            return -1;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(gVar.field_descWording)) {
            return -1;
        }
        return gVar.field_descWording.hashCode();
    }
}
