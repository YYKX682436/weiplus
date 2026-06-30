package nu0;

/* loaded from: classes5.dex */
public final class o4 extends lw0.l {

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f340056s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f340057t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f340056s = jz5.h.b(new nu0.n4(this));
        this.f340057t = jz5.h.b(new nu0.m4(this));
    }

    @Override // lw0.l
    public boolean l7(kw0.e state) {
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.maas.imagestudio.MJImageLayer x76 = x7();
        boolean z17 = false;
        if (x76 == null) {
            return false;
        }
        com.tencent.maas.base.MJID of6 = com.tencent.maas.base.MJID.of(x76.getLayerID());
        kw0.a b17 = fv0.e.b(state);
        if (zu0.i.f475676f != (b17 != null ? b17.f312789b : null) || kotlin.jvm.internal.o.b(x76.getMaterialID(), b17.f312788a.f48224b)) {
            return false;
        }
        boolean e17 = x76.e(b17.f312788a.f48224b);
        com.tencent.mars.xlog.Log.i("ImageWhenWhereEditPanelUIC", "onWhenWhereReplaced: updateResult " + e17);
        if (!e17) {
            return false;
        }
        if (x76.isDisplayingDateTime() && x76.getTimestamp() == 0) {
            x76.f(w7().e7());
        }
        boolean isDisplayingLocation = x76.isDisplayingLocation();
        jz5.g gVar = this.f340056s;
        if (!isDisplayingLocation) {
            com.tencent.mars.xlog.Log.i("ImageWhenWhereEditPanelUIC", "onWhenWhereReplaced: isDisplayingLocation false ");
            kotlin.jvm.internal.o.d(of6);
            gx0.hf.V6((nu0.i4) ((jz5.n) gVar).getValue(), of6, null, 2, null);
            return true;
        }
        com.tencent.maas.moviecomposing.segments.GeographicInfo geoInfo = x76.getGeoInfo();
        if (geoInfo != null) {
            java.lang.String province = geoInfo.getProvince();
            kotlin.jvm.internal.o.f(province, "getProvince(...)");
            if (province.length() == 0) {
                java.lang.String country = geoInfo.getCountry();
                kotlin.jvm.internal.o.f(country, "getCountry(...)");
                if (country.length() == 0) {
                    java.lang.String city = geoInfo.getCity();
                    kotlin.jvm.internal.o.f(city, "getCity(...)");
                    if (city.length() == 0) {
                        java.lang.String region = geoInfo.getRegion();
                        kotlin.jvm.internal.o.f(region, "getRegion(...)");
                        if (region.length() == 0) {
                            java.lang.String name = geoInfo.getName();
                            kotlin.jvm.internal.o.f(name, "getName(...)");
                            if (name.length() == 0) {
                                java.lang.String address = geoInfo.getAddress();
                                kotlin.jvm.internal.o.f(address, "getAddress(...)");
                                if (address.length() == 0) {
                                    z17 = true;
                                }
                            }
                        }
                    }
                }
            }
            if (!z17) {
                x76.d(geoInfo);
                kotlin.jvm.internal.o.d(of6);
                gx0.hf.V6((nu0.i4) ((jz5.n) gVar).getValue(), of6, null, 2, null);
                return true;
            }
        }
        du0.i0 P6 = P6();
        com.tencent.maas.imagestudio.MJImageScene Z6 = w7().Z6();
        P6.O6(Z6 != null ? Z6.getLocation() : null, new nu0.l4(x76, this, of6));
        return true;
    }

    @Override // lw0.l
    public lw0.d o7() {
        java.lang.String name;
        com.tencent.maas.imagestudio.MJImageLayer x76 = x7();
        if (x76 == null) {
            return null;
        }
        java.lang.String materialID = x76.getMaterialID();
        java.lang.String str = "";
        if (materialID == null) {
            materialID = "";
        }
        long timestamp = x76.getTimestamp();
        com.tencent.maas.moviecomposing.segments.GeographicInfo geoInfo = x76.getGeoInfo();
        if (geoInfo != null && (name = geoInfo.getName()) != null) {
            str = name;
        }
        return new lw0.d(materialID, timestamp, str);
    }

    @Override // lw0.l
    public void q7(java.util.Calendar calendarDate) {
        kotlin.jvm.internal.o.g(calendarDate, "calendarDate");
        com.tencent.maas.imagestudio.MJImageLayer x76 = x7();
        if (x76 == null) {
            return;
        }
        x76.f(calendarDate.getTimeInMillis());
        nu0.q0.Y6(w7(), false, null, 3, null);
    }

    @Override // lw0.l
    public void r7(com.tencent.maas.moviecomposing.segments.GeographicInfo geographicInfo) {
        kotlin.jvm.internal.o.g(geographicInfo, "geographicInfo");
        com.tencent.maas.imagestudio.MJImageLayer x76 = x7();
        if (x76 == null) {
            return;
        }
        x76.d(geographicInfo);
        nu0.q0.Y6(w7(), false, null, 3, null);
    }

    @Override // lw0.l
    public void s7() {
        com.tencent.maas.imagestudio.MJImageLayer x76 = x7();
        if (x76 != null) {
            if (x76.isDisplayingDateTime()) {
                com.tencent.maas.moviecomposing.e dateTimeDisplayOptions = x76.getDateTimeDisplayOptions();
                kotlin.jvm.internal.o.f(dateTimeDisplayOptions, "getDateTimeDisplayOptions(...)");
                k7(dateTimeDisplayOptions, x76.getTimestamp());
            } else if (x76.isDisplayingLocation()) {
                m7(x76.getGeoInfo());
            }
        }
    }

    @Override // lw0.l
    public void t7() {
    }

    @Override // lw0.l
    public void u7() {
    }

    public final nu0.q0 w7() {
        return (nu0.q0) ((jz5.n) this.f340057t).getValue();
    }

    public final com.tencent.maas.imagestudio.MJImageLayer x7() {
        com.tencent.maas.base.MJID destID$plugin_mj_template_release;
        lw0.c cVar = (lw0.c) this.f69240i;
        return w7().b7((cVar == null || (destID$plugin_mj_template_release = cVar.getDestID$plugin_mj_template_release()) == null) ? null : destID$plugin_mj_template_release.value());
    }
}
