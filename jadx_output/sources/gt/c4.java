package gt;

/* loaded from: classes4.dex */
public class c4 extends com.tencent.mm.sdk.event.n {
    public c4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (!gm0.j1.a()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonKVDataStorage", "sql:%s, updateRet : %b", "update AppBrandCommonKVData set value = '0' where key like '%_unreadCount'", java.lang.Boolean.valueOf(com.tencent.mm.plugin.appbrand.app.r9.Ui().f305788d.A("AppBrandCommonKVData", "update AppBrandCommonKVData set value = '0' where key like '%_unreadCount'")));
        return true;
    }
}
