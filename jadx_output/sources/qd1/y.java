package qd1;

/* loaded from: classes.dex */
public final class y implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f361691d;

    public y(java.util.ArrayList arrayList) {
        this.f361691d = arrayList;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        java.util.ArrayList arrayList = this.f361691d;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            g4Var.getItem(i17).setTitle((java.lang.CharSequence) arrayList.get(i17));
        }
    }
}
