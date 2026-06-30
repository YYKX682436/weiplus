package zw1;

/* loaded from: classes15.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f476851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f476852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.vf5 f476853f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.o90 f476854g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f476855h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476856i;

    public y0(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI, android.widget.LinearLayout linearLayout, boolean z17, r45.vf5 vf5Var, r45.o90 o90Var, int i17) {
        this.f476856i = collectMainUI;
        this.f476851d = linearLayout;
        this.f476852e = z17;
        this.f476853f = vf5Var;
        this.f476854g = o90Var;
        this.f476855h = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.u3.i(new zw1.x0(this), this.f476855h);
    }
}
