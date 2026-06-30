package i53;

/* loaded from: classes8.dex */
public class o implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.type.IPCString f288681b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.t f288682c;

    public o(i53.t tVar, int i17, com.tencent.mm.ipcinvoker.type.IPCString iPCString) {
        this.f288682c = tVar;
        this.f288680a = i17;
        this.f288681b = iPCString;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameHaowanDataCenter", "checkNewVideo errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 0 && i18 == 0) {
            p33.h hVar = (p33.h) oVar.f70711b.f70700a;
            java.lang.String str2 = hVar.f351584i;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.contains("[count]")) {
                int i19 = this.f288680a + hVar.f351583h;
                if (i19 > 0) {
                    this.f288681b.f68406d = str2.replace("[count]", java.lang.String.valueOf(i19));
                }
            } else {
                this.f288681b.f68406d = str2;
            }
        }
        synchronized (this.f288682c.f288716a) {
            this.f288682c.f288716a.notifyAll();
        }
    }
}
