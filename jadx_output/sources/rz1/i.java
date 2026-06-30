package rz1;

/* loaded from: classes3.dex */
public class i implements ly1.a {
    public i(com.tencent.mm.plugin.datareport.sample.SampleUI sampleUI) {
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (u46.l.c(str, "page_in")) {
            hashMap.put("sampleui_dynamicparams", "页面动态参数");
        }
        return hashMap;
    }
}
