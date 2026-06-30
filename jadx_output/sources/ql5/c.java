package ql5;

/* loaded from: classes15.dex */
public class c implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f364590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ExpandableListView f364591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ql5.g f364592c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql5.e f364593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ql5.d f364594e;

    public c(ql5.d dVar, int i17, android.widget.ExpandableListView expandableListView, ql5.g gVar, ql5.e eVar) {
        this.f364594e = dVar;
        this.f364590a = i17;
        this.f364591b = expandableListView;
        this.f364592c = gVar;
        this.f364593d = eVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        ql5.d dVar = this.f364594e;
        int i17 = this.f364590a;
        dVar.a(i17).f364606a = false;
        this.f364591b.collapseGroup(i17);
        dVar.notifyDataSetChanged();
        this.f364592c.f364609d = -1;
        this.f364593d.setTag(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
