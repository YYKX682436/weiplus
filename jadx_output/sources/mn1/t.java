package mn1;

/* loaded from: classes12.dex */
public class t implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn1.e f329884d;

    public t(mn1.e eVar) {
        this.f329884d = eVar;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "getMsgCount";
    }

    @Override // java.lang.Runnable
    public void run() {
        long P1 = ((com.tencent.mm.storage.g9) tn1.f.f().e().g()).P1();
        mn1.e eVar = this.f329884d;
        eVar.f329840c = P1;
        mn1.d.i().e().f309619k = eVar.f329840c;
    }
}
