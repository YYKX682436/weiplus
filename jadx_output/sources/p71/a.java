package p71;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public i83.a f352473a = new i83.a();

    public void a(i83.b bVar) {
        java.lang.String str = bVar.f289635e;
        if (str == null || !str.equals("0")) {
            java.lang.String str2 = bVar.f289635e;
            if (str2 != null && str2.equals("1")) {
                bVar.f289637g = bVar.f289636f;
                bVar.f289636f = "";
                bVar.f289642o = "";
                bVar.f289638h = "";
                bVar.f289639i = "";
                bVar.f289640m = "";
                bVar.f289645r = "";
                this.f352473a.f289633d.add(bVar);
            }
        } else {
            bVar.f289637g = "";
            bVar.f289643p = "";
            bVar.f289644q = "";
            this.f352473a.f289633d.add(bVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.InvoiceMgr", "type is error..");
    }
}
