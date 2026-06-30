package dt4;

/* loaded from: classes9.dex */
public class d extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f243233f = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.wallet_core.model.Bankcard.A3, "WalletBankcard")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f243234d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f243235e;

    public d(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.wallet_core.model.Bankcard.A3, "WalletBankcard", null);
        this.f243235e = new java.util.LinkedList();
        this.f243234d = k0Var;
    }

    public boolean D0(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            super.insert((com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next());
        }
        java.util.Iterator it6 = this.f243235e.iterator();
        if (!it6.hasNext()) {
            return true;
        }
        android.support.v4.media.f.a(it6.next());
        throw null;
    }

    @Override // l75.n0
    public boolean delete(l75.f0 f0Var, java.lang.String[] strArr) {
        if (!super.delete((com.tencent.mm.plugin.wallet_core.model.Bankcard) f0Var, strArr)) {
            return false;
        }
        java.util.Iterator it = this.f243235e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        android.support.v4.media.f.a(it.next());
        throw null;
    }

    @Override // l75.n0, l75.g0
    public boolean update(l75.f0 f0Var, java.lang.String[] strArr) {
        if (!super.update((com.tencent.mm.plugin.wallet_core.model.Bankcard) f0Var, strArr)) {
            return false;
        }
        java.util.Iterator it = this.f243235e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        android.support.v4.media.f.a(it.next());
        throw null;
    }

    public java.util.ArrayList y0() {
        l75.e0 e0Var = com.tencent.mm.plugin.wallet_core.model.Bankcard.A3;
        java.util.ArrayList arrayList = null;
        android.database.Cursor f17 = this.f243234d.f("select * from WalletBankcard where cardType <= 7 OR cardType & 128 != 0", null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            do {
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = new com.tencent.mm.plugin.wallet_core.model.Bankcard();
                bankcard.convertFrom(f17);
                arrayList2.add(bankcard);
            } while (f17.moveToNext());
            arrayList = arrayList2;
        }
        f17.close();
        return arrayList;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean insert(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        if (!super.insert(bankcard)) {
            return false;
        }
        java.util.Iterator it = this.f243235e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        android.support.v4.media.f.a(it.next());
        throw null;
    }
}
