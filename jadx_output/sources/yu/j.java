package yu;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.aw2 f465764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.aw2 f465765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f465766f;

    public j(r45.aw2 aw2Var, r45.aw2 aw2Var2, yz5.l lVar) {
        this.f465764d = aw2Var;
        this.f465765e = aw2Var2;
        this.f465766f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.aw2 aw2Var = this.f465765e;
        yz5.l lVar = this.f465766f;
        r45.aw2 aw2Var2 = this.f465764d;
        if (aw2Var2 != null) {
            aw2Var2.set(7, aw2Var.getString(7));
            lVar.invoke(aw2Var2);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecordOtherItemHelper", "onItemClick, new shareObject is null");
            lVar.invoke(aw2Var);
        }
    }
}
