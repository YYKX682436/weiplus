package r35;

/* loaded from: classes11.dex */
public class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.o f369209d;

    public n(r35.o oVar) {
        this.f369209d = oVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AddContactDialog", "doAddContact fail, contact not biz");
        this.f369209d.b(-1);
    }
}
