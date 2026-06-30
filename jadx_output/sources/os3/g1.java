package os3;

/* loaded from: classes11.dex */
public class g1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ os3.j1 f348087f;

    public g1(os3.j1 j1Var, java.lang.String str, java.lang.String str2) {
        this.f348087f = j1Var;
        this.f348085d = str;
        this.f348086e = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        os3.j1.a(this.f348087f, this.f348085d, this.f348086e, "", "");
    }
}
