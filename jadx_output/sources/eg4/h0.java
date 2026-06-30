package eg4;

/* loaded from: classes4.dex */
public final class h0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.i0 f252720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f252721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.ib f252722f;

    public h0(eg4.i0 i0Var, android.content.Context context, com.tencent.mm.storage.ib ibVar) {
        this.f252720d = i0Var;
        this.f252721e = context;
        this.f252722f = ibVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        eg4.i0.n(this.f252720d, this.f252721e, this.f252722f);
    }
}
