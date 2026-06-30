package qk4;

/* loaded from: classes10.dex */
public final class f implements qk4.b {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f364443a;

    /* renamed from: b, reason: collision with root package name */
    public final int f364444b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f364445c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f364446d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f364447e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f364448f;

    public f(androidx.appcompat.app.AppCompatActivity activity, int i17, int i18) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f364443a = activity;
        this.f364444b = i17;
        this.f364445c = "TP.Recycler";
        this.f364446d = "MicroMsg.TP.MMVideoLayoutRecycler";
        this.f364447e = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f364448f = new java.util.concurrent.ConcurrentHashMap();
    }

    public qk4.a a() {
        java.lang.String str;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f364447e;
        com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout mMRecyclerVideoLayout = (com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout) kz5.n0.Y(concurrentLinkedDeque);
        if (mMRecyclerVideoLayout != null) {
            concurrentLinkedDeque.remove(mMRecyclerVideoLayout);
            str = "from idle queue";
        } else {
            mMRecyclerVideoLayout = new com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout(this.f364443a);
            str = "from create";
        }
        mMRecyclerVideoLayout.setId(this.f364444b);
        this.f364448f.put(mMRecyclerVideoLayout, java.lang.Long.valueOf(c01.id.c()));
        com.tencent.mars.xlog.Log.i(this.f364446d, "getOrCreateVideoLayout ".concat(str));
        return mMRecyclerVideoLayout;
    }
}
