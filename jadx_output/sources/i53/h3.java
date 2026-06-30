package i53;

/* loaded from: classes12.dex */
public class h3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i53.m3 f288592e;

    public h3(i53.m3 m3Var, java.lang.String str) {
        this.f288592e = m3Var;
        this.f288591d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f288592e.b(this.f288591d);
    }
}
