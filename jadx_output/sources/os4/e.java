package os4;

/* loaded from: classes8.dex */
public final class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f348273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f04 f348274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ms4.b f348275f;

    public e(android.content.Context context, r45.f04 f04Var, ms4.b bVar) {
        this.f348273d = context;
        this.f348274e = f04Var;
        this.f348275f = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        os4.h.a(this.f348273d, this.f348274e.f373908e, this.f348275f);
    }
}
