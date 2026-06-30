package l02;

/* loaded from: classes8.dex */
public class j implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m02.q f314825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f314826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314827f;

    public j(l02.k kVar, m02.q qVar, com.tencent.mm.pointers.PBool pBool, java.lang.String str) {
        this.f314825d = qVar;
        this.f314826e = pBool;
        this.f314827f = str;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        m02.q qVar = this.f314825d;
        if (qVar != null) {
            qVar.a();
        }
        if (this.f314826e.value) {
            return;
        }
        o02.a.b(15, 1502, 1, 2, this.f314827f, "", "");
    }
}
