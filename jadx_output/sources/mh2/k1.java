package mh2;

/* loaded from: classes10.dex */
public final class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.m1 f326396d;

    public k1(mh2.m1 m1Var) {
        this.f326396d = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f326396d.f326406d.setInitRadius(((android.widget.ImageView) r0.f326292b.findViewById(com.tencent.mm.R.id.a_4)).getWidth() / 2.0f);
    }
}
