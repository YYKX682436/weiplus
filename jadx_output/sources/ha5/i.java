package ha5;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final ha5.i f280007a = new ha5.i();

    public final java.lang.String a() {
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("AFFUDRPath"), true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UDRPath", "udrAffRoot path is null");
            return null;
        }
        return i17 + "/resource";
    }
}
