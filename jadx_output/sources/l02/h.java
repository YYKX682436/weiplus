package l02;

/* loaded from: classes8.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f314817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m02.q f314818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314819f;

    public h(l02.k kVar, com.tencent.mm.pointers.PBool pBool, m02.q qVar, java.lang.String str) {
        this.f314817d = pBool;
        this.f314818e = qVar;
        this.f314819f = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.pointers.PBool pBool = this.f314817d;
        pBool.value = true;
        m02.q qVar = this.f314818e;
        if (qVar != null) {
            qVar.a();
        }
        pBool.value = true;
        o02.a.b(15, 1502, 1, 23, this.f314819f, "", "");
    }
}
