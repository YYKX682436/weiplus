package ij5;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.t f291769d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ij5.t tVar) {
        super(0);
        this.f291769d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(com.tencent.mm.ui.contact.i5.b());
        ij5.t tVar = this.f291769d;
        java.lang.String stringExtra = tVar.getIntent().getStringExtra("Select_block_List");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            hashSet.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra != null ? (java.lang.String[]) new r26.t(",").g(stringExtra, 0).toArray(new java.lang.String[0]) : null));
        }
        if (com.tencent.mm.ui.contact.i5.d(((java.lang.Number) ((jz5.n) tVar.f291803h).getValue()).intValue(), 2)) {
            java.util.HashSet i17 = c01.e2.i();
            i17.remove("filehelper");
            hashSet.addAll(i17);
        }
        return hashSet;
    }
}
