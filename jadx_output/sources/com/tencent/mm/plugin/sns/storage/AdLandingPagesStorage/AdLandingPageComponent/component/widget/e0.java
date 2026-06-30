package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

/* loaded from: classes4.dex */
public class e0 {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.LinearLayoutManager f165644b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b0 f165645c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f165643a = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f165646d = true;

    public e0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() == null || !(recyclerView.getLayoutManager() instanceof androidx.recyclerview.widget.LinearLayoutManager)) {
            throw new java.lang.IllegalArgumentException("set LinearLayoutManger to RecyclerView first");
        }
        if (recyclerView.getAdapter() == null || !(recyclerView.getAdapter() instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b0)) {
            throw new java.lang.IllegalArgumentException("set Adapter which implemented ExposureListener to RecyclerView first");
        }
        this.f165645c = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b0) recyclerView.getAdapter();
        this.f165644b = (androidx.recyclerview.widget.LinearLayoutManager) recyclerView.getLayoutManager();
        recyclerView.i(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.d0(this, recyclerView, (androidx.recyclerview.widget.LinearLayoutManager) recyclerView.getLayoutManager()));
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
        if (!this.f165646d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
            return;
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f165644b;
        if (linearLayoutManager != null) {
            int w17 = linearLayoutManager.w();
            int y17 = linearLayoutManager.y();
            if (w17 == y17 && w17 == -1) {
                com.tencent.mars.xlog.Log.i("RecyclerViewExposureMgr", "no exposuring child");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                return;
            }
            d(w17, y17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyChildrenDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f165644b;
        if (linearLayoutManager != null) {
            int w17 = linearLayoutManager.w();
            int y17 = linearLayoutManager.y();
            if (w17 == y17 && w17 == -1) {
                com.tencent.mars.xlog.Log.i("RecyclerViewExposureMgr", "no exposuring child");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyChildrenDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                return;
            }
            while (w17 <= y17) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a0 a0Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a0) ((java.util.HashMap) this.f165643a).get(java.lang.Integer.valueOf(w17));
                if (a0Var != null && a0Var.f165631a) {
                    ((gb4.b) this.f165645c).x(w17);
                    a0Var.b();
                }
                w17++;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyChildrenDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
    }

    public void c(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setForeground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
        this.f165646d = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setForeground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
    }

    public final void d(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startItmesExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
        while (i17 <= i18) {
            java.util.Map map = this.f165643a;
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a0 a0Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a0) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
            if (a0Var == null) {
                a0Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a0(this, null);
                ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), a0Var);
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b0 b0Var = this.f165645c;
            if (((gb4.b) b0Var).J(i17)) {
                if (!a0Var.f165631a) {
                    ((gb4.b) b0Var).y(i17, this);
                    a0Var.a();
                } else if (((gb4.b) b0Var).I(i17)) {
                    ((gb4.b) b0Var).K(i17);
                }
            }
            i17++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startItmesExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
    }

    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateChildrenExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
        if (!this.f165646d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateChildrenExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
            return;
        }
        a();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f165644b;
        int w17 = linearLayoutManager.w();
        int y17 = linearLayoutManager.y();
        for (java.util.Map.Entry entry : ((java.util.HashMap) this.f165643a).entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b0 b0Var = this.f165645c;
            if (intValue < w17 || ((java.lang.Integer) entry.getKey()).intValue() > y17) {
                if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a0) entry.getValue()).f165631a) {
                    ((gb4.b) b0Var).x(((java.lang.Integer) entry.getKey()).intValue());
                    ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a0) entry.getValue()).b();
                }
            } else if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a0) entry.getValue()).f165631a) {
                if (((gb4.b) b0Var).J(((java.lang.Integer) entry.getKey()).intValue())) {
                    if (((gb4.b) b0Var).I(((java.lang.Integer) entry.getKey()).intValue())) {
                        ((gb4.b) b0Var).K(((java.lang.Integer) entry.getKey()).intValue());
                    }
                } else {
                    ((gb4.b) b0Var).x(((java.lang.Integer) entry.getKey()).intValue());
                    ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a0) entry.getValue()).b();
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateChildrenExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
    }
}
