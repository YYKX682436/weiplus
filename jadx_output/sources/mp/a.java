package mp;

/* loaded from: classes11.dex */
public class a implements q25.a {
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        if (strArr.length <= 1) {
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.P(strArr[1], 0) > 0) {
            com.tencent.mm.plugin.hardcoder.a.f142254f = true;
        } else {
            com.tencent.mm.plugin.hardcoder.a.f142254f = false;
        }
        return true;
    }
}
