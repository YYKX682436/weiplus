package r53;

/* loaded from: classes8.dex */
public class i implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f392668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.GameMsgDownloadImgEvent f392669b;

    public i(float f17, com.tencent.mm.autogen.events.GameMsgDownloadImgEvent gameMsgDownloadImgEvent) {
        this.f392668a = f17;
        this.f392669b = gameMsgDownloadImgEvent;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        com.tencent.mm.autogen.events.GameMsgDownloadImgEvent gameMsgDownloadImgEvent = this.f392669b;
        am.ue ueVar = gameMsgDownloadImgEvent.f54367g;
        ueVar.f8078a = 2;
        ueVar.f8079b = str;
        gameMsgDownloadImgEvent.e();
        if (bVar == null) {
            return;
        }
        int i17 = bVar.f359532b;
        if (bVar.f359531a != 0 || bVar.f359534d == null) {
            if (i17 == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(858L, 14L, 1L, false);
            }
        } else if (i17 == 2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(858L, 13L, 1L, false);
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap = bVar.f359534d;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        float f17 = this.f392668a;
        if (f17 <= 0.0f) {
            return null;
        }
        android.graphics.Bitmap s07 = com.tencent.mm.sdk.platformtools.x.s0(bVar.f359534d, true, r1.getWidth() * f17);
        if (s07 != null) {
            return s07;
        }
        return null;
    }
}
