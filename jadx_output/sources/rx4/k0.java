package rx4;

/* loaded from: classes8.dex */
public final class k0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f401209d;

    /* renamed from: e, reason: collision with root package name */
    public int f401210e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f401211f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f401212g;

    /* renamed from: h, reason: collision with root package name */
    public rx4.l f401213h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f401214i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f401215m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f401209d = "FTSNativeTeachHotspotBoxUIC";
        float f17 = activity.getResources().getDisplayMetrics().density;
        this.f401214i = new java.util.ArrayList();
        this.f401215m = new java.util.LinkedHashMap();
    }

    public static final void T6(rx4.k0 k0Var, vu4.a actionId, rx4.m mVar, int i17) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(k0Var.f401210e);
        sb6.append("|42|");
        rx4.l lVar = k0Var.f401213h;
        if (lVar == null || (str = lVar.f401220b) == null) {
            str = "";
        }
        sb6.append(fp.s0.b(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        java.lang.String itemInfo = sb6.toString();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        int i18 = i17 + 1;
        sb7.append(i18);
        sb7.append('|');
        sb7.append(i18);
        java.lang.String g07 = kz5.n0.g0(kz5.c0.i(sb7.toString(), mVar.f401230c, "", "1", fp.s0.b(mVar.f401229b, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), "", "", "finder_hot_video", ""), "|", null, null, 0, null, null, 62, null);
        boolean z17 = k0Var.f401211f;
        kotlin.jvm.internal.o.g(actionId, "actionId");
        kotlin.jvm.internal.o.g(itemInfo, "itemInfo");
        android.app.Activity context = k0Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(rx4.h2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        rx4.h2 h2Var = (rx4.h2) a17;
        h2Var.a7();
        h2Var.q7(actionId, itemInfo, g07, z17, kz5.c1.l(new jz5.l("clickId", h2Var.f401183y)));
    }

    public final rx4.s2 U6(int i17) {
        java.util.List list;
        java.lang.String str;
        java.util.List list2;
        this.f401210e = i17;
        android.graphics.Rect rect = new android.graphics.Rect();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list3 = this.f401214i;
        int size = ((java.util.ArrayList) list3).size();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            rx4.m mVar = null;
            if (i19 >= size) {
                break;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
            java.util.Map map = this.f401215m;
            if (!map.containsKey(valueOf)) {
                android.view.View view = (android.view.View) ((java.util.ArrayList) list3).get(i19);
                rx4.l lVar = this.f401213h;
                if (lVar != null && (list2 = lVar.f401222d) != null) {
                    mVar = (rx4.m) kz5.n0.a0(list2, i19);
                }
                if (mVar != null) {
                    view.getLocalVisibleRect(rect);
                    int i27 = rect.top;
                    if (i27 == 0 && rect.bottom - i27 >= view.getHeight() - 1) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        int i28 = i19 + 1;
                        sb6.append(i28);
                        sb6.append('|');
                        sb6.append(i28);
                        arrayList.add(kz5.n0.g0(kz5.c0.i(sb6.toString(), mVar.f401230c, "", "1", fp.s0.b(mVar.f401229b, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), "", "", "finder_hot_video", ""), "|", null, null, 0, null, null, 62, null));
                        map.put(java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    }
                }
            }
            i19++;
        }
        if (!(!arrayList.isEmpty())) {
            rx4.l lVar2 = this.f401213h;
            if (lVar2 != null && (list = lVar2.f401222d) != null) {
                i18 = ((java.util.ArrayList) list).size();
            }
            if (i18 > 0) {
                return new rx4.s2(vu4.a.f440238e, "", "", this.f401211f, null, 16, null);
            }
            return null;
        }
        vu4.a aVar = vu4.a.f440239f;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(i17);
        sb7.append("|42|");
        rx4.l lVar3 = this.f401213h;
        if (lVar3 == null || (str = lVar3.f401220b) == null) {
            str = "";
        }
        sb7.append(fp.s0.b(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        return new rx4.s2(aVar, sb7.toString(), kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null), this.f401211f, null, 16, null);
    }

    public final void V6(rx4.l lVar, boolean z17, boolean z18) {
        java.util.List list;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hitest] fillHotspotBlock block.items=");
        sb6.append((lVar == null || (list = lVar.f401222d) == null) ? -1 : ((java.util.ArrayList) list).size());
        sb6.append(", isCache=");
        sb6.append(z17);
        sb6.append(", isTabMode=");
        sb6.append(z18);
        com.tencent.mars.xlog.Log.i(this.f401209d, sb6.toString());
        this.f401211f = z17;
        this.f401213h = lVar;
        this.f401212g = z18;
        if (lVar != null) {
            pm0.v.X(new rx4.j0(this));
        } else {
            pm0.v.X(new rx4.f0(this));
        }
    }

    public final void W6(org.json.JSONArray jSONArray, boolean z17) {
        org.json.JSONObject jSONObject;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hitest] fillHotspotBox isCache=");
        sb6.append(z17);
        sb6.append(", data.len=");
        sb6.append(jSONArray != null ? jSONArray.length() : -1);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f401209d;
        com.tencent.mars.xlog.Log.i(str, sb7);
        jz5.f0 f0Var = null;
        if (jSONArray != null) {
            int length = jSONArray.length();
            int i17 = 0;
            while (true) {
                if (i17 < length) {
                    jSONObject = jSONArray.optJSONObject(i17);
                    if (jSONObject != null && jSONObject.optInt("type") == 42) {
                        break;
                    } else {
                        i17++;
                    }
                } else {
                    jSONObject = null;
                    break;
                }
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[hitest] fillHotspotBox found type=42: ");
            sb8.append(jSONObject != null);
            com.tencent.mars.xlog.Log.i(str, sb8.toString());
            jz5.f0 f0Var2 = jz5.f0.f302826a;
            if (jSONObject != null) {
                this.f401211f = z17;
                this.f401212g = false;
                this.f401213h = new rx4.l(jSONObject);
                pm0.v.X(new rx4.j0(this));
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                pm0.v.X(new rx4.g0(this));
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            pm0.v.X(new rx4.h0(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        pm0.v.X(new rx4.j0(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
    }
}
