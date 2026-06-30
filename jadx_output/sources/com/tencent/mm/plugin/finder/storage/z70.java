package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class z70 {

    /* renamed from: e */
    public static com.tencent.mm.plugin.finder.storage.k80 f128436e;

    /* renamed from: a */
    public static final com.tencent.mm.plugin.finder.storage.z70 f128432a = new com.tencent.mm.plugin.finder.storage.z70();

    /* renamed from: b */
    public static final jz5.g f128433b = jz5.h.b(com.tencent.mm.plugin.finder.storage.y70.f128349d);

    /* renamed from: c */
    public static final boolean f128434c = kb2.b.f306225a.a();

    /* renamed from: d */
    public static final jz5.g f128435d = jz5.h.b(com.tencent.mm.plugin.finder.storage.x70.f128292d);

    /* renamed from: f */
    public static final jz5.g f128437f = jz5.h.b(com.tencent.mm.plugin.finder.storage.w70.f128234d);

    public static /* synthetic */ java.lang.Object f(com.tencent.mm.plugin.finder.storage.z70 z70Var, com.tencent.mm.plugin.finder.storage.t70 t70Var, java.lang.String str, e42.b0 b0Var, java.lang.Object obj, boolean z17, yz5.a aVar, int i17, java.lang.Object obj2) {
        if ((i17 & 8) != 0) {
            z17 = true;
        }
        return z70Var.e(t70Var, str, b0Var, obj, z17, aVar);
    }

    public final java.lang.Object a(com.tencent.mm.plugin.finder.storage.t70 t70Var, java.lang.String title, java.lang.String dyConfigKey, java.lang.Object obj, yz5.a aVar) {
        com.tencent.mm.plugin.finder.storage.l80 l80Var;
        java.lang.Object obj2;
        kotlin.jvm.internal.o.g(t70Var, "<this>");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(dyConfigKey, "dyConfigKey");
        boolean z17 = f128434c;
        if (z17) {
            l80Var = aVar != null ? (com.tencent.mm.plugin.finder.storage.l80) aVar.invoke() : null;
            lb2.j a17 = com.tencent.mm.plugin.finder.storage.d90.f126635a.a(title, obj, l80Var);
            if (a17 != null) {
                a17.b(dyConfigKey);
            }
            obj2 = c(title, obj, l80Var);
        } else {
            l80Var = null;
            obj2 = null;
        }
        if (obj2 == null) {
            com.tencent.mm.plugin.finder.storage.FinderConfigDynamicData finderConfigDynamicData = (com.tencent.mm.plugin.finder.storage.FinderConfigDynamicData) ((jz5.n) f128437f).getValue();
            finderConfigDynamicData.getClass();
            java.lang.Object obj3 = finderConfigDynamicData.c().get(dyConfigKey);
            if (obj3 == null) {
                obj3 = finderConfigDynamicData.d(dyConfigKey, obj);
            } else if (kb2.b.f306225a.a()) {
                com.tencent.mars.xlog.Log.i(finderConfigDynamicData.f126368d, "dynamic config " + dyConfigKey + " cache result=" + obj3);
            }
            if (obj3 == null) {
                obj3 = null;
            }
            obj2 = obj3 == null ? obj : obj3;
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("valueFromDynamicConfig ");
                sb6.append(title);
                sb6.append(' ');
                sb6.append(l80Var != null ? l80Var.f127116a : null);
                sb6.append(" config from server value=");
                sb6.append(obj2);
                com.tencent.mars.xlog.Log.i("FinderConfigExtension", sb6.toString());
            }
        } else if (z17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("valueFromDynamicConfig ");
            sb7.append(title);
            sb7.append(' ');
            sb7.append(l80Var != null ? l80Var.f127116a : null);
            sb7.append(" config from local value=");
            sb7.append(obj2);
            com.tencent.mars.xlog.Log.i("FinderConfigExtension", sb7.toString());
        }
        return obj2 == null ? obj : obj2;
    }

    public final java.lang.Object b(com.tencent.mm.plugin.finder.storage.t70 t70Var, java.lang.String title, int i17, java.lang.String exptKey, java.lang.Object obj, yz5.a localSettingParamsCall) {
        com.tencent.mm.plugin.finder.storage.l80 l80Var;
        java.lang.Object obj2;
        kotlin.jvm.internal.o.g(t70Var, "<this>");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(exptKey, "exptKey");
        kotlin.jvm.internal.o.g(localSettingParamsCall, "localSettingParamsCall");
        boolean z17 = f128434c;
        if (z17) {
            l80Var = (com.tencent.mm.plugin.finder.storage.l80) localSettingParamsCall.invoke();
            lb2.j a17 = com.tencent.mm.plugin.finder.storage.d90.f126635a.a(title, obj, l80Var);
            if (a17 != null) {
                a17.g(i17, exptKey);
            }
            obj2 = c(title, obj, l80Var);
        } else {
            l80Var = null;
            obj2 = null;
        }
        if (obj2 == null) {
            if (f128436e == null) {
                synchronized (t70Var) {
                    if (f128436e == null) {
                        f128436e = new com.tencent.mm.plugin.finder.storage.k80();
                    }
                }
            }
            com.tencent.mm.plugin.finder.storage.k80 k80Var = f128436e;
            if (k80Var != null) {
                com.tencent.mm.plugin.finder.storage.g80 g80Var = (com.tencent.mm.plugin.finder.storage.g80) k80Var.c().get(exptKey);
                obj2 = g80Var != null ? g80Var.f126817c : null;
                if (obj2 == null) {
                    obj2 = k80Var.d(i17, exptKey, obj);
                } else if (((java.lang.Boolean) ((jz5.n) k80Var.f127055a).getValue()).booleanValue()) {
                    com.tencent.mars.xlog.Log.i("FinderConfigInitExptData", "cmdId=" + i17 + " (" + exptKey + ") cache result=" + obj2);
                }
                if (obj2 == null) {
                    obj2 = null;
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
            } else {
                obj2 = null;
            }
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("valueFromFinderInitExpt ");
                sb6.append(title);
                sb6.append(' ');
                sb6.append(l80Var != null ? l80Var.f127116a : null);
                sb6.append(" config from server value=");
                sb6.append(obj2);
                com.tencent.mars.xlog.Log.i("FinderConfigExtension", sb6.toString());
            }
        } else if (z17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("valueFromFinderInitExpt ");
            sb7.append(title);
            sb7.append(' ');
            sb7.append(l80Var != null ? l80Var.f127116a : null);
            sb7.append(" config from local value=");
            sb7.append(obj2);
            com.tencent.mars.xlog.Log.i("FinderConfigExtension", sb7.toString());
        }
        return obj2 == null ? obj : obj2;
    }

    public final java.lang.Object c(java.lang.String str, java.lang.Object obj, com.tencent.mm.plugin.finder.storage.l80 l80Var) {
        java.lang.String str2;
        java.lang.String str3;
        if (!f128434c) {
            return null;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f128433b).getValue();
        java.lang.String str4 = "";
        if (l80Var == null || (str2 = l80Var.f127116a) == null) {
            str2 = "";
        }
        int i17 = o4Var.getInt(str2, -1);
        java.util.List list = l80Var != null ? l80Var.f127117b : null;
        java.lang.Object obj2 = (list == null || i17 < 0 || i17 >= list.size()) ? null : list.get(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (l80Var != null && (str3 = l80Var.f127120e) != null) {
            str4 = str3;
        }
        sb6.append(str4);
        sb6.append(" valueFromLocalSetting ");
        sb6.append(str);
        sb6.append(" mmkvKey ");
        sb6.append(l80Var != null ? l80Var.f127116a : null);
        sb6.append(" index ");
        sb6.append(i17);
        sb6.append(" result=");
        sb6.append(obj2);
        sb6.append(" defValue:");
        sb6.append(obj);
        com.tencent.mars.xlog.Log.i("FinderConfigExtension", sb6.toString());
        return obj2;
    }

    public final java.lang.Object d(com.tencent.mm.plugin.finder.storage.t70 t70Var, java.lang.String title, java.lang.Object obj, com.tencent.mm.plugin.finder.storage.l80 localSettingParams) {
        kotlin.jvm.internal.o.g(t70Var, "<this>");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(localSettingParams, "localSettingParams");
        java.lang.Object c17 = c(title, obj, localSettingParams);
        if (c17 == null) {
            c17 = obj;
        }
        if (f128434c) {
            com.tencent.mm.plugin.finder.storage.d90.f126635a.a(title, obj, localSettingParams);
            com.tencent.mars.xlog.Log.i("FinderConfigExtension", "valueFromSetting " + title + ' ' + localSettingParams.f127116a + " config value=" + c17);
        }
        return c17;
    }

    public final java.lang.Object e(com.tencent.mm.plugin.finder.storage.t70 t70Var, java.lang.String title, e42.b0 xLabKey, java.lang.Object obj, boolean z17, yz5.a localSettingParamsCall) {
        com.tencent.mm.plugin.finder.storage.l80 l80Var;
        java.lang.Object obj2;
        kotlin.jvm.internal.o.g(t70Var, "<this>");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(xLabKey, "xLabKey");
        kotlin.jvm.internal.o.g(localSettingParamsCall, "localSettingParamsCall");
        boolean z18 = f128434c;
        if (z18) {
            l80Var = (com.tencent.mm.plugin.finder.storage.l80) localSettingParamsCall.invoke();
            lb2.j a17 = com.tencent.mm.plugin.finder.storage.d90.f126635a.a(title, obj, l80Var);
            if (a17 != null) {
                a17.c(xLabKey, z17);
            }
            obj2 = c(title, obj, l80Var);
        } else {
            l80Var = null;
            obj2 = null;
        }
        if (obj2 == null) {
            com.tencent.mm.plugin.finder.storage.FinderConfigXLabData finderConfigXLabData = (com.tencent.mm.plugin.finder.storage.FinderConfigXLabData) ((jz5.n) f128435d).getValue();
            finderConfigXLabData.getClass();
            com.tencent.mm.plugin.finder.storage.m80 m80Var = (com.tencent.mm.plugin.finder.storage.m80) finderConfigXLabData.c().get(xLabKey.name());
            java.lang.Object obj3 = m80Var != null ? m80Var.f127178b : null;
            if (obj3 == null) {
                obj3 = finderConfigXLabData.d(xLabKey, obj, z17);
            } else if (kb2.b.f306225a.a()) {
                com.tencent.mars.xlog.Log.i(finderConfigXLabData.f126370d, xLabKey + " cache result=" + obj3);
            }
            if (obj3 == null) {
                obj3 = null;
            }
            obj2 = obj3 == null ? obj : obj3;
            if (z18) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("valueFromXLab ");
                sb6.append(title);
                sb6.append('(');
                sb6.append(l80Var != null ? l80Var.f127116a : null);
                sb6.append(") config from server value=");
                sb6.append(obj2);
                com.tencent.mars.xlog.Log.i("FinderConfigExtension", sb6.toString());
            }
        } else if (z18) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("valueFromXLab ");
            sb7.append(title);
            sb7.append('(');
            sb7.append(l80Var != null ? l80Var.f127116a : null);
            sb7.append(")  config from local value=");
            sb7.append(obj2);
            com.tencent.mars.xlog.Log.i("FinderConfigExtension", sb7.toString());
        }
        return obj2 == null ? obj : obj2;
    }
}
