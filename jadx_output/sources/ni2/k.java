package ni2;

/* loaded from: classes3.dex */
public final class k extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f337346d;

    /* renamed from: e, reason: collision with root package name */
    public final km2.q f337347e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f337348f;

    /* renamed from: g, reason: collision with root package name */
    public final ni2.v2 f337349g;

    public k(com.tencent.mm.plugin.finder.live.plugin.l basePlugin, km2.q qVar, java.util.List pkTeamMembers, ni2.v2 panel) {
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        kotlin.jvm.internal.o.g(pkTeamMembers, "pkTeamMembers");
        kotlin.jvm.internal.o.g(panel, "panel");
        this.f337346d = basePlugin;
        this.f337347e = qVar;
        this.f337348f = pkTeamMembers;
        this.f337349g = panel;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object object) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(object, "object");
        container.removeView((android.view.View) object);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        java.util.List list = this.f337348f;
        if (!list.isEmpty()) {
            return list.size();
        }
        return 1;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.CharSequence getPageTitle(int i17) {
        java.util.List list = this.f337348f;
        if (!list.isEmpty()) {
            return ((km2.q) list.get(i17)).f309173d;
        }
        km2.q qVar = this.f337347e;
        if (qVar != null) {
            return qVar.f309173d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ff  */
    @Override // androidx.viewpager.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object instantiateItem(android.view.ViewGroup r32, int r33) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ni2.k.instantiateItem(android.view.ViewGroup, int):java.lang.Object");
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object object) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(object, "object");
        return kotlin.jvm.internal.o.b(view, object);
    }
}
