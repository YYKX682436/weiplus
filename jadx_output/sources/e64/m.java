package e64;

/* loaded from: classes7.dex */
public enum m implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f249834d = null;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
    }

    m() {
    }

    public static e64.m valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        e64.m mVar = (e64.m) java.lang.Enum.valueOf(e64.m.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        return mVar;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static e64.m[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        e64.m[] mVarArr = (e64.m[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        return mVarArr;
    }

    @Override // fs.q
    public java.lang.Object get() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        java.lang.Object obj = this.f249834d;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f249834d;
                    if (obj == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
                        e64.j jVar = new e64.j();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
                        this.f249834d = jVar;
                        obj = jVar;
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
                    throw th6;
                }
            }
        }
        e64.j jVar2 = (e64.j) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        return jVar2;
    }

    @Override // fs.q
    public java.lang.Object getQualifierAttribute(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
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
                java.util.List list = e64.k.f249830a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
                return list;
            case 1:
                java.util.List list2 = e64.l.f249831a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
                return list2;
            case 2:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
                return java.lang.Void.class;
            default:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
                return null;
        }
    }

    @Override // fs.q
    public boolean hasKey(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        if (java.util.Objects.equals(obj, j95.a.ON_SPLASH)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        return false;
    }

    @Override // fs.q
    public boolean hasNoKeys() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        java.lang.String concat = "provider ".concat(e64.j.class.getName());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        return concat;
    }
}
