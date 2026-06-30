package lz2;

/* loaded from: classes9.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lz2.i f322337d;

    public h(lz2.i iVar) {
        this.f322337d = iVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        lz2.i iVar = this.f322337d;
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdAuthUI", "do finish");
        iVar.f322346d.finish();
    }
}
