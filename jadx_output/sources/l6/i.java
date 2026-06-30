package l6;

/* loaded from: classes16.dex */
public class i extends l6.c {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f316728d = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Vibrator f316729b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Class f316730c;

    public i(android.content.Context context) {
        this.f316729b = (android.os.Vibrator) context.getSystemService("vibrator");
        try {
            this.f316730c = java.lang.Class.forName("android.os.RichTapVibrationEffect");
        } catch (java.lang.ClassNotFoundException unused) {
        }
        if (this.f316730c == null) {
            try {
                this.f316730c = java.lang.Class.forName("android.os.VibrationEffect");
            } catch (java.lang.ClassNotFoundException unused2) {
            }
        }
    }

    @Override // l6.c
    public void a(java.lang.String str, int i17, int i18, int i19, int i27) {
        int i28;
        android.os.Vibrator vibrator = this.f316729b;
        if (vibrator != null && i17 >= 1) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (l6.m.f316741c) {
                    i28 = 0;
                } else {
                    int i29 = jSONObject.getJSONObject("Metadata").getInt("Version");
                    int i37 = l6.m.f316739a;
                    if (!f(i37, l6.m.f316740b, i29)) {
                        java.lang.String.format("%x02", java.lang.Integer.valueOf(i37));
                        return;
                    }
                    i28 = i29;
                }
                l6.f[] m17 = m(str);
                if (m17 != null && m17.length != 0) {
                    int andIncrement = f316728d.getAndIncrement();
                    int myPid = android.os.Process.myPid();
                    int i38 = 0;
                    int i39 = 0;
                    while (i38 < ((int) java.lang.Math.ceil(m17.length / 4.0d))) {
                        int i47 = i38 + 1;
                        int length = m17.length < i47 * 4 ? m17.length - (i38 * 4) : 4;
                        l6.f[] fVarArr = new l6.f[length];
                        java.lang.System.arraycopy(m17, i38 * 4, fVarArr, 0, length);
                        int i48 = length;
                        int[] g17 = g(2, i28, length, myPid, andIncrement, i39, fVarArr);
                        try {
                            if (android.os.Build.VERSION.SDK_INT >= 26) {
                                java.lang.Class cls = this.f316730c;
                                java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
                                vibrator.vibrate((android.os.VibrationEffect) cls.getMethod("createPatternHeWithParam", int[].class, cls2, cls2, cls2, cls2).invoke(null, g17, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27)));
                            }
                        } catch (java.lang.Exception unused) {
                        }
                        i38 = i47;
                        i39 = i48;
                    }
                }
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    @Override // l6.c
    public void b(java.lang.String str, int i17, int i18, int i19, int i27) {
        android.os.Vibrator vibrator = this.f316729b;
        if (vibrator != null && i17 >= 1) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                boolean z17 = l6.m.f316741c;
                if (!z17) {
                    int i28 = jSONObject.getJSONObject("Metadata").getInt("Version");
                    int i29 = l6.m.f316739a;
                    if (!f(i29, l6.m.f316740b, i28)) {
                        java.lang.String.format("%x02", java.lang.Integer.valueOf(i29));
                        return;
                    }
                }
                int[] j17 = l6.m.f316739a < 24 ? j(str) : k(str);
                if (j17 == null) {
                    return;
                }
                int length = j17.length;
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    java.lang.Class cls = this.f316730c;
                    java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
                    java.lang.reflect.Method method = cls.getMethod("createPatternHeWithParam", int[].class, cls2, cls2, cls2, cls2);
                    if (!z17) {
                        int[] iArr = new int[length + 1];
                        iArr[0] = l6.m.f316739a < 24 ? 1 : 3;
                        java.lang.System.arraycopy(j17, 0, iArr, 1, j17.length);
                        j17 = iArr;
                    }
                    vibrator.vibrate((android.os.VibrationEffect) method.invoke(null, j17, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27)));
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // l6.c
    public int d(java.lang.String str) {
        int i17;
        int i18;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("Pattern");
            int min = java.lang.Math.min(jSONArray.length(), 16);
            int i19 = min * 2;
            long[] jArr = new long[i19];
            int i27 = 0;
            int i28 = 0;
            for (int i29 = 0; i29 < min; i29++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i29).getJSONObject("Event");
                java.lang.String string = jSONObject.getString("Type");
                if (!android.text.TextUtils.equals("continuous", string)) {
                    if (!android.text.TextUtils.equals("transient", string)) {
                        break;
                    }
                    int i37 = i29 * 2;
                    long j17 = (jSONObject.getInt("RelativeTime") - i27) - i28;
                    jArr[i37] = j17;
                    if (j17 < 0) {
                        jArr[i37] = 50;
                    }
                    org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("Parameters");
                    jSONObject2.getInt("Intensity");
                    jSONObject2.getInt("Frequency");
                    i17 = 65;
                    jArr[i37 + 1] = 65;
                    i18 = jSONObject.getInt("RelativeTime");
                } else {
                    int i38 = i29 * 2;
                    long j18 = (jSONObject.getInt("RelativeTime") - i27) - i28;
                    jArr[i38] = j18;
                    if (j18 < 0) {
                        jArr[i38] = 50;
                    }
                    i17 = jSONObject.getInt("Duration");
                    jArr[i38 + 1] = i17;
                    i18 = jSONObject.getInt("RelativeTime");
                }
                int i39 = i18;
                i28 = i17;
                i27 = i39;
            }
            int i47 = 0;
            for (int i48 = 0; i48 < i19; i48++) {
                try {
                    i47 = (int) (i47 + jArr[i48]);
                } catch (java.lang.Exception unused) {
                    return i47;
                }
            }
            return i47;
        } catch (java.lang.Exception unused2) {
            return 0;
        }
    }

    @Override // l6.c
    public void e() {
        try {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                java.lang.Class cls = this.f316730c;
                java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
                this.f316729b.vibrate((android.os.VibrationEffect) cls.getMethod("createPatternHeParameter", cls2, cls2, cls2).invoke(null, 0, 0, 0));
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final boolean f(int i17, int i18, int i19) {
        if (i17 < 22) {
            java.lang.String.format("%x02", java.lang.Integer.valueOf(i17));
            return false;
        }
        if (i17 == 22) {
            if (i19 != 1) {
                java.lang.String.format("%x", java.lang.Integer.valueOf(i17));
                return false;
            }
        } else if (i17 == 23) {
            if (i19 != 1) {
                java.lang.String.format("%x", java.lang.Integer.valueOf(i17));
                return false;
            }
        } else if (i17 == 24 && i19 != 1 && i19 != 2) {
            return false;
        }
        return true;
    }

    public int[] g(int i17, int i18, int i19, int i27, int i28, int i29, l6.f[] fVarArr) {
        int i37 = 0;
        for (int i38 = 0; i38 < i19; i38++) {
            i37 += fVarArr[i38].a();
        }
        int[] iArr = new int[i37 + 5];
        java.util.Arrays.fill(iArr, 0);
        iArr[0] = i17;
        char c17 = 1;
        iArr[1] = i18;
        char c18 = 2;
        iArr[2] = i27;
        iArr[3] = i28;
        int i39 = iArr[4] | (65535 & i19);
        iArr[4] = i39;
        iArr[4] = i39 | ((fVarArr.length << 16) & (-65536));
        int i47 = 0;
        int i48 = 5;
        int i49 = i29;
        while (i47 < i19) {
            l6.f fVar = fVarArr[i47];
            int a17 = fVar.a();
            int[] iArr2 = new int[a17];
            java.util.Arrays.fill(iArr2, 0);
            iArr2[0] = i49;
            iArr2[c17] = fVar.f316723a;
            l6.e[] eVarArr = fVar.f316724b;
            iArr2[c18] = eVarArr.length;
            int i57 = 3;
            for (l6.e eVar : eVarArr) {
                int[] a18 = eVar.a();
                java.lang.System.arraycopy(a18, 0, iArr2, i57, a18.length);
                i57 += a18.length;
            }
            java.lang.System.arraycopy(iArr2, 0, iArr, i48, a17);
            i48 += a17;
            i49++;
            i47++;
            c17 = 1;
            c18 = 2;
        }
        return iArr;
    }

    public final int[] h(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[48];
        for (int i17 = 0; i17 < 48; i17++) {
            iArr[i17] = -1;
        }
        try {
            int length = jSONArray.length();
            if (length >= 4) {
                int min = java.lang.Math.min(length, 16);
                for (int i18 = 0; i18 < min; i18++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                    int i19 = jSONObject.getInt("Time");
                    int i27 = (int) (jSONObject.getDouble("Intensity") * 100.0d);
                    int i28 = jSONObject.getInt("Frequency");
                    if (l(i19, 0, 5000) && l(i27, 0, 100) && l(i28, -100, 100)) {
                        int i29 = i18 * 3;
                        iArr[i29 + 0] = i19;
                        iArr[i29 + 1] = i27;
                        iArr[i29 + 2] = i28;
                    }
                    return null;
                }
                return iArr;
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }

    public final int[] i(org.json.JSONArray jSONArray) {
        int i17;
        int[] iArr = null;
        if (jSONArray == null) {
            return null;
        }
        int[] iArr2 = new int[12];
        try {
            int length = jSONArray.length();
            double d17 = 100.0d;
            try {
                if (length == 4) {
                    int i18 = 0;
                    while (i18 < length) {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                        int i19 = jSONObject.getInt("Time");
                        int i27 = (int) (jSONObject.getDouble("Intensity") * 100.0d);
                        int i28 = jSONObject.getInt("Frequency");
                        if (l(i19, 0, 5000) && l(i27, 0, 100) && l(i28, -100, 100)) {
                            int i29 = i18 * 3;
                            iArr2[i29] = i19;
                            iArr2[i29 + 1] = i27;
                            iArr2[i29 + 2] = i28;
                            i18++;
                            iArr = null;
                        }
                        return null;
                    }
                }
                if (length <= 4 || length > 16) {
                    return null;
                }
                int i37 = 0;
                while (i37 < length) {
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i37);
                    int i38 = jSONObject2.getInt("Time");
                    int i39 = (int) (jSONObject2.getDouble("Intensity") * d17);
                    int i47 = jSONObject2.getInt("Frequency");
                    if (l(i38, 0, 5000) && l(i39, 0, 100) && l(i47, -100, 100)) {
                        if (i37 == 0) {
                            int i48 = i37 * 3;
                            iArr2[i48] = i38;
                            iArr2[i48 + 1] = i39;
                            iArr2[i48 + 2] = i47;
                        } else {
                            int i49 = length - 1;
                            if (i37 < i49) {
                                double d18 = length / 2.0d;
                                int i57 = 1;
                                if (i37 < java.lang.Math.ceil(d18)) {
                                    i17 = (int) (java.lang.Math.ceil(d18) - 1.0d);
                                } else {
                                    i17 = (length / 2) - 1;
                                    i57 = 2;
                                }
                                int i58 = i57 * 3;
                                iArr2[i58] = iArr2[i58] + (i38 / i17);
                                int i59 = i58 + 1;
                                iArr2[i59] = iArr2[i59] + (i39 / i17);
                                int i66 = i58 + 2;
                                iArr2[i66] = iArr2[i66] + (i47 / i17);
                            } else if (i37 == i49) {
                                iArr2[9] = i38;
                                iArr2[10] = i39;
                                iArr2[11] = i47;
                            }
                        }
                        i37++;
                        d17 = 100.0d;
                    }
                    return null;
                }
                return iArr2;
            } catch (java.lang.Exception unused) {
                return null;
            }
        } catch (java.lang.Exception unused2) {
            return iArr;
        }
    }

    public final int[] j(java.lang.String str) {
        int[] iArr;
        boolean z17;
        int i17;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("Pattern");
            int min = java.lang.Math.min(jSONArray.length(), 16);
            int[] iArr2 = new int[min * 17];
            for (int i18 = 0; i18 < min; i18++) {
                try {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18).getJSONObject("Event");
                    java.lang.String string = jSONObject.getString("Type");
                    if (!android.text.TextUtils.equals("continuous", string)) {
                        if (!android.text.TextUtils.equals("transient", string)) {
                            z17 = false;
                            break;
                        }
                        i17 = 4097;
                    } else {
                        i17 = 4096;
                    }
                    int i19 = !jSONObject.has("RelativeTime") ? i18 * 400 : jSONObject.getInt("RelativeTime");
                    if (i19 >= 0) {
                        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("Parameters");
                        int i27 = jSONObject2.getInt("Intensity");
                        int i28 = jSONObject2.getInt("Frequency");
                        if (i17 != 4096 ? i17 != 4097 || (l(i27, 0, 100) && l(i28, -50, 150)) : l(i27, 0, 100) && l(i28, 0, 100)) {
                            int i29 = i18 * 17;
                            iArr2[i29 + 0] = i17;
                            iArr2[i29 + 1] = i19;
                            iArr2[i29 + 2] = i27;
                            iArr2[i29 + 3] = i28;
                            if (4096 == i17) {
                                int i37 = !jSONObject.has("Duration") ? 0 : jSONObject.getInt("Duration");
                                if (l(i37, 0, 5000)) {
                                    iArr2[i29 + 4] = i37;
                                    int[] i38 = i(jSONObject2.getJSONArray("Curve"));
                                    if (i38 != null) {
                                        java.lang.System.arraycopy(i38, 0, iArr2, i29 + 5, 12);
                                    }
                                }
                            }
                        }
                    }
                    z17 = false;
                    break;
                } catch (java.lang.Exception unused) {
                    iArr = iArr2;
                    return iArr;
                }
            }
            z17 = true;
            if (!z17) {
                return null;
            }
            int i39 = iArr2[((min - 1) * 17) + 0];
            return iArr2;
        } catch (java.lang.Exception unused2) {
            iArr = null;
        }
    }

    public final int[] k(java.lang.String str) {
        int[] iArr;
        boolean z17;
        int i17;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("Pattern");
            int min = java.lang.Math.min(jSONArray.length(), 16);
            int[] iArr2 = new int[min * 55];
            for (int i18 = 0; i18 < min; i18++) {
                try {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18).getJSONObject("Event");
                    java.lang.String string = jSONObject.getString("Type");
                    if (!android.text.TextUtils.equals("continuous", string)) {
                        if (!android.text.TextUtils.equals("transient", string)) {
                            z17 = false;
                            break;
                        }
                        i17 = 4097;
                    } else {
                        i17 = 4096;
                    }
                    int i19 = !jSONObject.has("RelativeTime") ? i18 * 400 : jSONObject.getInt("RelativeTime");
                    if (i19 >= 0) {
                        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("Parameters");
                        int i27 = jSONObject2.getInt("Intensity");
                        int i28 = jSONObject2.getInt("Frequency");
                        if (i17 != 4096 ? i17 != 4097 || (l(i27, 0, 100) && l(i28, -50, 150)) : l(i27, 0, 100) && l(i28, 0, 100)) {
                            int i29 = i18 * 55;
                            iArr2[i29 + 0] = i17;
                            iArr2[i29 + 1] = i19;
                            iArr2[i29 + 2] = i27;
                            iArr2[i29 + 3] = i28;
                            iArr2[i29 + 5] = 0;
                            if (4096 == i17) {
                                int i37 = !jSONObject.has("Duration") ? 0 : jSONObject.getInt("Duration");
                                if (l(i37, 0, 5000)) {
                                    iArr2[i29 + 4] = i37;
                                    org.json.JSONArray jSONArray2 = jSONObject2.getJSONArray("Curve");
                                    iArr2[i29 + 6] = jSONArray2.length();
                                    int[] h17 = h(jSONArray2);
                                    if (h17 != null) {
                                        java.lang.System.arraycopy(h17, 0, iArr2, i29 + 7, 48);
                                    }
                                }
                            }
                        }
                    }
                    z17 = false;
                    break;
                } catch (java.lang.Exception unused) {
                    iArr = iArr2;
                    return iArr;
                }
            }
            z17 = true;
            if (!z17) {
                return null;
            }
            int i38 = iArr2[((min - 1) * 55) + 0];
            return iArr2;
        } catch (java.lang.Exception unused2) {
            iArr = null;
        }
    }

    public final boolean l(int i17, int i18, int i19) {
        return i17 >= i18 && i17 <= i19;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cc A[Catch: Exception -> 0x021b, LOOP:1: B:14:0x0058->B:69:0x01cc, LOOP_END, TryCatch #0 {Exception -> 0x021b, blocks: (B:74:0x0205, B:46:0x017d, B:57:0x018d, B:63:0x01a7, B:65:0x01bc, B:69:0x01cc), top: B:73:0x0205 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l6.f[] m(java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.i.m(java.lang.String):l6.f[]");
    }
}
