package u8;

/* loaded from: classes15.dex */
public final class a extends u8.c {
    public final long P0;
    public final java.util.List Q0;
    public final java.util.List R0;

    public a(int i17, long j17) {
        super(i17);
        this.P0 = j17;
        this.Q0 = new java.util.ArrayList();
        this.R0 = new java.util.ArrayList();
    }

    public u8.a b(int i17) {
        java.util.List list = this.R0;
        int size = ((java.util.ArrayList) list).size();
        for (int i18 = 0; i18 < size; i18++) {
            u8.a aVar = (u8.a) ((java.util.ArrayList) list).get(i18);
            if (aVar.f425240a == i17) {
                return aVar;
            }
        }
        return null;
    }

    public u8.b c(int i17) {
        java.util.List list = this.Q0;
        int size = ((java.util.ArrayList) list).size();
        for (int i18 = 0; i18 < size; i18++) {
            u8.b bVar = (u8.b) ((java.util.ArrayList) list).get(i18);
            if (bVar.f425240a == i17) {
                return bVar;
            }
        }
        return null;
    }

    @Override // u8.c
    public java.lang.String toString() {
        return u8.c.a(this.f425240a) + " leaves: " + java.util.Arrays.toString(((java.util.ArrayList) this.Q0).toArray()) + " containers: " + java.util.Arrays.toString(((java.util.ArrayList) this.R0).toArray());
    }
}
