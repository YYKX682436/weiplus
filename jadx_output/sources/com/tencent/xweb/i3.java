package com.tencent.xweb;

/* loaded from: classes13.dex */
public abstract class i3 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.xweb.z2 f220301a;

    public static synchronized void a(java.lang.String str, int i17) {
        android.content.SharedPreferences c17;
        synchronized (com.tencent.xweb.i3.class) {
            if (org.xwalk.core.XWalkEnvironment.l().equalsIgnoreCase(org.xwalk.core.XWalkEnvironment.getProcessName()) && (c17 = by5.d4.c()) != null) {
                by5.c4.f("XWebWebViewMode", "saveWebViewModeIfNeed, key:" + str + ", value:" + i17);
                c17.edit().putInt(str, i17).apply();
            }
        }
    }
}
