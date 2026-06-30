package yk5;

/* loaded from: classes11.dex */
public class e extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f462875o;

    /* renamed from: p, reason: collision with root package name */
    public final android.content.res.ColorStateList[] f462876p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f462877q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f462878r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f462879s;

    /* renamed from: t, reason: collision with root package name */
    public bb5.e f462880t;

    /* renamed from: u, reason: collision with root package name */
    public final bb5.g f462881u;

    public e(android.content.Context context, com.tencent.mm.ui.y9 y9Var) {
        super(context, new com.tencent.mm.storage.l4());
        this.f462875o = null;
        this.f462876p = r1;
        this.f462878r = true;
        this.f462880t = null;
        this.f462881u = new bb5.g(15, new yk5.a(this));
        this.f212611h = y9Var;
        android.content.res.ColorStateList[] colorStateListArr = {i65.a.e(context, com.tencent.mm.R.color.f479416yn), i65.a.e(context, com.tencent.mm.R.color.f479417yo)};
        this.f462877q = new java.util.HashMap();
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) obj;
        if (cursor.getString(0) != null && cursor.getString(0).equals("1")) {
            if (l4Var == null) {
                l4Var = new com.tencent.mm.storage.l4();
            }
            l4Var.convertFrom(cursor);
        } else if (cursor.getString(0).equals("2")) {
            com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
            com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.storage.z3.M2;
            com.tencent.mm.storage.z3 L = ((com.tencent.mm.storage.k4) q17).L(cursor.getString(cursor.getColumnIndex(dm.i4.COL_USERNAME)));
            if (L == null) {
                L = new com.tencent.mm.storage.z3();
                L.convertFrom(cursor);
                ((com.tencent.mm.storage.k4) c01.d9.b().q()).s0(L, false);
            }
            if (l4Var == null) {
                l4Var = new com.tencent.mm.storage.l4();
            }
            l4Var.W1(2);
            l4Var.n1(-1L);
            l4Var.M1(1);
            l4Var.l1(this.f212608e.getString(com.tencent.mm.R.string.ffi));
            l4Var.b2(L.d1());
            l4Var.Y1(0);
            l4Var.S1(java.lang.Integer.toString(1));
        } else {
            if (l4Var == null) {
                l4Var = new com.tencent.mm.storage.l4();
            }
            l4Var.convertFrom(cursor);
        }
        return l4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e4  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            Method dump skipped, instructions count: 1111
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yk5.e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9, l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.util.HashMap hashMap = this.f462877q;
        if (str != null && !str.equals("") && hashMap != null) {
            hashMap.remove(str);
        } else if (hashMap != null) {
            hashMap.clear();
        }
        f();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        android.database.Cursor[] cursorArr = new android.database.Cursor[2];
        cursorArr[0] = c01.d9.b().A().a(c01.e2.f37121e, this.f462875o, this.f462879s);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List list = this.f462875o;
        if (list != null && list.size() > 0) {
            arrayList.addAll(this.f462875o);
        }
        while (cursorArr[0].moveToNext()) {
            try {
                android.database.Cursor cursor = cursorArr[0];
                java.lang.String string = cursor.getString(cursor.getColumnIndex(dm.i4.COL_USERNAME));
                arrayList.add(string);
                if (!com.tencent.mm.storage.z3.R4(string)) {
                    arrayList2.add(string);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SearchConversationAdapter", e17, "", new java.lang.Object[0]);
            }
        }
        cursorArr[1] = c01.d9.b().z().c(this.f462879s, "@micromsg.with.all.biz.qq.com", null, arrayList, false, true, true, 2, arrayList2);
        s(new android.database.MergeCursor(cursorArr));
        notifyDataSetChanged();
    }
}
