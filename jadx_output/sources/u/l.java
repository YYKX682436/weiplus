package u;

/* loaded from: classes16.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {
    public final /* synthetic */ u.n C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u.n nVar) {
        super(0);
        this.C = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.C.getIntent().getIntExtra("visibility_tab_init_select_index", 0));
    }
}
