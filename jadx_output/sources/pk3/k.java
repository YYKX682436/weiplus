package pk3;

/* loaded from: classes8.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk3.l f356455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f356456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qn5.a f356457f;

    public k(pk3.l lVar, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, qn5.a aVar) {
        this.f356455d = lVar;
        this.f356456e = multiTaskInfo;
        this.f356457f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f356455d.l(this.f356456e, this.f356457f);
    }
}
