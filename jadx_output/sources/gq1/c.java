package gq1;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f274497a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final gq1.a f274498b;

    public c(gq1.a aVar) {
        this.f274498b = null;
        this.f274498b = aVar;
    }

    public void a(java.lang.String str, int i17, java.lang.String str2, gq1.d dVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevie.IBeaconManager", "advertismentProcess, brand = %s, rssi = %d", str, java.lang.Integer.valueOf(i17));
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevie.IBeaconManager", "null == aProtocal");
            return;
        }
        gq1.b bVar = new gq1.b();
        bVar.f274494a = dVar;
        bVar.f274496c = str2;
        java.util.HashMap hashMap = this.f274497a;
        if (!hashMap.containsKey(bVar)) {
            java.util.Vector vector = new java.util.Vector();
            vector.add(java.lang.Integer.valueOf(i17));
            hashMap.put(bVar, vector);
            return;
        }
        java.util.Vector vector2 = (java.util.Vector) hashMap.get(bVar);
        vector2.add(java.lang.Integer.valueOf(i17));
        try {
            if (1 <= vector2.size()) {
                try {
                    b(vector2, bVar);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevie.IBeaconManager", "calDistance failed!!!, %s", e17.getMessage());
                }
            }
        } finally {
            vector2.clear();
        }
    }

    public final void b(java.util.Vector vector, gq1.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevie.IBeaconManager", "calDistance");
        int size = vector.size();
        int[] iArr = new int[size];
        for (int i17 = 0; i17 < size; i17++) {
            iArr[i17] = ((java.lang.Integer) vector.elementAt(i17)).intValue();
        }
        if (size == 0) {
            throw new java.lang.NullPointerException("null == aDataGroup || 0 == aDataGroup.length");
        }
        if (1 != size) {
            for (int i18 = 0; i18 < size; i18++) {
                int i19 = iArr[i18];
            }
            double a17 = gq1.r.a(iArr, 5);
            if (size == 0) {
                throw new java.lang.NullPointerException("null == dataGroup || 0 == dataGroup.length");
            }
            double a18 = gq1.r.a(iArr, 5);
            java.math.BigDecimal bigDecimal = new java.math.BigDecimal(0.0d);
            for (int i27 = 0; i27 < size; i27++) {
                bigDecimal = bigDecimal.add(new java.math.BigDecimal(iArr[i27]).subtract(new java.math.BigDecimal(a18)).pow(2));
            }
            double pow = java.lang.Math.pow(bigDecimal.divide(new java.math.BigDecimal(size - 1), 5, 4).doubleValue(), 0.5d);
            double doubleValue = new java.math.BigDecimal(0.15d).multiply(new java.math.BigDecimal(pow)).add(new java.math.BigDecimal(a17)).doubleValue();
            double doubleValue2 = new java.math.BigDecimal(3.09d).multiply(new java.math.BigDecimal(pow)).add(new java.math.BigDecimal(a17)).doubleValue();
            int[] iArr2 = new int[size];
            int i28 = 0;
            for (int i29 = 0; i29 < size; i29++) {
                int i37 = iArr[i29];
                double d17 = i37;
                if (d17 >= doubleValue && d17 <= doubleValue2) {
                    iArr2[i28] = i37;
                    i28++;
                }
            }
            iz5.a.g(null, i28 != 0);
            iArr = new int[i28];
            for (int i38 = 0; i38 < i28; i38++) {
                iArr[i38] = iArr2[i38];
            }
            for (int i39 = 0; i39 < i28; i39++) {
                int i47 = iArr[i39];
            }
        }
        if (iArr.length == 0) {
            throw new java.lang.NullPointerException("null == ret || 0 == ret.length");
        }
        double a19 = gq1.r.a(iArr, 5);
        bVar.f274495b = new java.math.BigDecimal(a19).divide(new java.math.BigDecimal(1), 3, 4).doubleValue();
        double d18 = bVar.f274494a.f274500b.f274540f;
        double d19 = (a19 * 1.0d) / d18;
        double pow2 = d19 < 1.0d ? java.lang.Math.pow(d19, 10.0d) : (java.lang.Math.pow(d19, 9.9476d) * 0.92093d) + 0.54992d;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevie.IBeaconManager", "txPower = %f , rssi = %f,distance = %f", java.lang.Double.valueOf(d18), java.lang.Double.valueOf(a19), java.lang.Double.valueOf(pow2));
        this.f274498b.d(pow2, bVar);
    }
}
