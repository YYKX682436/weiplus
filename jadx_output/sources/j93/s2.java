package j93;

/* loaded from: classes.dex */
public final class s2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.v2 f298497d;

    public s2(int i17, j93.v2 v2Var) {
        this.f298497d = v2Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        j93.v2 v2Var = this.f298497d;
        g4Var.d(1, v2Var.getContext().getResources().getColor(com.tencent.mm.R.color.f479483a32), v2Var.getContext().getString(com.tencent.mm.R.string.mbf));
    }
}
