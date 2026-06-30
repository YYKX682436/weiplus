package yi4;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi4.l f462617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f462618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yi4.l lVar, yz5.l lVar2) {
        super(2);
        this.f462617d = lVar;
        this.f462618e = lVar2;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        this.f462617d.getClass();
        yz5.l lVar = this.f462618e;
        byte[] bArr = null;
        if (intValue != -1 || intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusPublishPoiApiImpl", "handleResult: cancelled, resultCode=" + intValue);
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
        } else {
            java.lang.String stringExtra = intent.getStringExtra("get_poi_name");
            java.lang.String str = stringExtra == null ? "" : stringExtra;
            java.lang.String stringExtra2 = intent.getStringExtra("get_city");
            java.lang.String str2 = stringExtra2 == null ? "" : stringExtra2;
            float floatExtra = intent.getFloatExtra("get_lat", -1000.0f);
            float floatExtra2 = intent.getFloatExtra("get_lng", -1000.0f);
            java.lang.String stringExtra3 = intent.getStringExtra("get_poi_classify_id");
            java.lang.String str3 = stringExtra3 != null ? stringExtra3 : "";
            if (str.length() == 0) {
                if (str2.length() == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.StatusPublishPoiApiImpl", "handleResult: no poi selected, reset location");
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
                }
            }
            r45.c64 c64Var = new r45.c64();
            c64Var.f371310d = str3;
            c64Var.f371311e = str;
            c64Var.A = str2;
            c64Var.f371329z = (floatExtra > (-1000.0f) ? 1 : (floatExtra == (-1000.0f) ? 0 : -1)) == 0 ? 0.0d : floatExtra;
            c64Var.f371328y = floatExtra2 == -1000.0f ? 0.0d : floatExtra2;
            try {
                bArr = c64Var.toByteArray();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.StatusPublishPoiApiImpl", "handleResult: serialize LbsLife failed, err=" + th6.getMessage());
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleResult: poi=");
            sb6.append(str);
            sb6.append(", city=");
            sb6.append(str2);
            sb6.append(", lat=");
            sb6.append(floatExtra);
            sb6.append(", lng=");
            sb6.append(floatExtra2);
            sb6.append(", bytes=");
            sb6.append(bArr != null ? bArr.length : -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusPublishPoiApiImpl", sb6.toString());
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(bArr)));
        }
        return jz5.f0.f302826a;
    }
}
