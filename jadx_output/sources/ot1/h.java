package ot1;

/* loaded from: classes12.dex */
public class h extends dm.rc implements ot1.i {
    public static final l75.e0 P = dm.rc.initAutoDBInfo(dm.rc.class);
    public static final int[] Q = {1, 3, 4, 5, 20, 23, 26, 27, 28, 30, 32, 34, 39, 41, 50, 52, 54, 60, 62, 64};
    public static final int[] R = {3, 23};
    public static final int[] S = {2, 3, 20, 21, 22, 23};
    public static final int[] T = {20, 23, 26, 27, 28, 30};
    public static final int[] U = {20, 23, 26, 27, 28, 30, 50, 60};
    public static final int[] V = {23};
    public static final int[] W = {20, 21, 22, 23};
    public static final int[] X = {20, 21, 22, 23, 24, 25, 26, 27, 28, 30, 31};
    public static final int[] Y = {20, 21, 22, 23, 24, 25, 26, 27, 28, 30, 31, 50, 51, 60, 61};
    public static final int[] Z = {1, 3, 4, 5};

    /* renamed from: p0, reason: collision with root package name */
    public static final int[] f348838p0 = {1, 3, 4, 5, 52, 62};

    /* renamed from: x0, reason: collision with root package name */
    public static final int[] f348840x0 = {3};

    /* renamed from: y0, reason: collision with root package name */
    public static final int[] f348842y0 = {2, 3};

    /* renamed from: l1, reason: collision with root package name */
    public static final int[] f348837l1 = {1, 2, 3, 4, 5};

    /* renamed from: p1, reason: collision with root package name */
    public static final int[] f348839p1 = {1, 2, 3, 4, 5, 52, 53, 62, 63};

    /* renamed from: x1, reason: collision with root package name */
    public static final int[] f348841x1 = {32, 34};

    /* renamed from: y1, reason: collision with root package name */
    public static final int[] f348843y1 = {32, 34, 54, 64};

    /* renamed from: z1, reason: collision with root package name */
    public static final int[] f348844z1 = {32, 33, 34, 35};
    public static final int[] A1 = {32, 33, 34, 35, 54, 55, 64, 65};
    public static final int[] B1 = {31, 33, 35, 38, 40, 42, 51, 53, 55, 61, 63, 65};

    public static java.lang.String u0(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("/") || str.startsWith("wcf://")) {
            return str;
        }
        return lp0.b.D() + str;
    }

    public static boolean w0(int[] iArr, int i17) {
        return iArr == null || java.util.Arrays.binarySearch(iArr, i17) >= 0;
    }

    @Override // dm.rc, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        super.convertFrom(cursor);
        java.lang.String str = this.field_detail;
        if (str != null && str.isEmpty()) {
            this.field_detail = null;
        }
        byte[] bArr = this.field_hash;
        if (bArr != null && bArr.length == 0) {
            this.field_hash = null;
        }
        byte[] bArr2 = this.field_linkUUID;
        if (bArr2 == null || bArr2.length != 0) {
            return;
        }
        this.field_linkUUID = null;
    }

    @Override // dm.rc, l75.f0
    public l75.e0 getDBInfo() {
        return P;
    }

    public java.lang.String t0() {
        return u0(this.field_path);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(512);
        sb6.append("{ ");
        sb6.append(this.field_path);
        sb6.append(", size: ");
        sb6.append(this.field_diskSpace);
        sb6.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG);
        sb6.append(this.field_size);
        sb6.append(", type: ");
        sb6.append(this.field_msgSubType);
        java.util.UUID v07 = v0();
        if (v07 != null) {
            sb6.append(", uuid: ");
            sb6.append(v07);
        }
        byte[] bArr = this.field_hash;
        if (bArr != null && bArr.length > 0) {
            sb6.append(", hash: ");
            for (byte b17 : this.field_hash) {
                sb6.append(java.lang.String.format("%02x", java.lang.Byte.valueOf(b17)));
            }
        }
        sb6.append(" }");
        return sb6.toString();
    }

    public java.util.UUID v0() {
        byte[] bArr = this.field_linkUUID;
        jz5.g gVar = c01.td.f37497a;
        if (bArr == null || bArr.length != 16) {
            return null;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        return new java.util.UUID(wrap.getLong(), wrap.getLong());
    }

    public java.util.UUID y0(java.lang.String str) {
        if (str == null) {
            this.field_linkUUID = null;
            return null;
        }
        java.util.UUID fromString = java.util.UUID.fromString(str);
        this.field_linkUUID = c01.td.b(fromString);
        return fromString;
    }
}
