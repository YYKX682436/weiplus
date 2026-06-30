package he5;

/* loaded from: classes.dex */
public final /* synthetic */ class n$$a implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) obj;
        com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) obj2;
        return (int) ((f9Var != null ? f9Var.getCreateTime() : 0L) - (f9Var2 != null ? f9Var2.getCreateTime() : 0L));
    }
}
