package ec3;

/* loaded from: classes9.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.l f251030d;

    public h(ec3.l lVar) {
        this.f251030d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.appcompat.app.AppCompatActivity activity = this.f251030d.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.luckymoney.ui.jd) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.luckymoney.ui.jd.class)).O6(true);
    }
}
