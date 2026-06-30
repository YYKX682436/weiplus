package os4;

/* loaded from: classes8.dex */
public final class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f348267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f04 f348268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ms4.b f348269f;

    public c(android.content.Context context, r45.f04 f04Var, ms4.b bVar) {
        this.f348267d = context;
        this.f348268e = f04Var;
        this.f348269f = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        os4.h.a(this.f348267d, this.f348268e.f373908e, this.f348269f);
    }
}
