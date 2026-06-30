package px1;

/* loaded from: classes12.dex */
public abstract class u<V, C extends px1.h> {
    public abstract void a(com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText, java.lang.Object obj);

    public abstract int b();

    public abstract nx1.p c(com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText);

    public abstract java.util.ArrayList d(android.text.Spannable spannable, nx1.p pVar, px1.r rVar);

    public boolean e(int i17, int... iArr) {
        for (int i18 : iArr) {
            if ((i17 & i18) == i18) {
                return true;
            }
        }
        return false;
    }
}
