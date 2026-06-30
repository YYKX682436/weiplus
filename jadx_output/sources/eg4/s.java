package eg4;

/* loaded from: classes11.dex */
public final class s implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f252789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.p7 f252790e;

    public s(android.content.Context context, com.tencent.mm.storage.p7 p7Var) {
        this.f252789d = context;
        this.f252790e = p7Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        eg4.g1.b(this.f252789d, null, this.f252790e, false, false);
    }
}
