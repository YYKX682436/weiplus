package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class x7 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f171492a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f171493b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f171494c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f171495d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f171496e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f171497f = new java.util.HashMap();

    public x7(com.tencent.mm.plugin.sns.ui.p7 p7Var) {
    }

    public static /* synthetic */ java.util.ArrayList a(com.tencent.mm.plugin.sns.ui.x7 x7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        java.util.ArrayList arrayList = x7Var.f171492a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        return arrayList;
    }

    public com.tencent.mm.plugin.sns.ui.x7 b(java.lang.String str, int i17, boolean z17, com.tencent.mm.modelscan.ScanCodeInfo scanCodeInfo, r45.h96 h96Var, r45.vb1 vb1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addMedia", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        this.f171492a.add(str);
        ((java.util.HashMap) this.f171494c).put(str, java.lang.Integer.valueOf(i17));
        ((java.util.HashMap) this.f171493b).put(str, java.lang.Boolean.valueOf(z17));
        if (scanCodeInfo != null) {
            ((java.util.HashMap) this.f171495d).put(str, scanCodeInfo);
        }
        if (h96Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "addMedia snsMediaEcsInfo path: %s", str);
            ((java.util.HashMap) this.f171496e).put(str, h96Var);
        }
        if (vb1Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "addMedia snsMediaEcsInfo path: %s", str);
            ((java.util.HashMap) this.f171497f).put(str, vb1Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addMedia", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        return this;
    }

    public int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaSize", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        int size = this.f171492a.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaSize", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        return size;
    }

    public java.util.ArrayList d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMedias", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        java.util.ArrayList arrayList = this.f171492a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMedias", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        return arrayList;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        java.util.Iterator it = this.f171492a.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            java.util.Map map = this.f171494c;
            str = str + str2 + "," + (map != null ? ((java.lang.Integer) ((java.util.HashMap) map).get(str2)).intValue() : 0) + ";";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        return str;
    }
}
