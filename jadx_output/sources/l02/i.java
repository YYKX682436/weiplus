package l02;

/* loaded from: classes8.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m02.q f314822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f314823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314824f;

    public i(l02.k kVar, m02.q qVar, com.tencent.mm.pointers.PBool pBool, java.lang.String str) {
        this.f314822d = qVar;
        this.f314823e = pBool;
        this.f314824f = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        m02.q qVar = this.f314822d;
        if (qVar != null) {
            qVar.a();
        }
        this.f314823e.value = true;
        o02.a.b(15, 1502, 1, 3, this.f314824f, "", "");
    }
}
