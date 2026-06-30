package com.tencent.mm.pluginsdk.model;

/* loaded from: classes13.dex */
public abstract class i2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f189342a;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("content://");
        sb6.append(com.tencent.mm.sdk.platformtools.x2.f193072b + ".plugin.gwallet.queryprovider");
        f189342a = sb6.toString();
    }

    public static void a(android.content.Context context, java.lang.String[] strArr, ec0.e eVar) {
        if (eVar == null || strArr == null || strArr.length == 0) {
            throw new java.lang.IllegalArgumentException();
        }
        new com.tencent.mm.pluginsdk.model.h2(context, strArr, eVar).execute(new java.lang.Void[0]);
    }
}
