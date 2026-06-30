package tn4;

/* loaded from: classes11.dex */
public class f extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tn4.o f420827a;

    public f(tn4.o oVar) {
        this.f420827a = oVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what == this.f420827a.f420838d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "do checkRealDoMMdiffUpdatePatchVersion");
            tn4.o oVar = this.f420827a;
            boolean z17 = message.arg1 == 1;
            boolean z18 = message.arg2 == 1;
            oVar.getClass();
            ((ku5.t0) ku5.t0.f312615d).g(new tn4.k(oVar, z18, z17));
        }
    }
}
