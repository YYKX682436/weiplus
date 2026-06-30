package y30;

@j95.b
/* loaded from: classes9.dex */
public class q extends i95.w implements z30.u {

    /* renamed from: d, reason: collision with root package name */
    public int f459142d = -1;

    public boolean wi() {
        if (this.f459142d == -1) {
            int i17 = j62.e.g().c(new com.tencent.mm.repairer.config.note.RepairerConfigNoteFlutter()) == 1 ? 1 : 0;
            this.f459142d = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.FavApiLogicService", "enableFlutterWeNote init =%d", java.lang.Integer.valueOf(i17));
        }
        return this.f459142d == 1;
    }
}
