package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes5.dex */
public final class ro extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.uo f135819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f135820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135821g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f135822h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(java.lang.String str, com.tencent.mm.plugin.finder.viewmodel.component.uo uoVar, android.view.View view, java.lang.String str2, boolean z17) {
        super(0);
        this.f135818d = str;
        this.f135819e = uoVar;
        this.f135820f = view;
        this.f135821g = str2;
        this.f135822h = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("Finder.FinderMagicEmojiUIC", "trigger " + this.f135818d);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f135819e.f136148d;
        java.lang.String str = this.f135818d;
        concurrentHashMap.put(str, new com.tencent.mm.plugin.finder.viewmodel.component.qo(this.f135820f, new wp0.b(str, java.lang.System.currentTimeMillis(), this.f135821g, 1L, new android.graphics.RectF(), 0L, false, "", "", 0, "", "")));
        java.util.ArrayList arrayList = this.f135819e.f136149e;
        java.lang.String str2 = this.f135818d;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (str2.compareTo((java.lang.String) it.next()) > 0) {
                break;
            }
            i17++;
        }
        if (i17 == -1) {
            this.f135819e.f136149e.add(this.f135818d);
        } else {
            this.f135819e.f136149e.add(i17, this.f135818d);
        }
        if (!this.f135819e.f136153i) {
            this.f135819e.f136153i = true;
            com.tencent.mars.xlog.Log.i("Finder.FinderMagicEmojiUIC", "start trigger");
            com.tencent.mm.plugin.finder.viewmodel.component.uo uoVar = this.f135819e;
            long j17 = this.f135822h ? 700L : 0L;
            uoVar.getClass();
            com.tencent.mm.plugin.finder.viewmodel.component.so soVar = new com.tencent.mm.plugin.finder.viewmodel.component.so(uoVar);
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            com.tencent.mm.sdk.platformtools.u3.i(soVar, j17);
        }
        return jz5.f0.f302826a;
    }
}
