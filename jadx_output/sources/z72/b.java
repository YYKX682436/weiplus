package z72;

/* loaded from: classes12.dex */
public class b extends l75.s0 implements o72.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.wcdb.core.Database f470550d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.wcdb.core.Table f470551e;

    public b(com.tencent.wcdb.core.Database database) {
        this.f470550d = database;
        this.f470551e = database.getTable("FavConfigInfo", up5.c.f429910b);
    }

    @Override // o72.a4
    public byte[] Ue() {
        com.tencent.wcdb.base.Value value;
        try {
            value = this.f470551e.getValue(up5.c.f429912d, up5.c.f429911c.eq(8216));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavConfigStorage", "Operation failed: " + e17.getMessage());
            value = null;
        }
        if (value != null) {
            java.lang.String text = value.getText();
            com.tencent.mars.xlog.Log.i("MicroMsg.FavConfigStorage", "get sync key, id %d, value %s", 8216, text);
            return com.tencent.mm.sdk.platformtools.t8.h(text);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FavConfigStorage", "get sync key from fav db fail, try to load from mmdb");
        gm0.j1.i();
        if (((java.lang.Boolean) gm0.j1.u().c().l(8224, java.lang.Boolean.FALSE)).booleanValue()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavConfigStorage", "get sync from mmdb fail, has trans");
            return new byte[0];
        }
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(8216, "");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = str != null ? str : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.FavConfigStorage", "get sync key(%s) from mmdb, do update fav sync key", str2);
        byte[] h17 = com.tencent.mm.sdk.platformtools.t8.h(str2);
        q1(h17);
        com.tencent.mars.xlog.Log.w("MicroMsg.FavConfigStorage", "set fav sync key has trans");
        gm0.j1.i();
        gm0.j1.u().c().w(8224, java.lang.Boolean.TRUE);
        return h17;
    }

    @Override // o72.a4
    public void q1(byte[] bArr) {
        up5.q qVar = new up5.q();
        qVar.f430043a = 8216;
        qVar.f430044b = com.tencent.mm.sdk.platformtools.t8.l(bArr);
        try {
            this.f470551e.insertOrReplaceObject(qVar);
            java.lang.String num = java.lang.Integer.toString(qVar.f430043a);
            o72.k2 k2Var = new o72.k2();
            k2Var.field_configId = qVar.f430043a;
            k2Var.field_value = qVar.f430044b;
            doNotify(num, 2, k2Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavConfigStorage", "Operation failed: " + e17.getMessage());
        }
    }
}
