package od5;

/* loaded from: classes5.dex */
public final class f implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ od5.g f344660d;

    public f(od5.g gVar) {
        this.f344660d = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnLayoutChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        /*
            r0 = this;
            int r9 = r9 - r7
            long r6 = (long) r9
            int r5 = r5 - r3
            long r2 = (long) r5
            r4 = 0
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L45
            od5.g r2 = r0.f344660d
            yb5.d r3 = r2.f344662f
            if (r3 == 0) goto L45
            r2.getClass()
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L1c
            goto L3d
        L1c:
            java.lang.Object r1 = r1.getTag()
            boolean r5 = r1 instanceof com.tencent.mm.ui.chatting.viewitems.g0
            if (r5 == 0) goto L27
            com.tencent.mm.ui.chatting.viewitems.g0 r1 = (com.tencent.mm.ui.chatting.viewitems.g0) r1
            goto L28
        L27:
            r1 = 0
        L28:
            if (r1 == 0) goto L3d
            int r1 = r1.getAdapterPosition()
            com.tencent.mm.ui.chatting.adapter.k r5 = r2.f344664h
            if (r5 == 0) goto L37
            int r5 = r5.getCount()
            goto L38
        L37:
            r5 = r3
        L38:
            int r5 = r5 - r4
            if (r5 != r1) goto L3d
            r1 = r4
            goto L3e
        L3d:
            r1 = r3
        L3e:
            if (r1 == 0) goto L45
            yb5.d r1 = r2.f344662f
            r1.M(r3, r4, r4)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: od5.f.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }
}
