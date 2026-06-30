package rx4;

/* loaded from: classes8.dex */
public final class u0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f401280d;

    /* renamed from: e, reason: collision with root package name */
    public int f401281e;

    /* renamed from: f, reason: collision with root package name */
    public int f401282f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f401283g;

    /* renamed from: h, reason: collision with root package name */
    public rx4.w0 f401284h;

    /* renamed from: i, reason: collision with root package name */
    public float f401285i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f401286m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f401287n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f401288o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f401289p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f401280d = "FTSNativeTeachRecommendBoxUIC";
        this.f401285i = 1.0f;
        this.f401286m = new java.util.ArrayList();
        this.f401287n = new java.util.LinkedHashMap();
    }

    public final java.util.Map T6() {
        java.lang.String str;
        java.util.Map map = this.f401287n;
        if (map.size() <= 0) {
            return null;
        }
        java.util.Iterator it = ((java.util.LinkedHashMap) map).values().iterator();
        if (!it.hasNext()) {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            next = java.lang.Long.valueOf(java.lang.Math.min(((java.lang.Number) next).longValue(), ((java.lang.Number) it.next()).longValue()));
        }
        long longValue = ((java.lang.Number) next).longValue();
        jz5.l[] lVarArr = new jz5.l[2];
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f401282f);
        sb6.append("|39|");
        rx4.w0 w0Var = this.f401284h;
        if (w0Var == null || (str = w0Var.f401317d) == null) {
            str = "";
        }
        sb6.append(fp.s0.b(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        lVarArr[0] = new jz5.l("itemid", sb6.toString());
        lVarArr[1] = new jz5.l("item_exptime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - longValue));
        return kz5.c1.k(lVarArr);
    }

    public final void U6(org.json.JSONArray jSONArray, boolean z17) {
        java.lang.Object obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hitest] fillRecommendBox isCache=");
        sb6.append(z17);
        sb6.append(", data.len=");
        sb6.append(jSONArray != null ? jSONArray.length() : -1);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f401280d;
        com.tencent.mars.xlog.Log.i(str, sb7);
        jz5.f0 f0Var = null;
        if (jSONArray != null) {
            int i17 = 0;
            while (true) {
                boolean z18 = true;
                if (!(i17 < jSONArray.length())) {
                    obj = null;
                    break;
                }
                obj = jSONArray.get(i17);
                i17++;
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                if (((org.json.JSONObject) obj).optInt("type") != 39) {
                    z18 = false;
                }
                if (z18) {
                    break;
                }
            }
            if (obj != null) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[hitest] fillRecommendBox found type=39, items=");
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("items");
                sb8.append(optJSONArray != null ? optJSONArray.length() : 0);
                com.tencent.mars.xlog.Log.i(str, sb8.toString());
                this.f401283g = z17;
                android.app.Activity context = getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                this.f401284h = new rx4.w0(jSONObject, ((rx4.h2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(rx4.h2.class)).i7());
                pm0.v.X(new rx4.t0(this));
                if (!z17) {
                    try {
                        org.json.JSONArray optJSONArray2 = ((org.json.JSONObject) obj).optJSONArray("items");
                        if (optJSONArray2 != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            c75.c.d(optJSONArray2, new rx4.l0(arrayList));
                            ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().D("websearch:FINDER_REC_QUERY_PERMANENT_KEY", new org.json.JSONArray((java.util.Collection) arrayList).toString());
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null) {
            pm0.v.X(new rx4.m0(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        android.view.View findViewById;
        super.onCreateAfter(bundle);
        this.f401285i = getActivity().getResources().getDisplayMetrics().density;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f486554s23);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((rx4.h2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(rx4.h2.class)).E || (findViewById = viewGroup.findViewById(com.tencent.mm.R.id.cgz)) == null) {
                return;
            }
            float f17 = 16;
            float f18 = this.f401285i;
            findViewById.setPadding((int) (f17 * f18), 0, (int) (f17 * f18), (int) (10 * f18));
        }
    }
}
