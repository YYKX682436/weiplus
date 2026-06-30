package tn4;

/* loaded from: classes11.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.hp.util.TinkerSyncResponse f420828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tn4.o f420829e;

    public g(tn4.o oVar, com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse) {
        this.f420829e = oVar;
        this.f420828d = tinkerSyncResponse;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f420829e.wj(this.f420828d);
    }
}
