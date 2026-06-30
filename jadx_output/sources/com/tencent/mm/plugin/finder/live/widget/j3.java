package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView f118719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f118720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b4 f118721f;

    public j3(com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView easySimpleLivingCardView, com.tencent.mm.protocal.protobuf.FinderObject finderObject, com.tencent.mm.plugin.finder.live.widget.b4 b4Var) {
        this.f118719d = easySimpleLivingCardView;
        this.f118720e = finderObject;
        this.f118721f = b4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView.e(this.f118719d, this.f118720e, 0, 1.0f, 0, 8, null);
        com.tencent.mm.plugin.finder.live.widget.b4 b4Var = this.f118721f;
        b4Var.getClass();
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f118720e;
        com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView easySimpleLivingCardView = this.f118719d;
        easySimpleLivingCardView.post(new com.tencent.mm.plugin.finder.live.widget.q3(finderObject, easySimpleLivingCardView, b4Var));
    }
}
