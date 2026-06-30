package ne1;

/* loaded from: classes7.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f336513d;

    public b(ne1.d dVar, java.lang.Runnable runnable) {
        this.f336513d = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f336513d.run();
    }
}
