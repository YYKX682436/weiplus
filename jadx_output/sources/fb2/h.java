package fb2;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f260845d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.util.List list) {
        super(1);
        this.f260845d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Long l17 = (java.lang.Long) obj;
        java.util.Iterator it = this.f260845d.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (l17 != null && ((r45.yw2) it.next()).getLong(3) == l17.longValue()) {
                break;
            }
            i17++;
        }
        return java.lang.Boolean.valueOf(i17 >= 0);
    }
}
