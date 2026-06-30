package gx0;

/* loaded from: classes5.dex */
public final class n3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f276744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f276745e;

    public n3(boolean z17, boolean z18) {
        this.f276744d = z17;
        this.f276745e = z18;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        ((db5.h4) g4Var.a(1, com.tencent.mm.R.string.mtt)).f228375s = !this.f276744d;
        ((db5.h4) g4Var.a(2, com.tencent.mm.R.string.mts)).f228375s = !this.f276745e;
    }
}
