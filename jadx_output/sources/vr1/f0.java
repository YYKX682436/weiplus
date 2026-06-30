package vr1;

/* loaded from: classes3.dex */
public final class f0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI f439563d;

    public f0(com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI bizPCRecentReadUI) {
        this.f439563d = bizPCRecentReadUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI bizPCRecentReadUI = this.f439563d;
        g4Var.d(0, bizPCRecentReadUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), bizPCRecentReadUI.getString(com.tencent.mm.R.string.alz));
    }
}
