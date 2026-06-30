package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 f156224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f156225e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 h0Var, android.view.ViewGroup viewGroup) {
        super(0);
        this.f156224d = h0Var;
        this.f156225e = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.viewpager.widget.ViewPager viewPager = new androidx.viewpager.widget.ViewPager(this.f156224d.f156168g);
        viewPager.setId(android.view.View.generateViewId());
        ((android.view.ViewGroup) this.f156225e.findViewById(com.tencent.mm.R.id.pz9)).addView(viewPager, -1, -1);
        return viewPager;
    }
}
