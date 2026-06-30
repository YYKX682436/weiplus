package wb;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb.g f444337d;

    public f(wb.g gVar, byte b17) {
        this.f444337d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wb.i iVar;
        int i17;
        wb.g gVar = this.f444337d;
        if (gVar.f444338a.begin() != 0) {
            iVar = gVar.f444339b;
            i17 = -102;
        } else {
            com.qq.wx.voice.embed.recognizer.Grammar grammar = gVar.f444338a;
            byte[] bArr = gVar.f444340c;
            if (grammar.recognize(bArr, bArr.length) != 0) {
                iVar = gVar.f444339b;
                i17 = -103;
            } else {
                if (gVar.f444338a.end() == 0) {
                    wb.a aVar = new wb.a();
                    if (gVar.f444338a.getResult(aVar) != 0) {
                        gVar.f444339b.a(-105);
                    }
                    android.os.Handler handler = gVar.f444339b.f444346b;
                    handler.sendMessage(handler.obtainMessage(200, aVar));
                    return;
                }
                iVar = gVar.f444339b;
                i17 = -104;
            }
        }
        iVar.a(i17);
    }
}
