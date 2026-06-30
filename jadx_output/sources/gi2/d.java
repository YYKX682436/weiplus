package gi2;

/* loaded from: classes10.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public gi2.f f272267a;

    /* renamed from: b, reason: collision with root package name */
    public int f272268b;

    public android.view.View a(int i17) {
        gi2.e eVar = (gi2.e) this;
        xh2.a g17 = eVar.g(i17);
        int h17 = eVar.h(g17);
        java.lang.String str = g17.b() + '@' + eVar.h(g17) + '@' + g17.f454521b.f454553e;
        java.lang.String i18 = eVar.i();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getItemView pos: ");
        sb6.append(i17);
        sb6.append(" key: ");
        sb6.append(str);
        sb6.append(" micType: ");
        sb6.append(h17);
        sb6.append(" viewCache: ");
        java.util.HashMap hashMap = eVar.f272272f;
        sb6.append(hashMap);
        com.tencent.mars.xlog.Log.i(i18, sb6.toString());
        android.view.View view = (android.view.View) hashMap.get(str);
        if (view == null) {
            view = eVar.f(g17, h17);
        }
        kotlin.jvm.internal.o.d(view);
        hashMap.put(str, view);
        return view;
    }

    public abstract gi2.g b();

    public final void c() {
        gi2.g b17;
        gi2.f fVar = this.f272267a;
        if (fVar != null) {
            if (fVar == null) {
                kotlin.jvm.internal.o.o("layout");
                throw null;
            }
            com.tencent.mm.plugin.finder.live.mic.custom.LiveCustomRoomLayoutView liveCustomRoomLayoutView = (com.tencent.mm.plugin.finder.live.mic.custom.LiveCustomRoomLayoutView) fVar;
            gi2.d dVar = liveCustomRoomLayoutView.f111700w;
            if (dVar == null || (b17 = dVar.b()) == null) {
                return;
            }
            b17.a(liveCustomRoomLayoutView);
            liveCustomRoomLayoutView.setTag(((gi2.c) b17).f272266a);
        }
    }

    public abstract void d(int i17, android.view.View view);
}
