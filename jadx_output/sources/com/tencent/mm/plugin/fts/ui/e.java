package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes11.dex */
public abstract class e {
    public static int a(java.lang.String str, float f17) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        return ((i65.a.B(context) - i65.a.f(context, com.tencent.mm.R.dimen.f479890i3)) - i65.a.f(context, com.tencent.mm.R.dimen.f479909in)) - (((int) java.lang.Math.min(com.tencent.mm.plugin.fts.ui.d.f138036e.measureText(str), f17)) + 1);
    }
}
