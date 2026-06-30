package xp3;

/* loaded from: classes5.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f455923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.elf.ElfCheckResponse f455924e;

    public e(com.tencent.mm.plugin.performance.elf.ElfCheckResponse elfCheckResponse, android.content.Context context) {
        this.f455924e = elfCheckResponse;
        this.f455923d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.performance.elf.ElfCheckResponse elfCheckResponse = this.f455924e;
        com.tencent.mars.xlog.Log.i("MicroMsg.ElfCheckResponse", "call this response %s", elfCheckResponse.toString());
        android.content.Context context = this.f455923d;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.performance.elf.ElfCallUpReceiver.class);
        intent.setAction(com.tencent.mm.plugin.performance.elf.ElfCallUpReceiver.class.getName());
        android.os.Bundle bundle = elfCheckResponse.f152976o;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        context.sendBroadcast(intent);
    }
}
