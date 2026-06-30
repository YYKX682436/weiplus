package t02;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt02/a;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-dupcheck_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class a implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String string;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null || (string = bundle.getString("talker")) == null) {
            return;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(bundle.getLong("msgId", 0L));
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.DupCheckFeatureService", "CleanServiceUpdateIncrementallyTask invoked with msgId = " + longValue + ", talker = " + string);
            ((yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class))).hj(longValue, string, true);
        }
    }
}
