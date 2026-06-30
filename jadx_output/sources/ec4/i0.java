package ec4;

/* loaded from: classes4.dex */
public enum i0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f251162d = null;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
    }

    i0() {
    }

    public static ec4.i0 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        ec4.i0 i0Var = (ec4.i0) java.lang.Enum.valueOf(ec4.i0.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        return i0Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ec4.i0[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        ec4.i0[] i0VarArr = (ec4.i0[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        return i0VarArr;
    }

    @Override // fs.q
    public java.lang.Object get() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        java.lang.Object obj = this.f251162d;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f251162d;
                    if (obj == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
                        ec4.h0 h0Var = new ec4.h0();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
                        this.f251162d = h0Var;
                        obj = h0Var;
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
                    throw th6;
                }
            }
        }
        ec4.h0 h0Var2 = (ec4.h0) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        return h0Var2;
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
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
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
                return list;
            case 1:
                java.util.List list2 = java.util.Collections.EMPTY_LIST;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
                return list2;
            case 2:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
                return java.lang.Void.class;
            default:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        return false;
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        return true;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        java.lang.String concat = "provider ".concat(ec4.h0.class.getName());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        return concat;
    }
}
