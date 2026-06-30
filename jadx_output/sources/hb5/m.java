package hb5;

/* loaded from: classes11.dex */
public class m extends com.tencent.mm.ui.z9 implements s01.f {
    public boolean A;
    public boolean B;
    public long C;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.ui.MMFragmentActivity f280221o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f280222p;

    /* renamed from: q, reason: collision with root package name */
    public final db5.c6 f280223q;

    /* renamed from: r, reason: collision with root package name */
    public final float f280224r;

    /* renamed from: s, reason: collision with root package name */
    public final int f280225s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashMap f280226t;

    /* renamed from: u, reason: collision with root package name */
    public final float f280227u;

    /* renamed from: v, reason: collision with root package name */
    public final float f280228v;

    /* renamed from: w, reason: collision with root package name */
    public final android.content.res.ColorStateList[] f280229w;

    /* renamed from: x, reason: collision with root package name */
    public o11.g f280230x;

    /* renamed from: y, reason: collision with root package name */
    public o11.g f280231y;

    /* renamed from: z, reason: collision with root package name */
    public java.util.HashMap f280232z;

    public m(android.content.Context context, com.tencent.mm.ui.y9 y9Var, java.lang.String str) {
        super(context, new s01.b());
        this.f280223q = com.tencent.mm.ui.base.MMSlideDelView.getItemStatusCallBack();
        this.f280224r = -1.0f;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f280226t = linkedHashMap;
        this.f280227u = -1.0f;
        this.f280228v = -1.0f;
        android.content.res.ColorStateList[] colorStateListArr = new android.content.res.ColorStateList[5];
        this.f280229w = colorStateListArr;
        this.f280230x = null;
        this.f280231y = null;
        this.A = false;
        this.B = false;
        this.C = 0L;
        this.f212611h = y9Var;
        this.f280221o = (com.tencent.mm.ui.MMFragmentActivity) context;
        this.f280222p = str;
        this.f280232z = new java.util.HashMap();
        colorStateListArr[0] = i65.a.e(context, com.tencent.mm.R.color.f479232tk);
        colorStateListArr[1] = i65.a.e(context, com.tencent.mm.R.color.f479417yo);
        colorStateListArr[3] = i65.a.e(context, com.tencent.mm.R.color.a0c);
        colorStateListArr[2] = i65.a.e(context, com.tencent.mm.R.color.f479415ym);
        colorStateListArr[2] = i65.a.e(context, com.tencent.mm.R.color.f479415ym);
        colorStateListArr[4] = i65.a.e(context, com.tencent.mm.R.color.f479305vl);
        linkedHashMap.put(s01.a.ALL, java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bqq));
        linkedHashMap.put(s01.a.DEPARTMENT, java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bqr));
        linkedHashMap.put(s01.a.EXTERNAL, java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bqs));
        this.f280225s = i65.a.b(context, 8);
        this.f280224r = i65.a.h(context, com.tencent.mm.R.dimen.f479897ia);
        this.f280227u = i65.a.h(context, com.tencent.mm.R.dimen.f479853h2);
        this.f280228v = i65.a.h(context, com.tencent.mm.R.dimen.f479930ja);
        o11.f fVar = new o11.f();
        java.lang.String str2 = s01.r.f401924a;
        fVar.f342083g = qk.b.a(str);
        fVar.f342078b = true;
        fVar.f342095s = true;
        fVar.f342091o = com.tencent.mm.R.raw.default_avatar;
        fVar.f342096t = true;
        fVar.f342097u = i65.a.f(r8, com.tencent.mm.R.dimen.f479890i3) * 0.1f;
        this.f280230x = fVar.a();
        fVar.f342097u = i65.a.f(r8, com.tencent.mm.R.dimen.f479566i) * 0.1f;
        this.f280231y = fVar.a();
    }

    @Override // s01.f
    public void a(s01.e eVar) {
        if (this.A) {
            f();
        } else {
            this.B = true;
        }
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        s01.b bVar = (s01.b) obj;
        if (bVar == null) {
            bVar = new s01.b();
            this.C = bVar.field_bizChatId;
        }
        bVar.field_bizChatId = this.C;
        bVar.convertFrom(cursor);
        return bVar;
    }

    @Override // com.tencent.mm.ui.z9, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        super.g(i17, a1Var, obj);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04e9  */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r29, android.view.View r30, android.view.ViewGroup r31) {
        /*
            Method dump skipped, instructions count: 1430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb5.m.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 1;
    }

    @Override // com.tencent.mm.ui.z9
    public android.database.Cursor j() {
        return super.j();
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9, l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (this.A) {
            f();
        } else {
            this.B = true;
        }
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        c();
        s(r01.q3.aj().L0(this.f280222p));
        com.tencent.mm.ui.y9 y9Var = this.f212611h;
        if (y9Var != null) {
            y9Var.b(null);
        }
        notifyDataSetChanged();
    }

    public final java.lang.String t(java.lang.String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(str);
    }

    public void u(long j17) {
        java.util.HashMap hashMap = this.f280232z;
        if (hashMap != null) {
            hashMap.remove(j17 + "");
        }
    }
}
