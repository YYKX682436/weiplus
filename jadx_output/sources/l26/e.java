package l26;

/* loaded from: classes14.dex */
public final class e extends kz5.c {

    /* renamed from: f, reason: collision with root package name */
    public int f315221f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l26.f f315222g;

    public e(l26.f fVar) {
        this.f315222g = fVar;
    }

    @Override // kz5.c
    public void b() {
        int i17;
        java.lang.Object[] objArr;
        do {
            i17 = this.f315221f + 1;
            this.f315221f = i17;
            objArr = this.f315222g.f315224d;
            if (i17 >= objArr.length) {
                break;
            }
        } while (objArr[i17] == null);
        if (i17 >= objArr.length) {
            this.f313962d = 2;
            return;
        }
        java.lang.Object obj = objArr[i17];
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
        this.f313963e = obj;
        this.f313962d = 1;
    }
}
