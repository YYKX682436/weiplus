package wo2;

/* loaded from: classes2.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo2.m0 f448079e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, wo2.m0 m0Var) {
        super(0);
        this.f448078d = str;
        this.f448079e = m0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wo2.q qVar;
        oa.i k17;
        java.lang.String str = this.f448078d;
        if (!android.text.TextUtils.isEmpty(str)) {
            com.google.android.material.tabs.TabLayout R6 = this.f448079e.R6();
            if (R6 == null || (k17 = R6.k(1)) == null) {
                qVar = null;
            } else {
                java.lang.Object obj = k17.f343778a;
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.NearbyActionBarUIC.NearbyTab");
                qVar = (wo2.q) obj;
            }
            android.widget.TextView textView = qVar != null ? qVar.f448117c : null;
            if (textView != null) {
                textView.setText(str);
            }
        }
        return jz5.f0.f302826a;
    }
}
