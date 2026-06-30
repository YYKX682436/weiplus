package gn4;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f273607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gn4.f f273608e;

    public e(gn4.f fVar, java.util.List list) {
        this.f273608e = fVar;
        this.f273607d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.z0 s47 = this.f273608e.f264492g.s4();
        int e17 = s47.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoAdapter", "callbackToSuccess originSize: %d insertSize %d", java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(this.f273607d.size()));
        java.util.List list = this.f273607d;
        synchronized (s47) {
            if (!com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                ((java.util.LinkedList) s47.b()).addAll(list);
            }
        }
        gn4.f fVar = this.f273608e;
        fVar.notifyItemChanged(e17 + fVar.z());
    }
}
