package gk4;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f272630a;

    public t(java.util.List trackList) {
        kotlin.jvm.internal.o.g(trackList, "trackList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f272630a = arrayList;
        arrayList.addAll(trackList);
        if (arrayList.isEmpty()) {
            return;
        }
        long j17 = 0;
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            gk4.s sVar = (gk4.s) obj;
            long j18 = ((float) (sVar.f272626e - sVar.f272625d)) / sVar.f272627f;
            sVar.f272623b = j17;
            j17 += j18;
            sVar.f272624c = j17;
            i17 = i18;
        }
    }
}
