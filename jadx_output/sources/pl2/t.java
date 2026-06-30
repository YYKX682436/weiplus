package pl2;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f356661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pl2.w f356662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pl2.x f356663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f356664g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.util.HashSet hashSet, pl2.w wVar, pl2.x xVar, java.util.ArrayList arrayList) {
        super(0);
        this.f356661d = hashSet;
        this.f356662e = wVar;
        this.f356663f = xVar;
        this.f356664g = arrayList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet hashSet = this.f356661d;
        java.util.Iterator it = hashSet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            pl2.w wVar = this.f356662e;
            if (!hasNext) {
                wVar.f356679i.clear();
                wVar.f356679i.addAll(hashSet);
                return jz5.f0.f302826a;
            }
            int intValue = ((java.lang.Number) it.next()).intValue();
            if (!wVar.f356679i.contains(java.lang.Integer.valueOf(intValue))) {
                android.app.Activity context = this.f356663f.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356687m.d(intValue, (pl2.a) kz5.n0.a0(this.f356664g, intValue), 2);
            }
        }
    }
}
