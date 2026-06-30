package u1;

/* loaded from: classes14.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final o0.i f423619a = new o0.i(new u1.w[16], 0);

    public final void a(u1.w wVar) {
        o0.i iVar;
        int i17;
        int i18 = 0;
        if (wVar.f423691o == u1.c0.Idle && !wVar.Y && !wVar.X && wVar.A && (iVar = wVar.U) != null && (i17 = iVar.f341852f) > 0) {
            java.lang.Object[] objArr = iVar.f341850d;
            int i19 = 0;
            do {
                jz5.l lVar = (jz5.l) objArr[i19];
                ((s1.f1) lVar.f302834e).l((s1.z) lVar.f302833d);
                i19++;
            } while (i19 < i17);
        }
        wVar.V = false;
        o0.i r17 = wVar.r();
        int i27 = r17.f341852f;
        if (i27 > 0) {
            java.lang.Object[] objArr2 = r17.f341850d;
            do {
                a((u1.w) objArr2[i18]);
                i18++;
            } while (i18 < i27);
        }
    }
}
