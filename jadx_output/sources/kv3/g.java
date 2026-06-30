package kv3;

/* loaded from: classes5.dex */
public final class g implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv3.h f312677d;

    public g(kv3.h hVar) {
        this.f312677d = hVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        kv3.h hVar = this.f312677d;
        java.lang.Object obj = hVar.K.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment finderMusicPickerSearchFragment = (com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment) obj;
        java.lang.String str = hVar.I;
        if (kotlin.jvm.internal.o.b(hVar.M, finderMusicPickerSearchFragment)) {
            return;
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment finderMusicPickerSearchFragment2 = hVar.M;
        finderMusicPickerSearchFragment.M0();
        hVar.M = finderMusicPickerSearchFragment;
    }
}
