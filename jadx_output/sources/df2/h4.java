package df2;

/* loaded from: classes3.dex */
public final class h4 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.l4 f230281d;

    public h4(df2.l4 l4Var) {
        this.f230281d = l4Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        df2.l4 l4Var = this.f230281d;
        l4Var.getClass();
        pm0.v.X(new df2.e4(l4Var));
        return true;
    }
}
