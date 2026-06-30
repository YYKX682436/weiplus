package y43;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly43/i;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Landroid/os/Bundle;", "<init>", "()V", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class i implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (iPCString == null) {
            if (rVar != null) {
                rVar.a(null);
                return;
            }
            return;
        }
        java.lang.String str = iPCString.f68406d;
        y43.f fVar = (y43.f) i95.n0.c(y43.f.class);
        kotlin.jvm.internal.o.d(str);
        y43.e e17 = fVar.e(str);
        y43.m mVar = y43.m.f459355a;
        if (e17 == null) {
            y43.m.a(mVar, str);
            if (rVar != null) {
                rVar.a(null);
                return;
            }
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (java.lang.System.currentTimeMillis() - e17.field_updateTime > e17.field_refresh_duration) {
            y43.m.a(mVar, str);
        } else if (java.lang.System.currentTimeMillis() - e17.field_updateTime > e17.field_expire_duration) {
            ((y43.f) i95.n0.c(y43.f.class)).d(str);
        }
        if (!e17.field_hasLiteConf) {
            if (rVar != null) {
                rVar.a(null);
            }
        } else if (rVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appid", e17.field_appid);
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, e17.field_path);
            bundle.putString("wepkg_id", e17.field_wepkg_id);
            rVar.a(bundle);
        }
    }
}
