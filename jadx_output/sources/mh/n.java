package mh;

/* loaded from: classes12.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.battery.accumulate.persist.FlattParcelable f326273d;

    public n(com.tencent.matrix.battery.accumulate.persist.FlattParcelable flattParcelable) {
        this.f326273d = flattParcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.matrix.battery.accumulate.persist.FlattParcelable flattParcelable = this.f326273d;
        flattParcelable.lock(new mh.m(flattParcelable));
    }
}
