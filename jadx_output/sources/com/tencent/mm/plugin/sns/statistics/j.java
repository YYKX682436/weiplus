package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public enum j implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f164860d = null;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
    }

    j() {
    }

    public static com.tencent.mm.plugin.sns.statistics.j valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        com.tencent.mm.plugin.sns.statistics.j jVar = (com.tencent.mm.plugin.sns.statistics.j) java.lang.Enum.valueOf(com.tencent.mm.plugin.sns.statistics.j.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        return jVar;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static com.tencent.mm.plugin.sns.statistics.j[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        com.tencent.mm.plugin.sns.statistics.j[] jVarArr = (com.tencent.mm.plugin.sns.statistics.j[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        return jVarArr;
    }

    @Override // fs.q
    public java.lang.Object get() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        java.lang.Object obj = this.f164860d;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f164860d;
                    if (obj == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
                        com.tencent.mm.plugin.sns.statistics.i iVar = new com.tencent.mm.plugin.sns.statistics.i();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
                        this.f164860d = iVar;
                        obj = iVar;
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
                    throw th6;
                }
            }
        }
        com.tencent.mm.plugin.sns.statistics.i iVar2 = (com.tencent.mm.plugin.sns.statistics.i) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        return iVar2;
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
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
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
                return list;
            case 1:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
                return java.lang.Void.class;
            case 2:
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
                return bool;
            default:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        if (java.util.Objects.equals(obj, com.tencent.mm.autogen.events.AggressiveCleanCacheEvent.class)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        return false;
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        java.lang.String concat = "provider ".concat(com.tencent.mm.plugin.sns.statistics.i.class.getName());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        return concat;
    }
}
