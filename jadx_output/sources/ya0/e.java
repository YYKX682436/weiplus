package ya0;

/* loaded from: classes.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent;
        am.r2 r2Var = checkResUpdateCacheFileEvent.f54053g;
        if (r2Var.f7759a != 96) {
            return false;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(r2Var.f7760b);
        am.r2 r2Var2 = checkResUpdateCacheFileEvent.f54053g;
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginNotification", " ringtone update coming. subtype: %d, file path: %s, file version: %d", valueOf, r2Var2.f7761c, java.lang.Integer.valueOf(r2Var2.f7762d));
        int i17 = r2Var2.f7760b;
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginNotification", "sub type can't be handled!, subtype:%d", java.lang.Integer.valueOf(i17));
            return false;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(r2Var2.f7761c);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginNotification", "file not exits :%s", r2Var2.f7761c);
            return false;
        }
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(r2Var2.f7761c);
        if (android.text.TextUtils.isEmpty(p17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginNotification", "current_file_md5 is empty");
            return false;
        }
        if (!p17.equals(r2Var2.f7764f)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginNotification", "md5 is diff, current md5:%s, original md5:%s", p17, r2Var2.f7764f);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginNotification", "md5 is same, current md5:%s, original md5:%s", p17, r2Var2.f7764f);
        mo3.g.Ai(r2Var2.f7761c);
        return true;
    }
}
