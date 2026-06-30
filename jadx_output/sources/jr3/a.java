package jr3;

/* loaded from: classes4.dex */
public class a implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jr3.b f301394d;

    public a(jr3.b bVar) {
        this.f301394d = bVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
        jr3.b bVar = this.f301394d;
        e17.d(bVar.f301395d.f301396d);
        bVar.f301395d.f301397e = null;
    }
}
