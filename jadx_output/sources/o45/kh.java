package o45;

/* loaded from: classes12.dex */
public class kh implements o45.wg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o45.zg f342973a;

    public kh(o45.lh lhVar, o45.zg zgVar) {
        this.f342973a = zgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o45.wg
    public boolean a(com.tencent.mm.pointers.PByteArray pByteArray, int i17, byte[] bArr, byte[] bArr2, byte[] bArr3, int i18, boolean z17, int i19, int i27) {
        o45.zg zgVar = this.f342973a;
        o45.xg xgVar = (o45.xg) zgVar;
        long uin = zgVar.getUin();
        if (z65.c.a() && uin == 0) {
            uin = o45.wf.f343028f;
        }
        o45.pi rsaInfo = zgVar.getRsaInfo();
        if (i17 == 722) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMEncryptCheckResUpdate", "MMEncryptCheckResUpdate reqToBuf rsaReqData");
            r45.gk0 gk0Var = ((o45.lh) zgVar).f342975a;
            byte[][] e17 = com.tencent.mm.modelbase.r2.e(uin, gk0Var.f375309d, gk0Var.f375310e);
            if (e17 == null) {
                return false;
            }
            if (com.tencent.mm.protocal.MMProtocalJni.packHybrid(pByteArray, bArr2, zgVar.getDeviceID(), (int) uin, xgVar.getFuncId(), rsaInfo.f342999c, e17[0], e17[1], rsaInfo.f342997a.getBytes(), rsaInfo.f342998b.getBytes(), zgVar.getPassKey(), i19, ((o45.lh) zgVar).getRouteInfo(), 0)) {
                int length = pByteArray.value.length;
                return true;
            }
        } else if (i17 == 784) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMEncryptCheckResUpdate", "summerauths rsaInfo[%s] EcdhMgr.USE_ECDH[%s] engine[%s]", java.lang.Integer.valueOf(rsaInfo.f342999c), java.lang.Boolean.valueOf(o45.ag.f342892a), java.lang.Long.valueOf(((o45.xg) zgVar).getECDHEngine()));
            ((o45.xg) zgVar).getFuncId();
            com.tencent.mm.pointers.PByteArray pByteArray2 = new com.tencent.mm.pointers.PByteArray();
            byte[] protoBuf = ((o45.xg) zgVar).toProtoBuf();
            if (protoBuf == null) {
                com.tencent.mars.xlog.Log.f("MicroMsg.MMEncryptCheckResUpdate", "protobuf is null");
                return false;
            }
            long d17 = o45.ag.d(null);
            zgVar.setEcdhEngine(d17);
            boolean packHybridEcdh = com.tencent.mm.protocal.MMProtocalJni.packHybridEcdh(pByteArray2, bArr2, zgVar.getDeviceID(), (int) uin, xgVar.getFuncId(), o45.ag.a(), com.tencent.mm.jni.utils.UtilsJni.HybridEcdhEncrypt(d17, protoBuf), i19, xgVar.getRouteInfo(), 0, 12);
            o45.ag.a();
            int length2 = pByteArray2.value.length;
            return packHybridEcdh;
        }
        return false;
    }
}
