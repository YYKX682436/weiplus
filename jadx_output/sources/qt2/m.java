package qt2;

/* loaded from: classes2.dex */
public final class m extends qt2.j {

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Runnable f366600r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f366601s;

    /* renamed from: t, reason: collision with root package name */
    public float f366602t;

    /* renamed from: u, reason: collision with root package name */
    public final int f366603u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f366602t = -1.0f;
        this.f366603u = android.view.ViewConfiguration.getTouchSlop();
    }

    @Override // qt2.j
    public int Q6() {
        return com.tencent.mm.R.id.fvq;
    }

    @Override // qt2.j
    public void S6(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.S6(recyclerView);
        android.view.View view = this.f366588e;
        if (view != null) {
            view.setOnClickListener(new qt2.k(this));
        }
    }

    @Override // qt2.j
    public boolean X6() {
        if (this.f366601s) {
            return false;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.W3).getValue()).r()).intValue() == 1 || ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).f39226d) {
            return false;
        }
        ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127689f3).getValue()).r()).intValue();
        return false;
    }

    @Override // qt2.j
    public void Y6() {
        android.view.View view;
        if (this.f366589f || T6() || (view = this.f366588e) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC", "popupEntrance", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC", "popupEntrance", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC", "popupEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC", "popupEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        W6(i65.a.b(getContext(), 80), 300L);
        view.animate().alpha(1.0f).setDuration(300L).start();
        this.f366589f = true;
        view.removeCallbacks(this.f366600r);
        qt2.l lVar = new qt2.l(this);
        this.f366600r = lVar;
        view.postDelayed(lVar, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        java.lang.String string = getString(com.tencent.mm.R.string.cmp);
        com.tencent.mm.plugin.finder.report.y3 y3Var = com.tencent.mm.plugin.finder.report.y3.f125472a;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        long c17 = c01.id.c();
        kotlin.jvm.internal.o.d(string);
        com.tencent.mm.plugin.finder.report.y3.a(y3Var, V6, 1, c17, 0, 2, string, 0, null, 128, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f366601s = getIntent().getBooleanExtra("is_from_ad", false);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        android.view.View view = this.f366588e;
        if (view != null) {
            view.removeCallbacks(this.f366600r);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f366602t = -1.0f;
        this.f366603u = android.view.ViewConfiguration.getTouchSlop();
    }
}
