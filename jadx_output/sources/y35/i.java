package y35;

/* loaded from: classes11.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.my6 f459216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y35.d f459217e;

    public i(y35.d dVar, r45.my6 my6Var) {
        this.f459217e = dVar;
        this.f459216d = my6Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        y35.k kVar = this.f459217e.f459201i;
        if (kVar != null) {
            com.tencent.mm.plugin.profile.r0 r0Var = (com.tencent.mm.plugin.profile.r0) kVar;
            com.tencent.mm.plugin.profile.e0 e0Var = r0Var.f153597b;
            r45.my6 my6Var = this.f459216d;
            if (my6Var == null || !android.text.TextUtils.equals(e0Var.f153421e.d1(), my6Var.f380930d) || android.text.TextUtils.isEmpty(my6Var.f380934h)) {
                e0Var.d(e0Var.f153420d, e0Var.f153421e, e0Var.f153423g, false, "");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "dealAddContact with antispamTicket: %s, username: %s", my6Var.f380934h, my6Var.f380930d);
            com.tencent.mm.plugin.profile.e0 e0Var2 = r0Var.f153597b;
            e0Var2.d(e0Var2.f153420d, e0Var2.f153421e, r0Var.f153596a, false, my6Var.f380934h);
        }
    }
}
