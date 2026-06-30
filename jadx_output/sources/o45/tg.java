package o45;

/* loaded from: classes12.dex */
public class tg extends o45.vg {
    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        r45.xb xbVar;
        try {
            r45.sr6 sr6Var = (r45.sr6) this.f343015a.parseFrom(bArr);
            this.f343015a = sr6Var;
            o45.bh.b(this, sr6Var.getBaseResponse());
            this.f343021g = 0;
            if (this.f343015a.getBaseResponse().f376959d == 0 && ((xbVar = this.f343015a.f385952e) == null || xbVar.f389921d == 0 || com.tencent.mm.sdk.platformtools.t8.M0(x51.j1.d(xbVar.f389923f)))) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMAuth", "retcode 0 but invalid auth sect resp or invalid uin or invalid session");
                this.f343015a.getBaseResponse().f376959d = -1;
            }
            java.lang.String errMsg = getErrMsg();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAuth", "summerauthkick manual errmsg[%s]", errMsg);
            gm0.m.f273235x = errMsg;
            return this.f343015a.getBaseResponse().f376959d;
        } catch (java.io.IOException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAuth", "toProtoBuf :%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            this.f343015a.getBaseResponse().f376959d = -1;
            return -1;
        }
    }
}
