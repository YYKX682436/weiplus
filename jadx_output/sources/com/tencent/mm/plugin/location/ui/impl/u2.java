package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class u2 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.q2 f144905d;

    public u2(com.tencent.mm.plugin.location.ui.impl.q2 q2Var) {
        this.f144905d = q2Var;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return false;
        }
        double d27 = f18;
        if (d27 == 0.0d && f17 == 0.0d) {
            return true;
        }
        com.tencent.mm.plugin.location.ui.impl.q2 q2Var = this.f144905d;
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = q2Var.f144732h;
        double d28 = locationInfo.f144586e;
        double d29 = locationInfo.f144587f;
        locationInfo.f144586e = d27;
        double d37 = f17;
        locationInfo.f144587f = d37;
        u60.h hVar = new u60.h(d27, d37);
        hVar.f424873f = locationInfo.f144585d;
        ((i11.g) q2Var.f144735n).b(hVar, q2Var.f144745x);
        q2Var.G = new android.location.Location("");
        q2Var.G.setLongitude(q2Var.f144732h.f144587f);
        q2Var.G.setLatitude(q2Var.f144732h.f144586e);
        this.f144905d.E(d37, d27, i17, d17);
        return true;
    }
}
