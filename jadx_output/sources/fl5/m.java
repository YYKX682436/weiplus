package fl5;

/* loaded from: classes15.dex */
public class m implements fl5.a {
    public m(com.tencent.mm.ui.widget.cedit.api.MMCustomEditText mMCustomEditText) {
    }

    public void a(java.lang.Throwable th6, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("Content", str);
        hashMap.put("Exception", th6.toString());
        hashMap.put("Stack", th6.getStackTrace());
        jx3.f.INSTANCE.i("CustomEditView", str2, hashMap);
    }
}
