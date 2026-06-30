package kotlin.jvm.internal;

/* loaded from: classes16.dex */
public abstract class e implements f06.c, java.io.Serializable {
    public static final java.lang.Object NO_RECEIVER = kotlin.jvm.internal.d.f310113d;
    private final boolean isTopLevel;
    private final java.lang.String name;
    private final java.lang.Class owner;
    protected final java.lang.Object receiver;
    private transient f06.c reflected;
    private final java.lang.String signature;

    public e(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, boolean z17) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z17;
    }

    @Override // f06.c
    public java.lang.Object call(java.lang.Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // f06.c
    public java.lang.Object callBy(java.util.Map map) {
        return getReflected().callBy(map);
    }

    public f06.c compute() {
        f06.c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        f06.c computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract f06.c computeReflected();

    @Override // f06.b
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public java.lang.Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // f06.c
    public java.lang.String getName() {
        return this.name;
    }

    public f06.f getOwner() {
        java.lang.Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? kotlin.jvm.internal.i0.f310124a.c(cls, "") : kotlin.jvm.internal.i0.a(cls);
    }

    @Override // f06.c
    public java.util.List<f06.o> getParameters() {
        return getReflected().getParameters();
    }

    public abstract f06.c getReflected();

    @Override // f06.c
    public f06.w getReturnType() {
        return getReflected().getReturnType();
    }

    public java.lang.String getSignature() {
        return this.signature;
    }

    @Override // f06.c
    public java.util.List<f06.x> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // f06.c
    public f06.b0 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // f06.c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // f06.c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // f06.c
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
