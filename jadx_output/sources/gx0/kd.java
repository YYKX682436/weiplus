package gx0;

/* loaded from: classes5.dex */
public final class kd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f276634e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.c7 f276635f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276636g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, rv0.c7 c7Var, gx0.bf bfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276634e = clipSegment;
        this.f276635f = c7Var;
        this.f276636g = bfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.kd(this.f276634e, this.f276635f, this.f276636g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.kd) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.ComposingDefines$ClipSkimOptions composingDefines$ClipSkimOptions;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276633d;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rv0.c7 c7Var = this.f276635f;
            kotlin.jvm.internal.o.g(c7Var, "<this>");
            int ordinal = c7Var.ordinal();
            if (ordinal != 0) {
                boolean z18 = false;
                if (ordinal == 1) {
                    composingDefines$ClipSkimOptions = new java.lang.Object(z18, z18) { // from class: com.tencent.maas.moviecomposing.ComposingDefines$ClipSkimOptions

                        /* renamed from: a, reason: collision with root package name */
                        public final int f48368a;

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.f48368a = z18 ? (z18 ? 1 : 0) | 2 : z18;
                        }

                        public boolean useAssetAspectRatio() {
                            return (this.f48368a & 1) != 0;
                        }

                        public boolean useTimelineVideoSettings() {
                            return (this.f48368a & 2) != 0;
                        }
                    };
                } else if (ordinal == 2) {
                    composingDefines$ClipSkimOptions = new java.lang.Object(z17, z18) { // from class: com.tencent.maas.moviecomposing.ComposingDefines$ClipSkimOptions

                        /* renamed from: a, reason: collision with root package name */
                        public final int f48368a;

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.f48368a = z18 ? (z17 ? 1 : 0) | 2 : z17;
                        }

                        public boolean useAssetAspectRatio() {
                            return (this.f48368a & 1) != 0;
                        }

                        public boolean useTimelineVideoSettings() {
                            return (this.f48368a & 2) != 0;
                        }
                    };
                } else {
                    if (ordinal != 3) {
                        throw new jz5.j();
                    }
                    composingDefines$ClipSkimOptions = new java.lang.Object(z18, z17) { // from class: com.tencent.maas.moviecomposing.ComposingDefines$ClipSkimOptions

                        /* renamed from: a, reason: collision with root package name */
                        public final int f48368a;

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.f48368a = z17 ? (z18 ? 1 : 0) | 2 : z18;
                        }

                        public boolean useAssetAspectRatio() {
                            return (this.f48368a & 1) != 0;
                        }

                        public boolean useTimelineVideoSettings() {
                            return (this.f48368a & 2) != 0;
                        }
                    };
                }
            } else {
                composingDefines$ClipSkimOptions = new java.lang.Object(z17, z17) { // from class: com.tencent.maas.moviecomposing.ComposingDefines$ClipSkimOptions

                    /* renamed from: a, reason: collision with root package name */
                    public final int f48368a;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.f48368a = z17 ? (z17 ? 1 : 0) | 2 : z17;
                    }

                    public boolean useAssetAspectRatio() {
                        return (this.f48368a & 1) != 0;
                    }

                    public boolean useTimelineVideoSettings() {
                        return (this.f48368a & 2) != 0;
                    }
                };
            }
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f276634e;
            clipSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
            com.tencent.maas.moviecomposing.VideoClipWrapper X0 = D != null ? com.tencent.maas.moviecomposing.segments.ClipSegment.X0(clipSegment, composingDefines$ClipSkimOptions, D) : null;
            if (X0 == null) {
                return java.lang.Boolean.FALSE;
            }
            gx0.bf bfVar = this.f276636g;
            oz5.l lVar = bfVar.f276252s;
            gx0.jd jdVar = new gx0.jd(bfVar, X0, clipSegment, null);
            this.f276633d = 1;
            obj = kotlinx.coroutines.l.g(lVar, jdVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
