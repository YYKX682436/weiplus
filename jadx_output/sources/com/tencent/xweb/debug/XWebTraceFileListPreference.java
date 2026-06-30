package com.tencent.xweb.debug;

/* loaded from: classes13.dex */
public class XWebTraceFileListPreference extends androidx.preference.ListPreference implements qx5.m {

    /* renamed from: l1, reason: collision with root package name */
    public static final android.webkit.ValueCallback f220256l1 = new qx5.l0$$a();

    /* renamed from: y0, reason: collision with root package name */
    public final java.lang.String f220257y0;

    public XWebTraceFileListPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.xwebsdk.R.styleable.XWebDebugPreference);
        this.f220257y0 = obtainStyledAttributes.getString(com.tencent.xwebsdk.R.styleable.XWebDebugPreference_debug_key);
        obtainStyledAttributes.recycle();
        this.X = new java.lang.String[0];
        this.Y = new java.lang.String[0];
    }

    @Override // qx5.m
    public qx5.a a(qx5.l lVar, java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (com.tencent.xweb.t0.f220594a.a()) {
            yu5.b.f465914a.a(new qx5.l0$$b(str));
        } else {
            by5.c4.c("XWebTraceFileListPreference", "[XWEB_RECORD_TRACE] Need local debug permission");
        }
        return qx5.a.b();
    }

    @Override // qx5.m
    public qx5.a b(qx5.l lVar) {
        java.lang.String str = (java.lang.String) tx5.j.d(80038, new java.lang.Object[0]);
        if (android.text.TextUtils.isEmpty(str)) {
            return qx5.a.a();
        }
        java.io.File[] listFiles = new java.io.File(str).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return qx5.a.a();
        }
        java.util.Arrays.sort(listFiles, new qx5.l0$$c());
        java.lang.String[] strArr = new java.lang.String[listFiles.length];
        for (int i17 = 0; i17 < listFiles.length; i17++) {
            strArr[i17] = listFiles[i17].getName();
        }
        this.X = strArr;
        this.Y = strArr;
        return qx5.a.b();
    }

    @Override // qx5.m
    public java.lang.String h() {
        return this.f220257y0;
    }
}
