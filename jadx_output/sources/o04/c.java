package o04;

/* loaded from: classes4.dex */
public class c implements o04.o {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f341898a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class f341899b;

    /* renamed from: c, reason: collision with root package name */
    public final int f341900c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f341901d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f341902e;

    public c(java.util.List activityNameList, java.lang.Class clazz, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(activityNameList, "activityNameList");
        kotlin.jvm.internal.o.g(clazz, "clazz");
        this.f341898a = activityNameList;
        this.f341899b = clazz;
        this.f341900c = i17;
        this.f341901d = z17;
        this.f341902e = jz5.h.b(new o04.b(this));
    }

    @Override // o04.o
    public boolean a() {
        return this.f341901d;
    }

    @Override // o04.o
    public boolean b(android.content.Intent intent) {
        java.lang.String str;
        java.lang.String className;
        if (intent == null) {
            return false;
        }
        android.content.ComponentName component = intent.getComponent();
        if (component == null || (className = component.getClassName()) == null || (str = (java.lang.String) kz5.n0.k0(r26.n0.f0(className, new java.lang.String[]{"."}, false, 0, 6, null))) == null) {
            str = "";
        }
        return this.f341898a.contains(str);
    }

    @Override // o04.o
    public com.tencent.mm.protobuf.f c() {
        com.tencent.mm.protobuf.f fVar = (com.tencent.mm.protobuf.f) ((jz5.n) this.f341902e).getValue();
        kotlin.jvm.internal.o.f(fVar, "<get-data>(...)");
        return fVar;
    }

    @Override // o04.o
    public int getType() {
        return this.f341900c;
    }
}
