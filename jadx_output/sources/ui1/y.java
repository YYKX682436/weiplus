package ui1;

/* loaded from: classes7.dex */
public interface y {
    static /* synthetic */ void b(ui1.y yVar, int i17, java.util.ArrayList arrayList, int i18, boolean z17, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onMsg");
        }
        if ((i19 & 4) != 0) {
            i18 = 0;
        }
        if ((i19 & 8) != 0) {
            z17 = false;
        }
        yVar.a(i17, arrayList, i18, z17);
    }

    void a(int i17, java.util.ArrayList arrayList, int i18, boolean z17);
}
