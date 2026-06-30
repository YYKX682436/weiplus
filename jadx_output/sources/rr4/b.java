package rr4;

/* loaded from: classes2.dex */
public class b extends com.tencent.mm.wallet_core.model.h1 {
    public b(long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.cw cwVar = new r45.cw();
        cwVar.f371857d = j17;
        cwVar.f371858e = str;
        cwVar.f371859f = str2;
        lVar.f70664a = cwVar;
        lVar.f70665b = new r45.dw();
        lVar.f70666c = "/cgi-bin/mmpay-bin/tenpay/getfreefeedetail";
        lVar.f70667d = 1236;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetFreeFeeDetail", "get free fee detail: %s, %s, %s", java.lang.Long.valueOf(j17), str, str2);
    }
}
