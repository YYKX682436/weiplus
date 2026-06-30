package x51;

/* loaded from: classes5.dex */
public class h1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tm.a f452018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f452019f;

    public h1(android.content.Context context, tm.a aVar, int i17) {
        this.f452017d = context;
        this.f452018e = aVar;
        this.f452019f = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        c71.b.c(this.f452017d, this.f452018e.f420398a, this.f452019f, false);
    }
}
