package lp;

/* loaded from: classes12.dex */
public class i implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f320230a = 0;

    static {
        q25.b.b(new lp.i(), "//fav");
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        if (com.tencent.mars.xlog.Log.getLogLevel() > 1) {
            return false;
        }
        if (strArr.length < 2) {
            return true;
        }
        java.lang.String str2 = strArr[1];
        str2.getClass();
        if (str2.equals("resendfavitem")) {
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var = favoriteOperationEvent.f54243g;
            z9Var.f8528a = 39;
            z9Var.f8544q = strArr[2];
            z9Var.f8545r = strArr[3];
            favoriteOperationEvent.b(android.os.Looper.getMainLooper());
        } else if (str2.equals("uploadfavitem")) {
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent2 = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var2 = favoriteOperationEvent2.f54243g;
            z9Var2.f8528a = 38;
            z9Var2.f8544q = strArr[2];
            favoriteOperationEvent2.b(android.os.Looper.getMainLooper());
        }
        return true;
    }
}
