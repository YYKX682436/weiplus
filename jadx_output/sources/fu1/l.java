package fu1;

/* loaded from: classes4.dex */
public class l extends dm.ha {

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f266859v = dm.ha.initAutoDBInfo(fu1.l.class);

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof fu1.l) && this.field_card_id == ((fu1.l) obj).field_card_id;
    }

    @Override // dm.ha, l75.f0
    public l75.e0 getDBInfo() {
        return f266859v;
    }

    public int hashCode() {
        java.lang.String str = this.field_card_id;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
