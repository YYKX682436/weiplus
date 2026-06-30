package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class e7 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.MultiStageCitySelectUI f210376d;

    public e7(com.tencent.mm.ui.tools.MultiStageCitySelectUI multiStageCitySelectUI) {
        this.f210376d = multiStageCitySelectUI;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mm.ui.tools.MultiStageCitySelectUI multiStageCitySelectUI = this.f210376d;
        if (multiStageCitySelectUI.f210111y == null) {
            return false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiStageCitySelectUI", "lat:%f lng:%f accuracy:%f", java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17), java.lang.Double.valueOf(d18));
            c01.d9.e().g(new va3.y(f18, f17));
        } else {
            com.tencent.mm.ui.tools.ZoneRecommandPreference zoneRecommandPreference = multiStageCitySelectUI.f210110x;
            if (zoneRecommandPreference != null) {
                zoneRecommandPreference.P = 2;
                zoneRecommandPreference.M();
            }
            if (!multiStageCitySelectUI.f210108v && !com.tencent.mm.sdk.platformtools.n2.a()) {
                multiStageCitySelectUI.f210108v = true;
                db5.e1.C(multiStageCitySelectUI, multiStageCitySelectUI.getString(com.tencent.mm.R.string.fs_), multiStageCitySelectUI.getString(com.tencent.mm.R.string.f490573yv), multiStageCitySelectUI.getString(com.tencent.mm.R.string.g6z), multiStageCitySelectUI.getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.ui.tools.d7(this), null);
            }
        }
        i11.e eVar = multiStageCitySelectUI.f210111y;
        if (eVar != null) {
            ((i11.h) eVar).m(multiStageCitySelectUI.D);
            multiStageCitySelectUI.f210111y = null;
        }
        return false;
    }
}
