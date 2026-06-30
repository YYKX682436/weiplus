package n34;

/* loaded from: classes4.dex */
public enum y2 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f334788d = null;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
    }

    y2() {
    }

    public static n34.y2 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        n34.y2 y2Var = (n34.y2) java.lang.Enum.valueOf(n34.y2.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        return y2Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static n34.y2[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        n34.y2[] y2VarArr = (n34.y2[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        return y2VarArr;
    }

    @Override // fs.q
    public java.lang.Object get() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        java.lang.Object obj = this.f334788d;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f334788d;
                    if (obj == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
                        n34.x2 x2Var = new n34.x2();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
                        this.f334788d = x2Var;
                        obj = x2Var;
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
                    throw th6;
                }
            }
        }
        n34.x2 x2Var2 = (n34.x2) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        return x2Var2;
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
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
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
                return list;
            case 1:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
                return java.lang.Void.class;
            case 2:
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
                return bool;
            default:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        if (java.util.Objects.equals(obj, com.tencent.mm.autogen.events.RecentlySnsMediaObjEvent.class)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        return false;
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        java.lang.String concat = "provider ".concat(n34.x2.class.getName());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        return concat;
    }
}
