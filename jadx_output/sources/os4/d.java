package os4;

/* loaded from: classes8.dex */
public final class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f348270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f04 f348271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ms4.b f348272f;

    public d(android.content.Context context, r45.f04 f04Var, ms4.b bVar) {
        this.f348270d = context;
        this.f348271e = f04Var;
        this.f348272f = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        os4.h.a(this.f348270d, this.f348271e.f373909f, this.f348272f);
    }
}
