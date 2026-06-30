package r53;

/* loaded from: classes8.dex */
public class h implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.GameMsgDownloadImgEvent f392667a;

    public h(com.tencent.mm.autogen.events.GameMsgDownloadImgEvent gameMsgDownloadImgEvent) {
        this.f392667a = gameMsgDownloadImgEvent;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... objArr) {
        com.tencent.mm.autogen.events.GameMsgDownloadImgEvent gameMsgDownloadImgEvent = this.f392667a;
        am.ue ueVar = gameMsgDownloadImgEvent.f54367g;
        ueVar.f8078a = 2;
        ueVar.f8079b = str;
        gameMsgDownloadImgEvent.e();
    }
}
