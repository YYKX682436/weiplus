package pb1;

/* loaded from: classes7.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f353164a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f353165b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashMap f353166c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f353167d;

    /* renamed from: e, reason: collision with root package name */
    public final int f353168e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f353169f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f353170g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedHashMap f353171h;

    public z(java.util.List list, java.util.Map map, int i17, int i18, java.lang.String str, byte[] bArr, java.util.LinkedHashMap linkedHashMap) {
        this.f353165b = list;
        this.f353166c = linkedHashMap;
        this.f353167d = map;
        this.f353169f = str;
        this.f353164a = i17;
        this.f353168e = i18;
        this.f353170g = bArr;
        this.f353171h = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static pb1.z a(byte[] r16) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pb1.z.a(byte[]):pb1.z");
    }

    public static int b(byte[] bArr, int i17, int i18, int i19, java.util.List list) {
        while (i18 > 0) {
            byte[] bArr2 = new byte[i19];
            java.lang.System.arraycopy(bArr, i17, bArr2, 0, i19);
            list.add(pb1.n.a(bArr2));
            i18 -= i19;
            i17 += i19;
        }
        return i17;
    }

    public static java.lang.String c(java.util.Map map) {
        if (map == null) {
            return "null";
        }
        if (map.isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{");
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Object key = ((java.util.Map.Entry) it.next()).getKey();
            sb6.append(key);
            sb6.append("=");
            sb6.append(java.util.Arrays.toString((byte[]) map.get(key)));
            if (it.hasNext()) {
                sb6.append(", ");
            }
        }
        sb6.append('}');
        return sb6.toString();
    }

    public java.lang.String toString() {
        return "ScanRecord [mAdvertiseFlags=" + this.f353164a + ", mServiceUuids=" + this.f353165b + ", mServiceData=" + c(this.f353167d) + ", mTxPowerLevel=" + this.f353168e + ", mDeviceName=" + this.f353169f + ", mManufacturerSpecificDataFixed=" + c(this.f353171h) + "]";
    }
}
