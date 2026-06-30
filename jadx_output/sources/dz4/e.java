package dz4;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f245208a;

    /* renamed from: b, reason: collision with root package name */
    public final int f245209b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f245210c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f245211d;

    /* renamed from: e, reason: collision with root package name */
    public final double f245212e;

    /* renamed from: f, reason: collision with root package name */
    public final double f245213f;

    /* renamed from: g, reason: collision with root package name */
    public final double f245214g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f245215h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f245216i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f245217j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f245218k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f245219l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f245220m;

    /* renamed from: n, reason: collision with root package name */
    public final float f245221n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f245222o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f245223p;

    public e(int i17, int i18, java.lang.String str, java.lang.String str2, double d17, double d18, double d19, java.lang.String str3, java.lang.String str4, boolean z17, java.lang.String str5, java.lang.String str6, java.lang.String str7, float f17, java.lang.String str8, java.lang.String str9, int i19, kotlin.jvm.internal.i iVar) {
        int i27 = (i19 & 1) != 0 ? 0 : i17;
        int i28 = (i19 & 2) != 0 ? 0 : i18;
        java.lang.String poiName = (i19 & 4) != 0 ? "" : str;
        java.lang.String locationThumbTaskName = (i19 & 8) != 0 ? "" : str2;
        double d27 = (i19 & 16) != 0 ? 0.0d : d17;
        double d28 = (i19 & 32) != 0 ? 0.0d : d18;
        double d29 = (i19 & 64) == 0 ? d19 : 0.0d;
        java.lang.String address = (i19 & 128) != 0 ? "" : str3;
        java.lang.String poiid = (i19 & 256) != 0 ? "" : str4;
        boolean z18 = (i19 & 512) != 0 ? false : z17;
        java.lang.String poiCategoryTips = (i19 & 1024) != 0 ? "" : str5;
        boolean z19 = z18;
        java.lang.String poiBusinessHour = (i19 & 2048) != 0 ? "" : str6;
        double d37 = d29;
        java.lang.String poiPhone = (i19 & 4096) != 0 ? "" : str7;
        float f18 = (i19 & 8192) != 0 ? 0.0f : f17;
        java.lang.String buildingID = (i19 & 16384) != 0 ? "" : str8;
        java.lang.String floorName = (i19 & 32768) != 0 ? "" : str9;
        kotlin.jvm.internal.o.g(poiName, "poiName");
        kotlin.jvm.internal.o.g(locationThumbTaskName, "locationThumbTaskName");
        kotlin.jvm.internal.o.g(address, "address");
        kotlin.jvm.internal.o.g(poiid, "poiid");
        kotlin.jvm.internal.o.g(poiCategoryTips, "poiCategoryTips");
        kotlin.jvm.internal.o.g(poiBusinessHour, "poiBusinessHour");
        kotlin.jvm.internal.o.g(poiPhone, "poiPhone");
        kotlin.jvm.internal.o.g(buildingID, "buildingID");
        kotlin.jvm.internal.o.g(floorName, "floorName");
        this.f245208a = i27;
        this.f245209b = i28;
        this.f245210c = poiName;
        this.f245211d = locationThumbTaskName;
        this.f245212e = d27;
        this.f245213f = d28;
        this.f245214g = d37;
        this.f245215h = address;
        this.f245216i = poiid;
        this.f245217j = z19;
        this.f245218k = poiCategoryTips;
        this.f245219l = poiBusinessHour;
        this.f245220m = poiPhone;
        this.f245221n = f18;
        this.f245222o = buildingID;
        this.f245223p = floorName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz4.e)) {
            return false;
        }
        dz4.e eVar = (dz4.e) obj;
        return this.f245208a == eVar.f245208a && this.f245209b == eVar.f245209b && kotlin.jvm.internal.o.b(this.f245210c, eVar.f245210c) && kotlin.jvm.internal.o.b(this.f245211d, eVar.f245211d) && java.lang.Double.compare(this.f245212e, eVar.f245212e) == 0 && java.lang.Double.compare(this.f245213f, eVar.f245213f) == 0 && java.lang.Double.compare(this.f245214g, eVar.f245214g) == 0 && kotlin.jvm.internal.o.b(this.f245215h, eVar.f245215h) && kotlin.jvm.internal.o.b(this.f245216i, eVar.f245216i) && this.f245217j == eVar.f245217j && kotlin.jvm.internal.o.b(this.f245218k, eVar.f245218k) && kotlin.jvm.internal.o.b(this.f245219l, eVar.f245219l) && kotlin.jvm.internal.o.b(this.f245220m, eVar.f245220m) && java.lang.Float.compare(this.f245221n, eVar.f245221n) == 0 && kotlin.jvm.internal.o.b(this.f245222o, eVar.f245222o) && kotlin.jvm.internal.o.b(this.f245223p, eVar.f245223p);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((java.lang.Integer.hashCode(this.f245208a) * 31) + java.lang.Integer.hashCode(this.f245209b)) * 31) + this.f245210c.hashCode()) * 31) + this.f245211d.hashCode()) * 31) + java.lang.Double.hashCode(this.f245212e)) * 31) + java.lang.Double.hashCode(this.f245213f)) * 31) + java.lang.Double.hashCode(this.f245214g)) * 31) + this.f245215h.hashCode()) * 31) + this.f245216i.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f245217j)) * 31) + this.f245218k.hashCode()) * 31) + this.f245219l.hashCode()) * 31) + this.f245220m.hashCode()) * 31) + java.lang.Float.hashCode(this.f245221n)) * 31) + this.f245222o.hashCode()) * 31) + this.f245223p.hashCode();
    }

    public java.lang.String toString() {
        return "FlutterNoteLocationModel(width=" + this.f245208a + ", height=" + this.f245209b + ", poiName=" + this.f245210c + ", locationThumbTaskName=" + this.f245211d + ", lat=" + this.f245212e + ", lng=" + this.f245213f + ", scale=" + this.f245214g + ", address=" + this.f245215h + ", poiid=" + this.f245216i + ", isFromPoiList=" + this.f245217j + ", poiCategoryTips=" + this.f245218k + ", poiBusinessHour=" + this.f245219l + ", poiPhone=" + this.f245220m + ", poiPriceTips=" + this.f245221n + ", buildingID=" + this.f245222o + ", floorName=" + this.f245223p + ')';
    }
}
