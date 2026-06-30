package eg4;

/* loaded from: classes11.dex */
public class n1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.p7 f252765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eg4.t1 f252766e;

    public n1(eg4.t1 t1Var, com.tencent.mm.storage.p7 p7Var) {
        this.f252766e = t1Var;
        this.f252765d = p7Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        eg4.g1.b(this.f252766e.f252811o, null, this.f252765d, false, false);
    }
}
