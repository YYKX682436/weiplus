package is;

/* loaded from: classes11.dex */
public class o extends am5.a {
    public o(is.p pVar) {
    }

    @Override // am5.a
    public boolean a() {
        java.lang.String j17 = gm0.j1.b().j();
        if (android.text.TextUtils.isEmpty(j17)) {
            return false;
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.L().getString("heavy_user_game_" + j17, "");
        return !android.text.TextUtils.isEmpty(string) && java.lang.Integer.valueOf(string.split(":")[0]).intValue() >= 3;
    }
}
