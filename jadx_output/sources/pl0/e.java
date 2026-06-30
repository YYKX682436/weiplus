package pl0;

/* loaded from: classes13.dex */
public abstract class e implements fl0.b {
    private static final int ONE_ARG = 1;
    private static final java.lang.String TAG = "FeatureGroup";
    private java.lang.String _uid;
    private java.lang.Object extra;
    private boolean hasBuild = false;

    public final org.json.JSONObject a(java.lang.String str, org.json.JSONObject jSONObject) {
        java.lang.String name = str.equals(getName()) ? getName() : str + "_" + getName();
        try {
            for (java.lang.reflect.Field field : getClass().getFields()) {
                java.lang.Object obj = field.get(this);
                if (obj != null && field.isAnnotationPresent(fl0.a.class)) {
                    if (obj instanceof pl0.e) {
                        ((pl0.e) obj).a(name, jSONObject);
                    } else if (obj.getClass().isArray()) {
                        org.json.JSONArray jSONArray = new org.json.JSONArray();
                        for (int i17 = 0; i17 < java.lang.reflect.Array.getLength(obj); i17++) {
                            jSONArray.put(d(java.lang.reflect.Array.get(obj, i17)));
                        }
                        jSONObject.put(name + "_" + field.getName(), jSONArray);
                    } else {
                        jSONObject.put(name + "_" + field.getName(), d(obj));
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    public java.lang.Object b() {
        return this.extra;
    }

    @Override // fl0.b
    public void build() {
        try {
            for (java.lang.reflect.Field field : getClass().getFields()) {
                java.lang.Object obj = field.get(this);
                if ((obj instanceof pl0.e) && field.isAnnotationPresent(fl0.a.class)) {
                    ((pl0.e) obj).build();
                }
            }
            this.hasBuild = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    public java.lang.String c() {
        return this._uid;
    }

    public final java.lang.Object d(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Float)) {
            return obj;
        }
        int floatToIntBits = java.lang.Float.floatToIntBits(((java.lang.Float) obj).floatValue());
        byte[] bArr = new byte[4];
        for (int i17 = 0; i17 < 4; i17++) {
            bArr[i17] = (byte) (floatToIntBits >> (i17 * 8));
        }
        return android.util.Base64.encodeToString(bArr, 2);
    }

    public final void e(java.lang.String str, java.util.Map map) {
        try {
            java.lang.String name = getName();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(android.text.TextUtils.isEmpty(name) ? "" : name + "_");
            java.lang.String sb7 = sb6.toString();
            for (java.lang.reflect.Field field : getClass().getFields()) {
                java.lang.Object obj = field.get(this);
                if (obj != null && field.isAnnotationPresent(fl0.a.class)) {
                    if (obj instanceof pl0.e) {
                        ((pl0.e) obj).e(sb7, map);
                    } else {
                        map.put(sb7 + field.getName(), obj);
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public void f(java.lang.Object obj) {
        this.extra = obj;
    }

    public void g(java.lang.String str) {
        this._uid = str;
    }

    public java.lang.String h() {
        java.lang.String name = getName();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        a(name, jSONObject);
        return jSONObject.toString();
    }

    public java.lang.Object[] i(java.lang.Object obj) {
        if (obj == null || !(obj instanceof org.tensorflow.lite.d)) {
            return null;
        }
        org.tensorflow.lite.d dVar = (org.tensorflow.lite.d) obj;
        if (!this.hasBuild) {
            build();
        }
        int c17 = dVar.c();
        java.util.HashMap hashMap = new java.util.HashMap();
        e("", hashMap);
        java.lang.Object[] objArr = new java.lang.Object[c17];
        for (int i17 = 0; i17 < c17; i17++) {
            org.tensorflow.lite.Tensor b17 = dVar.b(i17);
            if (!b17.f347865b.name().contains("FLOAT")) {
                return null;
            }
            int i18 = b17.i();
            java.lang.Object obj2 = hashMap.get(b17.h());
            boolean z17 = obj2 != null;
            if (obj2 != null) {
                boolean isArray = obj2.getClass().isArray();
                z17 = z17 && ((i18 == 1 && !isArray) || (i18 > 1 && isArray && i18 == java.lang.reflect.Array.getLength(obj2)));
            }
            if (z17) {
                if (b17.i() == 1) {
                    float[][] fArr = new float[1];
                    float[] fArr2 = new float[1];
                    fArr2[0] = java.lang.Float.valueOf(java.lang.String.valueOf(obj2)).floatValue();
                    fArr[0] = fArr2;
                    objArr[i17] = fArr;
                } else {
                    float[][] fArr3 = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 1, i18);
                    if (obj2 instanceof int[]) {
                        int[] iArr = (int[]) obj2;
                        int length = iArr.length;
                        float[] fArr4 = new float[length];
                        for (int i19 = 0; i19 < length; i19++) {
                            fArr4[i19] = java.lang.Float.valueOf(java.lang.String.valueOf(iArr[i19])).floatValue();
                        }
                        fArr3[0] = fArr4;
                    } else {
                        fArr3[0] = (float[]) obj2;
                    }
                    objArr[i17] = fArr3;
                }
            } else if (b17.i() == 1) {
                float[][] fArr5 = new float[1];
                float[] fArr6 = new float[1];
                fArr6[0] = 0.0f;
                fArr5[0] = fArr6;
                objArr[i17] = fArr5;
            } else {
                objArr[i17] = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 1, i18);
            }
        }
        return objArr;
    }
}
