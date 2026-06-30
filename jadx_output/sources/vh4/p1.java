package vh4;

/* loaded from: classes7.dex */
public final class p1 extends android.database.ContentObserver {
    public p1() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17, android.net.Uri uri) {
        java.lang.String str;
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.w9.f193053a;
        if (uri == null || (str = uri.getPath()) == null) {
            str = "";
        }
        com.tencent.mm.ipcinvoker.d0.d(str2, new com.tencent.mm.ipcinvoker.type.IPCString(str), vh4.x0.class, null);
    }
}
