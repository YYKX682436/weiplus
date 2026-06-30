package mg;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.instamovie.MJMovieSession f326183a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f326184b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.base.Vec2 f326185c;

    /* renamed from: d, reason: collision with root package name */
    public final mg.d f326186d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f326187e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.maas.base.Rect2 f326188f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f326189g;

    /* renamed from: h, reason: collision with root package name */
    public final mg.c f326190h;

    public a(com.tencent.maas.instamovie.MJMovieSession movieSession, android.content.Context context, com.tencent.maas.base.Vec2 viewSize, og.a handleBoxListener, mg.d dVar) {
        kotlin.jvm.internal.o.g(movieSession, "movieSession");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(viewSize, "viewSize");
        kotlin.jvm.internal.o.g(handleBoxListener, "handleBoxListener");
        this.f326183a = movieSession;
        this.f326184b = context;
        this.f326185c = viewSize;
        this.f326186d = dVar;
        new java.util.ArrayList();
        movieSession.setOnDidTapSegmentCallback(new com.tencent.maas.instamovie.MJMovieSession.OnDidTapSegment() { // from class: mg.a$$a
            @Override // com.tencent.maas.instamovie.MJMovieSession.OnDidTapSegment
            public final void onDidTapSegment(java.lang.String str, long j17) {
                mg.a this$0 = mg.a.this;
                kotlin.jvm.internal.o.g(this$0, "this$0");
                mg.e.a("MJHandleBoxTouchHelper", "OnDidTapSegment segmentID: " + ((java.lang.Object) str) + ", editOptions: " + j17);
                if (str != null) {
                    this$0.f326187e = str;
                    throw null;
                }
                this$0.f326183a.removeHandleBox();
                this$0.f326187e = null;
                throw null;
            }
        });
        movieSession.setOnWillShowHandleBoxCallback(new com.tencent.maas.instamovie.MJMovieSession.OnWillShowHandleBox() { // from class: mg.a$$b
            @Override // com.tencent.maas.instamovie.MJMovieSession.OnWillShowHandleBox
            public final void onWillShowHandleBox(java.lang.String str, com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Vec2 scale, float f17) {
                mg.a this$0 = mg.a.this;
                kotlin.jvm.internal.o.g(this$0, "this$0");
                mg.e.a("MJHandleBoxTouchHelper", "OnWillShowHandleBox segmentID: " + ((java.lang.Object) str) + ", position: " + vec2 + ", scale: " + scale + ", rotation: " + f17);
                com.tencent.maas.base.Rect2 rect2 = this$0.f326188f;
                if (rect2 == null) {
                    return;
                }
                ng.e eVar = (ng.e) ((jz5.n) this$0.f326189g).getValue();
                kotlin.jvm.internal.o.f(scale, "scale");
                eVar.getClass();
                mg.e.a("MJHandleBoxGestureDetector", "setup rect origin: " + rect2.getOrigin() + ", size:" + rect2.getSize() + ", scale:" + scale + ", rotation:" + f17);
                eVar.f336888c = rect2;
                eVar.f336891f = scale.f47799x;
                eVar.f336890e = (float) java.lang.Math.toDegrees((double) f17);
                float f18 = eVar.f336891f;
                eVar.f336887b.a(rect2, new com.tencent.maas.base.Vec2(f18, f18), (float) java.lang.Math.toRadians((double) eVar.f336890e));
            }
        });
        movieSession.setOnHandleBoxSettingsChangeCallback(new com.tencent.maas.instamovie.MJMovieSession.OnHandleBoxSettingsChanged() { // from class: mg.a$$c
            @Override // com.tencent.maas.instamovie.MJMovieSession.OnHandleBoxSettingsChanged
            public final void handleBoxSettingsChanged(com.tencent.maas.handlebox.model.MJHandleBoxSettings mJHandleBoxSettings) {
                mg.d dVar2;
                mg.a this$0 = mg.a.this;
                kotlin.jvm.internal.o.g(this$0, "this$0");
                mg.e.a("MJHandleBoxTouchHelper", kotlin.jvm.internal.o.m("handleBoxSettingsChanged handleBoxSettings: ", mJHandleBoxSettings));
                if (mJHandleBoxSettings == null) {
                    return;
                }
                float f17 = mJHandleBoxSettings.getPosition().f47799x;
                com.tencent.maas.base.Vec2 vec2 = this$0.f326185c;
                com.tencent.maas.base.Vec2 vec22 = new com.tencent.maas.base.Vec2(f17, vec2.f47800y - mJHandleBoxSettings.getPosition().f47800y);
                float f18 = 2;
                com.tencent.maas.base.Rect2 rect2 = new com.tencent.maas.base.Rect2(new com.tencent.maas.base.Vec2(vec22.f47799x - (mJHandleBoxSettings.getContentSize().f47799x / f18), vec22.f47800y - (mJHandleBoxSettings.getContentSize().f47800y / f18)), mJHandleBoxSettings.getContentSize());
                mg.e.a("MJHandleBoxTouchHelper", "origin:" + vec22 + ", viewSize: " + vec2 + ", contentSize: " + mJHandleBoxSettings.getContentSize() + ", segmentRect.origin:" + rect2.getOrigin() + ", segmentRect.size: " + rect2.getSize() + ", handleBoxSettings: " + mJHandleBoxSettings);
                this$0.f326188f = rect2;
                mJHandleBoxSettings.getScale();
                mJHandleBoxSettings.getRotation();
                this$0.getClass();
                com.tencent.maas.base.Rect2 rect22 = this$0.f326188f;
                java.lang.String str = this$0.f326187e;
                if (rect22 == null || str == null || (dVar2 = this$0.f326186d) == null) {
                    return;
                }
                com.tencent.maas.base.Vec2 scale = mJHandleBoxSettings.getScale();
                kotlin.jvm.internal.o.f(scale, "scale");
                dVar2.a(rect22, scale, mJHandleBoxSettings.getRotation());
            }
        }, viewSize);
        movieSession.setOnDidRemoveSegmentCallback(new com.tencent.maas.instamovie.MJMovieSession.OnHandleBoxComplete() { // from class: mg.a$$d
            @Override // com.tencent.maas.instamovie.MJMovieSession.OnHandleBoxComplete
            public final void onHandleBoxComplete(java.lang.String it) {
                mg.a this$0 = mg.a.this;
                kotlin.jvm.internal.o.g(this$0, "this$0");
                kotlin.jvm.internal.o.f(it, "it");
                throw null;
            }
        });
        this.f326189g = jz5.h.b(new mg.b(this));
        this.f326190h = new mg.c(this);
    }
}
