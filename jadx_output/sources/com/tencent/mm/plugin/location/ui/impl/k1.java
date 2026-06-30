package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class k1 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144838d;

    public k1(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144838d = x1Var;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144838d;
        if (!z17) {
            if (!x1Var.f144928p1 && !com.tencent.mm.sdk.platformtools.n2.a()) {
                x1Var.f144928p1 = true;
                android.app.Activity activity = x1Var.f144909d;
                db5.e1.C(activity, activity.getString(com.tencent.mm.R.string.fs_), activity.getString(com.tencent.mm.R.string.f490573yv), activity.getString(com.tencent.mm.R.string.g6z), activity.getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.location.ui.impl.j1(this), null);
            }
            return false;
        }
        if (!x1Var.R1) {
            return true;
        }
        double d27 = x1Var.G;
        if (d27 != -85.0d) {
            double d28 = x1Var.H;
            if (d28 != -1000.0d) {
                double d29 = f18;
                if (d27 != d29 || d28 != f17) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LAST_LOCATION_STRING, ((int) (f18 * 1000000.0f)) + "," + ((int) (f17 * 1000000.0f)));
                    x1Var.G = d29;
                    x1Var.H = (double) f17;
                }
                android.location.Location location = new android.location.Location("");
                x1Var.M1 = location;
                location.setLongitude(x1Var.H);
                x1Var.M1.setLatitude(x1Var.G);
                return true;
            }
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LAST_LOCATION_STRING, ((int) (f18 * 1000000.0f)) + "," + ((int) (f17 * 1000000.0f)));
        double d37 = (double) f18;
        x1Var.G = d37;
        double d38 = (double) f17;
        x1Var.H = d38;
        com.tencent.mm.plugin.location.ui.impl.c0 c0Var = x1Var.f144931s;
        c0Var.f144767p = d37;
        c0Var.f144768q = d38;
        com.tencent.mm.plugin.location.ui.impl.c0 c0Var2 = x1Var.f144932t;
        c0Var2.f144767p = d37;
        c0Var2.f144768q = d38;
        if (x1Var.x()) {
            if (!x1Var.x()) {
                return true;
            }
            double doubleExtra = x1Var.k().getDoubleExtra("KPickPoiLat", -85.0d);
            double doubleExtra2 = x1Var.k().getDoubleExtra("KPickPoiLong", -85.0d);
            if (doubleExtra == -85.0d || doubleExtra2 == -1000.0d) {
                return true;
            }
            x1Var.E = doubleExtra;
            x1Var.F = doubleExtra2;
            com.tencent.mm.plugin.location.ui.impl.PickPoi pickPoi = x1Var.f144924n;
            boolean booleanExtra = x1Var.k().getBooleanExtra("key_geo_coder_four_level", false);
            com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker = x1Var.f144935w;
            pickPoi.b(doubleExtra, doubleExtra2, booleanExtra, customIndoorPicker.f144696m2, customIndoorPicker.f144697n2, customIndoorPicker.f144698o2);
            x1Var.f144910e.getIController().animateTo(doubleExtra, doubleExtra2, 15);
            x1Var.w(false);
            return true;
        }
        double d39 = x1Var.G;
        x1Var.E = d39;
        double d47 = x1Var.H;
        x1Var.F = d47;
        com.tencent.mm.plugin.location.ui.impl.PickPoi pickPoi2 = x1Var.f144924n;
        boolean booleanExtra2 = x1Var.k().getBooleanExtra("key_geo_coder_four_level", false);
        com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker2 = x1Var.f144935w;
        pickPoi2.b(d39, d47, booleanExtra2, customIndoorPicker2.f144696m2, customIndoorPicker2.f144697n2, customIndoorPicker2.f144698o2);
        x1Var.f144910e.getIController().animateTo(x1Var.G, x1Var.H, 15);
        if (!x1Var.f144920J) {
            x1Var.w(false);
        }
        android.location.Location location2 = new android.location.Location("");
        x1Var.M1 = location2;
        location2.setLongitude(x1Var.H);
        x1Var.M1.setLatitude(x1Var.G);
        return true;
    }
}
