package i9;

/* loaded from: classes15.dex */
public final class i extends o8.g implements java.lang.Comparable {

    /* renamed from: i, reason: collision with root package name */
    public long f289670i;

    public i() {
        super(1);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        i9.i iVar = (i9.i) obj;
        if (b(4) == iVar.b(4)) {
            long j17 = this.f343611g - iVar.f343611g;
            if (j17 == 0) {
                return 0;
            }
            if (j17 > 0) {
                return 1;
            }
        } else if (b(4)) {
            return 1;
        }
        return -1;
    }
}
