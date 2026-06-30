package vh0;

/* loaded from: classes3.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f436992d;

    public w1(android.view.View view) {
        this.f436992d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion.expand$default(com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.INSTANCE, this.f436992d, 100, 50, 50, 100, false, 32, null);
    }
}
