package oa2;

/* loaded from: classes.dex */
public final class k implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oa2.w f343822d;

    public k(oa2.w wVar) {
        this.f343822d = wVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            oa2.w wVar = this.f343822d;
            g4Var.d(10001, wVar.getResources().getColor(com.tencent.mm.R.color.f478532ac), wVar.getResources().getString(com.tencent.mm.R.string.f491290cn4));
        }
    }
}
