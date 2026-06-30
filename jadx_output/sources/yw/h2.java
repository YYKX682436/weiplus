package yw;

/* loaded from: classes3.dex */
public final class h2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f466345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f466346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f466347f;

    public h2(o25.y1 y1Var, com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f466345d = y1Var;
        this.f466346e = mMActivity;
        this.f466347f = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.MMActivity mMActivity = this.f466346e;
        kotlin.jvm.internal.o.d(mMActivity);
        kotlin.jvm.internal.o.d(g4Var);
        ((com.tencent.mm.pluginsdk.forward.m) this.f466345d).wi(mMActivity, g4Var, this.f466347f);
    }
}
