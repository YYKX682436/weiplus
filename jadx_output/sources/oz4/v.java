package oz4;

/* loaded from: classes12.dex */
public abstract class v<V, C extends oz4.h> {
    public abstract void a(com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText, java.lang.Object obj);

    public abstract int b();

    public abstract mz4.t c(com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText);

    public abstract java.util.ArrayList d(android.text.Spannable spannable, mz4.t tVar, oz4.u uVar);

    public boolean e(int i17, int... iArr) {
        for (int i18 : iArr) {
            if ((i17 & i18) == i18) {
                return true;
            }
        }
        return false;
    }
}
