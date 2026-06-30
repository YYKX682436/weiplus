package hb5;

/* loaded from: classes11.dex */
public class i extends com.tencent.mm.ui.contact.item.a {
    public static final java.util.Map G = new java.util.HashMap();
    public java.lang.String C;
    public long D;
    public final hb5.h E;
    public final hb5.g F;

    public i(int i17) {
        super(4, i17);
        this.D = -1L;
        this.E = new hb5.h(this);
        this.F = new hb5.g(this);
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public void a(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar) {
        this.f206818y = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, this.f206818y, i65.a.h(context, com.tencent.mm.R.dimen.f479897ia));
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public com.tencent.mm.ui.contact.item.c b() {
        return this.E;
    }
}
