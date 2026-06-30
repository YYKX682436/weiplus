package pk2;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.f f355533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.View view, pk2.f fVar) {
        super(1);
        this.f355532d = view;
        this.f355533e = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.view.View findViewById = this.f355532d.findViewById(com.tencent.mm.R.id.f485494u92);
        if (findViewById != null) {
            int i17 = booleanValue ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption$addItem$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption$addItem$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        pk2.f fVar = this.f355533e;
        if (booleanValue) {
            df2.zb zbVar = (df2.zb) fVar.f364427a.e(df2.zb.class);
            if (zbVar != null) {
                zbVar.e7();
            }
        } else {
            df2.zb zbVar2 = (df2.zb) fVar.f364427a.e(df2.zb.class);
            if (zbVar2 != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                com.tencent.mm.plugin.finder.live.util.y.o(zbVar2, kotlinx.coroutines.internal.b0.f310484a, null, new df2.z9(zbVar2, null), 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
