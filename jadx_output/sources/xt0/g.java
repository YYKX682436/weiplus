package xt0;

/* loaded from: classes5.dex */
public final class g extends xt0.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f456421a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.h70 f456422b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String originMediaPath, r45.h70 compositionInfo) {
        super(null);
        kotlin.jvm.internal.o.g(originMediaPath, "originMediaPath");
        kotlin.jvm.internal.o.g(compositionInfo, "compositionInfo");
        this.f456421a = originMediaPath;
        this.f456422b = compositionInfo;
    }

    @Override // xt0.h
    public java.lang.String a() {
        return this.f456421a;
    }
}
