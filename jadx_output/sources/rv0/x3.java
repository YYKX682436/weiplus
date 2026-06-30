package rv0;

/* loaded from: classes5.dex */
public final class x3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f400326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f400327e;

    public x3(boolean z17, boolean z18) {
        this.f400326d = z17;
        this.f400327e = z18;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        ((db5.h4) g4Var.a(1, com.tencent.mm.R.string.lkt)).f228375s = !this.f400326d;
        ((db5.h4) g4Var.a(2, com.tencent.mm.R.string.lku)).f228375s = true ^ this.f400327e;
        g4Var.a(3, com.tencent.mm.R.string.lks);
    }
}
