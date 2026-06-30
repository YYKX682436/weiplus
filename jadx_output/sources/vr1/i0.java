package vr1;

/* loaded from: classes3.dex */
public final class i0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI f439571d;

    public i0(com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI bizPCRecentReadUI) {
        this.f439571d = bizPCRecentReadUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.add(0, 0, 1, this.f439571d.getString(com.tencent.mm.R.string.alw));
    }
}
