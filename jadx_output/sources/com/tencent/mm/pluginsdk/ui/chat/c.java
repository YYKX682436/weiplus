package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class c extends android.widget.BaseAdapter {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f190202m = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f190204e;

    /* renamed from: f, reason: collision with root package name */
    public final int f190205f;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.AppGrid f190208i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f190203d = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map f190206g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f190207h = false;

    public c(com.tencent.mm.pluginsdk.ui.chat.AppGrid appGrid, android.content.Context context, java.util.List list, java.util.Map map, java.util.ArrayList arrayList) {
        this.f190208i = appGrid;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(list == null ? -1 : list.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppGrid", "AppGridAdapter infoList size:%s ", objArr);
        this.f190204e = com.tencent.mm.sdk.platformtools.j.d(context, 56.0f);
        this.f190205f = com.tencent.mm.sdk.platformtools.j.d(context, 53.3f);
        f(list, map, arrayList);
    }

    public final void a(com.tencent.mm.pluginsdk.ui.chat.e eVar, java.lang.String str, java.lang.String str2) {
        java.util.Map map = this.f190206g;
        if (map == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppGrid", "func[attachHarcodeServiceApp] harcodeServiceAppInfoMap null");
            return;
        }
        com.tencent.mm.pluginsdk.model.app.m mVar = (com.tencent.mm.pluginsdk.model.app.m) map.get(str);
        if (mVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppGrid", "func[attachHarcodeServiceApp] info null");
            return;
        }
        l75.e0 e0Var = com.tencent.mm.pluginsdk.model.app.m.f188983f2;
        if ("wxce6f23b478a3a2a2".equals(mVar.field_appId)) {
            eVar.f190283g.setImageResource(com.tencent.mm.R.raw.panel_icon_transfer);
        } else if ("wx6fa7e3bab7e15415".equals(mVar.field_appId)) {
            eVar.f190283g.setImageResource(com.tencent.mm.R.raw.panel_icon_luckymoney);
        } else if ("wx7302cee7c7d6d7d6".equals(mVar.field_appId)) {
            eVar.f190283g.setImageResource(com.tencent.mm.R.raw.panel_icon_card);
            eVar.f190289p = "card";
        } else if ("wx3cc22b542de028d4".equals(mVar.field_appId)) {
            eVar.f190283g.setImageResource(com.tencent.mm.R.raw.panel_icon_aa);
        } else {
            eVar.f190283g.setImageResource(com.tencent.mm.R.drawable.bvu);
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str2);
        com.tencent.mm.pluginsdk.ui.chat.AppGrid appGrid = this.f190208i;
        if (K0) {
            eVar.f190281e.setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(appGrid.f189913e, mVar));
        } else {
            android.widget.TextView textView = eVar.f190281e;
            android.content.Context context = appGrid.f189913e;
            if (context != null) {
                java.lang.String m17 = com.tencent.mm.pluginsdk.model.app.w.m(context);
                java.lang.String str3 = m17.equalsIgnoreCase("zh_CN") ? mVar.field_appName : null;
                if (m17.equalsIgnoreCase("en")) {
                    str3 = com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appName_en) ? mVar.field_appName : mVar.field_appName_en;
                }
                if (m17.equalsIgnoreCase("zh_TW") || m17.equalsIgnoreCase("zh_HK")) {
                    if (m17.equalsIgnoreCase("zh_HK")) {
                        str3 = com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appName_hk) ? mVar.field_appName_tw : mVar.field_appName_hk;
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        str3 = com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appName_tw) ? mVar.field_appName : mVar.field_appName_tw;
                    }
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    str2 = str3;
                }
            }
            textView.setText(str2);
        }
        if (mVar.G0()) {
            if ((mVar.field_serviceAppInfoFlag & 2) != 0) {
                if (appGrid.f189920o == null) {
                    appGrid.f189920o = appGrid.f189913e.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
                }
                if (appGrid.f189920o.getBoolean("SP_KEY_SERVICE_APP_PREFIX_" + mVar.field_appId, true)) {
                    eVar.f190285i.setVisibility(0);
                }
            }
        }
        if ("wxce6f23b478a3a2a2".equals(mVar.field_appId)) {
            int intValue = ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
            if (intValue <= 1) {
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.P1(((java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REMITTANCE_STRING_SYNC, "")).split(";")).contains(intValue + "")) {
                return;
            }
            eVar.f190285i.setVisibility(0);
            return;
        }
        if ("wx6fa7e3bab7e15415".equals(mVar.field_appId)) {
            int intValue2 = ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
            if (intValue2 <= 1) {
                eVar.f190285i.setVisibility(8);
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.P1(((java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_STRING_SYNC, "")).split(";")).contains(intValue2 + "")) {
                return;
            }
            eVar.f190285i.setVisibility(0);
        }
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.pluginsdk.model.app.m getItem(int i17) {
        com.tencent.mm.pluginsdk.ui.chat.AppGrid appGrid = this.f190208i;
        int i18 = appGrid.f189918m;
        if (i17 < i18 && appGrid.f189917i == 0) {
            return null;
        }
        int i19 = appGrid.f189917i;
        int i27 = appGrid.f189915g;
        if ((i19 * i27) + i17 < i18) {
            return null;
        }
        int i28 = (i17 - i18) + (i19 * i27);
        java.util.List list = this.f190203d;
        if (i28 >= ((java.util.ArrayList) list).size()) {
            return null;
        }
        return (com.tencent.mm.pluginsdk.model.app.m) ((java.util.ArrayList) list).get((i17 - appGrid.f189918m) + (appGrid.f189917i * appGrid.f189915g));
    }

    public final java.util.Map d(int i17, com.tencent.mm.pluginsdk.ui.chat.e eVar) {
        com.tencent.mm.pluginsdk.ui.chat.AppGrid appGrid = this.f190208i;
        java.lang.ref.WeakReference weakReference = appGrid.f189921p;
        yb5.d dVar = weakReference == null ? null : (yb5.d) weakReference.get();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppGrid", "hy: no attaching chatting!");
            return hashMap;
        }
        int i18 = 1;
        int i19 = eVar.f190287n.getVisibility() == 0 ? 1 : 0;
        java.lang.String str = eVar.f190289p;
        int i27 = appGrid.f189917i;
        int numColumns = (i17 % appGrid.getNumColumns()) + 1;
        java.lang.String str2 = (i27 + 1) + "#" + ((i17 / appGrid.getNumColumns()) + 1) + "#" + numColumns;
        java.lang.String str3 = appGrid.f189922q;
        java.lang.String x17 = dVar.x();
        if (com.tencent.mm.storage.z3.m4(x17)) {
            i18 = 3;
        } else if (com.tencent.mm.storage.z3.N4(x17)) {
            i18 = 2;
        }
        if (c01.e2.R(x17)) {
            i18 = 4;
        }
        java.lang.String x18 = dVar.x();
        hashMap.put("has_reddot", java.lang.Integer.valueOf(i19));
        hashMap.put("attachment_item_name", str);
        hashMap.put("attachment_item_index", str2);
        hashMap.put("attachment_exp_sessionid", str3);
        hashMap.put("chat_name", x18);
        hashMap.put("chat_type", java.lang.Integer.valueOf(i18));
        if ("voice_input".equals(str)) {
            hashMap.put("log_version", "20260409");
        }
        return hashMap;
    }

    public void f(java.util.List list, java.util.Map map, java.util.ArrayList arrayList) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(list == null ? -1 : list.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppGrid", "[refreshInitData] AppGridAdapter infoList size:%s ", objArr);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = java.lang.Integer.valueOf(map == null ? -1 : map.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppGrid", "[refreshInitData] hardcodeServiceAppInfoMap size:%s ", objArr2);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        objArr3[0] = java.lang.Integer.valueOf(arrayList != null ? arrayList.size() : -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppGrid", "[refreshInitData] unCertainEnters size:%s ", objArr3);
        java.util.List list2 = this.f190203d;
        list2.clear();
        list2.addAll(list);
        list2.addAll(arrayList);
        this.f190206g = map;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.pluginsdk.ui.chat.y b17 = com.tencent.mm.pluginsdk.ui.chat.AppGrid.b((com.tencent.mm.pluginsdk.ui.chat.x) it.next());
            if (b17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(b17.f190755b)) {
                this.f190207h = true;
                return;
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.pluginsdk.ui.chat.AppGrid appGrid = this.f190208i;
        int i17 = appGrid.f189917i;
        return i17 == appGrid.f189916h + (-1) ? appGrid.f189914f - (i17 * appGrid.f189915g) : appGrid.f189915g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x050f  */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.tencent.mm.pluginsdk.ui.chat.AppGrid] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v77 */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r27, android.view.View r28, android.view.ViewGroup r29) {
        /*
            Method dump skipped, instructions count: 2494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.chat.c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
