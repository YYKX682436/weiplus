package db5;

/* loaded from: classes8.dex */
public class m0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f228438e;

    public m0(java.lang.String str, java.util.ArrayList arrayList) {
        this.f228437d = str;
        this.f228438e = arrayList;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.setHeaderTitle(this.f228437d);
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f228438e;
            if (i17 >= arrayList.size()) {
                return;
            }
            g4Var.f(i17, (java.lang.CharSequence) arrayList.get(i17));
            i17++;
        }
    }
}
