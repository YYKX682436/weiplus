package he0;

/* loaded from: classes4.dex */
public enum q4 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f280790d = null;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
    }

    q4() {
    }

    public static he0.q4 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
        he0.q4 q4Var = (he0.q4) java.lang.Enum.valueOf(he0.q4.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
        return q4Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static he0.q4[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
        he0.q4[] q4VarArr = (he0.q4[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
        return q4VarArr;
    }

    @Override // fs.q
    public java.lang.Object get() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
        java.lang.Object obj = this.f280790d;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f280790d;
                    if (obj == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
                        he0.p4 p4Var = new he0.p4();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
                        this.f280790d = p4Var;
                        obj = p4Var;
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
                    throw th6;
                }
            }
        }
        he0.p4 p4Var2 = (he0.p4) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
        return p4Var2;
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
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
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
                return list;
            case 1:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
                return java.lang.Void.class;
            case 2:
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
                return bool;
            default:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
        if (java.util.Objects.equals(obj, com.tencent.mm.autogen.events.GetAllNeedResendSnsEvent.class)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
        return false;
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
        java.lang.String concat = "provider ".concat(he0.p4.class.getName());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.listener.GetAllNeedResendSnsListenerProvider");
        return concat;
    }
}
