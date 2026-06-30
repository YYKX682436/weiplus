package h31;

/* loaded from: classes9.dex */
public final class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h31.r f278418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f278419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f278420f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f278421g;

    public l(h31.r rVar, yz5.a aVar, android.content.Context context, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        this.f278418d = rVar;
        this.f278419e = aVar;
        this.f278420f = context;
        this.f278421g = subscribeMsgRequestResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        h31.r rVar = this.f278418d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = rVar.f278437k;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        this.f278419e.invoke();
        e31.k a17 = e31.n.f247087a.a("name_biz");
        if (a17 != null) {
            a17.e(this.f278420f, 3, rVar.f278429c, this.f278421g.f71783f);
        }
    }
}
