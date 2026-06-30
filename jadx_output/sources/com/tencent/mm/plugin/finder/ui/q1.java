package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class q1 implements com.tencent.mm.plugin.finder.storage.tj0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI f129715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f129716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.f2 f129717c;

    public q1(com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI finderBlockListSearchUI, int i17, androidx.recyclerview.widget.f2 f2Var) {
        this.f129715a = finderBlockListSearchUI;
        this.f129716b = i17;
        this.f129717c = f2Var;
    }

    @Override // com.tencent.mm.plugin.finder.storage.tj0
    public void a(boolean z17) {
        com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI finderBlockListSearchUI = this.f129715a;
        if (!z17) {
            db5.t7.makeText(finderBlockListSearchUI.getContext(), com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, 0).show();
            return;
        }
        java.util.ArrayList arrayList = finderBlockListSearchUI.f128524v;
        int i17 = this.f129716b;
        arrayList.remove(i17);
        androidx.recyclerview.widget.f2 f2Var = this.f129717c;
        f2Var.notifyItemRemoved(((in5.n0) f2Var).a0() + i17);
    }
}
