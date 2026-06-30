package n34;

/* loaded from: classes7.dex */
public enum u implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f334737d = null;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
    }

    u() {
    }

    public static n34.u valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        n34.u uVar = (n34.u) java.lang.Enum.valueOf(n34.u.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        return uVar;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static n34.u[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        n34.u[] uVarArr = (n34.u[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        return uVarArr;
    }

    @Override // fs.q
    public java.lang.Object get() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        java.lang.Object obj = this.f334737d;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f334737d;
                    if (obj == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
                        n34.t tVar = new n34.t();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
                        this.f334737d = tVar;
                        obj = tVar;
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
                    throw th6;
                }
            }
        }
        n34.t tVar2 = (n34.t) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        return tVar2;
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
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
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
                return list;
            case 1:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
                return java.lang.Void.class;
            case 2:
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
                return bool;
            default:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        if (java.util.Objects.equals(obj, com.tencent.mm.autogen.events.ExtStartSnsServerAndCallbackOnFpSetSizeEvent.class)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        return false;
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        java.lang.String concat = "provider ".concat(n34.t.class.getName());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        return concat;
    }
}
