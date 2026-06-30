package cw2;

/* loaded from: classes15.dex */
public final class d6 {

    /* renamed from: f, reason: collision with root package name */
    public static final cw2.o5 f223644f = new cw2.o5(null);

    /* renamed from: g, reason: collision with root package name */
    public static cw2.d6 f223645g;

    /* renamed from: h, reason: collision with root package name */
    public static int f223646h;

    /* renamed from: a, reason: collision with root package name */
    public final android.os.HandlerThread f223647a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f223648b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.mmpostprocessing.MMPostProcessing f223649c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f223650d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Stack f223651e;

    public d6(kotlin.jvm.internal.i iVar) {
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("FinderThumbPlayerPostProcessor", 5);
        a17.start();
        this.f223647a = a17;
        this.f223648b = new android.os.Handler(a17.getLooper());
        this.f223649c = new com.tencent.mm.mmpostprocessing.MMPostProcessing();
        this.f223650d = new java.util.HashMap();
        this.f223651e = new java.util.Stack();
    }
}
