package rf2;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.f f394688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394690f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rf2.f fVar, android.view.View view, android.view.View view2) {
        super(0);
        this.f394688d = fVar;
        this.f394689e = view;
        this.f394690f = view2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view;
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        rf2.f fVar = this.f394688d;
        java.lang.String str = fVar.f394715f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on vote_desc back on beforePageAnimEnd!winnerContainner:");
        df2.ln lnVar = fVar.f394714e;
        rf2.q qVar = lnVar.f230678o;
        java.lang.Integer num = null;
        sb6.append((qVar == null || (viewGroup2 = qVar.f394857h) == null) ? null : java.lang.Integer.valueOf(viewGroup2.getVisibility()));
        sb6.append(",participantContainner:");
        rf2.a aVar = lnVar.f230679p;
        sb6.append((aVar == null || (viewGroup = aVar.f394639g) == null) ? null : java.lang.Integer.valueOf(viewGroup.getVisibility()));
        sb6.append(",voteDescContainer:");
        rf2.f fVar2 = lnVar.f230680q;
        if (fVar2 != null && (view = fVar2.f394717h) != null) {
            num = java.lang.Integer.valueOf(view.getVisibility());
        }
        sb6.append(num);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        android.view.View view2 = this.f394689e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage$onClick$1$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage$onClick$1$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f394689e.setTranslationX(0.0f);
        this.f394690f.setTranslationX(0.0f);
        return jz5.f0.f302826a;
    }
}
