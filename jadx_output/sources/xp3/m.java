package xp3;

/* loaded from: classes5.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f455929d;

    public m(xp3.n nVar, android.content.Context context) {
        this.f455929d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f455929d;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.performance.elf.ElfCallUpReceiver.class);
        intent.setAction(com.tencent.mm.plugin.performance.elf.ElfCallUpReceiver.class.getName());
        context.sendBroadcast(intent);
    }
}
