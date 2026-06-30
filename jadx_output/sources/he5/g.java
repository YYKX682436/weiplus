package he5;

/* loaded from: classes9.dex */
public class g implements java.util.Comparator {
    public g(he5.h hVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) obj;
        com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) obj2;
        if (f9Var.getCreateTime() > f9Var2.getCreateTime()) {
            return 1;
        }
        return f9Var.getCreateTime() < f9Var2.getCreateTime() ? -1 : 0;
    }
}
