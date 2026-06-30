package p13;

/* loaded from: classes12.dex */
public class z extends p13.y {
    public void a() {
        java.lang.String str;
        int i17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f351191i)) {
            return;
        }
        switch (this.f351184b) {
            case 131072:
            case 131076:
            case 131081:
            case 262144:
            case 327680:
                int i18 = this.f351185c;
                if (i18 != 2 && i18 != 3 && i18 != 6 && i18 != 7) {
                    if (i18 == 11 || i18 == 51) {
                        this.f351192j = Integer.MAX_VALUE;
                        this.f351193k = "";
                        return;
                    }
                    try {
                        this.f351192j = new java.lang.String(this.f351190h.getBytes(), 0, java.lang.Integer.valueOf(o13.c.f342209b.split(this.f351191i)[1]).intValue()).length();
                        this.f351193k = this.f351190h;
                        return;
                    } catch (java.lang.Exception unused) {
                        this.f351192j = Integer.MAX_VALUE;
                        this.f351193k = "";
                        return;
                    }
                }
                try {
                    java.lang.String[] split = o13.c.f342209b.split(this.f351191i);
                    f(o13.c.f342212e);
                    int binarySearch = java.util.Arrays.binarySearch(this.f351195m, new java.lang.String(this.f351190h.getBytes(), 0, java.lang.Integer.valueOf(split[1]).intValue()).length());
                    this.f351192j = binarySearch;
                    if (binarySearch < 0) {
                        this.f351192j = (-binarySearch) - 2;
                    }
                    this.f351193k = this.f351194l[this.f351192j];
                    return;
                } catch (java.lang.Exception unused2) {
                    this.f351192j = Integer.MAX_VALUE;
                    this.f351193k = "";
                    return;
                }
            case 131075:
            case 2097172:
                int i19 = this.f351185c;
                if (i19 == 38 || i19 == 69) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    f(o13.c.f342210c);
                    java.lang.String[] split2 = o13.c.f342209b.split(this.f351191i);
                    byte[] bytes = this.f351190h.getBytes();
                    for (int i27 = 0; i27 < split2.length - 1; i27 += 2) {
                        int intValue = java.lang.Integer.valueOf(split2[i27]).intValue();
                        int length = new java.lang.String(bytes, 0, java.lang.Integer.valueOf(split2[i27 + 1]).intValue()).length();
                        int binarySearch2 = java.util.Arrays.binarySearch(this.f351195m, length);
                        if (binarySearch2 < 0) {
                            binarySearch2 = (-binarySearch2) - 2;
                        }
                        int i28 = binarySearch2;
                        java.lang.String[] split3 = o13.c.f342211d.split(this.f351194l[i28]);
                        int i29 = length - this.f351195m[i28];
                        int i37 = 0;
                        while (true) {
                            if (i37 < split3.length) {
                                i29 = (i29 - split3[i37].length()) - 1;
                                if (i29 < 0) {
                                    java.lang.String str2 = split3[i37];
                                    i17 = o13.d.f342231q[i37];
                                    str = str2;
                                } else {
                                    i37++;
                                }
                            } else {
                                str = null;
                                i17 = -1;
                            }
                        }
                        if (i17 > 0) {
                            arrayList.add(new p13.l(i28, intValue, i17, str, split3[split3.length - 1]));
                        }
                    }
                    this.f351196n = arrayList;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void b(p13.r rVar) {
        java.lang.String str;
        java.lang.String str2;
        if (rVar.f351131c.length > 1) {
            this.f351200r = 1;
        } else {
            this.f351200r = 0;
        }
        int i17 = this.f351184b;
        if (i17 != 131075) {
            if (i17 == 131072) {
                if (java.lang.System.currentTimeMillis() - this.f351188f < 1105032704) {
                    this.f351198p += 50;
                }
                int i18 = this.f351185c;
                if ((i18 == 5 || i18 == 1) && this.f351190h.contains(rVar.f351129a)) {
                    if (rVar.f351131c.length > 1) {
                        this.f351200r = 2;
                    }
                    this.f351198p += 10;
                    return;
                }
                return;
            }
            return;
        }
        if (this.f351185c == 38) {
            this.f351207y = (int) this.f351186d;
            java.lang.String r17 = c01.z1.r();
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.List<p13.l> list = this.f351196n;
            if (list != null) {
                for (p13.l lVar : list) {
                    if (!r17.equals(lVar.f351113d)) {
                        hashSet.add(java.lang.Integer.valueOf(lVar.f351110a));
                    }
                }
            }
            long size = hashSet.size();
            long j17 = this.f351186d;
            if (size >= j17 - 1) {
                this.f351201s = true;
                if (j17 >= 3) {
                    this.f351208z = true;
                }
            }
            if (rVar.f351131c.length > 1 && (str2 = this.f351190h) != null && str2.contains(rVar.f351129a)) {
                this.f351200r = 2;
            }
        }
        int i19 = this.f351185c;
        if ((i19 == 5 || i19 == 1) && (str = this.f351190h) != null && str.contains(rVar.f351129a) && rVar.f351131c.length > 1) {
            this.f351200r = 2;
        }
    }

    public p13.z c(android.database.Cursor cursor) {
        this.f351183a = cursor.getLong(0);
        this.f351184b = cursor.getInt(1);
        this.f351185c = cursor.getInt(2);
        this.f351186d = cursor.getLong(3);
        this.f351187e = cursor.getString(4);
        this.f351188f = cursor.getLong(5);
        if (cursor.getColumnCount() >= 7) {
            this.f351190h = cursor.getString(6);
        }
        if (cursor.getColumnCount() >= 8) {
            this.f351191i = cursor.getString(7);
        }
        return this;
    }

    public p13.z d(android.database.Cursor cursor) {
        this.f351183a = cursor.getLong(0);
        this.f351184b = cursor.getInt(1);
        this.f351185c = cursor.getInt(2);
        this.f351186d = cursor.getLong(3);
        this.f351187e = cursor.getString(4);
        this.f351188f = cursor.getLong(5);
        this.f351189g = cursor.getString(6);
        return this;
    }

    public p13.z e(android.database.Cursor cursor) {
        this.f351183a = cursor.getLong(0);
        this.f351184b = cursor.getInt(1);
        this.f351185c = cursor.getInt(2);
        this.f351186d = cursor.getLong(3);
        this.f351187e = cursor.getString(4);
        this.f351188f = cursor.getLong(5);
        this.f351190h = cursor.getString(6);
        this.f351191i = cursor.getString(7);
        this.f351199q = cursor.getLong(8);
        return this;
    }

    public final void f(java.util.regex.Pattern pattern) {
        java.lang.String[] split = pattern.split(this.f351190h);
        this.f351194l = split;
        this.f351195m = new int[split.length];
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int[] iArr = this.f351195m;
            if (i17 >= iArr.length) {
                return;
            }
            iArr[i17] = i18;
            i18 += this.f351194l[i17].length() + 1;
            i17++;
        }
    }
}
