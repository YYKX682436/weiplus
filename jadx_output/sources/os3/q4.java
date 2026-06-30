package os3;

/* loaded from: classes8.dex */
public class q4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.s4 f348180d;

    public q4(os3.s4 s4Var) {
        this.f348180d = s4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = this.f348180d.f348198d.f348219d;
        java.lang.String str = com.tencent.mm.plugin.qqmail.ui.ReadMailUI.N;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(readMailUI.f154925d);
        sb6.append(";");
        java.lang.String str2 = readMailUI.f154926e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCString(sb6.toString()), js3.a.class, null);
        readMailUI.finish();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 22);
    }
}
