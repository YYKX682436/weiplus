package gr;

/* loaded from: classes12.dex */
public final class x implements qr.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gr.y f274699a;

    public x(gr.y yVar) {
        this.f274699a = yVar;
    }

    @Override // qr.i
    public final void onResult(int i17, java.lang.String str) {
        gr.y yVar = this.f274699a;
        if (i17 == 0) {
            yVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUploadLogic", "deal success " + str);
            s25.a aVar = yVar.f274702c;
            if (str != null && !kotlin.jvm.internal.o.b(str, yVar.f274700a.getMd5())) {
                com.tencent.mm.storage.emotion.EmojiInfo N = ((y12.h) aVar).N(str);
                kotlin.jvm.internal.o.f(N, "getEmojiByMd5(...)");
                yVar.f274700a = N;
            }
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = yVar.f274700a;
            ((y12.h) aVar).getClass();
            wq.a.f().d(emojiInfo, false);
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().i(yVar.f274700a);
            gr.w wVar = yVar.f274701b;
            if (wVar != null) {
                ((qr.f) wVar).a(0, str, yVar.f274700a.field_activityid);
                return;
            }
            return;
        }
        if (i17 != 2 && i17 != 11) {
            switch (i17) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = yVar.f274700a;
                    int i18 = emojiInfo2.field_captureUploadCounter;
                    if (i18 >= 5) {
                        i17 = 9;
                        break;
                    } else {
                        emojiInfo2.field_captureUploadCounter = i18 + 1;
                        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).m(yVar.f274700a);
                        if (i17 != 1) {
                            i17 = 0;
                            break;
                        } else {
                            i17 = 1;
                            break;
                        }
                    }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.EmojiUploadLogic", "deal fail " + str + ", errType:" + i17);
        gr.w wVar2 = yVar.f274701b;
        if (wVar2 != null) {
            ((qr.f) wVar2).a(i17, null, null);
        }
    }
}
