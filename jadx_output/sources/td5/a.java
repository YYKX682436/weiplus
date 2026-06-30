package td5;

/* loaded from: classes5.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ td5.b f417759d;

    public a(td5.b bVar) {
        this.f417759d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        td5.b bVar = this.f417759d;
        bVar.f225786b.setType(10002);
        com.tencent.mm.modelsimple.d1.J(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b5s), "", bVar.f225786b, "");
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).bb(bVar.f225786b.getMsgId(), bVar.f225786b);
        com.tencent.mars.xlog.Log.i("MicroMsg.InvokeMessageNewXmlMsg", "checkExpired:%s", java.lang.Long.valueOf(bVar.f225786b.getMsgId()));
    }
}
