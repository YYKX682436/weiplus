package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes.dex */
public class q0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f191275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f191276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191277f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f191278g;

    public q0(android.content.Context context, boolean z17, java.lang.String str, com.tencent.mm.storage.z3 z3Var) {
        this.f191275d = context;
        this.f191276e = z17;
        this.f191277f = str;
        this.f191278g = z3Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        android.content.Context context = this.f191275d;
        g4Var.f(1, context.getString(com.tencent.mm.R.string.f490881b56));
        if (com.tencent.mm.pluginsdk.ui.span.u0.b() || com.tencent.mm.sdk.platformtools.t8.I0(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.content.Intent("android.intent.action.PICK", android.provider.ContactsContract.Contacts.CONTENT_URI), false, false)) {
            if (this.f191276e) {
                g4Var.f(2, context.getString(com.tencent.mm.R.string.b57));
            }
            java.lang.String str = this.f191277f;
            if ((com.tencent.mm.sdk.platformtools.t8.K0(str) || c01.z1.J(str) || com.tencent.mm.storage.z3.m4(str)) ? false : true) {
                java.lang.String g27 = this.f191278g.g2();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(g27) && !str.equals("filehelper")) {
                    g4Var.f(3, context.getString(com.tencent.mm.R.string.f490877b51, g27));
                }
            }
            g4Var.f(4, context.getString(com.tencent.mm.R.string.f490878b52));
            g4Var.f(5, context.getString(com.tencent.mm.R.string.f490876b50));
        }
    }
}
