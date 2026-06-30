package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public class i0 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.sns.ad.widget.living.i0 f163721c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f163722a = new android.util.ArrayMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f163723b = new android.util.ArrayMap();

    public static void a(java.lang.String str, com.tencent.mm.plugin.sns.ad.widget.living.h0 h0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addStatusChangedListener", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
        try {
            b().e(str, h0Var);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addStatusChangedListener", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
    }

    public static com.tencent.mm.plugin.sns.ad.widget.living.i0 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("instance", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
        if (f163721c == null) {
            synchronized (com.tencent.mm.plugin.sns.ad.widget.living.i0.class) {
                try {
                    if (f163721c == null) {
                        f163721c = new com.tencent.mm.plugin.sns.ad.widget.living.i0();
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("instance", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
                    throw th6;
                }
            }
        }
        com.tencent.mm.plugin.sns.ad.widget.living.i0 i0Var = f163721c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("instance", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
        return i0Var;
    }

    public static int c(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("optLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
        int i18 = 0;
        try {
            com.tencent.mm.plugin.sns.ad.widget.living.i0 b17 = b();
            b17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
            java.lang.Integer num = (java.lang.Integer) ((android.util.ArrayMap) b17.f163722a).get(str);
            if (num != null) {
                int intValue = num.intValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
                i18 = intValue;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
            }
            if (i18 == 0) {
                if (i17 == 1) {
                    i18 = 257;
                } else if (i17 == 2) {
                    i18 = 770;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("optLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
            return i18;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("optLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
            return 0;
        }
    }

    public static int d(java.lang.String str, java.util.List list) {
        r45.a3 a3Var;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseAndPutLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
        try {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    a3Var = null;
                    break;
                }
                a3Var = (r45.a3) it.next();
                if (a3Var.f369690d == 2) {
                    break;
                }
            }
            if (a3Var != null) {
                java.lang.String str2 = a3Var.f369691e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
                try {
                    i17 = new org.json.JSONObject(str2).optInt("liveStatus", 0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
                } catch (java.lang.Throwable unused) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
                    i17 = 0;
                }
                b().f(str, i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseAndPutLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
                return i17;
            }
        } catch (java.lang.Throwable unused2) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseAndPutLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
        return 0;
    }

    public static void g(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
        try {
            if (!android.text.TextUtils.isEmpty(str)) {
                b().f(str, i17);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
    }

    public void e(java.lang.String str, com.tencent.mm.plugin.sns.ad.widget.living.h0 h0Var) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putListener", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
        android.os.SystemClock.elapsedRealtimeNanos();
        if (h0Var != null && !android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isKeyAndValueExist", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
            java.util.Map map = this.f163723b;
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((android.util.ArrayMap) map).get(str);
            boolean z17 = weakReference != null && h0Var == weakReference.get();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isKeyAndValueExist", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
            if (!z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearExpiredListeners", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
                if (a84.b0.f(map)) {
                    try {
                        java.util.Iterator it = ((android.util.ArrayMap) map).entrySet().iterator();
                        while (it.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            if (entry == null || entry.getValue() == null || ((java.lang.ref.WeakReference) entry.getValue()).get() == null) {
                                it.remove();
                            }
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearExpiredListeners", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
                if (!a84.b0.c(map)) {
                    java.util.Iterator it6 = ((android.util.ArrayMap) map).entrySet().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            str2 = null;
                            break;
                        }
                        java.util.Map.Entry entry2 = (java.util.Map.Entry) it6.next();
                        java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) entry2.getValue();
                        if (weakReference2 != null && weakReference2.get() == h0Var) {
                            str2 = (java.lang.String) entry2.getKey();
                            break;
                        }
                    }
                    if (str2 != null) {
                        ((android.util.ArrayMap) map).remove(str2);
                    }
                }
                ((android.util.ArrayMap) map).put(str, new java.lang.ref.WeakReference(h0Var));
                android.os.SystemClock.elapsedRealtimeNanos();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putListener", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("SnsAd.LivingStatusManager", "the input sns id or listener is invalid, or there is same key-value of them.");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putListener", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
    }

    public final void f(java.lang.String str, int i17) {
        java.lang.ref.WeakReference weakReference;
        com.tencent.mm.plugin.sns.ad.widget.living.h0 h0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
        java.lang.Integer num = (java.lang.Integer) ((android.util.ArrayMap) this.f163722a).put(str, java.lang.Integer.valueOf(i17));
        if ((num == null || !num.equals(java.lang.Integer.valueOf(i17))) && (weakReference = (java.lang.ref.WeakReference) ((android.util.ArrayMap) this.f163723b).get(str)) != null && (h0Var = (com.tencent.mm.plugin.sns.ad.widget.living.h0) weakReference.get()) != null) {
            h0Var.a(str, num != null ? num.intValue() : 0, i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
    }
}
