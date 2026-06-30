package rn1;

/* loaded from: classes12.dex */
public class a0 implements kn1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.backuppcui.BackupPcUI f397612a;

    public a0(com.tencent.mm.plugin.backup.backuppcui.BackupPcUI backupPcUI) {
        this.f397612a = backupPcUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0490, code lost:
    
        if (r2 != 4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x054d, code lost:
    
        if (r2 != 4) goto L82;
     */
    @Override // kn1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r17) {
        /*
            Method dump skipped, instructions count: 2078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn1.a0.a(int):void");
    }

    public void b() {
        int i17 = qn1.c.i().j().f364961a;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcUI", "onBackupPcUpdateUICallback onBackupPcStart, commandMode[%d]", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            qn1.c.i().e().f309609a = 11;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            a(11);
            return;
        }
        if (i17 == 2) {
            qn1.c.i().e().f309609a = 21;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            a(21);
        } else if (i17 == 3) {
            qn1.c.i().e().f309609a = 12;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            a(12);
        } else {
            if (i17 != 4) {
                return;
            }
            qn1.c.i().e().f309609a = 22;
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            a(22);
        }
    }

    @Override // kn1.e
    public void c() {
    }

    public final void d(int i17) {
        com.tencent.mm.plugin.backup.backuppcui.BackupPcUI backupPcUI = this.f397612a;
        if (2 == i17 || 4 == i17) {
            backupPcUI.f92535m.setImageResource(com.tencent.mm.R.drawable.bwp);
        } else {
            backupPcUI.f92535m.setImageResource(com.tencent.mm.R.drawable.bwm);
        }
    }

    public final void e() {
        com.tencent.mm.plugin.backup.backuppcui.BackupPcUI backupPcUI = this.f397612a;
        backupPcUI.f92534i.setText(com.tencent.mm.R.string.a7g);
        backupPcUI.f92534i.setOnClickListener(new rn1.m(this));
    }

    public final void f() {
        com.tencent.mm.plugin.backup.backuppcui.BackupPcUI backupPcUI = this.f397612a;
        backupPcUI.f92534i.setText(com.tencent.mm.R.string.a7l);
        backupPcUI.f92534i.setOnClickListener(new rn1.n(this));
    }
}
