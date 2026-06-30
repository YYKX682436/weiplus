package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class g0 implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 f156230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 f156231e;

    public g0(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 h0Var, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 j0Var) {
        this.f156230d = h0Var;
        this.f156231e = j0Var;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        java.lang.Object obj;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 h0Var = this.f156230d;
        jz5.l lVar = (jz5.l) h0Var.f156238o.get(i17);
        if (lVar == null) {
            return;
        }
        java.lang.String str = h0Var.f156237n;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment musicPickerDataFragment = h0Var.f156239p;
        h0Var.f156239p = (com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment) lVar.f302834e;
        if (musicPickerDataFragment != null) {
            musicPickerDataFragment.s0();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (kotlin.jvm.internal.o.b(h0Var.f156239p, musicPickerDataFragment)) {
            return;
        }
        java.util.Iterator it = h0Var.f156238o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((jz5.l) obj).f302834e, musicPickerDataFragment)) {
                    break;
                }
            }
        }
        jz5.l lVar2 = (jz5.l) obj;
        java.lang.Integer num = lVar2 != null ? (java.lang.Integer) lVar2.f302833d : null;
        java.lang.String str2 = h0Var.f156237n;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPageSelected:");
        java.lang.Object obj2 = lVar.f302833d;
        sb6.append(((java.lang.Number) obj2).intValue());
        sb6.append(" unselected:");
        sb6.append(num);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment musicPickerDataFragment2 = h0Var.f156239p;
        if (musicPickerDataFragment2 != null) {
            musicPickerDataFragment2.t0();
        }
        bundle.putInt("key_page_to_select", i17);
        this.f156231e.j(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156244d, bundle);
        h0Var.r(((java.lang.Number) obj2).intValue());
    }
}
