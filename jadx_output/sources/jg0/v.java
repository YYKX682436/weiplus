package jg0;

/* loaded from: classes12.dex */
public final class v implements com.tencent.mm.modelcdntran.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299632a;

    public v(jg0.x xVar) {
        this.f299632a = xVar;
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void b(com.tencent.mm.modelcdntran.n1 n1Var) {
        if (n1Var != null) {
            if (n1Var.f71103a == com.tencent.mm.modelcdntran.m1.f71080i) {
                jg0.x xVar = this.f299632a;
                java.lang.Integer e17 = qi3.c.e(xVar, false, 1, null);
                if (e17 != null) {
                    e17.intValue();
                    sx.b0 b0Var = (sx.b0) i95.n0.c(sx.b0.class);
                    dn.m mVar = n1Var.f71106d;
                    java.lang.String str = mVar != null ? mVar.field_mediaId : null;
                    if (str == null) {
                        str = "";
                    }
                    ((rx.f) b0Var).Bi(str);
                    e17.intValue();
                    return;
                }
                if (xVar.f363677f == qi3.g0.f363709h) {
                    dn.g gVar = n1Var.f71107e;
                    float f17 = gVar != null ? (float) gVar.field_finishedLength : 0.0f;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUploadVoiceProgress fileName:");
                    sb6.append(xVar.f299638i.f41049b);
                    sb6.append(" finishLength: ");
                    sb6.append(f17);
                    sb6.append(" totalLength: ");
                    dn.g gVar2 = n1Var.f71107e;
                    sb6.append(gVar2 != null ? java.lang.Long.valueOf(gVar2.field_toltalLength) : null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsg.VoiceMsgSendTask", sb6.toString());
                }
            }
        }
    }
}
