package ge0;

/* loaded from: classes.dex */
public enum l0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f270910d = null;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
    }

    l0() {
    }

    public static ge0.l0 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        ge0.l0 l0Var = (ge0.l0) java.lang.Enum.valueOf(ge0.l0.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        return l0Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ge0.l0[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        ge0.l0[] l0VarArr = (ge0.l0[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        return l0VarArr;
    }

    @Override // fs.q
    public java.lang.Object get() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        java.lang.Object obj = this.f270910d;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f270910d;
                    if (obj == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
                        ge0.k0 k0Var = new ge0.k0();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
                        this.f270910d = k0Var;
                        obj = k0Var;
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
                    throw th6;
                }
            }
        }
        ge0.k0 k0Var2 = (ge0.k0) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        return k0Var2;
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
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
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
                return list;
            case 1:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
                return java.lang.Void.class;
            case 2:
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
                return bool;
            default:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        if (java.util.Objects.equals(obj, 209)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        return false;
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        java.lang.String concat = "provider ".concat(ge0.k0.class.getName());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        return concat;
    }
}
