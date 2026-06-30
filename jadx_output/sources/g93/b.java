package g93;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g93.j f269772d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g93.j jVar) {
        super(0);
        this.f269772d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(com.tencent.mm.ui.contact.i5.b());
        g93.j jVar = this.f269772d;
        java.lang.String stringExtra = jVar.getIntent().getStringExtra("Select_block_List");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            hashSet.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra != null ? (java.lang.String[]) new r26.t(",").g(stringExtra, 0).toArray(new java.lang.String[0]) : null));
        }
        if (com.tencent.mm.ui.contact.i5.d(((java.lang.Number) ((jz5.n) jVar.f269784g).getValue()).intValue(), 2)) {
            java.util.HashSet i17 = c01.e2.i();
            i17.remove("filehelper");
            hashSet.addAll(i17);
        }
        return hashSet;
    }
}
