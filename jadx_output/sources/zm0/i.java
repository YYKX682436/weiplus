package zm0;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f474120a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f474121b;

    /* renamed from: c, reason: collision with root package name */
    public final zm0.f f474122c;

    /* renamed from: d, reason: collision with root package name */
    public final zm0.c f474123d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f474124e;

    /* renamed from: f, reason: collision with root package name */
    public final zm0.e f474125f = new zm0.e(this);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f474126g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f474127h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final android.view.Choreographer.FrameCallback f474128i = new zm0.h(this);

    /* renamed from: j, reason: collision with root package name */
    public yz5.a f474129j;

    public i(android.content.Context context, android.widget.FrameLayout frameLayout, zm0.f fVar, zm0.c cVar, kotlin.jvm.internal.i iVar) {
        this.f474120a = context;
        this.f474121b = frameLayout;
        this.f474122c = fVar;
        this.f474123d = cVar;
    }

    public final void a(java.lang.String source, java.util.List bulletList) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(bulletList, "bulletList");
        com.tencent.mars.xlog.Log.i("LinearBulletManager", "addBullet: source=" + source + ", bulletSize=" + bulletList.size());
        zm0.e eVar = this.f474125f;
        eVar.getClass();
        eVar.f474106c.addAll(bulletList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a7 A[LOOP:0: B:11:0x0031->B:69:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bb A[EDGE_INSN: B:70:0x02bb->B:71:0x02bb BREAK  A[LOOP:0: B:11:0x0031->B:69:0x02a7], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v11, types: [d92.f] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [zm0.d, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r23) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zm0.i.b(boolean):void");
    }

    public final void c(int i17, zm0.d dVar) {
        android.view.ViewParent parent = dVar.f474103a.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(dVar.f474103a);
        }
        java.util.HashMap hashMap = this.f474126g;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.ArrayList();
            hashMap.put(valueOf, obj);
        }
        ((java.util.ArrayList) obj).add(dVar);
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("LinearBulletManager", "stop: isStart=" + this.f474124e);
        if (this.f474124e) {
            this.f474124e = false;
            android.view.Choreographer.getInstance().removeFrameCallback(this.f474128i);
        }
    }
}
