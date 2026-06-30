package df2;

/* loaded from: classes3.dex */
public final class j implements q80.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.k f230439a;

    public j(df2.k kVar) {
        this.f230439a = kVar;
    }

    @Override // q80.s
    public void a(android.view.View view) {
        df2.k kVar = this.f230439a;
        com.tencent.mars.xlog.Log.i(kVar.f230522m, "start lite app succ");
        kVar.f230527r = true;
        kVar.getClass();
        com.tencent.mm.plugin.finder.live.util.y.d(kVar, kotlinx.coroutines.q1.f310570c, null, new df2.i(kVar, null), 2, null);
    }

    @Override // q80.s
    public void fail() {
        com.tencent.mars.xlog.Log.i(this.f230439a.f230522m, "start lite app failed");
    }
}
