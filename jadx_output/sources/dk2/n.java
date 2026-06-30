package dk2;

/* loaded from: classes3.dex */
public final class n {
    public n(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.util.ArrayList list, java.lang.String tag, boolean z17) {
        java.lang.String sb6;
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(tag, "tag");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(tag.concat(":"));
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            dk2.vg vgVar = (dk2.vg) obj;
            sb7.append("[第" + i17 + "首:");
            if (z17) {
                sb6 = dk2.q.e(vgVar.f234254a) + ", " + vgVar.f234255b + ']';
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(vgVar);
                sb8.append(']');
                sb6 = sb8.toString();
            }
            sb7.append(sb6);
            i17 = i18;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", sb7.toString());
    }
}
