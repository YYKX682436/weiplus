package db5;

/* loaded from: classes15.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.HorizontalListView f228523d;

    public u(com.tencent.mm.ui.base.HorizontalListView horizontalListView) {
        this.f228523d = horizontalListView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f228523d.requestLayout();
    }
}
