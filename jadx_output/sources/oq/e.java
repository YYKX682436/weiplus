package oq;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final oq.b f347302a = new oq.b();

    public final void a(f21.g eggList) {
        kotlin.jvm.internal.o.g(eggList, "eggList");
        oq.b bVar = this.f347302a;
        bVar.f193217b.clear();
        java.util.LinkedList eggList2 = eggList.f258898d;
        kotlin.jvm.internal.o.f(eggList2, "eggList");
        int i17 = 0;
        for (java.lang.Object obj : eggList2) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            f21.e eVar = (f21.e) obj;
            java.util.LinkedList<f21.f> keyWords = eVar.f258871d;
            kotlin.jvm.internal.o.f(keyWords, "keyWords");
            for (f21.f fVar : keyWords) {
                java.lang.String str = fVar.f258891d;
                if (!(str == null || str.length() == 0)) {
                    oq.a aVar = new oq.a(eVar, i17, fVar);
                    bVar.getClass();
                    bVar.b(aVar, 0, new com.tencent.mm.smiley.a(bVar));
                }
            }
            i17 = i18;
        }
    }
}
