package dt4;

/* loaded from: classes9.dex */
public class c extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f243230f = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.wallet_core.model.BankcardScene.f179588v3, "WalletBankcardScene")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f243231d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f243232e;

    public c(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.wallet_core.model.BankcardScene.f179588v3, "WalletBankcardScene", dm.zb.E1);
        this.f243232e = new java.util.LinkedList();
        this.f243231d = k0Var;
    }

    @Override // l75.n0
    public boolean delete(l75.f0 f0Var, java.lang.String[] strArr) {
        if (!super.delete((com.tencent.mm.plugin.wallet_core.model.BankcardScene) f0Var, strArr)) {
            return false;
        }
        java.util.Iterator it = this.f243232e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        android.support.v4.media.f.a(it.next());
        throw null;
    }

    @Override // l75.n0, l75.g0
    public boolean update(l75.f0 f0Var, java.lang.String[] strArr) {
        if (!super.update((com.tencent.mm.plugin.wallet_core.model.BankcardScene) f0Var, strArr)) {
            return false;
        }
        java.util.Iterator it = this.f243232e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        android.support.v4.media.f.a(it.next());
        throw null;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean insert(com.tencent.mm.plugin.wallet_core.model.BankcardScene bankcardScene) {
        if (!super.insert(bankcardScene)) {
            return false;
        }
        java.util.Iterator it = this.f243232e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        android.support.v4.media.f.a(it.next());
        throw null;
    }

    public boolean z0(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            super.insert((com.tencent.mm.plugin.wallet_core.model.BankcardScene) it.next());
        }
        java.util.Iterator it6 = this.f243232e.iterator();
        if (!it6.hasNext()) {
            return true;
        }
        android.support.v4.media.f.a(it6.next());
        throw null;
    }
}
