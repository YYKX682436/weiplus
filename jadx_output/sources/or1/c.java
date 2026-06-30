package or1;

/* loaded from: classes12.dex */
public class c extends pr1.a {

    /* renamed from: o, reason: collision with root package name */
    public static or1.b f347459o;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f347460h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f347461i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.CharSequence f347462j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.CharSequence f347463k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f347464l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f347465m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f347466n;

    public c(java.lang.Object obj) {
        super(5, obj);
    }

    @Override // fb5.c
    public void a(android.content.Context context, fb5.a aVar, java.lang.Object... objArr) {
        java.lang.Object obj;
        r45.gx5 gx5Var;
        qk.o oVar;
        java.lang.CharSequence charSequence;
        if (this.f260883c) {
            return;
        }
        if (context == null || aVar == null || (obj = this.f260882b) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizContactDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            return;
        }
        if (!(aVar instanceof or1.a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizContactDataItem", "The DataItem is not a instance of BizContactViewHolder.");
            return;
        }
        if (!(obj instanceof r45.xp)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizContactDataItem", "The ViewHolder is not a instance of BusinessResultItem.");
            return;
        }
        or1.a aVar2 = (or1.a) aVar;
        r45.pp ppVar = ((r45.xp) obj).f390299e;
        if (ppVar == null || (gx5Var = ppVar.f383263f) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizContactDataItem", "The brItem.ContactItem or brItem.ContactItem.ContactItem is null.");
            return;
        }
        r45.rp rpVar = ppVar.f383262e;
        if (objArr != null && objArr.length > 1) {
            java.lang.Object obj2 = objArr[1];
            if (obj2 instanceof java.util.List) {
                this.f357930d = (java.util.List) obj2;
            }
        }
        this.f347464l = gx5Var.f375614d.f372756d;
        this.f347462j = rpVar == null ? "" : rpVar.f385068e;
        r45.du5 du5Var = gx5Var.f375615e;
        qk.j jVar = null;
        try {
            this.f347461i = lr1.m.c(context, du5Var == null ? null : du5Var.f372756d, this.f357930d, (int) aVar2.f347448b.getTextSize());
        } catch (java.lang.Exception unused) {
            this.f347461i = "";
        }
        java.lang.String str = gx5Var.f375614d.f372756d;
        r45.wa0 wa0Var = gx5Var.f375628u;
        if (wa0Var != null) {
            oVar = new qk.o();
            oVar.field_username = str;
            int i17 = lr1.m.f320685a;
            oVar.field_brandFlag = wa0Var.f389001d;
            oVar.field_brandIconURL = wa0Var.f389004g;
            oVar.field_brandInfo = wa0Var.f389003f;
            oVar.field_extInfo = wa0Var.f389002e;
        } else {
            oVar = null;
        }
        if (oVar != null && oVar.D0(false) != null) {
            jVar = oVar.D0(false).k();
        }
        if (jVar != null) {
            qk.n D0 = oVar.D0(false);
            org.json.JSONObject jSONObject = D0.f364256a;
            if (jSONObject != null) {
                D0.f364278w = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("IsTrademarkProtection"), 0) == 1;
            }
            this.f347466n = D0.f364278w && !com.tencent.mm.sdk.platformtools.t8.K0(jVar.f364177b);
            this.f347465m = gx5Var.f375621n != 0;
        }
        java.lang.String str2 = gx5Var.f375624q;
        if (this.f357930d.size() > 0 && str2 != null && str2.toLowerCase().equals(((java.lang.String) this.f357930d.get(0)).toLowerCase())) {
            try {
                this.f347463k = lr1.m.c(context, str2, this.f357930d, (int) aVar2.f347452f.getTextSize());
                this.f347463k = android.text.TextUtils.concat(context.getResources().getString(com.tencent.mm.R.string.f492946id5), this.f347463k);
            } catch (java.lang.Exception unused2) {
                this.f347463k = "";
            }
        }
        java.lang.CharSequence charSequence2 = this.f347463k;
        if (charSequence2 == null || charSequence2.length() == 0 || (charSequence = this.f347462j) == null || ((java.lang.String) charSequence).length() == 0) {
            try {
                this.f347460h = lr1.m.c(context, gx5Var.f375619i, this.f357930d, (int) aVar2.f347450d.getTextSize());
            } catch (java.lang.Exception unused3) {
                this.f347460h = "";
            }
        }
        this.f260883c = true;
    }

    @Override // fb5.c
    public fb5.a b() {
        return new or1.a();
    }

    @Override // fb5.c
    public fb5.b c() {
        if (f347459o == null) {
            f347459o = new or1.b();
        }
        return f347459o;
    }
}
