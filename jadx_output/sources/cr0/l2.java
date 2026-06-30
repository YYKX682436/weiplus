package cr0;

/* loaded from: classes12.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.j f221676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f221677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(cr0.j jVar, long j17) {
        super(1);
        this.f221676d = jVar;
        this.f221677e = j17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map it = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(it, "it");
        cr0.u1 u1Var = cr0.u1.f221760a;
        it.put("enable", java.lang.Integer.valueOf((int) (!u1Var.e() ? 0 : u1Var.g().f221757a)));
        cr0.j jVar = this.f221676d;
        it.put("uid-collect-min", java.lang.Long.valueOf(jVar.f221787d.f395552a.longValue() / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL));
        long j17 = 0;
        it.put("uid-collect-ratio", java.lang.Long.valueOf(this.f221677e > 0 ? a06.d.c((jVar.f221787d.f395552a.floatValue() * 100.0f) / ((float) r3)) : -1L));
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b;
        java.util.List b17 = jVar.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : b17) {
            java.lang.String str2 = ((cr0.r) obj2).f221725d;
            kotlin.jvm.internal.o.d(str);
            if (!r26.i0.A(str2, str, false, 2, null)) {
                arrayList.add(obj2);
            }
        }
        java.util.List F0 = kz5.n0.F0(arrayList, new cr0.k2());
        if (!F0.isEmpty()) {
            java.util.Iterator it6 = F0.iterator();
            while (it6.hasNext()) {
                java.lang.Number number = ((cr0.r) it6.next()).f221727f.f395552a;
                kotlin.jvm.internal.o.f(number, "get(...)");
                j17 += ((java.lang.Long) number).longValue();
            }
            it.put("sum", java.lang.Long.valueOf(j17));
        }
        return jz5.f0.f302826a;
    }
}
