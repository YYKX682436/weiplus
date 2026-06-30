package e43;

/* loaded from: classes12.dex */
public class h implements u33.j {
    public void a(boolean z17, int i17, java.lang.String str, dn.h hVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SendImgUtil", "onFinish, success = %b, errCode = %d, mediaId = %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.autogen.events.UploadImgResultEvent uploadImgResultEvent = new com.tencent.mm.autogen.events.UploadImgResultEvent();
        am.k00 k00Var = uploadImgResultEvent.f54931g;
        k00Var.f7109a = str;
        k00Var.f7110b = z17;
        java.util.Map map = e43.g.f249362a;
        s33.k kVar = (s33.k) ((java.util.HashMap) map).get(str);
        if (kVar != null) {
            ((java.util.HashMap) map).put(str, kVar);
        }
        if (hVar == null || kVar == null) {
            return;
        }
        k00Var.f7111c = hVar.field_aesKey;
        k00Var.f7112d = hVar.field_fileId;
        k00Var.f7113e = kVar.f402518b;
        k00Var.f7114f = kVar.f402519c;
        uploadImgResultEvent.e();
    }
}
