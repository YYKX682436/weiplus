package mb;

/* loaded from: classes9.dex */
public class c extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mb.e f325279a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(mb.e eVar, android.os.Looper looper) {
        super(looper);
        this.f325279a = eVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17;
        int i18 = message.what;
        mb.e eVar = this.f325279a;
        if (i18 == 1) {
            mb.d dVar = eVar.f325283d;
            if (dVar != null) {
                ((nz2.l) dVar).b(1, eVar.f325284e, -1);
                return;
            }
            return;
        }
        if (i18 == 2) {
            mb.d dVar2 = eVar.f325283d;
            if (dVar2 != null) {
                ((nz2.l) dVar2).b(2, eVar.f325284e, -1);
                return;
            }
            return;
        }
        if (i18 == 3) {
            mb.d dVar3 = eVar.f325283d;
            if (dVar3 != null) {
                ((nz2.l) dVar3).b(3, eVar.f325284e, -1);
                return;
            }
            return;
        }
        if (i18 == 6) {
            mb.d dVar4 = eVar.f325283d;
            if (dVar4 != null) {
                ((nz2.l) dVar4).a(0, message.arg1, eVar.f325284e, -1);
            }
            removeMessages(8);
            return;
        }
        if (i18 == 7) {
            mb.d dVar5 = eVar.f325283d;
            if (dVar5 != null) {
                switch (message.arg1) {
                    case 2001:
                        i17 = 2002;
                        break;
                    case 2002:
                        i17 = 2003;
                        break;
                    case 2003:
                    case com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_END /* 2006 */:
                        i17 = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS;
                        break;
                    case 2004:
                        i17 = 2000;
                        break;
                    case com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS /* 2005 */:
                        i17 = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_END;
                        break;
                    default:
                        i17 = 2020;
                        break;
                }
                ((nz2.l) dVar5).a(i17, -1, eVar.f325284e, -1);
            }
            removeMessages(8);
            return;
        }
        if (i18 != 8) {
            return;
        }
        mb.d dVar6 = eVar.f325283d;
        if (dVar6 != null) {
            ((nz2.l) dVar6).a(2001, -1, eVar.f325284e, -1);
        }
        removeMessages(8);
        mb.c cVar = eVar.f325282c;
        if (cVar != null) {
            cVar.removeMessages(8);
        }
        try {
            ((mb.h) eVar.f325280a).d(eVar.f325281b);
        } catch (android.os.RemoteException unused) {
        }
    }
}
