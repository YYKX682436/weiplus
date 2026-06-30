package rz1;

/* loaded from: classes3.dex */
public class k implements ly1.a {
    public k(com.tencent.mm.plugin.datareport.sample.SampleUI sampleUI) {
    }

    @Override // ly1.a
    public boolean a(java.lang.Object obj, java.lang.String str, int i17) {
        return (obj instanceof android.view.View) && u46.l.c(str, "view_clk") && i17 == 24184;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (u46.l.c(str, "dr_click1")) {
            hashMap.put("btn1_dynamicparams", "控件动态参数");
        }
        return hashMap;
    }
}
