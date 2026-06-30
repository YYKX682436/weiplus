package zo1;

/* loaded from: classes5.dex */
public final class l implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI f474679a;

    public l(com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI) {
        this.f474679a = backupRangeManagerUI;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    @Override // al5.c2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStatusChange(boolean r9) {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r2 = "rangeInfo"
            java.lang.String r3 = "timeSubMenu"
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI r4 = r8.f474679a
            r5 = 0
            if (r9 == 0) goto L44
            android.widget.LinearLayout r6 = r4.f92793o
            if (r6 == 0) goto L40
            int r6 = r6.getVisibility()
            if (r6 == 0) goto L44
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo r9 = r4.f92787f
            if (r9 == 0) goto L3c
            long r6 = r9.f92733g
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L2f
            if (r9 == 0) goto L2b
            java.util.Calendar r0 = com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI.f92784t
            long r0 = r0.getTimeInMillis()
            r9.f92733g = r0
            goto L2f
        L2b:
            kotlin.jvm.internal.o.o(r2)
            throw r5
        L2f:
            android.widget.LinearLayout r9 = r4.f92793o
            if (r9 == 0) goto L38
            r0 = 0
            r9.setVisibility(r0)
            goto L71
        L38:
            kotlin.jvm.internal.o.o(r3)
            throw r5
        L3c:
            kotlin.jvm.internal.o.o(r2)
            throw r5
        L40:
            kotlin.jvm.internal.o.o(r3)
            throw r5
        L44:
            if (r9 != 0) goto L71
            android.widget.LinearLayout r9 = r4.f92793o
            if (r9 == 0) goto L6d
            int r9 = r9.getVisibility()
            r6 = 8
            if (r9 == r6) goto L71
            boolean r9 = r4.f92797s
            if (r9 != 0) goto L61
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo r9 = r4.f92787f
            if (r9 == 0) goto L5d
            r9.f92733g = r0
            goto L61
        L5d:
            kotlin.jvm.internal.o.o(r2)
            throw r5
        L61:
            android.widget.LinearLayout r9 = r4.f92793o
            if (r9 == 0) goto L69
            r9.setVisibility(r6)
            goto L71
        L69:
            kotlin.jvm.internal.o.o(r3)
            throw r5
        L6d:
            kotlin.jvm.internal.o.o(r3)
            throw r5
        L71:
            android.widget.LinearLayout r9 = r4.f92793o
            if (r9 == 0) goto L81
            zo1.k r0 = new zo1.k
            r0.<init>(r4)
            r9.post(r0)
            r4.V6()
            return
        L81:
            kotlin.jvm.internal.o.o(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zo1.l.onStatusChange(boolean):void");
    }
}
