package nf;

/* loaded from: classes.dex */
public class u implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f336611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f336613f;

    public u(android.app.Activity activity, java.lang.String str, int i17) {
        this.f336611d = activity;
        this.f336612e = str;
        this.f336613f = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        z2.h.a(this.f336611d, new java.lang.String[]{this.f336612e}, this.f336613f);
    }
}
