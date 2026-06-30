package gb4;

/* loaded from: classes4.dex */
public class b extends androidx.recyclerview.widget.f2 implements com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b0 {

    /* renamed from: d, reason: collision with root package name */
    public za4.g0 f270048d;

    /* renamed from: e, reason: collision with root package name */
    public int f270049e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedHashMap f270050f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final androidx.recyclerview.widget.LinearLayoutManager f270051g;

    /* renamed from: h, reason: collision with root package name */
    public int f270052h;

    public b(za4.g0 g0Var, int i17, android.content.Context context, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.f270051g = linearLayoutManager;
        this.f270048d = g0Var;
        this.f270049e = i17;
    }

    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLastVisiableComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        try {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) this.f270050f.get(((ab4.d0) this.f270048d.f471083c.get(this.f270051g.y())).f2817d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastVisiableComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            return a2Var;
        } catch (java.lang.Exception unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastVisiableComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            return null;
        }
    }

    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSecondLastVisiableComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        try {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) this.f270050f.get(((ab4.d0) this.f270048d.f471083c.get(this.f270051g.y() - 1)).f2817d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSecondLastVisiableComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            return a2Var;
        } catch (java.lang.Exception unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSecondLastVisiableComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            return null;
        }
    }

    public boolean I(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isContainerComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        boolean s17 = za4.z0.s(((ab4.d0) this.f270048d.f471083c.get(i17)).f2827q);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContainerComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        return s17;
    }

    public boolean J(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f270051g;
        if (i17 < linearLayoutManager.w() || i17 > linearLayoutManager.y()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) this.f270050f.get(((ab4.d0) this.f270048d.f471083c.get(i17)).f2817d);
        if (a2Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            return false;
        }
        a2Var.A();
        boolean A = a2Var.A();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        return A;
    }

    public void K(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 z17 = z(i17);
        if (za4.z0.s(z17.p().f2827q)) {
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a) z17).P();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        int size = this.f270048d.f471083c.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        return size;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        return i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        com.tencent.mars.xlog.Log.i("MicroMsg.ContentAdapter", "display page " + this.f270048d.f471086f + ", pos " + i17);
        gb4.a aVar = (gb4.a) k3Var;
        gb4.a.i(aVar).removeAllViews();
        ab4.d0 d0Var = (ab4.d0) this.f270048d.f471083c.get(i17);
        java.util.LinkedHashMap linkedHashMap = this.f270050f;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) linkedHashMap.get(d0Var.f2817d);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i19 = this.f270049e;
        java.lang.String str = d0Var.f2828r;
        if (str != null && str.length() > 0) {
            try {
                i19 = android.graphics.Color.parseColor(d0Var.f2828r);
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ContentAdapter", "parse cellBackgroundColor error: %s", d0Var.f2828r);
            }
        }
        gb4.a.i(aVar).setBackgroundColor(i19);
        if (a2Var != null) {
            a2Var.H((ab4.d0) this.f270048d.f471083c.get(i17));
            i18 = 1;
        } else {
            a2Var = com.tencent.mm.plugin.sns.ui.ta.a(gb4.a.i(aVar).getContext(), d0Var, gb4.a.i(aVar), i19);
            linkedHashMap.put(d0Var.f2817d, a2Var);
            i18 = 0;
        }
        android.view.View x17 = a2Var.x();
        if (x17.getParent() != null && (x17.getParent() instanceof android.view.ViewGroup)) {
            ((android.view.ViewGroup) x17.getParent()).removeView(x17);
        }
        gb4.a.i(aVar).addView(x17);
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            java.util.Collection values = linkedHashMap == null ? java.util.Collections.EMPTY_LIST : linkedHashMap.values();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var2 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) values.iterator().next();
            if (a2Var2 != null && (a2Var2 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s5)) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(io.flutter.plugin.editing.SpellCheckPlugin.START_INDEX_KEY, java.lang.Integer.valueOf(this.f270052h));
                a2Var2.F(hashMap);
            }
        } else if (a2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s5) {
            a2Var.F(new java.util.HashMap());
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        ab4.n0 u17 = a2Var.u();
        if (o54.g.c()) {
            ca4.e0.b("landing_page_rv_bind_view_cost", "" + u17.l(), d0Var.f2827q, (int) currentTimeMillis2, "snsId=" + u17.j() + "|isOnlyUpdate=" + i18 + "|cid=" + d0Var.f2817d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        gb4.a aVar = new gb4.a(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f487963co, viewGroup, false));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        return aVar;
    }

    public void x(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        if (i17 < 0 || i17 >= this.f270048d.f471083c.size()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ContentAdapter", "endExposure index[%d], size[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f270048d.f471083c.size()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            return;
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) this.f270050f.get(((ab4.d0) this.f270048d.f471083c.get(i17)).f2817d);
        if (a2Var != null) {
            a2Var.M();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
    }

    public void y(int i17, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e0 e0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        ab4.d0 d0Var = (ab4.d0) this.f270048d.f471083c.get(i17);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) this.f270050f.get(d0Var.f2817d);
        if (a2Var != null) {
            a2Var.K();
            a2Var.J();
            int i18 = d0Var.f2827q;
            if (i18 == 61 || i18 == 62 || i18 == 142) {
                e0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllExposuring", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.util.Map.Entry entry : ((java.util.HashMap) e0Var.f165643a).entrySet()) {
                    if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a0) entry.getValue()).f165631a) {
                        arrayList.add((java.lang.Integer) entry.getKey());
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllExposuring", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int intValue = ((java.lang.Integer) it.next()).intValue();
                    if (intValue != i17 && J(intValue)) {
                        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 z17 = z(intValue);
                        if (z17 instanceof ab4.b) {
                            ab4.b bVar = (ab4.b) z17;
                            bVar.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOpenVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
                            boolean z18 = bVar.f2809s;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOpenVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
                            if (z18 && this.f270048d.f471087g && intValue == 0) {
                                ((ab4.b) a2Var).P();
                            } else {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOpenVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
                                boolean z19 = ((ab4.b) a2Var).f2809s;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOpenVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
                                if (z19) {
                                    bVar.P();
                                }
                            }
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
    }

    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 z(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCompByIndex", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) this.f270050f.get(((ab4.d0) this.f270048d.f471083c.get(i17)).f2817d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCompByIndex", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        return a2Var;
    }
}
