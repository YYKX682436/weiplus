package ij4;

/* loaded from: classes10.dex */
public final class l implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final ij4.l f291736d = new ij4.l();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        mj4.h hVar = (mj4.h) obj;
        mj4.h hVar2 = (mj4.h) obj2;
        float f17 = hVar != null ? ((mj4.k) hVar).f327067b.field_contentScore : 0.0f;
        float f18 = hVar2 != null ? ((mj4.k) hVar2).f327067b.field_contentScore : 0.0f;
        int i17 = hVar != null ? ((mj4.k) hVar).f327067b.field_CreateTime : 0;
        int i18 = hVar2 != null ? ((mj4.k) hVar2).f327067b.field_CreateTime : 0;
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f21093a;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_text_state_square_sort_rule, true)) {
            return f17 == f18 ? kotlin.jvm.internal.o.i(i18, i17) : java.lang.Float.compare(f18, f17);
        }
        return kotlin.jvm.internal.o.i(i18, i17);
    }
}
