package ee0;

/* loaded from: classes.dex */
public enum q3 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f251517d = null;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
    }

    q3() {
    }

    public static ee0.q3 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        ee0.q3 q3Var = (ee0.q3) java.lang.Enum.valueOf(ee0.q3.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        return q3Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ee0.q3[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        ee0.q3[] q3VarArr = (ee0.q3[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        return q3VarArr;
    }

    @Override // fs.q
    public java.lang.Object get() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        java.lang.Object obj = this.f251517d;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f251517d;
                    if (obj == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
                        ee0.p3 p3Var = new ee0.p3();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
                        this.f251517d = p3Var;
                        obj = p3Var;
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
                    throw th6;
                }
            }
        }
        ee0.p3 p3Var2 = (ee0.p3) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        return p3Var2;
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case 503774505:
                if (str.equals("dependencies")) {
                    c17 = 0;
                    break;
                }
                break;
            case 1026760592:
                if (str.equals("onProcess")) {
                    c17 = 1;
                    break;
                }
                break;
            case 1028554796:
                if (str.equals("creator")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                java.util.List list = java.util.Collections.EMPTY_LIST;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
                return list;
            case 1:
                java.util.List list2 = java.util.Collections.EMPTY_LIST;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
                return list2;
            case 2:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
                return java.lang.Void.class;
            default:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        return false;
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        return true;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        java.lang.String concat = "provider ".concat(ee0.p3.class.getName());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.FinderCnyAdServiceProvider");
        return concat;
    }
}
