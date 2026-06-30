package qn2;

/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.z f365202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cz1 f365203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f365204f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(qn2.z zVar, r45.cz1 cz1Var, int i17) {
        super(0);
        this.f365202d = zVar;
        this.f365203e = cz1Var;
        this.f365204f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f365202d.f365223s = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playLotteringAnim done, id:");
        sb6.append(this.f365203e.getString(0));
        sb6.append(",status:");
        sb6.append(this.f365204f);
        sb6.append(",callback:");
        yz5.l lVar = this.f365202d.f365228x;
        sb6.append(lVar != null ? java.lang.Integer.valueOf(lVar.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryCardPlugin", sb6.toString());
        qn2.z zVar = this.f365202d;
        yz5.l lVar2 = zVar.f365228x;
        if (lVar2 != null) {
            lVar2.invoke(zVar.f365229y);
        }
        android.view.View view = this.f365202d.f365225u;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$playLotteringAnim$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$playLotteringAnim$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
