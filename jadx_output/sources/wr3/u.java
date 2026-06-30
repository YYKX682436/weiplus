package wr3;

/* loaded from: classes11.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr3.v f448895d;

    public u(wr3.v vVar) {
        this.f448895d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f448895d.notifyDataSetChanged();
    }
}
