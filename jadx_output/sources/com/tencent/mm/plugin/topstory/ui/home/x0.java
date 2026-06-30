package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class x0 extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f175101d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175102e;

    public x0(com.tencent.mm.plugin.topstory.ui.home.j jVar) {
        this.f175102e = jVar;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "destroyItem pos:%s, v:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(obj.hashCode()));
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175102e;
        wm4.y yVar = (wm4.y) jVar.f174999q.get(i17);
        if (pm4.w.k(yVar.f447318b)) {
            return;
        }
        if (pm4.w.n(yVar.f447318b) && jVar.E) {
            return;
        }
        viewGroup.removeView((android.view.View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f175102e.f174999q.size();
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175102e;
        boolean k17 = pm4.w.k(((wm4.y) ((java.util.ArrayList) jVar.f174999q).get(i17)).f447318b);
        boolean z17 = (k17 && this.f175101d) ? false : true;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "instantiateItem pos:%s, v:%s, needAddView:%s, isLongVideoTab:%s,isAddLongVideo:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(((com.tencent.mm.plugin.topstory.ui.home.c1) ((java.util.ArrayList) jVar.H).get(i17)).f174942a.hashCode()), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(k17), java.lang.Boolean.valueOf(this.f175101d));
        if (z17) {
            android.view.View view = ((com.tencent.mm.plugin.topstory.ui.home.c1) ((java.util.ArrayList) jVar.H).get(i17)).f174942a;
            if (view.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) view.getParent()).removeView(view);
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "instantiateItem remove from parent!");
            }
            viewGroup.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        if (k17) {
            this.f175101d = true;
        }
        return ((com.tencent.mm.plugin.topstory.ui.home.c1) ((java.util.ArrayList) jVar.H).get(i17)).f174942a;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }
}
