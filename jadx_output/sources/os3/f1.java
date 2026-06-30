package os3;

/* loaded from: classes11.dex */
public class f1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348075f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ os3.j1 f348076g;

    public f1(os3.j1 j1Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f348076g = j1Var;
        this.f348073d = str;
        this.f348074e = str2;
        this.f348075f = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f348076g.b(this.f348073d, this.f348074e, this.f348075f);
    }
}
