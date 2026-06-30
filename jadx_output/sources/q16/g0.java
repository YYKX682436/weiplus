package q16;

/* loaded from: classes16.dex */
public final class g0 implements q16.c0 {
    public static final /* synthetic */ f06.v[] X = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "withDefinedIn", "getWithDefinedIn()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "modifiers", "getModifiers()Ljava/util/Set;")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "startFromName", "getStartFromName()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "debugMode", "getDebugMode()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "verbose", "getVerbose()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "unitReturnType", "getUnitReturnType()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "withoutReturnType", "getWithoutReturnType()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "enhancedTypes", "getEnhancedTypes()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "renderDefaultModality", "getRenderDefaultModality()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "receiverAfterName", "getReceiverAfterName()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(kotlin.jvm.internal.i0.a(q16.g0.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    public final b06.d A;
    public final b06.d B;
    public final b06.d C;
    public final b06.d D;
    public final b06.d E;
    public final b06.d F;
    public final b06.d G;
    public final b06.d H;
    public final b06.d I;

    /* renamed from: J, reason: collision with root package name */
    public final b06.d f359729J;
    public final b06.d K;
    public final b06.d L;
    public final b06.d M;
    public final b06.d N;
    public final b06.d O;
    public final b06.d P;
    public final b06.d Q;
    public final b06.d R;
    public final b06.d S;
    public final b06.d T;
    public final b06.d U;
    public final b06.d V;
    public final b06.d W;

    /* renamed from: a, reason: collision with root package name */
    public boolean f359730a;

    /* renamed from: b, reason: collision with root package name */
    public final b06.d f359731b = new q16.e0(q16.d.f359723a, this);

    /* renamed from: c, reason: collision with root package name */
    public final b06.d f359732c;

    /* renamed from: d, reason: collision with root package name */
    public final b06.d f359733d;

    /* renamed from: e, reason: collision with root package name */
    public final b06.d f359734e;

    /* renamed from: f, reason: collision with root package name */
    public final b06.d f359735f;

    /* renamed from: g, reason: collision with root package name */
    public final b06.d f359736g;

    /* renamed from: h, reason: collision with root package name */
    public final b06.d f359737h;

    /* renamed from: i, reason: collision with root package name */
    public final b06.d f359738i;

    /* renamed from: j, reason: collision with root package name */
    public final b06.d f359739j;

    /* renamed from: k, reason: collision with root package name */
    public final b06.d f359740k;

    /* renamed from: l, reason: collision with root package name */
    public final b06.d f359741l;

    /* renamed from: m, reason: collision with root package name */
    public final b06.d f359742m;

    /* renamed from: n, reason: collision with root package name */
    public final b06.d f359743n;

    /* renamed from: o, reason: collision with root package name */
    public final b06.d f359744o;

    /* renamed from: p, reason: collision with root package name */
    public final b06.d f359745p;

    /* renamed from: q, reason: collision with root package name */
    public final b06.d f359746q;

    /* renamed from: r, reason: collision with root package name */
    public final b06.d f359747r;

    /* renamed from: s, reason: collision with root package name */
    public final b06.d f359748s;

    /* renamed from: t, reason: collision with root package name */
    public final b06.d f359749t;

    /* renamed from: u, reason: collision with root package name */
    public final b06.d f359750u;

    /* renamed from: v, reason: collision with root package name */
    public final b06.d f359751v;

    /* renamed from: w, reason: collision with root package name */
    public final b06.d f359752w;

    /* renamed from: x, reason: collision with root package name */
    public final b06.d f359753x;

    /* renamed from: y, reason: collision with root package name */
    public final b06.d f359754y;

    /* renamed from: z, reason: collision with root package name */
    public final b06.d f359755z;

    public g0() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.f359732c = new q16.e0(bool, this);
        this.f359733d = new q16.e0(bool, this);
        this.f359734e = new q16.e0(q16.b0.f359704e, this);
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        this.f359735f = new q16.e0(bool2, this);
        this.f359736g = new q16.e0(bool2, this);
        this.f359737h = new q16.e0(bool2, this);
        this.f359738i = new q16.e0(bool2, this);
        this.f359739j = new q16.e0(bool2, this);
        this.f359740k = new q16.e0(bool, this);
        this.f359741l = new q16.e0(bool2, this);
        this.f359742m = new q16.e0(bool2, this);
        this.f359743n = new q16.e0(bool2, this);
        this.f359744o = new q16.e0(bool, this);
        this.f359745p = new q16.e0(bool, this);
        this.f359746q = new q16.e0(bool2, this);
        this.f359747r = new q16.e0(bool2, this);
        this.f359748s = new q16.e0(bool2, this);
        this.f359749t = new q16.e0(bool2, this);
        this.f359750u = new q16.e0(bool2, this);
        this.f359751v = new q16.e0(null, this);
        this.f359752w = new q16.e0(bool2, this);
        this.f359753x = new q16.e0(bool2, this);
        this.f359754y = new q16.e0(q16.f0.f359727d, this);
        this.f359755z = new q16.e0(q16.d0.f359724d, this);
        this.A = new q16.e0(bool, this);
        this.B = new q16.e0(q16.j0.f359762e, this);
        this.C = new q16.e0(q16.q.f359779a, this);
        this.D = new q16.e0(q16.o0.f359776d, this);
        this.E = new q16.e0(q16.k0.f359765d, this);
        this.F = new q16.e0(bool2, this);
        this.G = new q16.e0(bool2, this);
        this.H = new q16.e0(q16.l0.f359770d, this);
        this.I = new q16.e0(bool2, this);
        this.f359729J = new q16.e0(bool2, this);
        this.K = new q16.e0(kz5.r0.f314002d, this);
        java.util.Set set = q16.h0.f359757a;
        this.L = new q16.e0(q16.h0.f359757a, this);
        this.M = new q16.e0(null, this);
        this.N = new q16.e0(q16.a.f359697f, this);
        this.O = new q16.e0(bool2, this);
        this.P = new q16.e0(bool, this);
        this.Q = new q16.e0(bool, this);
        this.R = new q16.e0(bool2, this);
        this.S = new q16.e0(bool, this);
        this.T = new q16.e0(bool, this);
        this.U = new q16.e0(bool2, this);
        this.V = new q16.e0(bool2, this);
        this.W = new q16.e0(bool, this);
    }

    @Override // q16.c0
    public boolean a() {
        return ((java.lang.Boolean) ((b06.b) this.f359742m).b(this, X[11])).booleanValue();
    }

    @Override // q16.c0
    public java.util.Set b() {
        return (java.util.Set) ((b06.b) this.L).b(this, X[36]);
    }

    @Override // q16.c0
    public boolean c() {
        return ((java.lang.Boolean) ((b06.b) this.f359737h).b(this, X[6])).booleanValue();
    }

    @Override // q16.c0
    public void d(java.util.Set set) {
        kotlin.jvm.internal.o.g(set, "<set-?>");
        ((b06.b) this.L).a(this, X[36], set);
    }

    @Override // q16.c0
    public void e(java.util.Set set) {
        kotlin.jvm.internal.o.g(set, "<set-?>");
        ((b06.b) this.f359734e).a(this, X[3], set);
    }

    @Override // q16.c0
    public void f(q16.e eVar) {
        kotlin.jvm.internal.o.g(eVar, "<set-?>");
        ((b06.b) this.f359731b).a(this, X[0], eVar);
    }

    @Override // q16.c0
    public void g(boolean z17) {
        ((b06.b) this.f359737h).a(this, X[6], java.lang.Boolean.valueOf(z17));
    }

    @Override // q16.c0
    public void h(q16.o0 o0Var) {
        kotlin.jvm.internal.o.g(o0Var, "<set-?>");
        ((b06.b) this.D).a(this, X[28], o0Var);
    }

    @Override // q16.c0
    public void i(boolean z17) {
        ((b06.b) this.f359752w).a(this, X[21], java.lang.Boolean.valueOf(z17));
    }

    @Override // q16.c0
    public void j(boolean z17) {
        ((b06.b) this.f359735f).a(this, X[4], java.lang.Boolean.valueOf(z17));
    }

    @Override // q16.c0
    public void k(boolean z17) {
        ((b06.b) this.f359732c).a(this, X[1], java.lang.Boolean.valueOf(z17));
    }

    @Override // q16.c0
    public void l(boolean z17) {
        ((b06.b) this.f359753x).a(this, X[22], java.lang.Boolean.valueOf(z17));
    }

    @Override // q16.c0
    public void m(boolean z17) {
        ((b06.b) this.F).a(this, X[30], java.lang.Boolean.valueOf(z17));
    }

    @Override // q16.c0
    public void n(q16.k0 k0Var) {
        kotlin.jvm.internal.o.g(k0Var, "<set-?>");
        ((b06.b) this.E).a(this, X[29], k0Var);
    }

    @Override // q16.c0
    public void o(boolean z17) {
        ((b06.b) this.G).a(this, X[31], java.lang.Boolean.valueOf(z17));
    }

    public q16.a p() {
        return (q16.a) ((b06.b) this.N).b(this, X[38]);
    }
}
