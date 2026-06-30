package sf2;

/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f407068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.e0 f407069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407070f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.u82 f407071g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i17, sf2.e0 e0Var, java.lang.String str, r45.u82 u82Var) {
        super(0);
        this.f407068d = i17;
        this.f407069e = e0Var;
        this.f407070f = str;
        this.f407071g = u82Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sf2.e0 e0Var = this.f407069e;
        int i17 = this.f407068d;
        if (i17 == -1001) {
            zl2.r4.f473950a.f3(e0Var.O6(), "(DEBUG)搜索失败" + i17);
        }
        java.lang.String str = e0Var.f407114p;
        java.lang.String str2 = this.f407070f;
        if (kotlin.jvm.internal.o.b(str2, str)) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorSearchMusicController", "Search for:" + str2 + " result accepted and shown");
            com.tencent.mm.plugin.finder.live.widget.i8 i8Var = e0Var.f407111m;
            if (i8Var != null) {
                i8Var.j0(false);
            }
            ((mm2.c1) e0Var.business(mm2.c1.class)).Z6().n(str2, this.f407071g);
            e0Var.b7();
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorSearchMusicController", "Search for:" + str2 + " has outdated. Drop search result and wait for " + e0Var.f407114p + "'s result back");
        }
        return jz5.f0.f302826a;
    }
}
