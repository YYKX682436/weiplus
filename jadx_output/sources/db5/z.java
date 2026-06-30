package db5;

/* loaded from: classes15.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.HorizontalListViewV2 f228590d;

    public z(com.tencent.mm.ui.base.HorizontalListViewV2 horizontalListViewV2) {
        this.f228590d = horizontalListViewV2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f228590d.requestLayout();
    }
}
