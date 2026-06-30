package qq3;

/* loaded from: classes12.dex */
public final class k extends qq3.i {

    /* renamed from: h, reason: collision with root package name */
    public final dn.o f365964h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f365965i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(sq3.a msgDbItem) {
        super(msgDbItem);
        kotlin.jvm.internal.o.g(msgDbItem, "msgDbItem");
        this.f365964h = new dn.o();
        this.f365965i = "";
    }

    @Override // qq3.a
    public void a(int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f365964h.field_mediaId)) {
            return;
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        t21.o2.Di().g(this.f365965i, null);
        qq3.i.e(this, i17, 0, 2, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CVideoMsgTask", "c2c pre download video task cancel: msgSvrId:" + this.f365961f + ", msgId:" + this.f365960e.getMsgId());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x021d  */
    @Override // qq3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qq3.k.c():void");
    }
}
