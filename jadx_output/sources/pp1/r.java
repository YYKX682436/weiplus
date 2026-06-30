package pp1;

/* loaded from: classes14.dex */
public final class r implements rp1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pp1.z f357437a;

    public r(pp1.z zVar) {
        this.f357437a = zVar;
    }

    public void a(float f17, float f18, boolean z17, boolean z18) {
        boolean z19 = pp1.z.B;
        boolean z27 = pp1.z.B;
        pp1.z zVar = this.f357437a;
        zVar.getClass();
        if (pp1.z.B) {
            if (z18) {
                int i17 = (int) f17;
                pp1.a0.b(this.f357437a, true, i17, null, null, true, false, false, 96, null);
                zVar.A = i17 - zVar.f357449g;
            } else if (z17) {
                int i18 = (int) f17;
                pp1.a0.a(this.f357437a, false, i18, null, null, true, false, false, 96, null);
                zVar.A = i18 - zVar.f357449g;
            }
            com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = zVar.f357448f;
            if (contentFloatBallView != null) {
                if (z18) {
                    zVar.f357450h = ((float) (-zVar.A)) >= ((float) contentFloatBallView.getMeasuredWidth()) * 0.3f;
                } else if (z17) {
                    zVar.f357450h = ((float) zVar.A) >= ((float) contentFloatBallView.getMeasuredWidth()) * 0.3f;
                }
                int i19 = zVar.A;
            }
        }
    }

    public void b(boolean z17, boolean z18) {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
        pp1.z zVar = this.f357437a;
        if (z18) {
            com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = zVar.f357446d;
            java.lang.Object layoutManager = contentFloatBallRecyclerView != null ? contentFloatBallRecyclerView.getLayoutManager() : null;
            linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            zVar.f357462w = linearLayoutManager.w();
            android.view.View findViewByPosition = linearLayoutManager.findViewByPosition(zVar.f357462w);
            if (findViewByPosition == null) {
                return;
            }
            findViewByPosition.getLeft();
            zVar.getClass();
            com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = zVar.f357448f;
            zVar.f357465z = contentFloatBallView != null ? contentFloatBallView.m(false) : 0;
        } else if (z17) {
            com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView2 = zVar.f357446d;
            java.lang.Object layoutManager2 = contentFloatBallRecyclerView2 != null ? contentFloatBallRecyclerView2.getLayoutManager() : null;
            linearLayoutManager = layoutManager2 instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager2 : null;
            if (linearLayoutManager == null) {
                return;
            }
            zVar.f357463x = linearLayoutManager.y();
            android.view.View findViewByPosition2 = linearLayoutManager.findViewByPosition(zVar.f357463x);
            if (findViewByPosition2 == null) {
                return;
            }
            findViewByPosition2.getRight();
            zVar.getClass();
            com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView2 = zVar.f357448f;
            zVar.f357464y = contentFloatBallView2 != null ? contentFloatBallView2.n(false) : 0;
        }
        zVar.h();
    }
}
