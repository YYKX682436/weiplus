package ih1;

/* loaded from: classes7.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ih1.u f291501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291504g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f291505h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ih1.m mVar, ih1.u uVar, java.lang.String str, java.lang.String str2, java.lang.String str3, yz5.l lVar) {
        super(1);
        this.f291501d = uVar;
        this.f291502e = str;
        this.f291503f = str2;
        this.f291504g = str3;
        this.f291505h = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        ih1.u uVar = this.f291501d;
        if (view != null) {
            com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "appId[" + uVar.f291530a + "], bindFrameSetView ok, frameSetName: " + this.f291502e + ", frameSetRootPath: " + this.f291503f + ", frameSetData.len: " + this.f291504g.length());
            this.f291505h.invoke(view);
        } else {
            com.tencent.mars.xlog.Log.e("MagicAdMiniProgramInstaller", "appId[" + uVar.f291530a + "], in starterBiz case, onRequestInsertCoverView, frameSetView is null");
        }
        return jz5.f0.f302826a;
    }
}
