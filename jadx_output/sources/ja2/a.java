package ja2;

/* loaded from: classes8.dex */
public final class a implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f298604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f298605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f298606c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.f96 f298607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f298608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f298609f;

    public a(yz5.l lVar, yz5.a aVar, java.lang.String str, r45.f96 f96Var, int i17, int i18) {
        this.f298604a = lVar;
        this.f298605b = aVar;
        this.f298606c = str;
        this.f298607d = f96Var;
        this.f298608e = i17;
        this.f298609f = i18;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.qo2 qo2Var = (r45.qo2) fVar.f70618d;
            com.tencent.mm.plugin.finder.storage.v90 v90Var = new com.tencent.mm.plugin.finder.storage.v90();
            java.lang.String str = this.f298606c;
            v90Var.field_poiId = str;
            r45.f96 f96Var = this.f298607d;
            v90Var.field_categoryTips = f96Var.getString(17);
            v90Var.field_businessHour = f96Var.getString(18);
            v90Var.field_phoneNumber = f96Var.getString(19);
            v90Var.field_priceTips = java.lang.String.valueOf(f96Var.getFloat(20));
            v90Var.field_fromType = java.lang.String.valueOf(f96Var.getInteger(10));
            v90Var.field_latitude = f96Var.getFloat(1);
            v90Var.field_longitude = f96Var.getFloat(0);
            java.lang.String string = qo2Var.getString(3);
            if (string == null || string.length() == 0) {
                string = f96Var.getString(4);
            }
            v90Var.field_address = string;
            v90Var.field_basicInfoResponse = qo2Var;
            com.tencent.mm.plugin.finder.storage.w90 w90Var = (com.tencent.mm.plugin.finder.storage.w90) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).f39139z).getValue();
            w90Var.getClass();
            java.lang.String field_poiId = v90Var.field_poiId;
            kotlin.jvm.internal.o.f(field_poiId, "field_poiId");
            com.tencent.mm.plugin.finder.storage.v90 y07 = w90Var.y0(field_poiId);
            l75.k0 k0Var = w90Var.f128238d;
            if (y07 != null) {
                o75.c cVar = new o75.c(o75.b.f343583d, java.lang.String.valueOf(v90Var.field_poiId), "MicroMsg.SDK.BaseFinderMapPoiInfo");
                cVar.f343590d = v90Var;
                new m75.e(v90Var, cVar, dm.v4.H, "MicroMsg.SDK.BaseFinderMapPoiInfo").a(k0Var);
            } else {
                o75.c cVar2 = new o75.c(o75.b.f343582c, java.lang.String.valueOf(v90Var.field_poiId), "MicroMsg.SDK.BaseFinderMapPoiInfo");
                cVar2.f343590d = v90Var;
                new m75.c(v90Var, true, cVar2, dm.v4.H, "MicroMsg.SDK.BaseFinderMapPoiInfo").a(k0Var);
            }
            r45.c35 c35Var = new r45.c35();
            c35Var.set(0, str);
            java.lang.String string2 = qo2Var.getString(1);
            if (string2 == null || string2.length() == 0) {
                string2 = f96Var.getString(3);
            }
            c35Var.set(4, string2);
            java.lang.String string3 = qo2Var.getString(3);
            if (string3 == null || string3.length() == 0) {
                string3 = f96Var.getString(4);
            }
            c35Var.set(6, string3);
            c35Var.set(5, qo2Var.getList(2));
            c35Var.set(2, java.lang.Long.valueOf(this.f298608e));
            c35Var.set(3, java.lang.Long.valueOf(this.f298609f));
            c35Var.set(11, java.lang.Float.valueOf(f96Var.getFloat(1)));
            c35Var.set(12, java.lang.Float.valueOf(f96Var.getFloat(0)));
            this.f298604a.invoke(c35Var);
        } else {
            this.f298605b.invoke();
        }
        return jz5.f0.f302826a;
    }
}
