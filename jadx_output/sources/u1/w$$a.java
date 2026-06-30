package u1;

/* loaded from: classes14.dex */
public final /* synthetic */ class w$$a implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        u1.w wVar = (u1.w) obj;
        u1.w wVar2 = (u1.w) obj2;
        float f17 = wVar.K;
        float f18 = wVar2.K;
        return (f17 > f18 ? 1 : (f17 == f18 ? 0 : -1)) == 0 ? kotlin.jvm.internal.o.i(wVar.B, wVar2.B) : java.lang.Float.compare(f17, f18);
    }
}
