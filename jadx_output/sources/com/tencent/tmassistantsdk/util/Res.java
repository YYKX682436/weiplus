package com.tencent.tmassistantsdk.util;

/* loaded from: classes13.dex */
public class Res {
    private static final java.lang.String TAG = "Res";
    protected final java.lang.String RclassName;
    protected android.content.Context ctx;

    public Res(android.content.Context context) {
        this.ctx = context;
        this.RclassName = this.ctx.getPackageName() + ".R";
    }

    private int reflectResouce(java.lang.String str, java.lang.String str2) {
        if (this.RclassName == null || str == null || str2 == null) {
            return 0;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(this.RclassName + "$" + str);
            return com.tencent.mm.sdk.platformtools.t8.P(cls.getField(str2).get(cls.newInstance()).toString(), -1);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return -1;
        }
    }

    public int drawable(java.lang.String str) {
        return reflectResouce("drawable", str);
    }

    public int id(java.lang.String str) {
        return reflectResouce(dm.i4.COL_ID, str);
    }

    public int layout(java.lang.String str) {
        return reflectResouce("layout", str);
    }

    public int string(java.lang.String str) {
        return reflectResouce("string", str);
    }

    public int style(java.lang.String str) {
        return reflectResouce("style", str);
    }
}
