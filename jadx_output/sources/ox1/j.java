package ox1;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f349603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ox1.s f349604e;

    public j(ox1.s sVar, boolean z17) {
        this.f349604e = sVar;
        this.f349603d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ox1.s sVar = this.f349604e;
        androidx.recyclerview.widget.RecyclerView i17 = sVar.i();
        if (i17 == null) {
            return;
        }
        for (int i18 = 0; i18 < i17.getChildCount(); i18++) {
            android.view.View childAt = i17.getChildAt(i18);
            ox1.d a17 = ox1.t.a(childAt);
            if (a17 != null) {
                com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText = a17.f349592a;
                if (wXRTEditText == null) {
                    com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText2 = a17.f349593b;
                    if (wXRTEditText2 != null && a17.f349594c != null) {
                        sVar.D((android.widget.LinearLayout) childAt.findViewById(com.tencent.mm.R.id.kmx), (android.widget.LinearLayout) childAt.findViewById(com.tencent.mm.R.id.kn7), (android.widget.LinearLayout) childAt.findViewById(com.tencent.mm.R.id.f486216kn1), wXRTEditText2.getPosInDataList());
                    }
                } else if (this.f349603d) {
                    wXRTEditText.postInvalidate();
                }
            }
        }
    }
}
