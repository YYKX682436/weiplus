package qb2;

/* loaded from: classes10.dex */
public final class h0 implements wn.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f361217a;

    /* renamed from: b, reason: collision with root package name */
    public final int f361218b;

    /* renamed from: c, reason: collision with root package name */
    public final int f361219c;

    public h0(java.lang.String finderDefaultUsername, int i17, int i18) {
        kotlin.jvm.internal.o.g(finderDefaultUsername, "finderDefaultUsername");
        this.f361217a = finderDefaultUsername;
        this.f361218b = i17;
        this.f361219c = i18;
    }

    @Override // wn.b
    public java.util.List a(int i17) {
        l75.n0 c17 = c();
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.FinderConversationStorage");
        return ((com.tencent.mm.plugin.finder.storage.t80) c17).P0(this.f361217a, i17, 60, kz5.n0.R0(d()), this.f361219c);
    }

    @Override // wn.b
    public java.util.List b() {
        l75.n0 c17 = c();
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.FinderConversationStorage");
        return ((com.tencent.mm.plugin.finder.storage.t80) c17).P0(this.f361217a, 0, 15, kz5.n0.R0(d()), this.f361219c);
    }

    @Override // wn.b
    public l75.n0 c() {
        return ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
    }

    public final java.util.ArrayList d() {
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        int i17 = this.f361218b;
        int i18 = this.f361219c;
        if (i18 == 2) {
            if (i17 == 1) {
                arrayList.add(2);
                l75.n0 c17 = c();
                kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.FinderConversationStorage");
                if (((com.tencent.mm.plugin.finder.storage.t80) c17).J0(i18, this.f361217a) > 0) {
                    arrayList.add(100);
                }
            } else if (i17 == 2) {
                arrayList.add(1);
            } else if (i17 == 3) {
                arrayList.add(3);
            }
        } else if (i17 == 1) {
            arrayList.add(2);
            arrayList.add(200);
        } else if (i17 != 3) {
            arrayList.add(1);
        } else {
            arrayList.add(3);
        }
        return arrayList;
    }
}
