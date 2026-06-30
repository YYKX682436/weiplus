package ea2;

/* loaded from: classes2.dex */
public final class d extends x92.e {
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public float E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.B = jz5.h.b(new ea2.c(activity));
        this.C = jz5.h.b(new ea2.b(activity));
        this.D = jz5.h.b(new ea2.a(this));
        this.E = -1.0f;
    }

    @Override // x92.e
    public void W6(com.google.android.material.appbar.AppBarLayout view, float f17) {
        kotlin.jvm.internal.o.g(view, "view");
        super.W6(view, f17);
        float abs = java.lang.Math.abs(f17) / ((java.lang.Number) ((jz5.n) this.B).getValue()).intValue();
        if (abs > 1.0f) {
            abs = 1.0f;
        }
        if (abs < 0.0f) {
            abs = 0.0f;
        }
        if (this.E == abs) {
            return;
        }
        this.E = abs;
        ((android.view.View) ((jz5.n) this.D).getValue()).setTranslationY((1.0f - abs) * ((java.lang.Number) ((jz5.n) this.C).getValue()).intValue());
    }

    @Override // x92.e
    public v92.g X6() {
        return new da2.i((r45.r03) this.f452719d, getActivity());
    }

    @Override // x92.e
    public java.lang.String Y6() {
        return "";
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        jz5.g gVar = this.D;
        android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicActionBarUIC", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicActionBarUIC", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.view.View) ((jz5.n) gVar).getValue()).setTranslationY(((java.lang.Number) ((jz5.n) this.C).getValue()).intValue());
    }
}
