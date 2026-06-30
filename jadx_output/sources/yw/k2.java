package yw;

/* loaded from: classes9.dex */
public final class k2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f466380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f466381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz.BizShareInfo f466382f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f466383g;

    public k2(o25.y1 y1Var, yz5.l lVar, com.tencent.pigeon.biz.BizShareInfo bizShareInfo, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f466380d = y1Var;
        this.f466381e = lVar;
        this.f466382f = bizShareInfo;
        this.f466383g = mMActivity;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        yw.j2 j2Var = new yw.j2(this.f466381e, this.f466382f, this.f466383g);
        ((com.tencent.mm.pluginsdk.forward.m) this.f466380d).aj((db5.h4) menuItem, j2Var);
    }
}
