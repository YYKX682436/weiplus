package nz4;

/* loaded from: classes12.dex */
public abstract class z {
    public static nz4.g a(android.view.View view) {
        if (view == null) {
            return null;
        }
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText = (com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText) view.findViewById(com.tencent.mm.R.id.m8b);
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText2 = (com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText) view.findViewById(com.tencent.mm.R.id.azt);
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText3 = (com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText) view.findViewById(com.tencent.mm.R.id.azq);
        if (wXRTEditText != null) {
            return new nz4.g(wXRTEditText);
        }
        if (wXRTEditText2 == null || wXRTEditText3 == null) {
            return null;
        }
        return new nz4.g(wXRTEditText2, wXRTEditText3);
    }

    public static android.view.View b(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        if (recyclerView == null) {
            return null;
        }
        try {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                return ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).findViewByPosition(i17);
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
