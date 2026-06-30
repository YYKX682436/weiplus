package tn5;

/* loaded from: classes15.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public float f420860d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f420861e;

    /* renamed from: f, reason: collision with root package name */
    public int f420862f;

    /* renamed from: g, reason: collision with root package name */
    public long f420863g;

    /* renamed from: h, reason: collision with root package name */
    public long f420864h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tn5.f f420865i;

    public c(tn5.f fVar, float f17, boolean z17) {
        this.f420865i = fVar;
        this.f420860d = f17;
        this.f420861e = z17;
        mn5.b bVar = fVar.f420870c;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("cValues");
            throw null;
        }
        this.f420862f = bVar.f330209b;
        this.f420864h = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // java.lang.Runnable
    public void run() {
        tn5.f fVar = this.f420865i;
        if (fVar.f420871d != this || fVar.f420869b.f420851b.f410172h) {
            return;
        }
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        long j17 = currentAnimationTimeMillis - this.f420864h;
        float pow = this.f420860d * ((float) java.lang.Math.pow(0.98f, ((float) (currentAnimationTimeMillis - this.f420863g)) / (1000.0f / 10)));
        this.f420860d = pow;
        float f17 = pow * ((((float) j17) * 1.0f) / 1000);
        if (java.lang.Math.abs(f17) <= 1.0f) {
            fVar.f420871d = null;
            return;
        }
        this.f420864h = currentAnimationTimeMillis;
        int i17 = this.f420862f + ((int) f17);
        this.f420862f = i17;
        mn5.b bVar = fVar.f420870c;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("cValues");
            throw null;
        }
        int i18 = bVar.f330209b * i17;
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = fVar.f420868a;
        if (i18 > 0) {
            wxRefreshLayout.s(i17, true);
            wxRefreshLayout.getF213750w().postDelayed(this, 10);
            return;
        }
        fVar.f420871d = null;
        wxRefreshLayout.s(0, true);
        on5.b contentView = wxRefreshLayout.getContentView();
        android.view.View view = contentView != null ? ((un5.b) contentView).f429497i : null;
        int i19 = (int) (-this.f420860d);
        boolean z17 = view instanceof android.widget.ScrollView;
        boolean z18 = this.f420861e;
        if (z17) {
            if (z18) {
                ((android.widget.ScrollView) view).smoothScrollBy(0, i19);
            } else {
                ((android.widget.ScrollView) view).fling(i19);
            }
        } else if (view instanceof android.widget.AbsListView) {
            ((android.widget.AbsListView) view).fling(i19);
        } else if (view instanceof android.webkit.WebView) {
            ((android.webkit.WebView) view).flingScroll(0, i19);
        } else if (view instanceof androidx.core.widget.NestedScrollView) {
            if (z18) {
                ((androidx.core.widget.NestedScrollView) view).s(0, i19, 250, false);
            } else {
                ((androidx.core.widget.NestedScrollView) view).d(i19);
            }
        } else if (view instanceof androidx.recyclerview.widget.RecyclerView) {
            if (z18) {
                ((androidx.recyclerview.widget.RecyclerView) view).smoothScrollBy(0, i19);
            } else {
                ((androidx.recyclerview.widget.RecyclerView) view).r0(0, i19);
            }
        }
        mn5.b bVar2 = fVar.f420870c;
        if (bVar2 == null) {
            kotlin.jvm.internal.o.o("cValues");
            throw null;
        }
        if (!bVar2.f330213f || f17 <= 0.0f) {
            return;
        }
        bVar2.f330213f = false;
    }
}
