package nv3;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d f340677a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.yv0 f340678b;

    /* renamed from: c, reason: collision with root package name */
    public final im5.b f340679c;

    /* renamed from: d, reason: collision with root package name */
    public final long f340680d;

    /* renamed from: e, reason: collision with root package name */
    public jv3.a f340681e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f340682f;

    public i(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d searchComponent, r45.yv0 finderCgiType, im5.b lifeCycleKeeper, long j17) {
        kotlin.jvm.internal.o.g(searchComponent, "searchComponent");
        kotlin.jvm.internal.o.g(finderCgiType, "finderCgiType");
        kotlin.jvm.internal.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        this.f340677a = searchComponent;
        this.f340678b = finderCgiType;
        this.f340679c = lifeCycleKeeper;
        this.f340680d = j17;
    }

    public final void a(java.lang.String str, boolean z17, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c1 searchType, java.lang.String str2) {
        pq5.g l17;
        kotlin.jvm.internal.o.g(searchType, "searchType");
        com.tencent.mars.xlog.Log.i("FinderGetSearchBgmListHelper", "doSearch " + str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d dVar = this.f340677a;
        if (!z17) {
            this.f340682f = null;
            dVar.F();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_string_1", str);
            dVar.j(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156247g, bundle);
        }
        java.lang.String str3 = str == null ? "" : str;
        android.app.Activity activity = dVar.getActivity();
        jv3.a aVar = this.f340681e;
        if (aVar != null) {
            aVar.j();
        }
        this.f340681e = new jv3.a(this.f340678b.f391399d, 30, this.f340682f, this.f340680d, null, null, null, nv3.d.a(nv3.f.f340658l, activity, null, 2, null).toString(), str3, str2, 0, 0, 0, null, 15472, null);
        long c17 = c01.id.c();
        jv3.a aVar2 = this.f340681e;
        if (aVar2 == null || (l17 = aVar2.l()) == null) {
            return;
        }
        l17.f(this.f340679c);
        l17.h(new nv3.h(c17, str3, str, this, z17, searchType));
    }
}
