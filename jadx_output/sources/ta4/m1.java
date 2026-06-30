package ta4;

/* loaded from: classes7.dex */
public enum m1 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f416803d = null;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
    }

    m1() {
    }

    public static ta4.m1 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
        ta4.m1 m1Var = (ta4.m1) java.lang.Enum.valueOf(ta4.m1.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
        return m1Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ta4.m1[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
        ta4.m1[] m1VarArr = (ta4.m1[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
        return m1VarArr;
    }

    @Override // fs.q
    public java.lang.Object get() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
        java.lang.Object obj = this.f416803d;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f416803d;
                    if (obj == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
                        ta4.l1 l1Var = new ta4.l1();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
                        this.f416803d = l1Var;
                        obj = l1Var;
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
                    throw th6;
                }
            }
        }
        ta4.l1 l1Var2 = (ta4.l1) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
        return l1Var2;
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
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
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
                return list;
            case 1:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
                return java.lang.Void.class;
            case 2:
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
                return bool;
            default:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
        if (java.util.Objects.equals(obj, com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent.class)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
        return false;
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
        java.lang.String concat = "provider ".concat(ta4.l1.class.getName());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListenerProvider");
        return concat;
    }
}
