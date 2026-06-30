package yo3;

/* loaded from: classes4.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f464149d;

    public h(android.app.Activity activity) {
        this.f464149d = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f464149d.finish();
    }
}
