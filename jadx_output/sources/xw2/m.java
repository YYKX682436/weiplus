package xw2;

/* loaded from: classes2.dex */
public final class m implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f457707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f457708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xw2.s f457709f;

    public m(android.widget.LinearLayout linearLayout, android.view.ViewGroup viewGroup, xw2.s sVar) {
        this.f457707d = linearLayout;
        this.f457708e = viewGroup;
        this.f457709f = sVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.widget.LinearLayout linearLayout = this.f457707d;
        int childCount = linearLayout.getChildCount();
        if (childCount < intValue) {
            int i17 = intValue - childCount;
            for (int i18 = 0; i18 < i17; i18++) {
                linearLayout.addView(android.view.LayoutInflater.from(this.f457708e.getContext()).inflate(this.f457709f.getItemResource(), (android.view.ViewGroup) linearLayout, false));
            }
        } else if (childCount > intValue) {
            int i19 = childCount - intValue;
            for (int i27 = 0; i27 < i19; i27++) {
                linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
            }
        }
        return jz5.f0.f302826a;
    }
}
