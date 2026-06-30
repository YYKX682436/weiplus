package vp;

/* loaded from: classes16.dex */
public final class v implements java.util.Comparator, java.io.Serializable {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int j17;
        wp.a aVar = (wp.a) obj;
        wp.a aVar2 = (wp.a) obj2;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = wp.a.C;
        if (aVar != aVar2) {
            if (aVar != null) {
                if (aVar2 != null) {
                    if (!aVar.equals(aVar2)) {
                        long j18 = aVar.f448335f - aVar2.f448335f;
                        if (j18 <= 0) {
                            if (j18 >= 0) {
                                int i17 = aVar.f448345p - aVar2.f448345p;
                                if (i17 <= 0) {
                                    if (i17 >= 0) {
                                        int i18 = aVar.f448355z - aVar2.f448355z;
                                        if (i18 <= 0) {
                                            if (i18 >= 0) {
                                                long j19 = aVar.f448332c - aVar2.f448332c;
                                                if (j19 <= 0) {
                                                    if (j19 >= 0 && (j17 = aVar.j() - aVar2.j()) <= 0) {
                                                        if (j17 >= 0) {
                                                            return j17;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }
}
