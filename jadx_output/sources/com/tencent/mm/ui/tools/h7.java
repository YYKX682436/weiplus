package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class h7 implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.MultiStageCitySelectUI f210458d;

    public h7(com.tencent.mm.ui.tools.MultiStageCitySelectUI multiStageCitySelectUI) {
        this.f210458d = multiStageCitySelectUI;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.ui.tools.MultiStageCitySelectUI multiStageCitySelectUI = this.f210458d;
        multiStageCitySelectUI.B = str;
        ((com.tencent.mm.ui.base.preference.h0) multiStageCitySelectUI.f210093d).t();
        multiStageCitySelectUI.A.removeCallbacks(multiStageCitySelectUI.E);
        multiStageCitySelectUI.A.postDelayed(multiStageCitySelectUI.E, 50L);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
        com.tencent.mm.ui.tools.MultiStageCitySelectUI multiStageCitySelectUI = this.f210458d;
        multiStageCitySelectUI.hideVKB();
        if (multiStageCitySelectUI.f210100n) {
            multiStageCitySelectUI.f210101o = 3;
        } else if (multiStageCitySelectUI.f210094e == null) {
            multiStageCitySelectUI.f210101o = 0;
        } else if (multiStageCitySelectUI.f210095f == null) {
            multiStageCitySelectUI.f210101o = 1;
        } else {
            multiStageCitySelectUI.f210101o = 2;
        }
        multiStageCitySelectUI.V6();
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mm.ui.tools.MultiStageCitySelectUI multiStageCitySelectUI = this.f210458d;
        multiStageCitySelectUI.B = str;
        ((com.tencent.mm.ui.base.preference.h0) multiStageCitySelectUI.f210093d).t();
        multiStageCitySelectUI.A.removeCallbacks(multiStageCitySelectUI.E);
        multiStageCitySelectUI.A.postDelayed(multiStageCitySelectUI.E, 50L);
        return true;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
        com.tencent.mm.ui.tools.MultiStageCitySelectUI multiStageCitySelectUI = this.f210458d;
        if (multiStageCitySelectUI.f210100n) {
            multiStageCitySelectUI.f210101o = 3;
        } else if (multiStageCitySelectUI.f210094e == null) {
            multiStageCitySelectUI.f210101o = 0;
        } else if (multiStageCitySelectUI.f210095f == null) {
            multiStageCitySelectUI.f210101o = 1;
        } else {
            multiStageCitySelectUI.f210101o = 2;
        }
        multiStageCitySelectUI.V6();
    }
}
