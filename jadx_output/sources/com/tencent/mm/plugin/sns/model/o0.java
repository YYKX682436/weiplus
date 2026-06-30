package com.tencent.mm.plugin.sns.model;

/* loaded from: classes.dex */
public enum o0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f164524d = null;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
    }

    o0() {
    }

    public static com.tencent.mm.plugin.sns.model.o0 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        com.tencent.mm.plugin.sns.model.o0 o0Var = (com.tencent.mm.plugin.sns.model.o0) java.lang.Enum.valueOf(com.tencent.mm.plugin.sns.model.o0.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        return o0Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static com.tencent.mm.plugin.sns.model.o0[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        com.tencent.mm.plugin.sns.model.o0[] o0VarArr = (com.tencent.mm.plugin.sns.model.o0[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        return o0VarArr;
    }

    @Override // fs.q
    public java.lang.Object get() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        java.lang.Object obj = this.f164524d;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f164524d;
                    if (obj == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
                        com.tencent.mm.plugin.sns.model.n0 n0Var = new com.tencent.mm.plugin.sns.model.n0();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
                        this.f164524d = n0Var;
                        obj = n0Var;
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
                    throw th6;
                }
            }
        }
        com.tencent.mm.plugin.sns.model.n0 n0Var2 = (com.tencent.mm.plugin.sns.model.n0) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        return n0Var2;
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case 1026760592:
                if (str.equals("onProcess")) {
                    c17 = 0;
                    break;
                }
                break;
            case 1028554796:
                if (str.equals("creator")) {
                    c17 = 1;
                    break;
                }
                break;
            case 1063801905:
                if (str.equals("accountAware")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                java.util.List list = java.util.Collections.EMPTY_LIST;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
                return list;
            case 1:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
                return java.lang.Void.class;
            case 2:
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
                return bool;
            default:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        if (java.util.Objects.equals(obj, 208)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        return false;
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        java.lang.String concat = "provider ".concat(com.tencent.mm.plugin.sns.model.n0.class.getName());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        return concat;
    }
}
