package w73;

/* loaded from: classes11.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f443501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.hp.util.TinkerSyncResponse f443503f;

    public b(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse) {
        this.f443501d = context;
        this.f443502e = str;
        this.f443503f = tinkerSyncResponse;
    }

    @Override // java.lang.Runnable
    public void run() {
        w73.a.c(this.f443501d, this.f443502e, this.f443503f);
    }
}
