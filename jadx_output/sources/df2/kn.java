package df2;

/* loaded from: classes10.dex */
public final class kn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ln f230589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f230590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f230591f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(df2.ln lnVar, android.view.View view, android.view.View view2) {
        super(0);
        this.f230589d = lnVar;
        this.f230590e = view;
        this.f230591f = view2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view;
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        df2.ln lnVar = this.f230589d;
        java.lang.String str = lnVar.f230676m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showVoteDescPage on beforePageAnimEnd!winnerContainner:");
        rf2.q qVar = lnVar.f230678o;
        java.lang.Integer num = null;
        sb6.append((qVar == null || (viewGroup2 = qVar.f394857h) == null) ? null : java.lang.Integer.valueOf(viewGroup2.getVisibility()));
        sb6.append(",participantContainner:");
        rf2.a aVar = lnVar.f230679p;
        sb6.append((aVar == null || (viewGroup = aVar.f394639g) == null) ? null : java.lang.Integer.valueOf(viewGroup.getVisibility()));
        sb6.append(",voteDescContainer:");
        rf2.f fVar = lnVar.f230680q;
        if (fVar != null && (view = fVar.f394717h) != null) {
            num = java.lang.Integer.valueOf(view.getVisibility());
        }
        sb6.append(num);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        rf2.q qVar2 = lnVar.f230678o;
        if (qVar2 != null) {
            qVar2.f(8);
        }
        rf2.a aVar2 = lnVar.f230679p;
        if (aVar2 != null) {
            aVar2.c(8);
        }
        this.f230590e.setTranslationX(0.0f);
        this.f230591f.setTranslationX(0.0f);
        return jz5.f0.f302826a;
    }
}
